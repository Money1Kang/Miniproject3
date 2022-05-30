package com.refrigerator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity()
public class Menu {
	
	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY) // autoIncrease
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String menuName;
	@Column(name = "minute")
	private String minute;
	@Column(name = "cost")
	private int cost;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "isOrder")
	private boolean isOrder;
	
	public Menu() {
		
	}
	public Menu(int id, String menuName, String minute, int cost, int quantity, boolean isOrder) {
		super();
		this.id = id;
		this.menuName = menuName;
		this.minute = minute;
		this.cost = cost;
		this.quantity = quantity;
		this.isOrder = isOrder;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMinute() {
		return minute;
	}
	public void setMinute(String minute) {
		this.minute = minute;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isOrder() {
		return isOrder;
	}
	public void setOrder(boolean isOrder) {
		this.isOrder = isOrder;
	}
	@Override
	public String toString() {
		return "Refrigerator [id=" + id + ", menuName=" + menuName + ", minute=" + minute + ", cost=" + cost
				+ ", quantity=" + quantity + ", isOrder=" + isOrder + "]";
	}

	
}
