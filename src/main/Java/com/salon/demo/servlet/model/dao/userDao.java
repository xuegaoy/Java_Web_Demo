package com.salon.demo.servlet.model.dao;


import com.salon.demo.servlet.entity.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by gaogao on 2017/6/21.
 */
public interface userDao {
    public ResultSet get(Connection conn, User user) throws SQLException;
}
