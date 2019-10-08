import java.util.ArrayList;
import java.util.Scanner;

public class Trabajo {
	
	ArrayList<String> Trabajos = new ArrayList<String>();
	
	
	public void addListaTrabajo() {
		
		Trabajos.add("Patrullar parque central");
		Trabajos.add("Patrullar parque  del cementerio");
		Trabajos.add("Patrullar parque de Palamres");
		Trabajos.add("investigar escena del crimen ");
		Trabajos.add("interrogar sospechoso de asalto");
		Trabajos.add("investigar sospechosos de homicidios");
		Trabajos.add("ordenar juicio en la corte");
		Trabajos.add("investigar delito de venta de drogas");
		Trabajos.add("requisar sospechosos de consumo y venta de drogas");
		Trabajos.add("Buscar delincuentes mas peligrosos de Alajuela");
		Trabajos.add("Ayudar en el transito de la calle ancha");
		Trabajos.add("Escoltar al alcalde municipal");
	}
	
	public void imprimirListaTrabajos() {
		for(int i=0; i<Trabajos.size(); i++) {
			System.out.println(Trabajos.get(i));
		}
	}
		
	public String GetTrabajo(int key) {
		
			String trabajo;
			trabajo = Trabajos.get(key);			
			return trabajo;
			
			}	
		

	

}
