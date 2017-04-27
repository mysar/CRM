package change.crm.mapper;

import java.util.List;

import change.crm.model.CustomerService;
import change.crm.model.QueryVo;

public interface CustomServiceMapper {

	/**
	 * 保存的方法
	 * 
	 * @param user
	 */
	void saveObject(CustomerService customerService);

	/**
	 * 根据主键id查询实体对象
	 * 
	 * @param id
	 * @return
	 */
	CustomerService getObjectById(Integer id);

	/**
	 * 条件查询
	 * 
	 * @param vo
	 * @return
	 */
	List<CustomerService> getObjects(QueryVo<CustomerService> vo);

	/**
	 * 根据id更新数据
	 * 
	 * @param id
	 */
	void updateById(CustomerService customerService);

	/**
	 * 根据id删除
	 * 
	 * @param user
	 */
	void deleteObject(Integer id);

	/**
	 * 获取总记录数
	 * 
	 * @param vo
	 * @return
	 */
	Integer getObjectsSize(QueryVo<CustomerService> vo);
}
