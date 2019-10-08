import java.util.ArrayList;

public class Policia {
	
	String nombre;
	int ID;
	ArrayList<Policia> Policias = new ArrayList<Policia>();
	ArrayList<String> Particulares = new ArrayList<String>();
	ArrayList<String> Regulares = new ArrayList<String>();
	
	public Policia() {
		
	}
	
	private Policia(String nombre, int iD) {
		this.nombre = nombre;
		this.ID = iD;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	@Override
	public String toString() {
		return "\nPolicia" + ID + " [nombre=" + nombre + ", ID=" + ID + "]";
	}
	
	public Policia getoficialID(int id) {
		
		for(int i=0; i<Policias.size(); i++) {
			Policia tmp = Policias.get(i);
			if(tmp.getID()==id) {
				return tmp;
			}else {System.out.println("\nEl ID ingresado no fue encontrado.");}
		}
		return null;
	}

	public void anadirPolicia() {
		
		Policia policia1 = new Policia("German", 1);
		Policia policia2 = new Policia("Wil", 2);
		Policia policia3 = new Policia("Alejandro", 3);
		Policia policia4 = new Policia("Joseph", 4);
		Policia policia5 = new Policia("Randall", 5);
		Policia policia6 = new Policia("Fernando", 6);
		Policia policia7 = new Policia("Kevin", 7);
		Policia policia8 = new Policia("Raychell", 8);
		
		Policias.add(policia1);
		Policias.add(policia2);
		Policias.add(policia3);
		Policias.add(policia4);
		Policias.add(policia5);
		Policias.add(policia6);
		Policias.add(policia7);
		Policias.add(policia8);
		
	}
	
		
	public void imprimirListaPolicias() {
		
		for(int i=0; i<Policias.size(); i++) {
			Policia tmp = Policias.get(i);
			System.out.println(tmp.toString());
		}	
	
	}
	
	public void imprimirListaTrabajosRegulares() {
		for(int i=0; i<Regulares.size(); i++) {
			System.out.println(Regulares.get(i));
		}
	}
	
	public void imprimirListaTrabajosParticulares() {
			for(int i=0; i<Particulares.size(); i++) {
				System.out.println(Particulares.get(i));
			}
	}
		
	
	public void pushParticulares(String elegir_Trabajo) {
		
		Particulares.add(elegir_Trabajo);
	}
	
	public void pushRegulares(String elegir_Trabajo) {
		
		Regulares.add(elegir_Trabajo);
	}
}

