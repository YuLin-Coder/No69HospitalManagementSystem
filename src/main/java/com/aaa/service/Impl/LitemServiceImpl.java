package com.aaa.service.Impl;

import com.aaa.entity.Litem;
import com.aaa.entity.Lrecord;
import com.aaa.mapper.LitemMapper;
import com.aaa.service.LitemService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class LitemServiceImpl implements LitemService {

    @Resource
    private LitemMapper litemMapper;

    @Override
    public List<Litem> selItems(Litem litem) {
        return litemMapper.selItems(litem);
    }

}
