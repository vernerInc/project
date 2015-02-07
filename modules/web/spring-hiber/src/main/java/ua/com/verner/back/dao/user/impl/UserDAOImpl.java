package ua.com.verner.back.dao.user.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.com.verner.back.dao.user.UserDAO;
import ua.com.verner.back.entity.User;

import java.math.BigDecimal;
import java.util.List;

/**
 * author trancer
 * since 31.01.2015.
 */
@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User selectByLogin(String login) {
        Session session = this.sessionFactory.openSession();
        String hql = "from User u WHERE u.login = :login";
        Query query = session.createQuery(hql);
        query.setParameter("login", login);
        User user = (User) query.uniqueResult();
        session.close();
        return user;
    }

    @Override
    public User selectById(BigDecimal id) {
        Session session = this.sessionFactory.openSession();
        User user = (User) session.get(User.class, id);
        session.close();
        return user;
    }

    @Override
    public void save(User user) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(user);
        tx.commit();
        session.close();
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> list() {
        Session session = this.sessionFactory.openSession();
        List<User> personList = session.createQuery("from User").list();
        session.close();
        return personList;
    }
}
