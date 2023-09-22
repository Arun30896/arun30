package org.com;

public class Desktop implements Hardware,Software {
	private void desktopMode() {
		System.out.println("High");
	}
	
	@Override
	public void softwareResource() {
		System.out.println("System OS");
		
		
	}
	@Override
	public void hardwardResource() {
		System.out.println("Keyboard");	
		
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.desktopMode();
	    d.softwareResource();
	    d.hardwardResource();
}
}