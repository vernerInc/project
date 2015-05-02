package ua.com.verner.back.dao.user;

import ua.com.verner.back.entity.user.User;

import java.math.BigDecimal;
import java.util.List;

/**
 * author trancer
 * since 31.01.2015.
 */
public interface UserDAO {

    User selectOne(String login);

    User selectOne(BigDecimal id);

    void insert(User user);

    List<User> list();
}
