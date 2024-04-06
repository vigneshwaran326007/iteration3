package com.vignesh.iteration3;

import org.springframework.stereotype.Component;

@Component
public class mario implements GameConsole {

	@Override
	public void up() {
		System.out.println("Mario Up");
		
	}

	@Override
	public void down() {
		System.out.println("Mario down");
		
	}

	@Override
	public void left() {
		System.out.println("Mario left");
	}

	@Override
	public void right() {
		System.out.println("Mario right");
		
	}

}