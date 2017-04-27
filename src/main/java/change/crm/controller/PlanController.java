package change.crm.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import change.crm.model.Chance;
import change.crm.model.Plan;
import change.crm.model.QueryVo;
import change.crm.service.ChanceService;
import change.crm.service.PlanService;

@Controller
@RequestMapping("/plan")
public class PlanController {
		
	private PlanService planService;
	private ChanceService chanceService;
	
	@Resource
	public void setPlanService(PlanService planService) {
		this.planService = planService;
	}
	@Resource
	public void setChanceService(ChanceService chanceService) {
		this.chanceService = chanceService;
	}
	
	@RequestMapping("goPlan.controller")
	public String goPlan(QueryVo<Plan> vo,QueryVo<Chance> co,Model model,Plan plan) {
		
		List<Plan> plans = planService.getObjects(vo);
		System.out.println(plans);
		model.addAttribute("paging", plans);
		return "admin/cus_dev_plan";
	}
	@RequestMapping("addPlan.controller")
	public String addPlan(QueryVo<Plan> vo,Model model,Plan plan) {
		plan.setPlanDate(new Date());
		planService.saveObject(plan);
		List<Plan> plans = planService.getObjects(vo);
		model.addAttribute("paging", plans);
		return "admin/cus_dev_plan";
	}
	@RequestMapping("deletePlan.controller")
	public String deletePlan(QueryVo<Plan> vo,Model model,Integer id) {
		planService.deleteObjectById(id);
		List<Plan> objects = planService.getObjects(vo);
		model.addAttribute("paging", objects);
		return "admin/cus_dev_plan";
	}
	
	@RequestMapping("updatePlan.controller")
	public String updatePlan(QueryVo<Plan> vo,Model model,Plan plan,Chance chance,Integer id) {
		
		chance.setState(1);
		chance.setDevResult(1);
		chanceService.updateObject(chance);

		List<Plan> objects = planService.getObjects(vo);
		model.addAttribute("paging", objects);
		return "admin/cus_dev_plan";
	}
}

