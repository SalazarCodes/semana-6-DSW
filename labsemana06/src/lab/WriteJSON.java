package lab;
import com.google.gson.*;
import java.util.*;

public class WriteJSON {

	public static void main(String[] args) {
		
		Gson gson = new Gson();
		Collection c = new ArrayList();
		c.add("Valor1");
		c.add("Valor2");
		c.add("Valor3");
		c.add("Valor4");
		c.add("Valor5");
		String json = gson.toJson(c);
		System.out.println("JSON : "+json);
	}
}
