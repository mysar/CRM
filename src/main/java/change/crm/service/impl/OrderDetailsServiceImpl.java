package change.crm.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import change.crm.mapper.OrderDetailsMapper;
import change.crm.model.OrderDetails;
import change.crm.model.QueryVo;
import change.crm.service.OrderDetailsService;


@Service("orderDetailsService")
public class OrderDetailsServiceImpl implements OrderDetailsService{

	private OrderDetailsMapper orderDetailsMapper;

	@Resource
	public void setOrderDetailsMapper(OrderDetailsMapper orderDetailsMapper) {
		this.orderDetailsMapper = orderDetailsMapper;
	}

	@Override
	public int saveObject(OrderDetails entity) {
		return orderDetailsMapper.saveObject(entity);
	}

	@Override
	public int updateObject(OrderDetails entity) {
		return orderDetailsMapper.updateObject(entity);
	}

	@Override
	public int deleteObject(OrderDetails entity) {
		//return customerLossMapper.deleteObject(entity);
		return 0;
	}

	@Override
	public int deleteObjectById(Integer id) {
		return orderDetailsMapper.deleteObjectById(id);
	}

	@Override
	public OrderDetails getObjectById(Integer id) {
		return orderDetailsMapper.getObjectById(id);
	}

	@Override
	public List<OrderDetails> getObjects(QueryVo<OrderDetails> vo) {
		return orderDetailsMapper.getObjects(vo);
	}

	@Override
	public Integer getObjectsSize(QueryVo<OrderDetails> vo) {
		return orderDetailsMapper.getObjectsSize(vo);
	}

	


}
