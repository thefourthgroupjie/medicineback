package com.xb.service;

import com.xb.model.Tree;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface TreeServiceApi {
    @RequestMapping(value = "queryTree",method = RequestMethod.POST)
    List<Tree> queryTree();
}
