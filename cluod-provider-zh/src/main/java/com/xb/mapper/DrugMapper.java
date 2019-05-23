package com.xb.mapper;

import com.xb.model.DrugBean;
import com.xb.model.DrugStoreBean;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DrugMapper {
    int findDrugCount();

    List<DrugBean> findDrugList(int start, Integer rows);

    void saveDrug(DrugBean drugBean);


    void delDrug(Integer[] ids);
    
    DrugBean findDrugInfoById(Integer id);

    void updateDrug(DrugBean drugBean);
    

    int findDrugStoreCount();

    List<DrugStoreBean> findDrugStoreList(int start, Integer rows);

    void updateDrugStore(DrugStoreBean drugBean);

    void saveDrugStore(DrugStoreBean drugBean);

    void delDrugStore(Integer[] ids);

    DrugStoreBean findDrugStoreInfoById(Integer id);
}
