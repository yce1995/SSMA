package cn.et.food.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface FoodMapper {
	@Select("select * from foods where foodname like '%${foodname}%'")
	public List<Map<String, Object>> select(@Param("foodname")String foodname);
	
	@Delete("delete from foods where foodId = #{0}")
	public void delete(String foodId);
	
	@Insert("insert into foods(foodname,price) values(#{0},#{1})")
	public void save(String foodName,String price);
	
	@Update("update foods set foodname= #{1},price=#{2} where foodid=#{0}")
	public void update(String foodId,String foodName,String price);
}
