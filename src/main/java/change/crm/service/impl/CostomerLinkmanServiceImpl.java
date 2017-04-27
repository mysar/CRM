package change.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import change.crm.mapper.CustomerLinkmanMapper;
import change.crm.model.CustomerLinkman;
import change.crm.model.QueryVo;
import change.crm.service.CustomerLinkmanService;

@Service("customerLinkmanService")
public class CostomerLinkmanServiceImpl implements CustomerLinkmanService {

	private CustomerLinkmanMapper customerLinkmanMapper;
	
	
	@Resource
	public void setCustomerLinkmanMapper(CustomerLinkmanMapper customerLinkmanMapper) {
		this.customerLinkmanMapper = customerLinkmanMapper;
	}


	@Override
	public int saveObject(CustomerLinkman entity) {
		return customerLinkmanMapper.saveObject(entity);
	}


	@Override
	public int updateObject(CustomerLinkman entity) {
		return customerLinkmanMapper.updateObject(entity);
	}


	@Override
	public int deleteObjectById(Integer id) {
		return customerLinkmanMapper.deleteObjectById(id);
	}


	@Override
	public CustomerLinkman getObjectById(Integer id) {
		return customerLinkmanMapper.getObjectById(id);
	}


	@Override
	public List<CustomerLinkman> getObjects(QueryVo<CustomerLinkman> vo) {
		return customerLinkmanMapper.getObjects(vo);
	}


	@Override
	public Integer getObjectsSize(QueryVo<CustomerLinkman> vo) {
		return customerLinkmanMapper.getObjectsSize(vo);
	}


	@Override
	public List<CustomerLinkman> getObjectss() {
		// TODO Auto-generated method stub
		return customerLinkmanMapper.getObjectss();
	}


	

}
