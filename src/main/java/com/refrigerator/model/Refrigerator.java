package com.refrigerator.model;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;

import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Builder
public class Refrigerator {
	
	private int id;
	private String menuName;
	private Date time;
	private String[] source;
	private String[] recipe;
	

}
