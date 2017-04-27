package change.crm.mapper;

import java.util.List;

import change.crm.model.Plan;
import change.crm.model.QueryVo;
/**
 * 客户开发计划- Mapper
 */
public interface PlanMapper {
	
	int saveObject(Plan entity);


	int updateObject(Plan entity);


	int deleteObject(Plan entity);


	int deleteObjectById(Integer id);


	Plan getObjectById(Integer id);

	List<Plan> getObjects(QueryVo<Plan> vo);

	Integer getObjectsSize(QueryVo<Plan> vo);
}
