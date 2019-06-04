package io.epicaracer.oopinspire.templatecallbackpattern;

public class Soldier2 {
	//전략을 생성하는 코드가 컨텍스트, 즉 군인 내부로 들어왔다.
	
	
	void runContext(String weaponSound) {
		System.out.println("전투 시작");
//		strategy.runStrategy();
		excuteWeapon(weaponSound).runStrategy();
		System.out.println("전투 종료");
	}

	private Strategy excuteWeapon(final String weaponSound) {
		return new Strategy() {
			public void runStrategy() {
				System.out.println(weaponSound);
			}
		};	
		
	}
}
