package com.macro.mall.tiny.modules.ams.service.impl;

import com.macro.mall.tiny.modules.ams.model.AmsActivity;
import com.macro.mall.tiny.modules.ams.mapper.AmsActivityMapper;
import com.macro.mall.tiny.modules.ams.service.AmsActivityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 * 课程活动表 服务实现类
 * </p>
 *
 * @author macro
 * @since 2022-08-13
 */
@Service
public class AmsActivityServiceImpl extends ServiceImpl<AmsActivityMapper, AmsActivity> implements AmsActivityService {
	@Override
	public boolean create(AmsActivity activity) {
		/*role.setCreateTime(new Date());
		role.setAdminCount(0);
		role.setSort(0);
		return save(role);*/
		return true;
	}
}
