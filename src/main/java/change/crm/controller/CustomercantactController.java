package change.crm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import change.crm.model.Customercontact;
import change.crm.model.QueryVo;
import change.crm.service.CustomercontactService;

@Controller
@RequestMapping("/cantact")
public class CustomercantactController {

	private CustomercontactService customercontactService;
	@Resource
	public void setCustomercontactService(CustomercontactService customercontactService) {
		this.customercontactService = customercontactService;
	}
	
	@RequestMapping("gocantact.controller")
	public String gocantact(QueryVo<Customercontact> vo,Model model,Customercontact customercontact) {
		vo.setEntity(customercontact);
		List<Customercontact> objects = customercontactService.getObjects(vo);
		model.addAttribute("entity", objects);
		return "admin/customercontact";
	}
	@RequestMapping("addcantact.controller")
	public String addcantact(QueryVo<Customercontact> vo,Model model,Customercontact customercontact) {
		customercontactService.saveObject(customercontact);
		
		List<Customercontact> objects = customercontactService.getObjects(vo);
		model.addAttribute("entity", objects);
		return "admin/customercontact";
	}
	@RequestMapping("deletecantact.controller")
	public String deletecantact(QueryVo<Customercontact> vo,Model model,Integer id) {
		customercontactService.deleteObjectById(id);
		List<Customercontact> objects = customercontactService.getObjects(vo);
		model.addAttribute("entity", objects);
		return "admin/customercontact";
	}
}
