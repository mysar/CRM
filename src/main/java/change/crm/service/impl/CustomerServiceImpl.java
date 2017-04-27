package change.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import change.crm.mapper.CustomerMapper;
import change.crm.model.Customer;
import change.crm.model.QueryVo;
import change.crm.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	
	private CustomerMapper customerMapper;

	@Autowired
	public void setCustomerMapper(CustomerMapper customerMapper) {
		this.customerMapper = customerMapper;
	}

	@Override
	public int saveObject(Customer entity) {
		// TODO Auto-generated method stub
		return customerMapper.saveObject(entity);
	}

	@Override
	public int updateObject(Customer entity) {
		// TODO Auto-generated method stub
		return customerMapper.updateObject(entity);
	}

	@Override
	public int deleteObject(Customer entity) {
		// TODO Auto-generated method stub
		return customerMapper.deleteObject(entity);
	}

	@Override
	public int deleteObjectById(Integer id) {
		// TODO Auto-generated method stub
		return customerMapper.deleteObjectById(id);
	}

	@Override
	public Customer getObjectById(Integer id) {
		// TODO Auto-generated method stub
		return customerMapper.getObjectById(id);
	}

	@Override
	public List<Customer> getObjects(QueryVo<Customer> vo) {
		// TODO Auto-generated method stub
		return customerMapper.getObjects(vo);
	}

	@Override
	public Integer getObjectsSize(QueryVo<Customer> vo) {
		// TODO Auto-generated method stub
		return customerMapper.getObjectsSize(vo);
	}

	

}
