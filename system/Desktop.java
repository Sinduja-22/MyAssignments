package org.system;

public class Desktop extends Computer{
	public void desktopSize()
	{
		System.out.println("Desktop size from Desktop class");
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.desktopSize();
		d.computerModel();
	}

}
