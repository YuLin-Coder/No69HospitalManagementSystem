package com.aaa.mapper;

import com.aaa.entity.Lrecord;
import com.aaa.entity.Pay;
import com.aaa.entity.Register;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LpayMapper {

    int updPay(Register register);
    int addPay(Register register);
    List<Pay> selPays(Register register);
    List<Lrecord> selSurplus(Lrecord lrecord);
}
