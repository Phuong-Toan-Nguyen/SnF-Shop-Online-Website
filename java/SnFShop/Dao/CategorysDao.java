package SnFShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import SnFShop.Entity.Categorys;
import SnFShop.Entity.MapperCategorys;

@Repository
public class CategorysDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;//phan biet bien toan cuc
	
	public List<Categorys> GetDataCategorys(){
		List<Categorys> list = new ArrayList<Categorys>();
		String sql = "SELECT * FROM categorys";
		list = _jdbcTemplate.query(sql, new MapperCategorys());
		return list;
	}
}
