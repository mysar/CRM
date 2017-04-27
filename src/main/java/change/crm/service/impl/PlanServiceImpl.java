package change.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import change.crm.mapper.PlanMapper;
import change.crm.model.Plan;
import change.crm.model.QueryVo;
import change.crm.service.PlanService;

@Service("planService")
public class PlanServiceImpl implements PlanService {
	

	private PlanMapper planMapper;
		
	@Resource
	public void setPlanMapper(PlanMapper planMapper) {
		this.planMapper = planMapper;
	}

	@Override
	public int saveObject(Plan entity) {
		// TODO Auto-generated method stub
		return planMapper.saveObject(entity);
	}

	@Override
	public int updateObject(Plan entity) {
		// TODO Auto-generated method stub
		return planMapper.updateObject(entity);
	}

	@Override
	public int deleteObject(Plan entity) {
		// TODO Auto-generated method stub
		return planMapper.deleteObject(entity);
	}

	@Override
	public int deleteObjectById(Integer id) {
		// TODO Auto-generated method stub
		return planMapper.deleteObjectById(id);
	}

	@Override
	public Plan getObjectById(Integer id) {
		// TODO Auto-generated method stub
		return planMapper.getObjectById(id);
	}

	@Override
	public List<Plan> getObjects(QueryVo<Plan> vo) {
		// TODO Auto-generated method stub
		return planMapper.getObjects(vo);
	}

	@Override
	public Integer getObjectsSize(QueryVo<Plan> vo) {
		// TODO Auto-generated method stub
		return planMapper.getObjectsSize(vo);
	}
}
