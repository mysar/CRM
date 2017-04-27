package change.crm.service;

import java.util.List;

import change.crm.model.Product;
import change.crm.model.QueryVo;

public interface ProductService {
		/**
		 * 保存实体对象
		 * 
		 * @param entity
		 * @return
		 */
		int saveObject(Product entity);

		/**
		 * 更新实体对象
		 * 
		 * @param entity
		 * @return
		 */
		int updateObject(Product entity) ;

		/**
		 * 删除实体对象
		 * 
		 * @param entity
		 * @return
		 */
		int deleteObject(Product entity) ;

		/**
		 * 根据主键id删除实体对象
		 * 
		 * @param entity
		 * @return
		 */
		int deleteObjectById(Integer id) ;

		/**
		 * 根据id查询实体对象
		 * 
		 * @param id
		 * @return
		 */
		Product getObjectById(Integer id) ;
		/**
		 * 条件查询
		 * 
		 * @param vo
		 * @return
		 */
		List<Product> getObjects(QueryVo<Product> vo) ;

		/**
		 * 获取总记录数
		 * 
		 * @param vo
		 * @return
		 */
		Integer getObjectsSize(QueryVo<Product> vo) ;
		
	}
	
