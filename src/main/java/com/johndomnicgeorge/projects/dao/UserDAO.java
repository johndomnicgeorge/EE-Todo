package com.johndomnicgeorge.projects.dao;

import com.johndomnicgeorge.projects.model.User;
import com.johndomnicgeorge.projects.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDAO {
    public int register(User user) {
        String query = "INSERT INTO users (first_name, last_name, username, password) VALUES (?,?,?,?);";
        int result = 0;
        try (Connection connection = JDBCUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, user.getFirstName());
            preparedStatement.setString(2, user.getLastName());
            preparedStatement.setString(3, user.getUsername());
            preparedStatement.setString(4, user.getPassword());
            result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}