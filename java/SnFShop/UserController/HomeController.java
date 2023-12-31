package SnFShop.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SnFShop.Dao.SlidesDao;
import SnFShop.Service.User.HomeServiceImpl;

@Controller
public class HomeController {
	
	@Autowired
	HomeServiceImpl homeService;
	
	
	
	@RequestMapping( value = { "/", "/trang-chu" })
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("user/index");
		mv.addObject("slides", homeService.GetDataSlide());
		mv.addObject("categorys", homeService.GetDataCategory());
		
		
		return mv;
	}
	
	
	
	
	
	
	@RequestMapping( value = "product")
	public ModelAndView Product() {
		ModelAndView mv = new ModelAndView("user/product");
		return mv;
	}
}
