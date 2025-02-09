package com.dongrejaipal.order.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.dongrejaipal.order.dto.FoodItemDTO;
import com.dongrejaipal.order.dto.RestaurantDTO;
import com.dongrejaipal.order.dto.UserDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("order")
public class Order {

	private Integer orderId;
	private List<FoodItemDTO> foodItemList;
	private RestaurantDTO restaurant;
	private UserDTO userDTO;
}
