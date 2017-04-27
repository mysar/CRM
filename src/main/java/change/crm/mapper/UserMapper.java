package change.crm.mapper;

import java.util.List;

import change.crm.model.QueryVo;
import change.crm.model.User;

public interface UserMapper {

	/**
	 * 保存的方法
	 * 
	 * @param user
	 */
	void saveObject(User user);

	/**
	 * 根据主键id查询实体对象
	 * 
	 * @param id
	 * @return
	 */
	User getObjectById(Integer id);

	/**
	 * 条件查询
	 * 
	 * @param vo
	 * @return
	 */
	List<User> getObjects(QueryVo<User> vo);

	/**
	 * 根据id更新数据
	 * 
	 * @param id
	 */
	void updateById(User user);

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
	Integer getObjectsSize(QueryVo<User> vo);

}
