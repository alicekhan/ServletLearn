//package mvc.dao;
//
//import java.util.List;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.orm.hibernate5.HibernateTemplate;
//import org.springframework.stereotype.Component;
//
//import mvc.vo.Product;
//
//@Component
//public class ProductDao {
//	
//	@Autowired
//	private HibernateTemplate hibernateTemplate;
//	
//	@Transactional
//	public void createProduct(Product product) {
//		this.hibernateTemplate.save(product);
//	}
//	
//	
//	public List<Product> getProducts(){
//		List<Product> list = this.hibernateTemplate.loadAll(Product.class);
//		return list;
//	}
//	
//	@Transactional
//	public void deleteProduct(int id) {
//		Product p = this.hibernateTemplate.load(Product.class, id);
//		this.hibernateTemplate.delete(p);
//	}
//	
//	public Product getProduct(int pid) {
//		return this.hibernateTemplate.get(Product.class, pid);
//	}
//}


package mvc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import mvc.vo.Product;

@Component
public class ProductDao {
   
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create
	@Transactional
	public void createProduct(Product product)
	{
		
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	//get all product
	public List <Product> getProducts()
	{
		List<Product>products=this.hibernateTemplate.loadAll(Product.class);
		return products;
	}
	
	//delete the single product
	@Transactional
	public void deleteProduct(int pid)
	{
		Product p=this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(p);
	}
	
	//get the single product
	
	public Product getProduct(int pid)
	{
		return this.hibernateTemplate.get(Product.class, pid);
	}
}