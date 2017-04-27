package change.crm.service;

import java.util.List;

import change.crm.model.OrderDetails;
import change.crm.model.QueryVo;

/**
 * mapper
 *
 */
public interface OrderDetailsService {

	/**
	 * 保存实体对象
	 * 
	 * @param entity
	 * @return
	 */
	int saveObject(OrderDetails entity);

	/**
	 * 更新实体对象
	 * 
	 * @param entity
	 * @return
	 */
	int updateObject(OrderDetails entity);

	/**
	 * 删除实体对象
	 * 
	 * @param entity
	 * @return
	 */
	int deleteObject(OrderDetails entity);

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
	OrderDetails getObjectById(Integer id);

	/**
	 * 条件查询
	 * 
	 * @param vo
	 * @return
	 */
	List<OrderDetails> getObjects(QueryVo<OrderDetails> vo);

	/**
	 * 获取总记录数
	 * 
	 * @param vo
	 * @return
	 */
	Integer getObjectsSize(QueryVo<OrderDetails> vo);
}
