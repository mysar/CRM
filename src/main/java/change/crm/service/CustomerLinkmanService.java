package change.crm.service;

import java.util.List;

import change.crm.model.CustomerLinkman;
import change.crm.model.QueryVo;

public interface CustomerLinkmanService {

	int saveObject(CustomerLinkman entity);

	int updateObject(CustomerLinkman entity);

	int deleteObjectById(Integer id);

	CustomerLinkman getObjectById(Integer id);

	List<CustomerLinkman> getObjects(QueryVo<CustomerLinkman> vo);

	Integer getObjectsSize(QueryVo<CustomerLinkman> vo);
	List<CustomerLinkman> getObjectss();
}
