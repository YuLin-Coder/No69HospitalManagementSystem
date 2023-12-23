package com.aaa.mapper;

import com.aaa.entity.Lcheckup;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CheckupMapper {

    int addCheckup(Lcheckup lcheckup);
    int updPrice(Lcheckup lcheckup);
    List<Lcheckup> selCheckup(Lcheckup lcheckup);
}
