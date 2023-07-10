package SnFShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SnFShop.Entity.Categorys;
import SnFShop.Entity.Slides;

@Service
public interface interfaceHomeService {
	@Autowired
	public List<Slides> GetDataSlide();
	public List<Categorys> GetDataCategory();
	
}
