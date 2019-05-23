package com.xb.controller;

import com.xb.DrugServiceApi;
import com.xb.model.DrugBean;
import com.xb.model.DrugStoreBean;
import com.xb.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("drug")
public class DrugController  {


    @Autowired
    private DrugService drugService;


    //药品数据库查询分页
    @RequestMapping(value = "findDrugList",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> findDrugList(Integer page, Integer rows){

        return drugService.findDrugList(page,rows);
    }

    //新增药品信息
    @RequestMapping(value="saveDrug",method = RequestMethod.POST)
    @ResponseBody
    public Boolean saveDrug(DrugBean drugBean){
        try {
            if(drugBean.getId()!=null){
                drugService.updateDrug(drugBean);
            }else{
                drugService.saveDrug(drugBean);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
//修改药品信息
@RequestMapping(value="updateDrug",method = RequestMethod.POST)
@ResponseBody
public Boolean updateDrug(DrugBean drugBean){
    try {
            drugService.updateDrug(drugBean);
        return true;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
    //删除数据
    @RequestMapping(value="delDrug",method = RequestMethod.POST)
    @ResponseBody
    public Boolean delDrug(Integer[] ids){
        try {
            drugService.delDrug(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //回显数据
    @RequestMapping(value="findDrugInfoById",method = RequestMethod.POST)
    @ResponseBody
    public DrugBean findDrugInfoById(Integer id){
        return drugService.findDrugInfoById(id);
    }



    //药店数据库查询分页
    @RequestMapping(value = "findDrugStoreList",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> findDrugStoreList(Integer page, Integer rows){

        return drugService.findDrugStoreList(page,rows);
    }

    //新增药店信息
    @RequestMapping(value="saveDrugStore",method = RequestMethod.POST)
    @ResponseBody
    public Boolean saveDrugStore(DrugStoreBean drugBean){
        try {
            if(drugBean.getId()!=null){
                drugService.updateDrugStore(drugBean);
            }else{
                drugService.saveDrugStore(drugBean);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    //修改药店信息
    @RequestMapping(value="updateDrugStore",method = RequestMethod.POST)
    @ResponseBody
    public Boolean updateDrugStore(DrugStoreBean drugBean){
        try {
            drugService.updateDrugStore(drugBean);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    //删除药店数据
    @RequestMapping(value="delDrugStore",method = RequestMethod.POST)
    @ResponseBody
    public Boolean delDrugStore(Integer[] ids){
        try {
            drugService.delDrugStore(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //回显药店数据
    @RequestMapping(value="findDrugStoreInfoById",method = RequestMethod.POST)
    @ResponseBody
    public DrugStoreBean findDrugStoreInfoById(Integer id){
        return drugService.findDrugStoreInfoById(id);
    }
}
