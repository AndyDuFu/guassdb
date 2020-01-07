package com.test.guass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @ClassName JavaTest
 * @Author Andy
 * @Date 2020/1/7 9:52
 * @Description TODO
 **/
public class JavaTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.huawei.gauss.jdbc.ZenithDriver");
        //Connection connection = DriverManager.getConnection("jdbc:zenith:@22.62.73.111:29009", "guassdba", "gaussdb_123");
        Connection connection = DriverManager.getConnection("jdbc:zenith:@22.62.73.111:29009", "QKJ", "Star*2019qkj");
        System.out.println(connection == null);

    }
}
