package com.xb;

import com.xb.model.DrugBean;
import com.xb.model.DrugStoreBean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

public interface DrugServiceApi {
    @RequestMapping(value = "findDrugList",method = RequestMethod.POST)
    Map<String, Object> findDrugList(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows);
    @RequestMapping(value = "updateDrug",method = RequestMethod.POST)
    void updateDrug(@RequestBody DrugBean drugBean);
    @RequestMapping(value = "saveDrug",method = RequestMethod.POST)
    void saveDrug(@RequestBody DrugBean drugBean);
    @RequestMapping(value = "delDrug",method = RequestMethod.POST)
    void delDrug( @RequestParam("ids") Integer[] ids);
    @RequestMapping(value = "findDrugInfoById",method = RequestMethod.POST)
    DrugBean findDrugInfoById( @RequestParam("id")  Integer id);


    @RequestMapping(value = "findDrugStoreList",method = RequestMethod.POST)
    Map<String, Object> findDrugStoreList(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows);

    @RequestMapping(value = "updateDrugStore",method = RequestMethod.POST)
    void updateDrugStore(@RequestBody DrugStoreBean drugBean);

    @RequestMapping(value = "saveDrugStore",method = RequestMethod.POST)
    void saveDrugStore(@RequestBody DrugStoreBean drugBean);

    @RequestMapping(value = "delDrugStore",method = RequestMethod.POST)
    void delDrugStore(@RequestParam("ids") Integer[] ids);

    @RequestMapping(value = "findDrugStoreInfoById",method = RequestMethod.POST)
    DrugStoreBean findDrugStoreInfoById(@RequestParam("id") Integer id);
}
