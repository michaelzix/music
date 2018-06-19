package musicsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class HomeController extends BaseController {
	
	@RequestMapping("/index.do")
	public String index() {
		return "admin/index";
	}
}
