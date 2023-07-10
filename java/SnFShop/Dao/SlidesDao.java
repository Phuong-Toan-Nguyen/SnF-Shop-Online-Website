package SnFShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import SnFShop.Entity.MapperSlides;
import SnFShop.Entity.Slides;

@Repository
public class SlidesDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;//phan biet bien toan cuc
	
	public List<Slides> GetDataSlide(){
		List<Slides> list = new ArrayList<Slides>();
		String sql = "SELECT * FROM slides";
		list = _jdbcTemplate.query(sql, new MapperSlides());
		return list;
	}
	
}
