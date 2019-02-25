
public class Empleado {

	//ATRIBUTOS
	private static final int PLUS = 300; //ATRIBUTO ESTATICO 
	private String nombre;
	private int edad;
	private double salario;	
	private int identificador;
	
	
	


	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public static int getPlus() {
		return PLUS;
	}
	
	public int getIdentificador() {
		return identificador;
	}


	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	
	//CONSTRUCTOR
	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}


	


	
}
