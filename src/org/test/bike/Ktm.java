package org.test.bike;

public class Ktm implements Bike{

	@Override
	public void cost() {
System.out.println("bike cost is 70000 on road");		
	}

	@Override
	public void speed() {
System.out.println("speed of the bike is 70mpH");		
	}
	public static void main(String[] args) {
		Ktm b=new Ktm();
		b.cost();
		b.speed();
	}
	

}
