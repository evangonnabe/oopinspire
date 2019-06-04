package io.epicaracer.oopinspire.templatemethodpattern;

public abstract class Animal {
	/*template method
	 * 공통 로직을 수행. 로직 중에 하위 클래스에서 오버라이딩한 추상 메서드/훅 메서드를 호출
	 * 
	*/
	public void playWithOwner() {
		System.out.println("귀염둥이 이리온...");
		play();
		runSomething();
		System.out.println("잘했어");
	}
	/*abstract method
	 * 템플릿 메서드에서 호출하는 추상메서드.
	 * 하위 클래스가 반드시 오버라이딩 해야한다.
	 */
	abstract void play();
	
	/* Hook method
	 * 템플릿 메서드에서 호출하는 hook메서드
	 * 하위 클래스가 선택적으로 오버라이딩한다.
	 */
	void runSomething() {
		System.out.println("꼬리 살랑 살랑~");
	}
	
}
