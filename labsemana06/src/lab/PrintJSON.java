package lab;
import com.google.gson.*;

public class PrintJSON {
	
	public static void main(String[] args) {
		
		Gson gson = new Gson();
		Objects o = new Objects("Pepito","Alv",null);
		String jsonString = gson.toJson(o);
		System.out.println("JSON : "+jsonString);
	}
}
