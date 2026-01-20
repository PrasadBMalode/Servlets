package com.xworkz.groceryShop.service;

import com.xworkz.groceryShop.dao.GroceryDAO;
import com.xworkz.groceryShop.dto.GroceryDTO;
import com.xworkz.groceryShop.customEvent.InvalidDataException;

public class GroceryService {
    public boolean productValidationSave(GroceryDTO groceryDTO) throws InvalidDataException {

        if (groceryDTO.getProductId() > 0
                && groceryDTO.getProductName() != null
                && groceryDTO.getProductPrice() < 2000
                && groceryDTO.getProductRating() > 3.0
                && groceryDTO.getProductReview() != null) {

            GroceryDAO groceryDAO = new GroceryDAO();
            groceryDAO.saveGrocery(groceryDTO);
            System.out.println("Data saved to DataBase...");

            return true;

        } else {
            throw new InvalidDataException();
        }
    }
}

