package com.codingdojo.objectmaster;

public class HumanTest {
	public static void main(String[] args) {
		Ninja ninja1 = new Ninja();
		Wizard wizard1 = new Wizard();
		Wizard wizard2 = new Wizard();
		Samurai samurai1 = new Samurai();
		Samurai samurai2 = new Samurai();
		
		samurai1.meditate();
		wizard1.fireBall(wizard2);
		wizard1.fireBall(wizard2);
		wizard1.heal(ninja1);
		samurai2.deathBlow(samurai1);
		samurai2.deathBlow(wizard1);
		ninja1.steal(samurai2);
		ninja1.steal(samurai2);
		ninja1.steal(samurai2);
		wizard2.heal(wizard1);
		
		
		System.out.println("ninja1 health is : " + ninja1.health);
		System.out.println("wizard1 health is : " + wizard1.health);
		System.out.println("wizard2 health is : " + wizard2.health);
		System.out.println("samurai1 health is : " + samurai1.health);
		System.out.println("samurai2 health is : " + samurai2.health);
		System.out.println("the number of samurais: " + Samurai.howMany());
	}
}
