package com.zhangguoming.zhoukao.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zhangguoming.zhoukao.pojo.Plan;
import com.zhangguoming.zhoukao.service.PlanService;

@Controller
public class PlanController {
	@Autowired
	private PlanService planService;
	
//	@RequestMapping(value="/plan",method=RequestMethod.GET)
	@GetMapping("plan")
	public String getPageInfo(Plan plan,Model model,
			@RequestParam(value="pageNum",defaultValue="1") Integer pageNo) {
		
		return "plan";
	}
}
