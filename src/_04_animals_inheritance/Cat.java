package _04_animals_inheritance;

public class Cat extends Animal{
	Cat(String name, String furColor, boolean isGirl){
		super(name, furColor, isGirl);
	}
	
	public void printName() {
		System.out.println("My name is "+name);
	}
	
	public void eat() {
		System.out.println("Eating");
	}
	
	public void sleep() {
		System.out.println("Sleeping");
	}
	
	public void play() {
		System.out.println("Playing");
	}
}
