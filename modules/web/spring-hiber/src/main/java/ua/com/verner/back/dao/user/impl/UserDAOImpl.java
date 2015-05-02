package ua.com.verner.back.dao.user.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ua.com.verner.back.dao.user.UserDAO;
import ua.com.verner.back.entity.user.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigDecimal;
import java.util.List;

/**
 * author trancer
 * since 31.01.2015.
 */
@Repository("userDAO")
@Transactional(propagation = Propagation.REQUIRED)
public class UserDAOImpl implements UserDAO {

    private static final Logger logger = Logger.getLogger(UserDAOImpl.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User selectOne(String login) {
        Query query = entityManager.createQuery("from User u WHERE u.login = :login");
        query.setParameter("login", login);
        return (User) query.getSingleResult();
    }

    @Override
    public User selectOne(BigDecimal id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void insert(User user) {
        entityManager.persist(user);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> list() {
        return entityManager.createQuery("from User").getResultList();
    }
}
