package com.unicom.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * @Copyright: Unicom (Zhejiang) Industrial Internet Co., Ltd.    2019 <br/>
 * @Desc: <br/>
 * @ProjectName: luckymoney <br/>
 * @Date: 2019/8/30 10:47 <br/>
 * @Author: yangjiabin
 */
@RestController
public class LuckymoneyController {

    @Autowired
    private LuckmoneyRepository repository;


    /**
     * 获取红包列表
     * @return
     */
    @GetMapping("/luckmoneys")
    public List<Luckmoney> list(){
        return repository.findAll();
    }


    /**
     * 创建红包
     */
    @PostMapping("/luckmoneys")
    public Luckmoney create(@RequestParam("producer") String producer,
                            @RequestParam("money")BigDecimal money){
        Luckmoney luckmoney = new Luckmoney();
        luckmoney.setProducer(producer);
        luckmoney.setMoney(money);
        return repository.save(luckmoney);
    }



    /**
     * 通过id查询红包
     */
    @GetMapping("/luckmoneys/{id}")
    public Luckmoney findById(@PathVariable("id") Integer id){
        //查不到就返回null
        return repository.findById(id).orElse(null);
    }



    /**
     * 更新红包（领红包）
     */
    @PutMapping("/luckmoneys/{id}")
    public Luckmoney update(@PathVariable("id") Integer id,
                            @RequestParam("consumer") String consumer){
        Optional<Luckmoney> optional = repository.findById(id);
        if(optional.isPresent()){
            Luckmoney luckmoney = optional.get();
            luckmoney.setId(id);
            luckmoney.setConsumer(consumer);
            return repository.save(luckmoney);
        }
        return null;


        //   这个不行会把没设置的字段弄成null的
//        Luckmoney luckmoney = new Luckmoney();
//        luckmoney.setId(id);
//        luckmoney.setConsumer(consumer);
//        return repository.save(luckmoney);
    }



    @Autowired
    private LuckmoneyService luckmoneyService;



    @PostMapping("/luckmoneys/two")
    public void createTwo(){
        luckmoneyService.createTwo();
    }




}
