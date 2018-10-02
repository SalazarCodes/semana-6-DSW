package lab;
import java.io.FileReader;
import java.util.Iterator;

import com.google.gson.*;

public class ReadJSON {

	public static void main(String[] args) {
		
		JsonParser parser = new JsonParser();
		try {
			Object obj = parser.parse(new FileReader("D:/semana 6/datos.json"));
			JsonObject jsonObject = (JsonObject) obj;
			String nombre = jsonObject.get("Name").toString();
			String autor = jsonObject.get("Author").toString();
			
			JsonArray c = (JsonArray)jsonObject.get("Company List");
			System.out.println("Nombre : "+nombre);
			System.out.println("Author : "+autor);
			System.out.println("\nCompany List : ");
			Iterator<JsonElement> it = c.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
