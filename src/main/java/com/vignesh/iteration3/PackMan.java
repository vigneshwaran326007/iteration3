package com.vignesh.iteration3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("PackMan")
@Primary
public class PackMan implements GameConsole {

	@Override
	public void up() {
		System.out.println("PackMan Up");
		
	}

	@Override
	public void down() {
		System.out.println("PackMan down");
		
	}

	@Override
	public void left() {
		System.out.println("PackMan left");
		
	}

	@Override
	public void right() {
		System.out.println("PackMan right");
		
	}

}
