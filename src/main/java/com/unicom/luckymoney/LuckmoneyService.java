package com.unicom.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @Copyright: Unicom (Zhejiang) Industrial Internet Co., Ltd.    2019 <br/>
 * @Desc: <br/>
 * @ProjectName: luckymoney <br/>
 * @Date: 2019/8/30 11:13 <br/>
 * @Author: yangjiabin
 */
@Service
public class LuckmoneyService {

    @Autowired
    private LuckmoneyRepository repository;

    @Transactional
    public void createTwo(){
        Luckmoney luckmoney1 = new Luckmoney();
        luckmoney1.setProducer("师兄1");
        luckmoney1.setMoney(new BigDecimal("520"));
        repository.save(luckmoney1);

        Luckmoney luckmoney2 = new Luckmoney();
        luckmoney2.setProducer("师兄1");
        luckmoney2.setMoney(new BigDecimal("1314"));
        repository.save(luckmoney2);


    }

}
