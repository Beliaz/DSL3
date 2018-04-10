package com.company;

public class Game_Object implements IObject{

	private String name;
	
	
	public Game_Object(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean equals(IObject other) {
		return this.name.equals(other.getName());
	}

}
