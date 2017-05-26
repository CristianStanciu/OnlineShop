package com.onlineshop.service.impl;

import com.onlineshop.controller.dao.ShipmentDao;
import com.onlineshop.model.entity.Shipment;
import com.onlineshop.model.vo.ShipmentVO;
import com.onlineshop.service.ShipmentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by smc on 5/21/2017.
 */

@Service
public class ShipmentServiceImpl implements ShipmentService {

    @Autowired
    ShipmentDao shipmentDao;

    public void addShipment(ShipmentVO shipmentVO) {
        ModelMapper mapperFromShipmentVO = new ModelMapper();
        Shipment shipment = mapperFromShipmentVO.map(shipmentVO, Shipment.class);
        shipmentDao.addShipment(shipment);
    }
}
