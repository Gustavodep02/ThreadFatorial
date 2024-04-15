package controller;

public class ThreadFatorial extends Thread{
	int metodo;
	int num;
	public ThreadFatorial(int metodo,int num) {
		this.metodo = metodo;
		this.num = num;
	}
	
	@Override
	public void run() {
		if (metodo == 0) {
			long tempoInicial =  System.nanoTime();
			long res =fatRecursivo(num);
			long tempoFinal =  ((System.nanoTime()-tempoInicial));
			System.out.println("Fatorial recursivo de "+num+" = "+res+" tempo de execução = "+tempoFinal+" nano segundos");
		}else {
			long tempoInicial = System.nanoTime();
			long res = fatIterativo(num);
			long tempoFinal =  ((System.nanoTime()-tempoInicial));
			System.out.println("Fatorial iterativo de "+num+" = "+res+" tempo de execução = "+tempoFinal+" nano segundos");
		}
	}
	
	public long fatRecursivo(int n) {
        if (n == 0) {
            return 1;
        }else {
            return n*fatRecursivo(n-1);
        }
    }
	public long fatIterativo(int n) {
		long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
	}
}
