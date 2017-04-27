package change.crm.mapper;

import java.util.List;

import change.crm.model.Chance;
import change.crm.model.QueryVo;
/**
 * 销售机会表
 */
public interface ChanceMapper {
	
	int saveObject(Chance entity);

	int updateObject(Chance entity);

	int deleteObject(Chance entity);
	
	int deleteObjectById(Integer id);

	Chance getObjectById(Integer id);

	List<Chance> getObjects(QueryVo<Chance> vo);

	Integer getObjectsSize(QueryVo<Chance> vo);
}
