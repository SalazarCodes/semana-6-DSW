package lab;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Empleados")
public class Empleados {

	private String codigo, nombre, direccion;
	private int sueldo;
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@XmlElement
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@XmlElement
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String nireccion) {
		this.direccion = nireccion;
	}
	@XmlElement
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	public Empleados(String codigo, String nombre, String direccion, int sueldo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.direccion = direccion;
		this.sueldo = sueldo;
	}
	public Empleados() {
		super();
	}
	
}
