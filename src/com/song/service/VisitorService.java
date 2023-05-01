package com.song.service;

import com.song.po.PageInfo;
import com.song.po.Visitor;

import java.util.List;

/**
 * @program: dormitorySystem
 * @description: 访客
 * @author: 宋浩旋
 * @create: 2022-10-18 10:28
 **/
public interface VisitorService {
    //分页查询
    public PageInfo<Visitor> findPageInfo(String v_name, Integer v_phone , Integer pageIndex, Integer pageSize);
    public int addVisitor(Visitor visitor);   //添加访客信息
    public List<Visitor> getAll();
}
