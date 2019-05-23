package com.xb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {

    //查询数据
    @RequestMapping("toDrugPage")
public String toDrugPage(){

    return "DrugPage";
}
   //去新增药品页面
    @RequestMapping("toAddDrugPage")
    public String toAddDrug(){

        return "AddDrugPage";
    }
    //去修改药品页面
    @RequestMapping("toEditPage")
    public String toEditPage(){

        return "EditPage";
    }

    //去药店页面
    @RequestMapping("toDrugStorePage")
    public String toDrugStorePage(){

        return "DrugStorePage";
    }



    //去新增药店页面
    @RequestMapping("toAddDrugStorePage")
    public String toAddDrugStorePage(){

        return "AddDrugStorePage";
    }
    //去修改药店页面
    @RequestMapping("toEditStorePage")
    public String toEditStorePage(){

        return "EditStorePage";
    }
}
