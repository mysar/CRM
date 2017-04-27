package change.crm.controller;

import java.util.List;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import change.crm.model.Customercontact;
import change.crm.model.Customerreprieve;
import change.crm.model.QueryVo;
import change.crm.service.CustomerreprieveService;

@Controller
@RequestMapping("/reprieve")
public class CustomerreprieveController {

	private CustomerreprieveService customerreprieveService;
	@Resource
	public void setCustomerreprieveService(CustomerreprieveService customerreprieveService) {
		this.customerreprieveService = customerreprieveService;
	}

	@RequestMapping("goreprieve.controller")
	public String golinkman(QueryVo<Customerreprieve> vo,Model model,Customerreprieve customerreprieve) {
		vo.setEntity(customerreprieve);
		List<Customerreprieve> objects = customerreprieveService.getObjects(vo);
		System.out.println(objects);
		model.addAttribute("entity", objects);
		return "admin/customerreprieve";
	}
	
	
	@RequestMapping("addreprieve.controller")
	public String addreprieve(QueryVo<Customerreprieve> vo,Model model,Customerreprieve customerreprieve) {
		customerreprieveService.saveObject(customerreprieve);
		
		List<Customerreprieve> objects = customerreprieveService.getObjects(vo);
		model.addAttribute("entity", objects);
		return "admin/customerreprieve";
	}
	@RequestMapping("deletereprieve.controller")
	public String deletereprieve(QueryVo<Customerreprieve> vo,Model model,Integer id) {
		customerreprieveService.deleteObjectById(id);
		List<Customerreprieve> objects = customerreprieveService.getObjects(vo);
		model.addAttribute("entity", objects);
		return "admin/customerreprieve";
	}
}
