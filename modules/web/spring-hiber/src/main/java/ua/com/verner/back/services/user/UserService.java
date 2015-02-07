package ua.com.verner.back.services.user;

import ua.com.verner.back.entity.User;

import java.math.BigDecimal;
import java.util.List;

/**
 * author trancer
 * since 07.02.2015.
 */
public interface UserService {

    User selectByLogin(String login);

    User selectById(BigDecimal id);

    void save(User user);

    List<User> list();

}
