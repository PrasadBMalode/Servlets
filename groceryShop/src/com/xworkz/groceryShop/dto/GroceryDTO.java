package com.xworkz.groceryShop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class GroceryDTO {
    private int productId;
    private String productName;
    private int productPrice;
    private float productRating;
    private String productReview;

}
