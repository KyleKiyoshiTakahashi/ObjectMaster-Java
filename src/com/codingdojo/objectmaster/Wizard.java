package com.codingdojo.objectmaster;

public class Wizard extends Human{
	protected Integer heath = 50;
	protected Integer intelligence = 8;
	public void heal(Human h) {
		h.health += intelligence;
	}
	public void fireBall(Human h) {
		h.health -= intelligence * 3;
	}
	

}
