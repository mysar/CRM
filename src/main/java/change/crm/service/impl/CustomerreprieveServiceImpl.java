package change.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import change.crm.mapper.CustomerreprieveMapper;
import change.crm.model.Customerreprieve;
import change.crm.model.QueryVo;
import change.crm.service.CustomerreprieveService;

@Service("customerreprieveService")
public class CustomerreprieveServiceImpl implements CustomerreprieveService {

	private CustomerreprieveMapper customerreprieveMapper;
    @Resource
	public void setCustomerreprieveMapper(CustomerreprieveMapper customerreprieveMapper) {
		this.customerreprieveMapper = customerreprieveMapper;
	}
	@Override
	public int saveObject(Customerreprieve entitiy) {
		// TODO Auto-generated method stub
		return customerreprieveMapper.saveObject(entitiy);
	}

	@Override
	public int updateObject(Customerreprieve entitiy) {
		// TODO Auto-generated method stub
		return customerreprieveMapper.updateObject(entitiy);
	}

	@Override
	public int deleteObjectById(Integer id) {
		// TODO Auto-generated method stub
		return customerreprieveMapper.deleteObjectById(id);
	}

	@Override
	public Customerreprieve getObjectById(Integer id) {
		// TODO Auto-generated method stub
		return customerreprieveMapper.getObjectById(id);
	}

	@Override
	public List<Customerreprieve> getObjects(QueryVo<Customerreprieve> vo) {
		// TODO Auto-generated method stub
		return customerreprieveMapper.getObjects(vo);
	}

	@Override
	public Integer getObjectsSize(QueryVo<Customerreprieve> vo) {
		// TODO Auto-generated method stub
		return customerreprieveMapper.getObjectsSize(vo);
	}

}
