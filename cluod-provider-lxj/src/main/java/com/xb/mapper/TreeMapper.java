package com.xb.mapper;

import com.xb.model.Tree;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TreeMapper {

    List<Tree> queryTree(@Param("pid") int pid);
}
