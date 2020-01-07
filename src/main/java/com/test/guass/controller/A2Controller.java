package com.test.guass.controller;

import com.test.guass.repository.A2Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName A2Controller
 * @Author Andy
 * @Date 2020/1/7 10:55
 * @Description TODO
 **/
@RestController
public class A2Controller {
    @Resource
    private A2Repository a2Repository;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Map<String, Object> test() {
        Map<String, Object> result = new HashMap<>();
        result.put("result", a2Repository.findOne("2919J117000Y"));
        return result;
    }
}
