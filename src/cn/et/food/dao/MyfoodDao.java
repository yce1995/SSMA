package cn.et.food.dao;

import java.util.List;
import java.util.Map;

public interface MyfoodDao {

	public abstract List<Map<String, Object>> select(String foodname);

	public abstract void delete(String foodId);

	public abstract void save(String foodName, String price);

	public abstract void update(String foodId, String foodName, String price);

}