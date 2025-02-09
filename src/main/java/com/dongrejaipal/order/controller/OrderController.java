package com.dongrejaipal.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dongrejaipal.order.dto.OrderDTO;
import com.dongrejaipal.order.dto.OrderDTOFromFE;
import com.dongrejaipal.order.service.OrderService;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

	@Autowired
	OrderService orderService;

	

	@PostMapping("/saveOrder")
	public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTOFromFE orderDTOFromFE) {
		OrderDTO OrderDTO = orderService.saveOrder(orderDTOFromFE);
		return new ResponseEntity<OrderDTO>(OrderDTO, HttpStatus.CREATED);
	}

}
