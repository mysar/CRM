package change.crm.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import change.crm.model.CustomerLinkman;
import change.crm.model.QueryVo;
import change.crm.service.CustomerLinkmanService;

@Controller
@RequestMapping("/linkman")
public class CustomerLinkManController {

	private CustomerLinkmanService customerLinkmanService;

	@Resource
	public void setCustomerLinkmanService(CustomerLinkmanService customerLinkmanService) {
		this.customerLinkmanService = customerLinkmanService;
	}

	@RequestMapping("golinkman.controller")
	public String golinkman(QueryVo<CustomerLinkman> vo, Model model, CustomerLinkman customerLinkman) {
		vo.setEntity(customerLinkman);
		List<CustomerLinkman> objects = customerLinkmanService.getObjects(vo);
		System.out.println(objects);
		model.addAttribute("entity", objects);
		return "admin/graph_metrics";
	}

	@RequestMapping("addlinkman.controller")
	public String addlinkman(QueryVo<CustomerLinkman> vo, Model model, CustomerLinkman customerLinkman) {
		customerLinkmanService.saveObject(customerLinkman);

		List<CustomerLinkman> objects = customerLinkmanService.getObjects(vo);
		model.addAttribute("entity", objects);
		return "admin/graph_metrics";
	}

	@RequestMapping("deletelinkman.controller")
	public String deletelinkman(QueryVo<CustomerLinkman> vo, Model model, Integer id) {
		customerLinkmanService.deleteObjectById(id);
		List<CustomerLinkman> objects = customerLinkmanService.getObjects(vo);
		model.addAttribute("entity", objects);
		return "admin/graph_metrics";
	}

	@ResponseBody
	@RequestMapping("goupdatelinkman.controller")
	public String goupdatelinkman(Integer id, Model model) {
		CustomerLinkman objectById = customerLinkmanService.getObjectById(id);
		System.out.println(objectById);
		model.addAttribute("linkman", objectById);
		return "admin/updatelinkman";

	}

	@RequestMapping("updatelinkman.controller")
	public String updatelinkman(QueryVo<CustomerLinkman> vo, Model model, CustomerLinkman customerLinkman)
			throws UnsupportedEncodingException {

		String string = new String(customerLinkman.getSex().getBytes("iso8859_1"), "UTF-8");
		customerLinkman.setSex(string);
		customerLinkmanService.updateObject(customerLinkman);
		List<CustomerLinkman> objects = customerLinkmanService.getObjects(vo);
		model.addAttribute("entity", objects);
		return "admin/graph_metrics";

	}
}
