package com.salon.demo.servlet.service;


import com.salon.demo.servlet.entity.User;
import com.salon.demo.servlet.model.dao.impl.userDaoImpl;
import com.salon.demo.servlet.model.dao.userDao;
import com.salon.demo.servlet.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;


/**
 * Created by gaogao on 2017/6/22.
 */
public class userDaoService {
    private userDao userDao = new userDaoImpl();

    public boolean check(User user) {
        Connection conn = null;
        try {
            conn = ConnectionFactory.getInstance().makeConnection();
            conn.setAutoCommit(false);
            ResultSet resultSet = userDao.get(conn, user);
            while (resultSet.next()) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (Exception e2) {
                System.out.println("在此处出错11");
                e2.printStackTrace();
            }
        } finally {
            try {
                conn.close();
            } catch (Exception e2) {
                System.out.println("在此处出错22");
                e2.printStackTrace();
            }
        }
        return false;
    }
}
