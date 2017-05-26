package com.onlineshop.service;

import com.onlineshop.model.vo.InvoiceVO;
import com.onlineshop.model.vo.OrderVO;

/**
 * Created by smc on 5/21/2017.
 */
public interface InvoiceService {

    void addInvoice(InvoiceVO invoiceVO);

//    double getInvoiceTotalPrice(InvoiceVO invoice);

}
