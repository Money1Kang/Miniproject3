package com.refrigerator.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.refrigerator.model.Menu;


@RestController
public class RefrigeratorController {



	@GetMapping(value = "/read")
	public List<Menu> allMenu() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Miniproject3");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "SELECT m FROM Menu as m";
		Query query = em.createQuery(jpql);

		// 쿼리 실행
		List<Menu> resultList = query.getResultList();

		return resultList; 

	}
	
	
	@DeleteMapping(value = "/delete")
	public Menu deleteMenu(@RequestParam("id") int id) {
		System.out.println(123);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Miniproject3");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		Menu menu = em.find(Menu.class, id);
		System.out.println(menu);
		em.remove(menu);
		
		tx.commit();
		return menu;
	}





}
