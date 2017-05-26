package com.onlineshop.service.impl;

import com.onlineshop.controller.dao.InvoiceDao;
import com.onlineshop.model.entity.Invoice;
import com.onlineshop.model.vo.InvoiceVO;
import com.onlineshop.service.InvoiceService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by smc on 5/21/2017.
 */

@Service
public class InvoiceServiceImpl implements InvoiceService {


    @Autowired
    private InvoiceDao invoiceDao;


    public void addInvoice(InvoiceVO invoiceVO) {
        ModelMapper mapperFromShipmentVO = new ModelMapper();
        Invoice invoice = mapperFromShipmentVO.map(invoiceVO, Invoice.class);
        invoiceDao.addInvoice(invoice);
    }

//    public double getInvoiceTotalPrice(InvoiceVO invoice) {
//        return 0; //
//    }
}
