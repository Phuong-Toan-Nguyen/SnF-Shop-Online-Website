package SnFShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SnFShop.Dao.CategorysDao;
import SnFShop.Dao.SlidesDao;
import SnFShop.Entity.Categorys;
import SnFShop.Entity.Slides;

@Service
public class HomeServiceImpl implements interfaceHomeService{
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CategorysDao categorysDao;
	
	
	public List<Slides> GetDataSlide() {
		// TODO Auto-generated method stub
		return slidesDao.GetDataSlide();
	}
	public List<Categorys> GetDataCategory() {
		// TODO Auto-generated method stub
		return categorysDao.GetDataCategorys();
	}

}
