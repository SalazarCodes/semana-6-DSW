package lab;
import java.io.*;

public class LeerArchivo {
	
	public static void main(String[] args) {
		
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			archivo = new File("D:/semana 6/rptas.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea;
			while((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				if(null != fr) {
					fr.close();
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
