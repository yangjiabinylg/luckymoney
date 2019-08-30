package com.unicom.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @Copyright: Unicom (Zhejiang) Industrial Internet Co., Ltd.    2019 <br/>
 * @Desc: <br/>
 * @ProjectName: luckymoney <br/>
 * @Date: 2019/8/30 9:26 <br/>
 * @Author: yangjiabin
 */
@RestController
public class HelloController {


    //@RequestMapping(value = "/hello",method = RequestMethod.GET)
    @GetMapping("/hello")
    public String say(){
        return "学习SpringBoot  啊啊啊";
    }

    //************************************************************************

    @Value("${minMoney}")
    private BigDecimal minMoney;

    @Value("${description}")
    private String description;

    @Value("${description2}")
    private String description2;


    @GetMapping("/hello2")
    public String say2(){
        return "minMoney: " + minMoney +
                " description: "+description +
                " description2: "+description2;
    }



    //************************************************************************

    @Autowired
    private LimitConfig limitConfig;

    @GetMapping("/hello3")
    public String say3(){
        return "toString: "+limitConfig.toString() ;
    }




}
