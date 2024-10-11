package edu.fra.uas.inner.statics;

public class Outside {

    private String name;
	private int number;
	
	public Outside(String name, int number) {
		this.name = name;
		this.number = number;
	}

    public static class Inside{
		
		public void print() {
			System.out.println("Inside");
            //name = "inside"; // does not work
		}
		
	}

}
