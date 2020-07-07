package cn.tedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/ajax/")
public class AjaxController {
    @RequestMapping("doAjaxGetRequest")
    @ResponseBody//将响应串
    public String doAjaxGetRequest(String key){
        return "query data by key="+key;
    }
}
