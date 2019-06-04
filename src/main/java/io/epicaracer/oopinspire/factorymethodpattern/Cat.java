package io.epicaracer.oopinspire.factorymethodpattern;

public class Cat extends Animal {

	@Override
	AnimalToy getToy() {
		return new CatToy();
	}

}
