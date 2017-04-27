package change.crm.mapper;

import java.util.List;

import change.crm.model.Customer;
import change.crm.model.Product;
import change.crm.model.QueryVo;

public interface CustomerMapper {

	/**
	 * 保存实体对象
	 * 
	 * @param entity
	 * @return
	 */
	int saveObject(Customer entity);

	/**
	 * 更新实体对象
	 * 
	 * @param entity
	 * @return
	 */
	int updateObject(Customer entity);

	/**
	 * 删除实体对象
	 * 
	 * @param entity
	 * @return
	 */
	int deleteObject(Customer entity);

	/**
	 * 根据主键id删除实体对象
	 * 
	 * @param entity
	 * @return
	 */
	int deleteObjectById(Integer id);

	/**
	 * 根据id查询实体对象
	 * 
	 * @param id
	 * @return
	 */
	Customer getObjectById(Integer id);

	/**
	 * 条件查询
	 * 
	 * @param vo
	 * @return
	 */
	List<Customer> getObjects(QueryVo<Customer> vo);

	/**
	 * 获取总记录数
	 * 
	 * @param vo
	 * @return
	 */
	Integer getObjectsSize(QueryVo<Customer> vo);
	

}
