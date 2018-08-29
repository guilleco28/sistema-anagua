package industrias;

public class Industria {
	
	private int id;
	private String cliente;
	private String responsable;
	private String departamento;
	private String localidad;
	private String direccion;
	private String telefono;
	private String claveDeAccesoWeb;
	private String contacto;
	private String rubro;
	private String descargaAbreviada;
	private String descarga;
	
	public Industria(int id, String cliente, String responsable, String departamento, String localidad,
			String direccion, String telefono, String claveDeAccesoWeb, String contacto, String rubro,
			String descargaAbreviada, String descarga) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.responsable = responsable;
		this.departamento = departamento;
		this.localidad = localidad;
		this.direccion = direccion;
		this.telefono = telefono;
		this.claveDeAccesoWeb = claveDeAccesoWeb;
		this.contacto = contacto;
		this.rubro = rubro;
		this.descargaAbreviada = descargaAbreviada;
		this.descarga = descarga;
	}

	public int getId() {
		return id;
	}

	public String getCliente() {
		return cliente;
	}

	public String getResponsable() {
		return responsable;
	}

	public String getDepartamento() {
		return departamento;
	}

	public String getLocalidad() {
		return localidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getClaveDeAccesoWeb() {
		return claveDeAccesoWeb;
	}

	public String getContacto() {
		return contacto;
	}

	public String getRubro() {
		return rubro;
	}

	public String getDescargaAbreviada() {
		return descargaAbreviada;
	}

	public String getDescarga() {
		return descarga;
	}	

}
