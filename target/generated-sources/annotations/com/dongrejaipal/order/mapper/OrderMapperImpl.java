package com.dongrejaipal.order.mapper;

import com.dongrejaipal.order.dto.FoodItemDTO;
import com.dongrejaipal.order.dto.OrderDTO;
import com.dongrejaipal.order.entity.Order;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-09T12:57:07+0530",
    comments = "version: 1.6.0.Beta1, compiler: Eclipse JDT (IDE) 3.39.0.v20240820-0604, environment: Java 21.0.4 (Eclipse Adoptium)"
)
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order mapOrderDTOToOrder(OrderDTO orderDTO) {
        if ( orderDTO == null ) {
            return null;
        }

        Order order = new Order();

        List<FoodItemDTO> list = orderDTO.getFoodItemList();
        if ( list != null ) {
            order.setFoodItemList( new ArrayList<FoodItemDTO>( list ) );
        }
        order.setOrderId( orderDTO.getOrderId() );
        order.setRestaurant( orderDTO.getRestaurant() );
        order.setUserDTO( orderDTO.getUserDTO() );

        return order;
    }

    @Override
    public OrderDTO mapOrderToOrderDTO(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderDTO orderDTO = new OrderDTO();

        List<FoodItemDTO> list = order.getFoodItemList();
        if ( list != null ) {
            orderDTO.setFoodItemList( new ArrayList<FoodItemDTO>( list ) );
        }
        orderDTO.setOrderId( order.getOrderId() );
        orderDTO.setRestaurant( order.getRestaurant() );
        orderDTO.setUserDTO( order.getUserDTO() );

        return orderDTO;
    }
}
