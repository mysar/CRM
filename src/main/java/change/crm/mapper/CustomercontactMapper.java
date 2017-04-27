package change.crm.mapper;

import java.util.List;

import change.crm.model.Customercontact;
import change.crm.model.QueryVo;


public interface CustomercontactMapper {

	int saveObject(Customercontact entitiy);

	int updateObject(Customercontact entitiy);

	int deleteObjectById(Integer id);

	Customercontact getObjectById(Integer id);

	List<Customercontact> getObjects(QueryVo<Customercontact> vo);

	Integer getObjectsSize(QueryVo<Customercontact> vo);
}
