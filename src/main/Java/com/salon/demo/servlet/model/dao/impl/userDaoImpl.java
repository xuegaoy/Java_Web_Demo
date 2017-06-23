package com.salon.demo.servlet.model.dao.impl;


import com.salon.demo.servlet.entity.User;
import com.salon.demo.servlet.model.dao.userDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by gaogao on 2017/6/22.
 */
public class userDaoImpl implements userDao {
    public ResultSet get(Connection conn, User user) throws SQLException {
        // TODO Auto-generated method stub
        PreparedStatement ps = conn.prepareStatement("select * from tbl_user Where name = ? and password = ?");
        ps.setString(1, user.getName());
        ps.setString(2, user.getPassword());
        System.out.println("user.getName()="+user.getName());
        System.out.println("user.getPassword()="+user.getPassword());
        return ps.executeQuery();
    }

}
