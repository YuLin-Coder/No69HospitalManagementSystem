package com.aaa.service;

import com.aaa.entity.Lrecord;
import com.aaa.entity.Pay;
import com.aaa.entity.Register;

import java.util.List;

public interface LpayService {

    int updPay(Register register);
    int addPay(Register register);
    List<Pay> selPays(Register register);
    List<Lrecord> selSurplus(Lrecord lrecord);
}
