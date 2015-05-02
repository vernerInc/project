package ua.com.verner.back.services.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.verner.back.dao.user.UserDAO;
import ua.com.verner.back.entity.user.User;
import ua.com.verner.back.services.user.UserService;

import java.math.BigDecimal;
import java.util.List;

/**
 * author trancer
 * since 07.02.2015.
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User selectByLogin(String login) {
        User user = userDAO.selectOne(login);
        if (user == null) {
            return null;
        } else {
            user.getUserType();
            return user;
        }
    }

    @Override
    public User selectById(BigDecimal id) {
        return userDAO.selectOne(id);
    }

    @Override
    public void save(User user) {
        userDAO.insert(user);
    }

    @Override
    public List<User> list() {
        return userDAO.list();
    }
}
