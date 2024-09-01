package com.Suma;

public class Suma {
	 private int numero1;
	    private int numero2;

	    // Constructor para inicializar los números
	    public Suma(int numero1, int numero2) {
	        this.numero1 = numero1;
	        this.numero2 = numero2;
	    }

	    // Método para realizar la suma
	    public int realizarSuma() {
	        return numero1 + numero2;
	    }
	    public void mostrarResultado() {
	        System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + realizarSuma());
	    }
	public Suma() {
		// TODO Auto-generated constructor stub
	}

}
