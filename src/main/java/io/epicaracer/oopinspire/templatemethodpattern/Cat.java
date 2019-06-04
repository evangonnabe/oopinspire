package io.epicaracer.oopinspire.templatemethodpattern;

public class Cat extends Animal{
/*	public void playWithOwner() {
		System.out.println("귀염둥이 이리온...");
		
		System.out.println("야옹! 야옹!");		
		
		System.out.println("꼬리 살랑 살랑~");
		System.out.println("잘했어");
	} */

	@Override
	void play() {
		System.out.println("야옹! 야옹!");
	}
	
	@Override
	void runSomething() {
		System.out.println("야옹~ 야옹~ 꼬리 살랑 살랑");
	}
}
