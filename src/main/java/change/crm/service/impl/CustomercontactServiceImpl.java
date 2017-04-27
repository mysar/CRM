package change.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import change.crm.mapper.CustomercontactMapper;
import change.crm.model.Customercontact;
import change.crm.model.QueryVo;
import change.crm.service.CustomercontactService;

@Service("customercontactService")
public class CustomercontactServiceImpl implements CustomercontactService {

	private CustomercontactMapper customercontactMapper;
	@Resource
	public void setCustomercontactMapper(CustomercontactMapper customercontactMapper) {
		this.customercontactMapper = customercontactMapper;
	}

	@Override
	public int saveObject(Customercontact entitiy) {
		// TODO Auto-generated method stub
		return customercontactMapper.saveObject(entitiy);
	}

	@Override
	public int updateObject(Customercontact entitiy) {
		// TODO Auto-generated method stub
		return customercontactMapper.updateObject(entitiy);
	}

	@Override
	public int deleteObjectById(Integer id) {
		// TODO Auto-generated method stub
		return customercontactMapper.deleteObjectById(id);
	}

	@Override
	public Customercontact getObjectById(Integer id) {
		// TODO Auto-generated method stub
		return customercontactMapper.getObjectById(id);
	}

	@Override
	public List<Customercontact> getObjects(QueryVo<Customercontact> vo) {
		// TODO Auto-generated method stub
		return customercontactMapper.getObjects(vo);
	}

	@Override
	public Integer getObjectsSize(QueryVo<Customercontact> vo) {
		// TODO Auto-generated method stub
		return customercontactMapper.getObjectsSize(vo);
	}

}
