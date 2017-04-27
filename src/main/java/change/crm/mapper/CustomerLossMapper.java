package change.crm.mapper;

import java.util.List;

import change.crm.model.CustomerLoss;
import change.crm.model.QueryVo;

/**
 * mapper
 *
 */
public interface CustomerLossMapper {

	/**
	 * 保存实体对象
	 * 
	 * @param entity
	 * @return
	 */
	int saveObject(CustomerLoss entity);

	/**
	 * 更新实体对象
	 * 
	 * @param entity
	 * @return
	 */
	int updateObject(CustomerLoss entity);

	/**
	 * 删除实体对象
	 * 
	 * @param entity
	 * @return
	 */
	int deleteObject(CustomerLoss entity);

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
	CustomerLoss getObjectById(Integer id);

	/**
	 * 条件查询
	 * 
	 * @param vo
	 * @return
	 */
	List<CustomerLoss> getObjects(QueryVo<CustomerLoss> vo);

	/**
	 * 获取总记录数
	 * 
	 * @param vo
	 * @return
	 */
	Integer getObjectsSize(QueryVo<CustomerLoss> vo);
}
