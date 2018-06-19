package musicsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/menu")
public class MenuController extends BaseController{

	@RequestMapping("/list.do")
	public String list(){
		return "admin/menu_list"; 
	}
	@RequestMapping("/load.do")
	public String load(){
		return "admin/menu_add"; 
	}

}
