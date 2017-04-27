package change.crm.mapper;

import java.util.List;

import change.crm.model.Orders;
import change.crm.model.OrdersCustom;
import change.crm.model.QueryVo;

/**
 * mapper
 *
 */
public interface OrdersMapper {

	/**
	 * 保存实体对象
	 * 
	 * @param entity
	 * @return
	 */
	int saveObject(Orders entity);

	/**
	 * 更新实体对象
	 * 
	 * @param entity
	 * @return
	 */
	int updateObject(Orders entity);

	/**
	 * 删除实体对象
	 * 
	 * @param entity
	 * @return
	 */
	int deleteObject(Orders entity);

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
	OrdersCustom getObjectById(Integer id);

	/**
	 * 条件查询
	 * 
	 * @param vo
	 * @return
	 */
	List<OrdersCustom> getObjects(QueryVo<OrdersCustom> vo);

	/**
	 * 获取总记录数
	 * 
	 * @param vo
	 * @return
	 */
	Integer getObjectsSize(QueryVo<OrdersCustom> vo);
}
