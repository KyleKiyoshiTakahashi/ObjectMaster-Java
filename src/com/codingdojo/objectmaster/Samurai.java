package com.codingdojo.objectmaster;

public class Samurai extends Human{
	private static int count;
	protected Integer health = 200;
	public Samurai() {
		count ++;
	}
	public void deathBlow(Human h) {
		h.health = 0;
		health = health - (health/2);
	}
	public void meditate() {
		health = health + (health/2);
	}
	public static int howMany() {
		return count;
	}
}
