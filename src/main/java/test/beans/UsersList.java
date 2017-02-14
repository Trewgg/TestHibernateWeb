package test.beans;

import test.entity.UsersEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import test.util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;


public class UsersList {
    private List<UsersEntity> usersList = new ArrayList<UsersEntity>();

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private Session session = sessionFactory.openSession();

    public List<UsersEntity> getUsers() {

        try {
            session.beginTransaction();

            Criteria criteria = session.createCriteria(UsersEntity.class);
            usersList = criteria.list();

//            Query query = session.createQuery("from UsersEntity");
//            usersList = (ArrayList<UsersEntity>) query.list();

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
