package com.curso.v4;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Inyección por setter");

		Becario bec1 = new Becario("Epeneto",25);
		
		Inyector.inyectarCompu(bec1, TipoComputadora.WINDOWS);
		
		bec1.iniciarTrabajo();
		
		Becario bec2 = new Becario("Tercio",35);
		
		Inyector.inyectarCompu(bec2, TipoComputadora.LINUX);
		
		bec2.iniciarTrabajo();
		
		Becario bec3 = new Becario("Patrobas",25);
		
		Inyector.inyectarCompu(bec3, TipoComputadora.MAC);
		
		bec3.iniciarTrabajo();
		

		
		
	}

}
