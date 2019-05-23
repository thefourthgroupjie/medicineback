package com.xb.controller;


import com.xb.DrugServiceApi;
import com.xb.mapper.DrugMapper;
import com.xb.model.DrugBean;
import com.xb.model.DrugStoreBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DrugControllerImpl implements DrugServiceApi {


    @Autowired
    private DrugMapper drugMapper;

    //药品数据库查询分页
    @RequestMapping(value = "findDrugList",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public Map<String, Object> findDrugList(Integer page, Integer rows) {
        HashMap<String, Object> params = new HashMap<>();
        int total= drugMapper.findDrugCount();
        int start=(page-1)*rows;
        List<DrugBean> list=drugMapper.findDrugList(start,rows);
        params.put("total",total);
        params.put("rows",list);
        return params;
    }

    //修改药品信息
    @RequestMapping(value = "updateDrug",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public void updateDrug(DrugBean drugBean) {
        drugMapper.updateDrug(drugBean);
    }
    //新增药品信息
    @RequestMapping(value = "saveDrug",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public void saveDrug(DrugBean drugBean) {
        drugMapper.saveDrug(drugBean);
    }

    //删除
    @RequestMapping(value = "delDrug",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public void delDrug(Integer[] ids) {
        drugMapper.delDrug(ids);
    }

    //回显
    @RequestMapping(value = "findDrugInfoById",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public DrugBean findDrugInfoById(Integer id) {
        return drugMapper.findDrugInfoById(id);
    }

    //药店查询分页
    @RequestMapping(value = "findDrugStoreList",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public Map<String, Object> findDrugStoreList(Integer page, Integer rows) {
        HashMap<String, Object> params = new HashMap<>();
        int total= drugMapper.findDrugStoreCount();
        int start=(page-1)*rows;
        List<DrugStoreBean> list=drugMapper.findDrugStoreList(start,rows);
        params.put("total",total);
        params.put("rows",list);
        return params;
    }

    //药店修改
    @RequestMapping(value = "updateDrugStore",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public void updateDrugStore(DrugStoreBean drugBean) {

        drugMapper.updateDrugStore(drugBean);
    }

    //药店新增
    @RequestMapping(value = "saveDrugStore",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public void saveDrugStore(DrugStoreBean drugBean) {

      drugMapper.saveDrugStore(drugBean);
    }

    //药店删除
    @RequestMapping(value = "delDrugStore",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public void delDrugStore(Integer[] ids) {

         drugMapper.delDrugStore(ids);
    }

    //药店回显
    @RequestMapping(value = "findDrugStoreInfoById",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public DrugStoreBean findDrugStoreInfoById(Integer id) {
        return drugMapper.findDrugStoreInfoById(id);
    }
}
