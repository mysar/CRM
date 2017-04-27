package change.crm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import change.crm.model.CustomerLoss;
import change.crm.model.OrderDetails;
import change.crm.model.QueryVo;
import change.crm.service.CustomerLossService;
import change.crm.service.OrderDetailsService;
import change.crm.util.Paging;

@Controller
@RequestMapping("/index")
public class OrderDetailsController {

	private OrderDetailsService orderDetailsService;
	
	@Resource
	public void setOrderDetailsService(OrderDetailsService orderDetailsService) {
		this.orderDetailsService = orderDetailsService;
	}
	
	@RequestMapping("/orderDetailsSelectAll.controller")
	@ResponseBody
	public List<OrderDetails> selectAll(){
		List<OrderDetails> list = orderDetailsService.getObjects(null);
		return list;		
	}
	
	@RequestMapping("/goorderDetails.controller")
	public String goOrderDetails(QueryVo<OrderDetails> vo,Model model,OrderDetails orderDetails){
		vo.setEntity(orderDetails);
		List<OrderDetails> objects = orderDetailsService.getObjects(vo);
		System.out.println(objects);
		model.addAttribute("orderDetails", objects);
		return "admin/orderDetails";
	}
	
	
	
}
