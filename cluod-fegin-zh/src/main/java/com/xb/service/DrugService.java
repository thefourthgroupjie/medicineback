package com.xb.service;

import com.xb.DrugServiceApi;
import org.springframework.cloud.openfeign.FeignClient;


import java.util.Map;


@FeignClient("springcloud-server")
public interface DrugService extends DrugServiceApi {


}
