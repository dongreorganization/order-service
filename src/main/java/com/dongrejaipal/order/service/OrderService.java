package com.dongrejaipal.order.service;

import java.lang.System.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dongrejaipal.order.dto.OrderDTO;
import com.dongrejaipal.order.dto.OrderDTOFromFE;
import com.dongrejaipal.order.dto.UserDTO;
import com.dongrejaipal.order.entity.Order;
import com.dongrejaipal.order.mapper.OrderMapper;
import com.dongrejaipal.order.repo.OrderRepo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class OrderService {

	@Autowired
	OrderRepo orderRepo;

	@Autowired
	SequenceGenerator sequenceGenerator;

	@Autowired
	RestTemplate restTemplate;

	public OrderDTO saveOrder(OrderDTOFromFE orderDTOFromFE) {
		// TODO Auto-generated method stub
		log.info("restaurant {}", orderDTOFromFE.getRestaurant());
		Integer newOrderId = sequenceGenerator.generateNextOrderId();
		UserDTO user = fetechUserDetailsFromUserId(orderDTOFromFE.getUserId());
		Order orderTosaved = new Order(newOrderId, orderDTOFromFE.getFoodItemList(), orderDTOFromFE.getRestaurant(),
				user);
		return OrderMapper.INSTANCE.mapOrderToOrderDTO(orderRepo.save(orderTosaved));

	}

	private UserDTO fetechUserDetailsFromUserId(Integer userId) {
		// TODO Auto-generated method stub
		return restTemplate.getForObject("http://USER-SERVICE/user/fetchUserById/" + userId, UserDTO.class);
	}

}
