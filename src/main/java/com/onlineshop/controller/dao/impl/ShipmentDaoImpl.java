package com.onlineshop.controller.dao.impl;

import com.onlineshop.controller.dao.ShipmentDao;
import com.onlineshop.model.entity.Shipment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by smc on 5/21/2017.
 */

@Repository
@Transactional
public class ShipmentDaoImpl implements ShipmentDao {

    @Autowired
    SessionFactory sessionFactory;

    public void addShipment(Shipment shipment) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(shipment);
    }
}
