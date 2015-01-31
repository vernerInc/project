package ua.com.verner.back.dao.user;

import ua.com.verner.back.entity.User;

import java.util.List;

/**
 * author trancer
 * since 31.01.2015.
 */
public interface UserDAO {

    void save(User user);

    List<User> list();
}
