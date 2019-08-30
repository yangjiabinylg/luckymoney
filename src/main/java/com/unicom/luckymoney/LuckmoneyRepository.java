package com.unicom.luckymoney;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * @Copyright: Unicom (Zhejiang) Industrial Internet Co., Ltd.    2019 <br/>
 * @Desc: <br/>
 * @ProjectName: luckymoney <br/>
 * @Date: 2019/8/30 10:46 <br/>
 * @Author: yangjiabin
 */

public interface LuckmoneyRepository extends JpaRepository<Luckmoney, Integer> {
}
