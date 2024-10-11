package edu.fra.uas.threads;

public class Output {

    static void printRow(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.print(name + " ");
			int n = 0;
			while (n < 10000)
				Math.sqrt(n++);
		}
		System.out.println();
	}
	
	static synchronized void printSyncRow(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.print(name + " ");
			int n = 0;
			while (n < 10000)
				Math.sqrt(n++);
		}
		System.out.println();
	}

}
