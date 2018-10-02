package lab;
import com.google.gson.*;

public class EscribirJSON {
	
	public static void main(String[] args) {
		
		Gson gson = new Gson();
		String datos = "Hola";
		String jsonString = gson.toJson(datos);
		System.out.println("JSON : "+jsonString);
	}
}
