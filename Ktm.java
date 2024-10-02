package org.bike;

public class Ktm extends Bike {
	public void cost() {
	System.out.println("cost:3,00,000");

}
	public void speed() {
	System.out.println("speed:250");

}
public static void main(String[] args) {
	Ktm k=new Ktm();
	k.cost();
	k.speed();
}
}
