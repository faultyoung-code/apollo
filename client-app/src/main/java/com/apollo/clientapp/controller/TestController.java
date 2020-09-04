package com.apollo.clientapp.controller;

import com.apollo.clientapp.config.LoggerConfig;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@Slf4j
public class TestController {
  //  private static final Logger logger = LoggerFactory.getLogger(LoggerConfig.class);
    @Value("${server.port}")
    private String serverPort;
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public @ResponseBody
    Map test()throws Exception{
        Map<String,String> map=new HashMap<>();
        map.put("code","200");
        map.put("message","成功");
        map.put("serverport",serverPort);
        log.info("========================================info=======================================");
        log.debug("========================================debug=======================================");
        log.error("========================================error=======================================");
        return map;
    }
}
