package edu.fra.uas.inner.classes;

public class Outside {

    private String name;
	private int number;
	
	public Outside(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public void outputInner(String innerName) {
		Inside inside = new Inside();
		inside.name = innerName;
		System.out.println(inside.getName());
	}
	
    // Inner class, cannot be accessed from outside
	private class Inside {
		private String name;
		
		private String getName() {
			return number + ":" + Outside.this.name + "." + name;
		}
	}

}
