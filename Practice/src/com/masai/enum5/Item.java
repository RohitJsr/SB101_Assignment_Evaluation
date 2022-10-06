package com.masai.enum5;

public enum Item {

	SUGER,RICE{
		public void info(){
			System.out.println("This is Rice");
		}
	},SALT;
	
	public void info() {
		System.out.println("This is grocery item");
	}
	public static void main(String[] args) {
		Item[] itr= Item.values();
		for(Item item:itr){
		item.info();
		}
	}
}
