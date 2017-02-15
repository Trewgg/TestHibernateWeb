package test.beans;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import test.entity.RolesEntity;
import test.entity.UsersEntity;
import test.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class RolesList {

    private List<RolesEntity> usersList = new ArrayList<RolesEntity>();

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private Session session = sessionFactory.openSession();

    public List<RolesEntity> getRoles(String id) {

        try {
            session.beginTransaction();

            Criteria criteria = session.createCriteria(RolesEntity.class);
            criteria.add(Restrictions.eq("idroles",id));
            criteria.addOrder(Order.asc("roleName"));
            usersList = criteria.list();

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }

        return usersList;
    }

}
