package change.crm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import change.crm.model.QueryVo;
import change.crm.model.User;
import change.crm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	private UserService userService;

	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}

	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	// 显示用户全部信息
	@RequestMapping(value = { "/selectUser.controller" })
	public String selectUser(Model model, QueryVo<User> vo, User user) {
		// form表单搜索
		vo.setEntity(user);
		List<User> objects = userService.getObjects(vo);
		model.addAttribute("userList", objects);
		return "admin/graph_echarts";
	}

	// 根据id删除信息
	@RequestMapping(value = { "/deleteUser.controller" })
	public Boolean deleteObject(Integer id) {
		boolean flag = false;
		userService.deleteObject(id);
		return flag;
	}

}
