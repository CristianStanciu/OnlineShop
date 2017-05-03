package com.onlineshop.Dao;

import com.onlineshop.model.Product;
import com.onlineshop.model.ProductType;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by smc on 5/1/2017.
 */
@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {

    @Autowired
    SessionFactory sessionFactory;


    public void addProduct(Product product) {
    Session session = sessionFactory.getCurrentSession();
    session.saveOrUpdate(product);
    session.flush();
    }

    public Product getProductById(int productId) {
        Session session = sessionFactory.getCurrentSession();
        return (Product) session.get(Product.class, productId);
    }

    public List<Product> getAllProducts() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Product");
        List<Product> products = query.list();
        session.flush();
        return  products;
    }

    public void deleteProduct(int productID) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(getProductById(productID));
    }

    public List<ProductType> getAllProductTypes() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from ProductType");
        List<ProductType> productTypes = query.list();
        return productTypes;
    }

}
