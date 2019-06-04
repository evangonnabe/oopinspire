package io.epicaracer.oopinspire.strategypattern;

public class Client {
	/* strategy pattern
	 * 클라이언트가 전략을 생성해 전략을 실행할 컨텍스트에 주입하는 패턴
	 * 
	 * 전략 메서드를 가진 전략 객체 -> 무기류
	 * 전략 객체를 사용하는 컨텍스트(전략 객체의 사용자/소비자) -> 람보
	 * 전략 객체를 생성해 컨텍스트에 주입하는 클라이언트(제3자, 전략 객체의 공급자)
	 */
	
	public static void main(String[] args) {
		Strategy strategy = null;
		Soldier rambo = new Soldier();
		
		strategy = new StrategyGun();
		rambo.runContext(strategy);
		
		System.out.println();
		
		strategy = new StrategySword();
		rambo.runContext(strategy);
		
		System.out.println();
		
		strategy = new StrategyBow();
		rambo.runContext(strategy);
		
	}
}
