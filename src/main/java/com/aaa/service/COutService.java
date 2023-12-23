package com.aaa.service;

import com.aaa.entity.CCashier;
import com.aaa.entity.CPharmacy;
import com.aaa.entity.Coutpatienttype;
import com.aaa.entity.ReportVo;

import java.util.List;

public interface COutService {
    //查询门诊收费项目
    List<CPharmacy> selout(Coutpatienttype coutpatienttype);
    //查询这个用户的处方表上有没有这个药
    Integer selchuo(CCashier cCashier);
    //添加处方药品
    Integer addchuo(CCashier cCashier);
    //如果有该项目则改变该项目的数量
    Integer updchuo(CCashier cCashier);
    //删除处方中的项目
    Integer delo(CCashier cCashier);
    //查询这个用户的处方的价钱
    Double selch(CCashier cCashier);
    //修改用户信息付过钱了
    Integer shoufei(ReportVo reportVo);
    //把挂号费添加到收费表上
    Integer guafei(ReportVo reportVo);
}
