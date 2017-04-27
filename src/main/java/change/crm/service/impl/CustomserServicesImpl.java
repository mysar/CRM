package change.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import change.crm.mapper.CustomServiceMapper;
import change.crm.mapper.UserMapper;
import change.crm.model.CustomerService;
import change.crm.model.QueryVo;
import change.crm.model.User;
import change.crm.service.CustomerServices;
import change.crm.service.UserService;

@Service
public class CustomserServicesImpl implements CustomerServices {

	private CustomServiceMapper customServiceMapper;

	@Resource
	public void setCustomServiceMapper(CustomServiceMapper customServiceMapper) {
		this.customServiceMapper = customServiceMapper;
	}

	// 保存的方法
	public void saveObject(CustomerService customerService) {
		customServiceMapper.saveObject(customerService);
	}

	public CustomerService getObjectById(Integer id) {
		// TODO Auto-generated method stub
		return customServiceMapper.getObjectById(id);
	}

	// 返回user数据
	public List<CustomerService> getObjects(QueryVo<CustomerService> vo) {
		return customServiceMapper.getObjects(vo);
	}

	public void updateById(CustomerService entitiy) {
		customServiceMapper.updateById(entitiy);
	}

	public void deleteObject(Integer id) {
		customServiceMapper.deleteObject(id);
	}

	// 返回总记录数
	public Integer getObjectsSize(QueryVo<CustomerService> vo) {
		// TODO Auto-generated method stub
		return customServiceMapper.getObjectsSize(vo);
	}

}
