package io.epicaracer.oopinspire.templatemethodpattern;

public class Dog extends Animal{
	public void playWithOwner() {
		System.out.println("귀염둥이 이리온...");
		
		System.out.println("멍! 멍!");
		
		System.out.println("꼬리 살랑 살랑~");
		System.out.println("잘했어");
	}

	@Override
	void play() {
		System.out.println("멍! 멍!");
	}
	
	@Override
	void runSomething() {
		System.out.println("멍! 멍! 꼬리 살랑 살랑~");
	}
	
}
