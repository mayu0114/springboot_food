package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

//import java.util.Optional;
//import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FoodController {

	@Autowired
	HttpSession session;

	@Autowired
	FoodRepository foodRepository;

	@Autowired
	CategoryRepository categoryRepository;

	//食べ物一覧の表示
	@RequestMapping("/foods")
	public ModelAndView index(ModelAndView mv) {
		
	       
		
		List<Food> foodlist = foodRepository.findAll();
		mv.addObject("foods", foodlist);
		mv.setViewName("list");
		return mv;
	}

}