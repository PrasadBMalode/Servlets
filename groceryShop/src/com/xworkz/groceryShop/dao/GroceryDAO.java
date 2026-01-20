package com.xworkz.groceryShop.dao;

import com.xworkz.groceryShop.dto.GroceryDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GroceryDAO {
    public String saveGrocery(GroceryDTO groceryDTO) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Grocery_DB";
            String userName = "root";
            String password = "Prasad@123";
            String insertQuery = "insert into Grocery_tb values(?,?,?,?,?)";

            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement ps = connection.prepareStatement(insertQuery);

            ps.setInt(1, groceryDTO.getProductId());
            ps.setString(2, groceryDTO.getProductName());
            ps.setInt(3, groceryDTO.getProductPrice());
            ps.setFloat(4, groceryDTO.getProductRating());
            ps.setString(5, groceryDTO.getProductReview());

            int rows = ps.executeUpdate();
            if (rows != 0) {
                System.out.println("Row is inserted succesfully to DB...!");
            }

        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        } catch (SQLException s) {
            s.printStackTrace();
        }

        return null;
    }
}
