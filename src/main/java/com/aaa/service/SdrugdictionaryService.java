package com.aaa.service;

import com.aaa.entity.Area;
import com.aaa.entity.Sdrugdictionary;
import com.aaa.entity.Type;
import com.aaa.entity.Unit;
import com.aaa.mapper.SdrugdictionaryMapper;

import java.util.List;

public interface SdrugdictionaryService {
    List<SdrugdictionaryMapper> findAllSdrugdictionary(Sdrugdictionary sdrugdictionary);
    int addSdrugdictionary(Sdrugdictionary sdrugdictionary);
    int editSdrugdictionary(Sdrugdictionary sdrugdictionary);
    int deleteSdrugdictionary(Integer drugId);
    List<Unit> findAllUnit();
    List<Area> findAllArea();
    List<Type> findAllType();
    int count(Sdrugdictionary sdrugdictionary);
}
