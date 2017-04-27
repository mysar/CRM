package change.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {

	// 跳转login页面
	@RequestMapping("index.controller")
	public String goIndex() {
		return "admin/index";
	}

	// 跳转login页面
	@RequestMapping("goIndex.controller")
	public String goShoueYe() {
		return "admin/index_v1";
	}

}