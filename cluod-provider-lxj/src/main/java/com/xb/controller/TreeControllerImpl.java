package com.xb.controller;

import com.xb.mapper.TreeMapper;
import com.xb.model.Tree;
import com.xb.service.TreeServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TreeControllerImpl implements TreeServiceApi {

    @Autowired
    private TreeMapper treeMapper;

    @RequestMapping(value = "queryTree",method = RequestMethod.POST)
    @ResponseBody
    @Override
    public List<Tree> queryTree() {
        Integer  pid =0;
        List<Tree> list =queryNode(pid);
        return list;
    }

    private List<Tree> queryNode(int pid) {
        List<Tree> list =treeMapper.queryTree(pid);
        for (Tree tree : list) {
            Integer id =tree.getId();
            List<Tree> nodeList =queryNode(id);
            if (nodeList.size()<=0){
                tree.setSelectable(true);
            }else {
                tree.setSelectable(false);
                tree.setNodes(nodeList);
            }
        }

        return  list;
    }
}
