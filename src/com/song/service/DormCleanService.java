package com.song.service;

import com.song.po.DormClean;
import com.song.po.PageInfo;

import java.util.List;

/**
 * @program: dormitorySystem
 * @description: 宿舍卫生服务接口
 * @author: 宋浩旋
 * @create: 2022-10-18 10:28
 **/
public interface DormCleanService {
    //分页查询
    public PageInfo<DormClean> findPageInfo(Integer d_id, String d_dormbuilding, Integer pageIndex, Integer pageSize);

    public int addDormClean(DormClean dormclean);    //添加宿舍信息
    public int deleteDormClean(Integer g_id);   //删除宿舍信息
    public int updateDormClean(DormClean dormclean); //修改宿舍信息
    public DormClean findDormCleanById(Integer g_id);
    public List<DormClean> getAll();
}
