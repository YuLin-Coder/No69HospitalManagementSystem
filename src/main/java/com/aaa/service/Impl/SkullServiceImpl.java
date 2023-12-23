package com.aaa.service.Impl;

import com.aaa.entity.Skull;
import com.aaa.mapper.SkullMapper;
import com.aaa.service.SkullService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class SkullServiceImpl implements SkullService {
    @Resource
    private SkullMapper skullMapper;
    @Override
    public List<Skull> findAllSkull(Skull skull) {
        return skullMapper.findAllSkull(skull);
    }

    @Override
    public int deleteSkull(Integer skullId) {
        return skullMapper.deleteSkull(skullId);
    }

    @Override
    public int addSkull(Skull skull) {
        return skullMapper.addSkull(skull);
    }

    @Override
    public int editSkull(Skull skull) {
        return skullMapper.editSkull(skull);
    }
}
