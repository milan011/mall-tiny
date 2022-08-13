package com.macro.mall.tiny.modules.ams.controller;


import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.ams.model.AmsActivity;
import com.macro.mall.tiny.modules.ams.service.AmsActivityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 课程活动表 前端控制器
 * </p>
 *
 * @author macro
 * @since 2022-08-13
 */
@RestController
@Api(tags = "AmsActivityController")
@Tag(name = "AmsActivityController",description = "活动管理")
@RequestMapping("/ams/amsActivity")
public class AmsActivityController {
	@Autowired
	AmsActivityService amsActivityService;
	@Value("${jwt.tokenHeader}")
	private String tokenHeader;
	@Value("${jwt.tokenHead}")
	private String tokenHead;

	@ApiOperation(value = "添加活动")
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public CommonResult<?> create(@RequestBody AmsActivity activity) {
		boolean success = amsActivityService.create(activity);
		if (success) {
			return CommonResult.success(null);
		}
		return CommonResult.failed();

	}
}

