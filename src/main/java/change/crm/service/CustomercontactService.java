package change.crm.service;

import java.util.List;

import change.crm.mapper.CustomercontactMapper;
import change.crm.model.Customercontact;
import change.crm.model.QueryVo;

public interface CustomercontactService {
	int saveObject(Customercontact entitiy);

	int updateObject(Customercontact entitiy);

	int deleteObjectById(Integer id);

	Customercontact getObjectById(Integer id);

	List<Customercontact> getObjects(QueryVo<Customercontact> vo);

	Integer getObjectsSize(QueryVo<Customercontact> vo);
}
