package com.macro.mall.tiny.modules.ams.service.impl;

import com.macro.mall.tiny.modules.ams.model.AmsActivitySign;
import com.macro.mall.tiny.modules.ams.mapper.AmsActivitySignMapper;
import com.macro.mall.tiny.modules.ams.service.AmsActivityService;
import com.macro.mall.tiny.modules.ams.service.AmsActivitySignService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.macro.mall.tiny.modules.ams.service.AmsPotentialCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 * 活动-报名表 服务实现类
 * </p>
 *
 * @author macro
 * @since 2022-08-13
 */
@Service
public class AmsActivitySignServiceImpl extends ServiceImpl<AmsActivitySignMapper, AmsActivitySign> implements AmsActivitySignService {
	@Autowired
	AmsActivityService amsActivityService;
	@Autowired
	AmsPotentialCustomerService amsPotentialCustomerService;
	@Override
	public boolean create(AmsActivitySign activitySign) {
		activitySign.setCreateTime(new Date());
		activitySign.setModifyTime(new Date());
		return save(activitySign);
	}
}
