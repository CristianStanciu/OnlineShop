package com.onlineshop.controller.dao.impl;

import com.onlineshop.controller.dao.ProductDao;
import com.onlineshop.model.entity.Product;
import com.onlineshop.model.entity.ProductType;
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

    public void editProduct(Product product) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();
    }

    public void deleteProduct(Product product) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(product);
    }

    public Product getProductById(int productId) {
        Session session = sessionFactory.getCurrentSession();
        return (Product) session.get(Product.class, productId);
    }

    public List<Product> getProductList() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Product");
        List<Product> productList = query.list();
        session.flush();
        return productList;
    }

    public List<ProductType> getAllProductTypes() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from ProductType");
        List<ProductType> productTypes = query.list();
        return productTypes;
    }

    public List<Product> getProductsByType(String productType) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Product where productType = ?");
        query.setParameter(0, productType);
        List<Product> products = query.list();
        return products;
    }


    public List<Product> getLatestProducts() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Product");
        List<Product> lastFourAddedProducts = query.setFirstResult(query.list().size() - 6).list();
        return lastFourAddedProducts;

    }

    public Product getLastProduct(){
        Session session = sessionFactory.getCurrentSession();
        Query<Product> query = session.createQuery("from Product order by productId DESC");
        query.setMaxResults(1);
        return query.uniqueResult();
    }
}
