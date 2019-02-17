package com.codingdojo.objectmaster;

public class Human {
	protected Integer strength = 3;
	protected Integer stealth = 3;
	protected Integer intelligence = 3;
	protected Integer health = 100;
	public void attack(Human h){
		h.health -= strength;
		
	}
}
