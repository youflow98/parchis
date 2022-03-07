package co.edu.unbosque.controller;

import co.edu.unbosque.view.ViewVentana;



public class Controller {
	public ViewVentana vista;
	private ClientThread customerlist;
	
	
	
	public Controller () {
		vista = new ViewVentana();
		customerlist = new ClientThread();
		funcionar();



	}

	private void funcionar() {
		
	}
	}


