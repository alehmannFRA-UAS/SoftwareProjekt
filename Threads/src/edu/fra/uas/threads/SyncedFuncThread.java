package edu.fra.uas.threads;

public class SyncedFuncThread extends Thread {

    private String name;

	public SyncedFuncThread(String n) {
		name = n;
	}

	public void run() {
		for (int i = 0; i < 10; i++){
            Output.printRow(name);
			//Output.printSyncRow(name);
        }
	}

}
