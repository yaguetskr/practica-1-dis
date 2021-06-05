import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;





public class main {
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static superheroe generarsuperheroe() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nombre:");		       			
		String nom =reader.readLine();
		System.out.println("Identidad secreta:");		       			
		String secret =reader.readLine();
		System.out.println("Genero:");		       			
		String gen =reader.readLine();
		System.out.println("Procedencia:");		       			
		String orig =reader.readLine();
		Habilidades ha=generarhabilidad();


		superheroe heroe=new superheroe(gen);
		heroe.superheroe(gen, nom, secret,ha, orig);
		System.out.println("Ha participado en alguna batalla?");
		System.out.println("1-Si");
		System.out.println("2-No");
		int exit=Integer.parseInt(reader.readLine());
		if(exit==1) {
			do {
			heroe.addbatalla(generarbatalla());
			System.out.println("Ha participado en alguna otra batalla?");
			System.out.println("1-Si");
			System.out.println("2-No");
			exit=Integer.parseInt(reader.readLine());
			}while(exit==1);
			
		}
		return heroe;
	}
	
	public static Habilidades generarhabilidad() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("¿Como son sus habilidades?");
		System.out.println("Tipo:");		       			
		String tipo =reader.readLine();
		System.out.println("Definicion:");		       			
		String definicion =reader.readLine();
		Habilidades skills=new Habilidades();
		skills.setTipo(tipo);
		skills.setDefinicion(definicion);
		return skills;
	}
	
	public static Batallas generarbatalla() throws IOException {
		int exit=0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Lugar:");		       			
		String lugar =reader.readLine();
		System.out.println("Fecha inicio:");		       			
		String fechacom =reader.readLine();
		System.out.println("Fecha fin:");		       			
		String fechafin =reader.readLine();
		Batallas bat=new Batallas(lugar,fechacom,fechafin);
		
		return bat;
	}
	
	public static void writeToFile(String xml, String fileName) throws IOException {
	    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
	    try {
			writer.write(xml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			writer.close();
		}
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<superheroe> heroes=new ArrayList<superheroe>();
		int opcion;
		do {
			System.out.println("1.-Añadir heroe");
			System.out.println("2.-Salir");
			
			opcion = Integer.parseInt(reader.readLine());
			
			switch(opcion) {
			case 1:
				heroes.add(generarsuperheroe());
				break;
			
			
			}
	}while(opcion!=2);
		
	String header = "<?xml version=\"1.0\" encoding=\"UTF-8\">\n";
	String root = "<Superheroes>\n";
	String xml = "";	
	xml += header + root+heroes;	
	for (superheroe p: heroes) {
		xml += heroes;
		System.out.println(xml);
	}	
	String close_root = "\n</Superheroes>";
	System.out.println(xml);
	xml += close_root;
	writeToFile(xml, "Superheroes.xml");	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
