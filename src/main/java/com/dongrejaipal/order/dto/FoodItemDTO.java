package com.dongrejaipal.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemDTO {

	private Integer id;

	private String itemName;
	private String itemDescription;
	private boolean isVeg;
	private Number price;
	private Integer restuarantId;
	private Integer quantity;

}
