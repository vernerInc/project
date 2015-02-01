package ua.com.verner.back.dao.user.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.verner.back.dao.user.UserDAO;
import ua.com.verner.back.entity.User;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class UserDAOImplTest {
    private ClassPathXmlApplicationContext context;
    private UserDAO userDAO;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("spring.xml");
        userDAO = context.getBean(UserDAO.class);
    }

    @Test
    public void testSave() throws Exception {
        User user = new User();
        user.setLogin("YAKOB4");
        user.setPassword("YAKOB");
        user.setFirstname(new String("Яков".getBytes(), "UTF-8"));
        user.setLastname("Иванченко");
        userDAO.save(user);

    }

    @Test
    public void testList() throws Exception {
        List<User> list = userDAO.list();
        for (User p : list) {
            System.out.println("users List::" + p);
        }
    }

    @After
    public void after() {
        if (context != null) {
            context.close();
        }
    }
}