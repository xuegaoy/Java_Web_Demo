package com.salon.demo.servlet.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
/**
 * Created by gaogao on 2017/6/22.
 */
public class ConnectionFactory {

    private static String driver;
    private static String dburl;
    private static String user;
    private static String password;

    private static final ConnectionFactory factory =new ConnectionFactory();
    private Connection conn;
    static{
        //执行cf = ConnectionFactory.getInstance()时，调用到此处
        //step2
        Properties prop = new Properties();
        try {
            InputStream in = ConnectionFactory.class.getClassLoader()
                    .getResourceAsStream("dbconfig.properties");
            prop.load(in);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("=====配置文件读取错误======");
        }
        driver=prop.getProperty("driver");
        dburl=prop.getProperty("dburl");
        user=prop.getProperty("user");
        password=prop.getProperty("password");
    }
    //执行cf = ConnectionFactory.getInstance()时，调用到此处
    //step1
    private ConnectionFactory(){

    }
    //执行cf = ConnectionFactory.getInstance()时，调用到此处
    //step3
    public static ConnectionFactory getInstance(){
        return factory;
    }

    public Connection makeConnection(){
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(dburl,user,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
