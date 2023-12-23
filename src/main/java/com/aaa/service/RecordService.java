package com.aaa.service;

import com.aaa.entity.Record;
import com.aaa.mapper.RecordMapper;

import java.util.List;

public interface RecordService {
    //查询所有记录
    List<Record> selrecord(Record record);
    //添加记录
    int addjilu(Record record);
}
