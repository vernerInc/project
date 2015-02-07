package ua.com.verner.back.dao.user.impl;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import ua.com.verner.back.entity.User;
import ua.com.verner.back.services.user.UserService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring.xml"})
@TransactionConfiguration(defaultRollback = true)
@Transactional
public class UserServiceImplTest {

    private static final Logger logger = Logger.getLogger(UserServiceImplTest.class);

    @Autowired
    private UserService userService;

    @Test
    public void testSave() throws Exception {
        User user = new User();
        user.setLogin("YAKOB4");
        user.setPassword("YAKOB");
        user.setFirstname("Яков");
        user.setLastname("Иванченко");
        userService.save(user);

        List<User> list = userService.list();
        for (User p : list) {
            System.out.println("users List::" + p);
        }

    }

}