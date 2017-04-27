package change.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import change.crm.mapper.UserMapper;
import change.crm.model.QueryVo;
import change.crm.model.User;
import change.crm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserMapper userMapper;

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	// 保存的方法
	public void saveObject(User user) {
		userMapper.saveObject(user);
	}

	public User getObjectById(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.getObjectById(id);
	}

	// 返回user数据
	public List<User> getObjects(QueryVo<User> vo) {
		return userMapper.getObjects(vo);
	}

	public void updateById(User user) {
		userMapper.updateById(user);
	}

	public void deleteObject(Integer id) {
		userMapper.deleteObject(id);
	}

	// 返回总记录数
	public Integer getObjectsSize(QueryVo<User> vo) {
		// TODO Auto-generated method stub
		return userMapper.getObjectsSize(vo);
	}

}
