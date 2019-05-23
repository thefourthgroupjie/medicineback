package com.xb.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("cloudprovider-server")
public interface TreeServiceFeign extends TreeServiceApi {

}
