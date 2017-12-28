package cn.et.food.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.et.food.dao.MyfoodDao;
import cn.et.food.service.MyfoodService;

@Repository
public class MyFoodServiceImpl implements MyfoodService{
	@Autowired
	MyfoodDao dao;
	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyfoodDao#select(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyfoodService#select(java.lang.String)
	 */
	public List<Map<String, Object>> selectFood(String foodname){
		return dao.select(foodname);
	}
	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyfoodDao#delete(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyfoodService#delete(java.lang.String)
	 */
	public void deleteFood(String foodId){
		dao.delete(foodId);
	}
	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyfoodDao#save(java.lang.String, java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyfoodService#save(java.lang.String, java.lang.String)
	 */
	public void saveFood(String foodName,String price){
		dao.save(foodName, price);
	}
	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyfoodDao#update(java.lang.String, java.lang.String, java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.MyfoodService#update(java.lang.String, java.lang.String, java.lang.String)
	 */
	public void updateFood(String foodId,String foodName,String price){
		dao.update(foodId, foodName, price);
	}
}
