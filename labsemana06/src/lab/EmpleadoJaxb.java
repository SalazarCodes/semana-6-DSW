package lab;
import java.io.File;
import javax.xml.bind.*;

public class EmpleadoJaxb {
	
	public void marshall() {
		try {
			Empleados emp = new Empleados("A001", "Perez", "Breña", 2000);
			JAXBContext jc = JAXBContext.newInstance(Empleados.class);
			Marshaller ms = jc.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ms.marshal(emp, System.out);
			ms.marshal(emp, new File("src\\Empleados.xml"));

		}
		catch(Exception e){
			System.out.println(""+e.getMessage());
		}
	}
	public void unmarshall() {
		try {
			JAXBContext jc = JAXBContext.newInstance(Empleados.class);
			Unmarshaller um = jc.createUnmarshaller();
			Empleados emp = (Empleados)um.unmarshal(new File("src\\Empleados.xml"));
			System.out.println("Informacion del empleado");
			System.out.println("Codigo : "+emp.getCodigo());
			System.out.println("Nombre : "+emp.getNombre());
			System.out.println("Direccion : "+emp.getDireccion());
			System.out.println("Sueldo : "+emp.getSueldo());
		}
		catch(Exception e){
			System.out.println(""+e.getMessage());
		}
	}
}
