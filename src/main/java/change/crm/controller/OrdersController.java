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

import change.crm.model.Orders;
import change.crm.model.OrdersCustom;
import change.crm.model.QueryVo;
import change.crm.service.OrdersService;
import change.crm.util.Paging;

@Controller
@RequestMapping("/index")
public class OrdersController {

	private OrdersService ordersService;
	
	@Resource
	public void setOrdersService(OrdersService ordersService) {
		this.ordersService = ordersService;
	}
	
	@RequestMapping("/ordersSelectAll.controller")
	@ResponseBody
	public List<OrdersCustom> selectAll(){
		List<OrdersCustom> list = ordersService.getObjects(null);
		return list;		
	}
	
	@RequestMapping("/goOrders.controller")
	public String goOrders(QueryVo<OrdersCustom> vo,Model model,OrdersCustom ordersCustom){
		vo.setEntity(ordersCustom);
		List<OrdersCustom> objects = ordersService.getObjects(vo);
		System.out.println(objects);
		model.addAttribute("orders", objects);
		return "admin/orders";
	}
	
	
	@RequestMapping("/ordersDelete.controller")
	@ResponseBody
	public String goDelete(Integer id,QueryVo<OrdersCustom> vo,Model model){
		ordersService.deleteObjectById(id);
		return "admin/orders";
	}
	
	@RequestMapping("/goOrdersAdd.controller")
	public String goAdd(){
		return "/orders/add";
	}
	
	@RequestMapping("/ordersAdd.controller")
	@ResponseBody
	public Integer add(Orders orders){ 
		
		int id = ordersService.saveObject(orders);
		return 1;
	}
	
	@RequestMapping("/OrdersUpdate.controller")
	public String goUpdate(Integer id,Model model){
		
		OrdersCustom ordersUpdate = ordersService.getObjectById(id);
		
		model.addAttribute("ordersUpdate", ordersUpdate);
		return "/orders/update";
	}
	
	
	@RequestMapping("/ordersUpdate.controller")
	@ResponseBody
	public Integer ordersUpdate(Orders orders){
		int object = ordersService.updateObject(orders);
		return object;
	}
	
	
	@InitBinder    
	public void initBinder(WebDataBinder binder) {    
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");    
	        dateFormat.setLenient(false);    
	        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));    
	} 
}
