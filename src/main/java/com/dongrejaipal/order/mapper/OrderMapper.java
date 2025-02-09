package com.dongrejaipal.order.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.dongrejaipal.order.dto.OrderDTO;
import com.dongrejaipal.order.entity.Order;

@Mapper
public interface OrderMapper {

	OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

	Order mapOrderDTOToOrder(OrderDTO orderDTO);

	OrderDTO mapOrderToOrderDTO(Order order);

}
