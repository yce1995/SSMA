package cn.et.food.service;

import java.util.List;
import java.util.Map;

public interface MyfoodService {

	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyfoodDao#select(java.lang.String)
	 */
	public abstract List<Map<String, Object>> selectFood(String foodname);

	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyfoodDao#delete(java.lang.String)
	 */
	public abstract void deleteFood(String foodId);

	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyfoodDao#save(java.lang.String, java.lang.String)
	 */
	public abstract void saveFood(String foodName, String price);

	/* (non-Javadoc)
	 * @see cn.et.food.dao.MyfoodDao#update(java.lang.String, java.lang.String, java.lang.String)
	 */
	public abstract void updateFood(String foodId, String foodName, String price);

}