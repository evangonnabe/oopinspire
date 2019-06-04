package io.epicaracer.oopinspire.templatecallbackpattern;

public class Client {
	/* Template callback pattern - 템플릿 콜백 패턴(견본/회신 패턴)
	 * 
	 */
	
	
	public static void main(String[] args) {
		Soldier rambo = new Soldier();
		
		rambo.runContext(new Strategy() {
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
		
		
	}
}
