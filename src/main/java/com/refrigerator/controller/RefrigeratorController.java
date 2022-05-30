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
import com.refrigerator.service.RefrigeratorService;

@RestController
public class RefrigeratorController {
	private List<Menu> menus;
	private RefrigeratorService refrigeratorService;



	public RefrigeratorController(RefrigeratorService refrigeratorService) {
		super();
		this.refrigeratorService = refrigeratorService;
	}

	@RequestMapping("/Menu")
	public List<Menu> allMenu(@RequestParam("choice") String choice) {

		// em.find로 데이터 전체 조회가 불가능해서 JPQL 사용

		if (choice.equals("allMenu")) {
			return refrigeratorService.allMenu();
		} 

		else if (choice.equals("deleteMenu")){
			return refrigeratorService.deleteMenu();
		} 

		else if (choice.equals("addMenu")) {
			return refrigeratorService.addMenu();

		} 

		return refrigeratorService.modifyMenu();
	}





}
