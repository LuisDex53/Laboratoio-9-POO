import java.util.Scanner;
import java.util.ArrayList;

public class Sistema {

	public static void main(String[] args) {
		
		Scanner id = new Scanner(System.in);
	    while(true) {
	    System.out.println("Ingrese el ID: ");
	    int ID = id.nextInt();
	    if(ID >= 0 && ID <= 9) {
	    	menuPolicia();	
	    }else {
	    	menuAdministrador();
	    }
	    
	    }
	    

	}
	
    
	public static void menuPolicia() {
		Scanner opcionPolicia = new Scanner(System.in);
		while(true){
	    	System.out.println("1. verificar trabajos asignados");
	        System.out.println("2. Salir ");
	        System.out.println("Cual es su opcion?");
	        int opcion_Policia = opcionPolicia.nextInt();
	        
	        	switch(opcion_Policia) {
	        		case 1:
	        			System.out.println("Trabajos Regulares a realizar: " );
	        			Policia listaRegulares = new Policia();
	        			listaRegulares.imprimirListaTrabajosRegulares();
	        			
	        			System.out.println("Trabajos Particulares a realizar: " );
	        			Policia listaParticulares = new Policia();
	        			listaParticulares.imprimirListaTrabajosParticulares();
	        			
	        		case 2: 
	        			System.exit(0);
		    			break;
	        	}
	    	}
	    }
	    
	   
	

	public static void menuAdministrador() {
		Scanner opcionAdministrador = new Scanner(System.in);
		while(true){
	    	System.out.println("1. verificar trabajos pendientes");
	    	System.out.println("2. Verificar Policias disponibles");
	    	System.out.println("3. Posicion de trabajo para asignar");
	    	System.out.println("4. salir "); 
	    	System.out.println("Cual es su opcion?");
	    	int opcion_Administrador = opcionAdministrador.nextInt();
	    	
	    	Trabajo verTrabajos = new Trabajo();
	        verTrabajos.addListaTrabajo();
	    	switch(opcion_Administrador) {
	    		case 1:
	    	        verTrabajos.imprimirListaTrabajos();
	    	        break;
    			
	    		case 2:
	    			Policia verPolicias = new Policia();
	    			verPolicias.anadirPolicia();
	    			verPolicias.imprimirListaPolicias();
	    			
	    			
	    		case 3:
	    			Administrador asignarTrabajos = new Administrador();
	    			asignarTrabajos.escogerTrabajos();
	    			break;
	    			
	    			
	    		case 4: 
	    			return;
	    			
    			
    		
	    		}
	    	}
	    }
	    
	    	
	}
	

	    	


	            
	   
		

