package change.crm.mapper;

import java.util.List;

import change.crm.model.CustomerLinkman;
import change.crm.model.QueryVo;

public interface CustomerLinkmanMapper {

	int saveObject(CustomerLinkman entitiy);

	int updateObject(CustomerLinkman entitiy);

	int deleteObjectById(Integer id);

	CustomerLinkman getObjectById(Integer id);

	List<CustomerLinkman> getObjects(QueryVo<CustomerLinkman> vo);

	Integer getObjectsSize(QueryVo<CustomerLinkman> vo);
	List<CustomerLinkman> getObjectss();
}
