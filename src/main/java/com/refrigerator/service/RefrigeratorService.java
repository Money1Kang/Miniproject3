package com.refrigerator.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import com.refrigerator.model.Menu;
@Service
public class RefrigeratorService {

	public List<Menu> allMenu() {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Miniproject3");
		EntityManager em = emf.createEntityManager();

		// 모든 데이터 가져오는 쿼리문
		String jpql = "SELECT m FROM Menu as m";
		Query query = em.createQuery(jpql);

		// 쿼리 실행
		List<Menu> resultList = query.getResultList();

		// 객체 json으로 웹에 출력. URL주소 : http://localhost:8080/refrigerator/Menu?choice=allMenu => POSTMAN에서 이 URL 조회시 데이터 출력
		return resultList; 

	}

	public List<Menu> deleteMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Menu> addMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Menu> modifyMenu() {
		// TODO Auto-generated method stub
		return null;
	}




}
