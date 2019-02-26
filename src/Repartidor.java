
public class Repartidor extends Empleado {

	//ATRIBUTOS
	private String zona;
	
	

	//GETTERS Y SETTERS
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
	
	
	
	//CONSTRUCTOR
	public Repartidor(String nombre, int edad, double salario, String zona, int identificador) {
		super(nombre, edad, salario);
		this.zona = zona;
	}

	
	//METODOS
	public static boolean tienePlus(Repartidor repartidor) {
		
		if(repartidor.getEdad()<25 && repartidor.getZona().equalsIgnoreCase("tres")) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
	
}
