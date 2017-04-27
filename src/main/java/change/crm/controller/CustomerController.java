package change.crm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import change.crm.model.Customer;
import change.crm.model.CustomerLinkman;
import change.crm.model.Customercontact;
import change.crm.model.Datadic;
import change.crm.model.OrdersCustom;
import change.crm.model.QueryVo;
import change.crm.model.User;
import change.crm.service.CustomerLinkmanService;
import change.crm.service.CustomerService;
import change.crm.service.CustomercontactService;
import change.crm.service.DatadicService;
import change.crm.service.OrdersService;
import change.crm.service.UserService;
import change.crm.util.Paging;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	private DatadicService datadicService;
	private CustomerService customerService;
	private UserService userService;
	private OrdersService oredrsServie;
	private CustomerLinkmanService linkmanService;
	private CustomercontactService customercontactService;
	
	public void setCustomercontactService(CustomercontactService customercontactService) {
		this.customercontactService = customercontactService;
	}
	@Resource
	public void setOredrsServie(OrdersService oredrsServie) {
		this.oredrsServie = oredrsServie;
	}
	@Resource
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	@Resource
	public void setDatadicService(DatadicService datadicService) {
		this.datadicService = datadicService;
	}

	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Resource
	public void setLinkmanService(CustomerLinkmanService linkmanService) {
		this.linkmanService = linkmanService;
	}
	@RequestMapping("/goCustomer.controller")
	public String gotoCustomers(){
		return "admin/customers";
	}

	@RequestMapping("customer.controller")
	@ResponseBody
	public Paging<Customer> list(QueryVo<Customer>vo,Customer customer,Integer limit,Integer offset) throws Exception{
		
		if(customer!=null){
			if(customer.getName()!=null){
				String name = customer.getName();

				String str= new String(name.getBytes("iso8859_1"), "UTF-8");
				customer.setName(str);
				
			}
			
			if(customer.getKhno()!=null){
				
				String khno = customer.getKhno();
				String str= new String(khno.getBytes("iso8859_1"), "UTF-8");
				customer.setKhno(str);

				
			}
			vo.setEntity(customer);
		}
		
		Integer total = customerService.getObjectsSize(vo);
		Paging<Customer> paging = new Paging<Customer>();
		paging.setTotal(total);
		vo.setStartSize(offset);
		vo.setPageSize(limit);
		
		List<Customer> object = customerService.getObjects(vo);
		paging.setRows(object);
		return paging;
	}
	

	@RequestMapping("addCustomer.controller")
	public String goAddCustomer(Model model,Customer customer,QueryVo<Customer> vo){
		int r1=(int)(Math.random()*(10));//产生2个0-9的随机数
		int r2=(int)(Math.random()*(10));
		long now = System.currentTimeMillis();//一个13位的时间戳
		String paymentID ="HK"+String.valueOf(now)+String.valueOf(r1)+String.valueOf(r2);
		customer.setKhno(paymentID);
		customer.setState(0);
		customerService.saveObject(customer);
		
		//返回paging对象
		return "admin/customers";
	}
	
	@RequestMapping("updateCustomer.controller")
	public String goUpdateCustomer(Model model,Customer customer,QueryVo<Customer> vo){
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!customer+"+customer);
	vo.setEntity(customer);
		customerService.updateObject(customer);
		//返回paging对象
		return "admin/customers";
	}
	@ResponseBody
	@RequestMapping("selectCustomerById.controller")
	public Customer goselectCustomerById(Integer id){
	
		Customer entity = customerService.getObjectById(id);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$"+entity);
		//返回paging对象
		return entity;
	}
	/**
	 * 从字典表获取客户等级级别
	 * @param vo
	 * @return
	 */
	@ResponseBody
	@RequestMapping("getdatadicByName.controller")
	public List<Datadic> gogetdatadicByName(QueryVo<Datadic> vo,Datadic datadic){
		datadic.setDataDicName("客户等级");
		vo.setEntity(datadic);
		List<Datadic> list = datadicService.getObjects(vo);
		for(Datadic l:list){
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"+l);
		}
		//返回paging对象
		return list;
	}
	@ResponseBody
	@RequestMapping("getObjectsByRole.controller")
	public List<User> gogetLinkManByZW(QueryVo<User> vo,User user){
		user.setRoleName("客户经理");
		vo.setEntity(user);
		List<User> list = userService.getObjects(vo);
		for(User l:list){
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"+l);
		}
		//返回paging对象
		return list;
	}
	@ResponseBody
	@RequestMapping("deleteCustomerById.controller")
	public Boolean godeleteCustomerByIds(String ids){
		boolean flag=false;
		String[] arr = ids.split(",");
		for (int i = 0; i < arr.length; i++) {

			customerService.deleteObjectById(Integer.valueOf(arr[i]));
			flag=true;
		}
		
		return flag;
	}
	
	@ResponseBody   
	@RequestMapping("selectOrderByCusid.controller")
	public Paging<OrdersCustom> goselectOrderByCusid(QueryVo<OrdersCustom> vo,OrdersCustom orders,Integer cusId,Integer limit,Integer offset){
		orders.setCusId(cusId);
		vo.setEntity(orders);
		
		Integer total = oredrsServie.getObjectsSize(vo);
		Paging<OrdersCustom> paging = new Paging<OrdersCustom>();
		paging.setTotal(total);
		vo.setStartSize(offset);
		vo.setPageSize(limit);
		
		List<OrdersCustom> object = oredrsServie.getObjects(vo);
		paging.setRows(object);
		return paging;
		
	}
	@ResponseBody   //linkmanService
	@RequestMapping("selectlinkmanBycusId.controller")
	public Paging<CustomerLinkman> goselectCustomerLinkmanByCusid(QueryVo<CustomerLinkman> vo,CustomerLinkman linkman,Integer cusId,Integer limit,Integer offset){
		linkman.setCusId(cusId);
		vo.setEntity(linkman);
		System.out.println("########################"+vo);
		Integer total = linkmanService.getObjectsSize(vo);
		System.out.println("tata@@@@@@@@@@@@@@@@@@@@@@@@@@@l"+total);
		Paging<CustomerLinkman> paging = new Paging<CustomerLinkman>();
		paging.setTotal(total);
		vo.setStartSize(offset);
		vo.setPageSize(limit);
		
		List<CustomerLinkman> object = linkmanService.getObjects(vo);
		paging.setRows(object);
		return paging;
		
	}

	@ResponseBody   //customercontactService
	@RequestMapping("selectContactByCusid.controller")
	public Paging<Customercontact> goselectContactByCusids(QueryVo<Customercontact> vo,Customercontact customercontact,Integer cusId,Integer limit,Integer offset){
		customercontact.setCusId(cusId);
		vo.setEntity(customercontact);
		
		Integer total = customercontactService.getObjectsSize(vo);
		Paging<Customercontact> paging = new Paging<Customercontact>();
		paging.setTotal(total);
		vo.setStartSize(offset);
		vo.setPageSize(limit);
		
		List<Customercontact> object = customercontactService.getObjects(vo);
		paging.setRows(object);
		return paging;
		
	}
	
	
	
	
}