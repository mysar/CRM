package change.crm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import change.crm.model.QueryVo;
import change.crm.model.User;
import change.crm.service.UserService;
import change.crm.util.Paging;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestUser {

	@Autowired
	private UserService userService;

	/**
	 * 查询所有信息
	 */
	@Test
	public void testGetObjectByName() {
		try {
			QueryVo<User> vo = new QueryVo<User>();
			Integer total = userService.getObjectsSize(vo);
			Paging<User> paging = new Paging<User>(1, 10, total);
			System.out.println(paging + "@@@@@@@@@@@paging");
			vo.setStartSize(paging.getStartRecorder());
			vo.setPageSize(paging.getPageSize());
			List<User> objects = userService.getObjects(vo);
			paging.setRows(objects);
			System.out.println(paging);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 根据id更新
	 */
	@Test
	public void getObjectById() {
		try {
			User objectById = userService.getObjectById(1);
			System.out.println(objectById);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 根据id更新
	 */
	@Test
	public void getObjects() {
		try {
			QueryVo<User> vo = new QueryVo<User>();
			List<User> objects = userService.getObjects(vo);
			for (User user : objects) {
				System.out.println(user+"@@@@@@@@");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}