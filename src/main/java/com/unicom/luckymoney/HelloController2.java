package com.unicom.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * @Copyright: Unicom (Zhejiang) Industrial Internet Co., Ltd.    2019 <br/>
 * @Desc: <br/>
 * @ProjectName: luckymoney <br/>
 * @Date: 2019/8/30 9:26 <br/>
 * @Author: yangjiabin
 */
@Controller
@RequestMapping("/yang")
public class HelloController2 {

    @ResponseBody
    @GetMapping("/hellosec")
    public String say(){
        return "学习SpringBoot  啊啊啊";
    }


    @GetMapping({"/hellosec2","/hi"})
    public String say2(){
        return "index";
    }

    @PostMapping({"/say3"})
    public String say3(){
        return "index";
    }


    //************************************************************************

    @ResponseBody
    @GetMapping({"/say4/{id}"})
    public String say4(@PathVariable("id") Integer myId){
        return "myId: " + myId;
    }

    @ResponseBody
    @GetMapping({"/say5"})
    public String say5(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myId){
        return "myId: " + myId;
    }

    @ResponseBody
    @PostMapping({"/say6"})
    public String say6(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myId){
        return "myId: " + myId;
    }





}
