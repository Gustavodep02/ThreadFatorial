package view;

import controller.ThreadFatorial;

public class Principal {

	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			Thread t = new ThreadFatorial(i,5);
			t.start();
		}
		

	}

}
