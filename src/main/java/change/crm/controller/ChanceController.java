package change.crm.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import change.crm.model.Chance;
import change.crm.model.QueryVo;
import change.crm.service.ChanceService;

@Controller
@RequestMapping("/chance")
public class ChanceController {

	private ChanceService chanceService;

	@Resource
	public void setChanceService(ChanceService chanceService) {
		this.chanceService = chanceService;
	}

	@RequestMapping("goChance.controller")
	public String goChance(QueryVo<Chance> vo, Model model,Chance chance) {
		if("".equals(chance.getState())){
			chance.setState(null);
		}
		if("".equals(chance.getLinkMan())){
			chance.setLinkMan(null);
		}
		vo.setEntity(chance);

		List<Chance> chances = chanceService.getObjects(vo);
		model.addAttribute("paging", chances);
		return "admin/cus_sale_chance";
	}
	
	@RequestMapping("addChance.controller")
	public String addChance(QueryVo<Chance> vo,Model model,Chance chance) {
		chance.setCreateTime(new Date());
		chance.setAssignTime(new Date());

		chanceService.saveObject(chance);
		List<Chance> chances = chanceService.getObjects(vo);
		model.addAttribute("paging", chances);
		return "admin/cus_sale_chance";
	}
	
	@RequestMapping("deleteChance.controller")
	public String deletePlan(QueryVo<Chance> vo,Model model,Integer id) {
		chanceService.deleteObjectById(id);
		List<Chance> objects = chanceService.getObjects(vo);
		model.addAttribute("paging", objects);
		return "admin/cus_sale_chance";
	}

}
