package change.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import change.crm.mapper.ProductMapper;
import change.crm.model.Product;
import change.crm.model.QueryVo;
import change.crm.service.ProductService;

@Service("productService")
public class ProductServiceimpl implements ProductService {

	private ProductMapper productMapper;
	@Resource
	public void setProductMapper(ProductMapper productMapper) {
		this.productMapper = productMapper;
	}

	@Override
	public int saveObject(Product entity) {
		// TODO Auto-generated method stub
		return productMapper.saveObject(entity);
	}

	@Override
	public int updateObject(Product entity) {
		// TODO Auto-generated method stub
		return productMapper.updateObject(entity);
	}

	@Override
	public int deleteObject(Product entity) {
		// TODO Auto-generated method stub
		return productMapper.deleteObject(entity);
	}

	@Override
	public int deleteObjectById(Integer id) {
		// TODO Auto-generated method stub
		return productMapper.deleteObjectById(id);
	}

	@Override
	public Product getObjectById(Integer id) {
		// TODO Auto-generated method stub
		return productMapper.getObjectById(id);
	}

	@Override
	public List<Product> getObjects(QueryVo<Product> vo) {
		// TODO Auto-generated method stub
		return productMapper.getObjects(vo);
	}

	@Override
	public Integer getObjectsSize(QueryVo<Product> vo) {
		// TODO Auto-generated method stub
		return productMapper.getObjectsSize(vo);
	}

	
}
