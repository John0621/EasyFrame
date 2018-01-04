package org.easyframe.web.admin.controller;

import java.util.List;

import net.sf.json.JSONObject;

import org.easyframe.domain.Test;
import org.easyframe.service.TestService;
import org.easyframe.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@Autowired
	private TestService testService;

	@RequestMapping(value = "/test.do")
	@ResponseBody
	public String getListTest(Model model) {
		List<Test> list = testService.getListTest();
		list = CommonUtils.updateListTest(list);
		JSONObject json = new JSONObject();
		json.put("list", list);
		return json.toString();
	}
}
