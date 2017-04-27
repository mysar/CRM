package change.crm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import change.crm.model.Product;
import change.crm.model.QueryVo;
import change.crm.service.ProductService;
import change.crm.util.Paging;

@Controller
@RequestMapping("/index")
public class ProductController {

	private ProductService productService;
	
	@Resource
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}


	// 跳转product页面profile
	@RequestMapping("goProduct.controller")
	public String goProduct(Model model,Product product){
		
		//查询当前数据
		System.out.println("######################"+product.getProductName());
		System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
		QueryVo<Product> vo = new QueryVo<Product>();
		vo.setEntity(product);
		List<Product> products = productService.getObjects(vo);
		for(Product p:products){
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+p);
		}
		
		model.addAttribute("entities", products);
		
		//返回paging对象
		return "admin/product";
	}
}