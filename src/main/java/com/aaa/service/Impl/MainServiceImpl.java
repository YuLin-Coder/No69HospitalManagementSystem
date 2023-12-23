package com.aaa.service.Impl;

import com.aaa.entity.Paiban;
import com.aaa.mapper.MainMapper;
import com.aaa.service.MainService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class MainServiceImpl implements MainService {
    @Resource
    private MainMapper mainMapper;
    @Override
    public List<Paiban> one() {
        return mainMapper.one();
    }

    @Override
    public List<Paiban> two() {
        return mainMapper.two();
    }

    @Override
    public List<Paiban> three() {
        return mainMapper.three();
    }

    @Override
    public List<Paiban> four() {
        return mainMapper.four();
    }

    @Override
    public List<Paiban> five() {
        return mainMapper.five();
    }

    @Override
    public List<Paiban> six() {
        return mainMapper.six();
    }

    @Override
    public List<Paiban> seven() {
        return mainMapper.seven();
    }

    @Override
    public int currentNum() {
        return mainMapper.currentNum();
    }

    @Override
    public int Total() {
        return mainMapper.Total();
    }

    @Override
    public int zhuyuanTotal() {
        return mainMapper.zhuyuanTotal();
    }

    @Override
    public int currentZhuYuan() {
        return mainMapper.currentZhuYuan();
    }


}
