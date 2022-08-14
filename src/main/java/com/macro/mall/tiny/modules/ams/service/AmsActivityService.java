package com.macro.mall.tiny.modules.ams.service;

import com.macro.mall.tiny.modules.ams.model.AmsActivity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 课程活动表 服务类
 * </p>
 *
 * @author macro
 * @since 2022-08-13
 */
public interface AmsActivityService extends IService<AmsActivity> {
	/**
	 * 添加活动
	 */
	boolean create(AmsActivity activity);

}
