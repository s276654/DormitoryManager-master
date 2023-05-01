package com.song.service;

import com.song.po.DormRepair;
import com.song.po.PageInfo;

import java.util.List;

/**
 * @program: dormitorySystem
 * @description: 维修登记
 * @author: 宋浩旋
 * @create: 2022-10-18 10:28
 **/
public interface DormRepairService {

    //分页查询
    public PageInfo<DormRepair> findPageInfo(Integer d_id, String d_dormbuilding, Integer pageIndex, Integer pageSize);

    public int addDormRepair(DormRepair dormrepair);    //添加宿舍信息
    public int deleteDormRepair(Integer r_id);   //删除宿舍信息
    public int updateDormRepair(DormRepair dormrepair); //修改宿舍信息
    public DormRepair findDormRepairById(Integer r_id);
    public List<DormRepair> getAll();
}
