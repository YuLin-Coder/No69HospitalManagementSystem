package com.aaa.mapper;

import com.aaa.entity.Paiban;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainMapper {
    List<Paiban> one();
    List<Paiban> two();
    List<Paiban> three();
    List<Paiban> four();
    List<Paiban> five();
    List<Paiban> six();
    List<Paiban> seven();
    int currentNum();
    int Total();
    int zhuyuanTotal();
    int currentZhuYuan();

}
