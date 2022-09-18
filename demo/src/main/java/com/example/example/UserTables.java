package com.example.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.example.Model.UserModel;
import com.opensymphony.xwork2.ActionSupport;

public class UserTables extends ActionSupport{
    
    private List<UserModel> users;
    public String displayTables()  {

        Connection connection;
        PreparedStatement ps;
        ResultSet rs;
        users = new ArrayList<>();

        try {
            String URL = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "meljamaica");
            String sql = "SELECT name, age, contact_number FROM user WHERE = ?";
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                UserModel user = new UserModel();
                user.setId(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setAge(rs.getInt(3));
                user.setContactNumber(rs.getString(4));
                users.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }

    
    public List<UserModel> getUsers() {
        return users;
    }
    public void setUsers(List<UserModel> users) {
        this.users = users;
    }
    
}
