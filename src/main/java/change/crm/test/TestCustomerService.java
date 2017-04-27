package change.crm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import change.crm.model.CustomerService;
import change.crm.model.QueryVo;
import change.crm.model.User;
import change.crm.service.CustomerServices;
import change.crm.util.Paging;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestCustomerService {

	@Autowired
	private CustomerServices customServices;

	/**
	 * 根据id更新
	 */
	@Test
	public void getObjects() {
		try {
			QueryVo<CustomerService> vo = new QueryVo<CustomerService>();
			List<CustomerService> objects = customServices.getObjects(vo);
			for (CustomerService user : objects) {
				System.out.println(user + "@@@@@@@@");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void getObjectById() {
		try {
			CustomerService objectById = customServices.getObjectById(1);
			System.out.println(objectById);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}