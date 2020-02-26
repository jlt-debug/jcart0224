package com.jlt.jcart.store.back.dao;


import com.jlt.jcart.store.back.po.OrderDetail;

public interface OrderDetailMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKeyWithBLOBs(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}