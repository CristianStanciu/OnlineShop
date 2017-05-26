package com.onlineshop.controller.dao.impl;

import com.onlineshop.controller.dao.InvoiceDao;
import com.onlineshop.model.entity.Invoice;
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
public class InvoiceDaoImpl implements InvoiceDao{


    @Autowired
    SessionFactory sessionFactory;

    public void addInvoice(Invoice invoice) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(invoice);
    }


}
