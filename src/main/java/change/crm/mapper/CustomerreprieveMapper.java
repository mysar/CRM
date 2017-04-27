package change.crm.mapper;

import java.util.List;

import change.crm.model.Customerreprieve;
import change.crm.model.QueryVo;

public interface CustomerreprieveMapper {

	int saveObject(Customerreprieve entitiy);

	int updateObject(Customerreprieve entitiy);

	int deleteObjectById(Integer id);

	Customerreprieve getObjectById(Integer id);

	List<Customerreprieve> getObjects(QueryVo<Customerreprieve> vo);

	Integer getObjectsSize(QueryVo<Customerreprieve> vo);
	
}
