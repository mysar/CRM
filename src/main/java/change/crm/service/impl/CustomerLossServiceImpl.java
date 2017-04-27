package change.crm.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import change.crm.mapper.CustomerLossMapper;
import change.crm.model.CustomerLoss;
import change.crm.model.QueryVo;
import change.crm.service.CustomerLossService;


@Service("customerLossService")
public class CustomerLossServiceImpl implements CustomerLossService{

	private CustomerLossMapper customerLossMapper;

	@Resource
	public void setCustomerLossMapper(CustomerLossMapper customerLossMapper) {
		this.customerLossMapper = customerLossMapper;
	}

	@Override
	public int saveObject(CustomerLoss entity) {
		return customerLossMapper.saveObject(entity);
	}

	@Override
	public int updateObject(CustomerLoss entity) {
		return customerLossMapper.updateObject(entity);
	}

	@Override
	public int deleteObject(CustomerLoss entity) {
		//return customerLossMapper.deleteObject(entity);
		return 0;
	}

	@Override
	public int deleteObjectById(Integer id) {
		return customerLossMapper.deleteObjectById(id);
	}

	@Override
	public CustomerLoss getObjectById(Integer id) {
		return customerLossMapper.getObjectById(id);
	}

	@Override
	public List<CustomerLoss> getObjects(QueryVo<CustomerLoss> vo) {
		return customerLossMapper.getObjects(vo);
	}

	@Override
	public Integer getObjectsSize(QueryVo<CustomerLoss> vo) {
		return customerLossMapper.getObjectsSize(vo);
	}

	


}
