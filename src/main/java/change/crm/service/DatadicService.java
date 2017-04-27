package change.crm.service;

import java.util.List;

import change.crm.model.Datadic;
import change.crm.model.QueryVo;

public interface DatadicService {
	
	int saveObject(Datadic entity);

	int updateObject(Datadic entity);
	
	int deleteObject(Datadic entity);

	int deleteObjectById(Integer id);

	Datadic getObjectById(Integer id);

	List<Datadic> getObjects(QueryVo<Datadic> vo);

	Integer getObjectsSize(QueryVo<Datadic> vo);
}
