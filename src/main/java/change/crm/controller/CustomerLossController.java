package change.crm.controller;


import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import change.crm.model.CustomerLoss;
import change.crm.model.QueryVo;
import change.crm.service.CustomerLossService;

@Controller
@RequestMapping("/customer")
public class CustomerLossController {

	private CustomerLossService customerLossService;
	
	@Resource
	public void setCustomerLossService(CustomerLossService customerLossService) {
		this.customerLossService = customerLossService;
	}
	
	@RequestMapping("/customerLossSelectAll.controller")
	@ResponseBody
	public List<CustomerLoss> selectAll(){
		List<CustomerLoss> list = customerLossService.getObjects(null);
		return list;		
	}
	
	@RequestMapping("/gocustomerLoss.controller")
	public String goCustomerLoss(QueryVo<CustomerLoss> vo,Model model){
		List<CustomerLoss> objects = customerLossService.getObjects(vo);
		System.out.println(objects);
		model.addAttribute("customerLoss", objects);
		return "admin/CustomerLoss";
	}
	
	@RequestMapping("updatecustomerLoss.controller")
	public String updatelinkman(int id,Model model,QueryVo<CustomerLoss> vo) {
		System.out.println("@@@@@@@+@@@@@@@@@@@@@@@@@@@@@@@@"+id);
		CustomerLoss customerLoss = new CustomerLoss();
		customerLoss.setId(id);
		customerLoss.setState(1);
		customerLoss.setConfirmLossTime(new Date());
		customerLossService.updateObject(customerLoss);
		
		List<CustomerLoss> objects = customerLossService.getObjects(vo);
		model.addAttribute("customerLoss", objects);
		return "admin/CustomerLoss";
	}
	
	
}
