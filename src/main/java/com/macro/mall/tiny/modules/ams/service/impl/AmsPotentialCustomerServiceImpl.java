package com.macro.mall.tiny.modules.ams.service.impl;

import com.macro.mall.tiny.modules.ams.model.AmsPotentialCustomer;
import com.macro.mall.tiny.modules.ams.mapper.AmsPotentialCustomerMapper;
import com.macro.mall.tiny.modules.ams.service.AmsPotentialCustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 * 报名用户表 服务实现类
 * </p>
 *
 * @author macro
 * @since 2022-08-13
 */
@Service
public class AmsPotentialCustomerServiceImpl extends ServiceImpl<AmsPotentialCustomerMapper, AmsPotentialCustomer> implements AmsPotentialCustomerService {
	@Override
	public boolean create(AmsPotentialCustomer amsPotentialCustomer) {
		amsPotentialCustomer.setCreateTime(new Date());
		amsPotentialCustomer.setModifyTime(new Date());
		return save(amsPotentialCustomer);
	}
}
