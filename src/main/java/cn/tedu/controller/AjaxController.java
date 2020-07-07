package cn.tedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/ajax/")
public class AjaxController {
    @RequestMapping("doAjaxGetRequest")
    @ResponseBody//将响应的内容以串的形式进行返回
    public String doAjaxGetRequest(String key){
        return "query data by key="+key;
    }
    @RequestMapping("doAjaxPostRequest")
    @ResponseBody//将响应的内容以串的形式进行返回
    public String doAjaxPostRequest(String key,String value){
        return "save data ["+key+","+value+"]";
    }
    @RequestMapping("doActivityUI")
    public String doActivityUI(){
        return "ajax-01";
    }
}
