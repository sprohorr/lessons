package org.example.service;

import org.example.config.HibernateUtil;
import org.example.dto.GroupDTO;
import org.example.entity.Grooup;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

@Service
public class GroupService {
    public Grooup createGroup(GroupDTO groupDTO) {
        Grooup grooup = new Grooup();
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            grooup.setId(groupDTO.getId());
            grooup.setTitle(groupDTO.getTitle());
            grooup.setRoom(groupDTO.getRoom());
            session.save(grooup);
            transaction.commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return grooup;
    }
}
