package change.crm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import change.crm.model.CustomerService;
import change.crm.model.QueryVo;
import change.crm.model.User;
import change.crm.service.CustomerServices;
import change.crm.service.UserService;

@Controller
@RequestMapping("/customerService")
public class CustomerServiceController {

	private CustomerServices customerServices;

	@Resource
	public void setCustomerServices(CustomerServices customerServices) {
		this.customerServices = customerServices;
	}

	// 时间处理格式
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}

	// 服务创建界面
	@RequestMapping(value = { "/createViewCustomerService.controller" })
	public String createCustomerView() {
		return "admin/create_customerService";
	}

	// 显示服务分配信息
	@RequestMapping(value = { "/selectCustomerService.controller" })
	public String selectCustomerService(Model model, QueryVo<CustomerService> vo, CustomerService customerService) {
		// 接收搜索的参数
		vo.setEntity(customerService);
		List<CustomerService> objects = customerServices.getObjects(vo);
		model.addAttribute("customerServiceList", objects);
		return "admin/customerService_echarts";
	}

	// 服务归档
	@RequestMapping(value = { "/selectObjects.controller" })
	public String selectObjects(Model model, QueryVo<CustomerService> vo, CustomerService customerService) {
		if ("0".equals(customerService.getServeType())) {
			customerService.setServeType("");
		} else if ("1".equals(customerService.getServeType())) {
			customerService.setServeType("咨询");
		} else if ("2".equals(customerService.getServeType())) {
			customerService.setServeType("建议");
		} else if ("3".equals(customerService.getServeType())) {
			customerService.setServeType("投诉");
		}
		// 接收搜索的参数
		vo.setEntity(customerService);
		List<CustomerService> objects = customerServices.getObjects(vo);
		model.addAttribute("customerServiceList", objects);
		return "admin/customerService_ServiceArchive";
	}

	// 保存服务创建
	@RequestMapping(value = { "/saveCustomServiceObjects.controller" })
	public ModelAndView saveCustomService(CustomerService customerService) {
		System.out.println(customerService + "@@@@@@@@@@");
		if (customerService != null) {
			customerServices.saveObject(customerService);
		}
		return new ModelAndView("redirect:selectCustomerService.controller");
	}

	// 根据id显示服务分配信息
	@RequestMapping(value = { "/selectObjectsById.controller" })
	public void selectById(Integer id,HttpServletRequest request) {
		System.out.println(id+"@@@@@@@@@@@@@@@@@@id");
		CustomerService customerService = customerServices.getObjectById(id);
		request.setAttribute("entityObjects", customerService);
		System.out.println(customerService + "@@@@@@@@@@@@@@@@");
	}

}
