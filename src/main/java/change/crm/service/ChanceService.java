package change.crm.service;

import java.util.List;

import change.crm.model.Chance;
import change.crm.model.QueryVo;

public interface ChanceService {
	
	int saveObject(Chance entity);

	int updateObject(Chance entity);

	int deleteObject(Chance entity);
	
	int deleteObjectById(Integer id);

	Chance getObjectById(Integer id);

	List<Chance> getObjects(QueryVo<Chance> vo);

	Integer getObjectsSize(QueryVo<Chance> vo);
}
