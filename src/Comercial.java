
public class Comercial extends Empleado {

	//ATRIBUTOS
	private double comision;
	
	
	
	
	//GETTERS Y SETTERS
	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	
	
	
	//CONSTRUCTOR
	public Comercial(String nombre, int edad, double salario, double comision, int identificador) {
		super(nombre, edad, salario);
		this.comision = comision;
		
	}

	
	//METODOS
	public static boolean tienePlus(Comercial comercial) {
		
		if(comercial.getEdad()>30 && comercial.getComision() >200 ) {
			return true;
		}else{
			return false;
		}
	}

	
	
}
