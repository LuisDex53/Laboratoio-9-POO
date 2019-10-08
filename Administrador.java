import java.util.Scanner;

public class Administrador {
	

	Scanner elegirTrabajo = new Scanner(System.in);
	Scanner nuevoTrabajo = new Scanner(System.in);
	
	public void escogerTrabajos() {
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Cual es el id del policia que desea asignarle el trabajo?");
		int TrabajoAsignado = sn.nextInt();
		
		Policia tmp1 = new Policia();
		Policia nuevoPolicia = tmp1.getoficialID(TrabajoAsignado);
		
		System.out.println("Cual posicion de trabajo desea asignar?");
		int elegir_Trabajo = elegirTrabajo.nextInt();
		Trabajo tmp = new Trabajo();
		tmp.addListaTrabajo();
		String trabajo = tmp.GetTrabajo(elegir_Trabajo);
		System.out.println(trabajo);
		
		System.out.println("Desea agregarlo a un trabajo particular o regular?");
		String tipoTrabajo = elegirTrabajo.next();
		
		if (tipoTrabajo == "regular") {
			
			tmp1.pushRegulares(trabajo);
			
			
		}else {
			tmp1.pushParticulares(trabajo);
		}
			
		System.out.println("Desea asignar otro trabajo?");
		String otroTrabajo = nuevoTrabajo.next();
		
		if (otroTrabajo.equals("si")) {
			Administrador trabajoNuevo = new Administrador();
			trabajoNuevo.escogerTrabajos();	
		}else {
			System.out.println("Se asigno el trabajo correctamente");
		}		
		
	}
	
	
}
	
	
	
	
	
	
	
	

