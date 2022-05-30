package com.refrigerator.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.refrigerator.model.Menu;

@RestController
public class RefrigeratorController {
	
	@RequestMapping("/add")
//	@RequestParam("menuName") String menuName)
	public void ex4() {
		
//		// DB처리 및 엔터티 반환
//		Refrigerator refrigerator = new Refrigerator();
//		refrigerator.setMenuName(menuName);
////		refrigerator.setId(1);
////		refrigerator.setRecipe(null);
////		refrigerator.setSource(null);
////		refrigerator.setTime(null);
//		return refrigerator;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Miniproject3");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		Menu menu = em.find(Menu.class, 1);
		System.out.println(menu);
		tx.commit();
	}
}
