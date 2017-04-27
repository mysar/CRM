package change.crm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import change.crm.model.Datadic;
import change.crm.model.QueryVo;
import change.crm.service.DatadicService;

@Controller
@RequestMapping("/datadic")
public class DatadicController {

	private DatadicService datadicService;

	@Resource
	public void setDatadicService(DatadicService datadicService) {
		this.datadicService = datadicService;
	}

	@RequestMapping("goDatadic.controller")
	public String soDatadic(QueryVo<Datadic> vo, Model model,Datadic datadic) {
		
		if("".equals(datadic.getDataDicValue())){
			datadic.setDataDicValue("");
		}
		vo.setEntity(datadic);

		List<Datadic> datadics = datadicService.getObjects(vo);
		
		model.addAttribute("paging", datadics);
		return "admin/cus_dev_datadic";
	}
	
	@RequestMapping("addDatadic.controller")
	public String addDatadic(QueryVo<Datadic> vo,Model model,Datadic datadic) {
		
		datadicService.saveObject(datadic);
		List<Datadic> datadics = datadicService.getObjects(vo);
		model.addAttribute("paging", datadics);
		return "admin/cus_dev_datadic";
	
	}
	
	
	@RequestMapping("deleteDatadic.controller")
	public String deleteDatadic(QueryVo<Datadic> vo,Model model,Integer id) {
		datadicService.deleteObjectById(id);
		List<Datadic> datadics = datadicService.getObjects(vo);
		model.addAttribute("paging", datadics);
		return "admin/cus_dev_datadic";
	}	
}
