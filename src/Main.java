import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	static ArrayList<Comercial> comerciales = new ArrayList<Comercial>();
	static ArrayList<Repartidor> repartidores = new ArrayList<Repartidor>();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		

		int opcion;
		
		
		do{
            // Mostrar menú
			System.out.println("Menú:");
            System.out.println(" 1. Añadir Comercial");
            System.out.println(" 2. Añadir Repartidor");
            System.out.println(" 3. Listar Comerciales");
            System.out.println(" 4. Listar Repartidores");
            System.out.println(" 5. Modificar repartidor");
            System.out.println(" 6. Salir");
           
            // Leer opción
            opcion = scan.nextInt();
            scan.nextLine(); 
            switch (opcion){
                case 1:
                	System.out.println("Introduce un nombre");
                	String nombreC = scan.nextLine();
                	System.out.println("Introduce una edad");
                	int edadC = scan.nextInt();
                	System.out.println("Introduce el salario");
                	double salarioC = scan.nextDouble();
                	System.out.println("Introduce la comision");
                	double comisionC = scan.nextDouble();
                	aniadirComercial(nombreC, edadC, salarioC, comisionC, 1);
                    break;
                case 2:
                	System.out.println("Introduce un nombre");
                	String nombre = scan.nextLine();
                	System.out.println("Introduce una edad");
                	int edad = scan.nextInt();
                	System.out.println("Introduce el salario");
                	double salario = scan.nextDouble();
                	scan.nextLine();
                	System.out.println("Introduce la zona");
                	String zona = scan.nextLine();
                	aniadirRepartidor(nombre, edad, salario, zona, 2);
                    break;
                case 3:
                	listarComerciales(comerciales);
                    break;
                case 4:
                	listarRepartidores(repartidores);
                    break;
                case 5:
                	System.out.println("Que apartado del repartidor deseas modificar");
                	System.out.println("Nombre, Edad, Salario, Zona");
                	String apartado = scan.nextLine();
                	System.out.print("que repartidor quieres modificar");
                	String nombreR = scan.nextLine();
                	modificarSRepartidor(nombreR, apartado);
                    break;
                default:
                    System.out.println("Opción incorrecta. Elija otra");
            } // Fin switch
        }while(opcion != 6);
}

	//Modificar repartidores Opcion a modificar cualquiera de los parametros
	private static void modificarSRepartidor(String nombreR, String apartado) {
		for(int i = 0; i< repartidores.size(); i++) {
			if(apartado.equalsIgnoreCase("nombre")) {
					if(repartidores.get(i).getNombre().equalsIgnoreCase(nombreR)) {
						System.out.println("introduce el nuevo nombre");
						String nombre= scan.nextLine();
						repartidores.get(i).setNombre(nombre);
					
				}
			}else if(apartado.equalsIgnoreCase("edad")) {
				
					if(repartidores.get(i).getNombre().equalsIgnoreCase(nombreR)) {
						System.out.println("introduce la nueva edad");
						int edad= scan.nextInt();
						repartidores.get(i).setEdad(edad);
					
				}
			}else if(apartado.equalsIgnoreCase("salario")) {
				
					if(repartidores.get(i).getNombre().equalsIgnoreCase(nombreR)) {
						System.out.println("introduce el nuevo salario");
						int Salario= scan.nextInt();
						repartidores.get(i).setSalario(Salario);
					
				}
			}else if(apartado.equalsIgnoreCase("zona")) {
				
					if(repartidores.get(i).getNombre().equalsIgnoreCase(nombreR)) {
						System.out.println("introduce la nueva zona");
						String zona = scan.nextLine();
						repartidores.get(i).setZona(zona);
					}	
			}
		}
	}


	//METODOS PARA ELIMINAR COMERCIAL Y REPARTIDOR
	private static void eliminarComercial(String nombreTr) {
		for(int i= 0; i>comerciales.size(); i++) {
			if(comerciales.get(i).getNombre().equalsIgnoreCase(nombreTr)) {
				comerciales.remove(i);
			}
		}
		
	}
	
	private static void eliminarRepartidor(String nombreTr) {
		for(int i= 0; i>repartidores.size(); i++) {
			if(repartidores.get(i).getNombre().equalsIgnoreCase(nombreTr)) {
				repartidores.remove(i);	
			}
		}
		
	}

	
	//METODOS PARA LISTAR LOS COMERCIALES Y REPARTIDORES
	private static void listarComerciales(ArrayList<Comercial> comerciales) {
		for( Comercial comercial: comerciales) {
			System.out.println("Edad: " + comercial.getEdad() +" --- Nombre: "+  comercial.getNombre() + " --- Salario " + comercial.getSalario() + " --- Comision: "+ comercial.getComision());
			
		}
	}
	
	private static void listarRepartidores(ArrayList<Repartidor> repartidores) {
		for( Repartidor repartidor: repartidores) {
			System.out.println("Edad: " + repartidor.getEdad() +" --- Nombre: "+  repartidor.getNombre() + " --- Salario " + repartidor.getSalario()+ " --- Zona: "+ repartidor.getZona());
			
		}
	}

	
	
	//METODOS PARA AÑADIR COMERCIALES Y REPARTIDORES
	private static void aniadirRepartidor(String nombre, int edad, double salario, String zona, int identificador) {
		Repartidor repartidor = new Repartidor(nombre, edad, salario, zona, identificador);
		repartidores.add(repartidor);
		
	}

	private static void aniadirComercial(String nombreC, int edadC, double salarioC, double comisionC, int identificador) {
		Comercial comercial = new Comercial(nombreC, edadC, salarioC, comisionC, identificador);
		comerciales.add(comercial);
		
	}
	
	//METODOS PARA BUSCAR LOS DATOS DE UN TRABAJADOR
	
	
	
		
		
}


