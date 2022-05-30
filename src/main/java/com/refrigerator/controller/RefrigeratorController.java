package com.refrigerator.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.refrigerator.model.Menu;

@RestController
public class RefrigeratorController {
	private List<Menu> menus;
	
	@RequestMapping("/Menu")
	public List<Menu> allMenu(@RequestParam("choice") String choice) {
		
		// em.find로 데이터 전체 조회가 불가능해서 JPQL 사용
		List<Menu> resultList=null;
		if (choice.equals("allMenu")) {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Miniproject3");
			EntityManager em = emf.createEntityManager();
			
			// 모든 데이터 가져오는 쿼리문
			String jpql = "SELECT m FROM Menu as m";
			Query query = em.createQuery(jpql);
			
			// 쿼리 실행
			resultList = query.getResultList();
		}
		// 객체 json으로 웹에 출력. URL주소 : http://localhost:8080/refrigerator/Menu?choice=allMenu => POSTMAN에서 이 URL 조회시 데이터 출력
		return resultList; 
		
	}
}
