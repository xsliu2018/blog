package com.xsl.blog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class BlogApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    DataSource dataSource;
    @Test
    public void testDatabase() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection == null);
    }
}
