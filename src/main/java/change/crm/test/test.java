package change.crm.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;

import change.crm.mapper.ProductMapper;
import change.crm.model.Product;
import change.crm.model.QueryVo;
import change.crm.service.ProductService;
import change.crm.util.Paging;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class test {
	private ProductMapper productMapper;
	private ProductService productService;
	@Resource
	public void setProductMapper(ProductMapper productMapper) {
		this.productMapper = productMapper;
	}


	@Resource
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}



	@Test
	public void testsaveww(){
		QueryVo<Product> vo = new QueryVo<Product>();
		//获取总记录数
				Integer total = productService.getObjectsSize(vo);
				//查询当前数据
				List<Product> objects = productService.getObjects(vo);
				//把它设置到分页对象中
		for(Product p:objects){
			System.out.println("@@@@@@@@@@@@@@@@"+p);
		}
	}
}
