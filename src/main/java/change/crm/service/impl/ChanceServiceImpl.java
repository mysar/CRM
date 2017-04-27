package change.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import change.crm.mapper.ChanceMapper;
import change.crm.model.Chance;
import change.crm.model.QueryVo;
import change.crm.service.ChanceService;

@Service("chanceService")
public class ChanceServiceImpl implements ChanceService {
	
	private ChanceMapper chanceMapper;
		
	@Resource
	public void setChanceMapper(ChanceMapper chanceMapper) {
		this.chanceMapper = chanceMapper;
	}

	@Override
	public int saveObject(Chance entity) {
		// TODO Auto-generated method stub
		return chanceMapper.saveObject(entity);
	}

	@Override
	public int updateObject(Chance entity) {
		// TODO Auto-generated method stub
		return chanceMapper.updateObject(entity);
	}

	@Override
	public int deleteObject(Chance entity) {
		// TODO Auto-generated method stub
		return chanceMapper.deleteObject(entity);
	}

	@Override
	public int deleteObjectById(Integer id) {
		// TODO Auto-generated method stub
		return chanceMapper.deleteObjectById(id);
	}

	@Override
	public Chance getObjectById(Integer id) {
		// TODO Auto-generated method stub
		return chanceMapper.getObjectById(id);
	}

	@Override
	public List<Chance> getObjects(QueryVo<Chance> vo) {
		// TODO Auto-generated method stub
		return chanceMapper.getObjects(vo);
	}

	@Override
	public Integer getObjectsSize(QueryVo<Chance> vo) {
		// TODO Auto-generated method stub
		return chanceMapper.getObjectsSize(vo);
	}

}
