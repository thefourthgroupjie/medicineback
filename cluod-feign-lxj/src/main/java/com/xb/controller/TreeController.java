package com.xb.controller;


import com.xb.model.Tree;
import com.xb.service.TreeServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TreeController {
    @Autowired
    private TreeServiceFeign treeServiceFeign;

    @RequestMapping(value = "queryTree",method = RequestMethod.POST)
    @ResponseBody
    public List<Tree> queryTree(){
        return treeServiceFeign.queryTree();
    }

}
