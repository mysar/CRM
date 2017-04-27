package change.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import change.crm.mapper.DatadicMapper;
import change.crm.model.Datadic;
import change.crm.model.QueryVo;
import change.crm.service.DatadicService;

@Service("datadicService")
public class DatadicServiceImpl implements DatadicService {
	
	private DatadicMapper datadicMapper;
		
	@Resource
	public void setDatadicMapper(DatadicMapper datadicMapper) {
		this.datadicMapper = datadicMapper;
	}

	@Override
	public int saveObject(Datadic entity) {
		// TODO Auto-generated method stub
		return datadicMapper.saveObject(entity);
	}

	@Override
	public int updateObject(Datadic entity) {
		// TODO Auto-generated method stub
		return datadicMapper.updateObject(entity);
	}

	@Override
	public int deleteObject(Datadic entity) {
		// TODO Auto-generated method stub
		return datadicMapper.deleteObject(entity);
	}

	@Override
	public int deleteObjectById(Integer id) {
		// TODO Auto-generated method stub
		return datadicMapper.deleteObjectById(id);
	}

	@Override
	public Datadic getObjectById(Integer id) {
		// TODO Auto-generated method stub
		return datadicMapper.getObjectById(id);
	}

	@Override
	public List<Datadic> getObjects(QueryVo<Datadic> vo) {
		// TODO Auto-generated method stub
		return datadicMapper.getObjects(vo);
	}

	@Override
	public Integer getObjectsSize(QueryVo<Datadic> vo) {
		// TODO Auto-generated method stub
		return datadicMapper.getObjectsSize(vo);
	}
}
