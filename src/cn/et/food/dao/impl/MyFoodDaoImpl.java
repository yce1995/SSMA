package cn.et.food.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.et.food.dao.MyfoodDao;
import cn.et.food.mapper.FoodMapper;

@Repository
public class MyFoodDaoImpl implements MyfoodDao{
	@Autowired
	FoodMapper fm;
	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyfoodDao#select(java.lang.String)
	 */
	public List<Map<String, Object>> select(String foodname){
		return fm.select(foodname);
	}
	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyfoodDao#delete(java.lang.String)
	 */
	public void delete(String foodId){
		fm.delete(foodId);
	}
	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyfoodDao#save(java.lang.String, java.lang.String)
	 */
	public void save(String foodName,String price){
		 fm.save(foodName, price);
	}
	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyfoodDao#update(java.lang.String, java.lang.String, java.lang.String)
	 */
	public void update(String foodId,String foodName,String price){
		fm.update(foodId, foodName, price);
	}
}
