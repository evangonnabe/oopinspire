package io.epicaracer.oopinspire.templatecallbackpattern;

public class Client2 {
	public static void main(String[] args) {
		Soldier2 rambo = new Soldier2();
		
		rambo.runContext("총! 총총총총총!");
		System.out.println();
		rambo.runContext("칼! 칼칼칼칼칼!");
		System.out.println();
		rambo.runContext("도끼! 도도도도끼!");

/*		rambo.runContext(new Strategy() {
			public void runStrategy() {
				System.out.println("총! 총총총총총!");
			}
		});
		
		System.out.println();
		
		rambo.runContext(new Strategy() {
			public void runStrategy() {
				System.out.println("칼! 칼칼칼칼칼!");
			}
		});
		
		System.out.println();
		
		rambo.runContext(new Strategy() {
			public void runStrategy() {
				System.out.println("도끼! 도도도도끼!");
			}
		});
*/		
		
	}
}
