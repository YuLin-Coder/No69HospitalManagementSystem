package com.aaa.mapper;

import com.aaa.entity.Litem;
import com.aaa.entity.Lrecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LitemMapper {

    List<Litem> selItems(Litem litem);
}
