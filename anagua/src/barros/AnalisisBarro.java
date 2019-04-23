package barros;

import java.util.Date;

public class AnalisisBarro {
	
	private String industria;
	private String departamento;
	private String localidad;
	private String descargaEn;
	private String nroAnalisis;
	private String lugarExtraccion;
	private String extraidoPor;
	private Date fechaExtraccion;
	private String horaExtraccion;
	private String aspecto;
	private String pH;
	private String solidosTotales;
	private String humedad;
	private String solidosTotalesVolatiles;
	private String liquidosLibres;
	private String sulfuro;
	private String cromoEnLixiviado;
	private String plomoEnLixiviado;
	private String materiaOrganica;
	private String hidrocarburosTotales;
	private String conductividad;
	private String relacionCN;
	private String otros1;
	private String otros2;
	private String otros3;
	private String otros4;
	private String estado;
	private int size;
	
	public AnalisisBarro(String industria, String departamento, String localidad, String descargaEn, String nroAnalisis,
			String lugarExtraccion, String extraidoPor, Date fechaExtraccion, String horaExtraccion, String aspecto,
			String pH, String solidosTotales, String humedad, String solidosTotalesVolatiles,
			String liquidosLibres, String sulfuro, String cromoEnLixiviado, String plomoEnLixiviado,
			String materiaOrganica, String hidrocarburosTotales, String conductividad, String relacionCN,
			String otros1, String otros2, String otros3, String otros4, String estado) {
		this.industria = industria;
		this.departamento = departamento;
		this.localidad = localidad;
		this.descargaEn = descargaEn;
		this.nroAnalisis = nroAnalisis;
		this.lugarExtraccion = lugarExtraccion;
		this.extraidoPor = extraidoPor;
		this.fechaExtraccion = fechaExtraccion;
		this.horaExtraccion = horaExtraccion;
		this.aspecto = aspecto;
		this.pH = pH;
		this.solidosTotales = solidosTotales;
		this.humedad = humedad;
		this.solidosTotalesVolatiles = solidosTotalesVolatiles;
		this.liquidosLibres = liquidosLibres;
		this.sulfuro = sulfuro;
		this.cromoEnLixiviado = cromoEnLixiviado;
		this.plomoEnLixiviado = plomoEnLixiviado;
		this.materiaOrganica = materiaOrganica;
		this.hidrocarburosTotales = hidrocarburosTotales;
		this.conductividad = conductividad;
		this.relacionCN = relacionCN;
		this.otros1 = otros1;
		this.otros2 = otros2;
		this.otros3 = otros3;
		this.otros4 = otros4;
		this.estado = estado;
		this.size = 24;
	}
	
	public String getIndustria() {
		return industria;
	}
	public String getDepartamento() {
		return departamento;
	}
	public String getLocalidad() {
		return localidad;
	}
	public String getDescargaEn() {
		return descargaEn;
	}
	public String getNroAnalisis() {
		return nroAnalisis;
	}
	public String getLugarExtraccion() {
		return lugarExtraccion;
	}
	public String getExtraidoPor() {
		return extraidoPor;
	}
	public Date getFechaExtraccion() {
		return fechaExtraccion;
	}
	public String getHoraExtraccion() {
		return horaExtraccion;
	}
	public String getAspecto() {
		return aspecto;
	}
	public String getpH() {
		return pH;
	}
	public String getSolidosTotales() {
		return solidosTotales;
	}
	public String getHumedad() {
		return humedad;
	}
	public String getSolidosTotalesVolatiles() {
		return solidosTotalesVolatiles;
	}
	public String getLiquidosLibres() {
		return liquidosLibres;
	}
	public String getSulfuro() {
		return sulfuro;
	}
	public String getCromoEnLixiviado() {
		return cromoEnLixiviado;
	}
	public String getPlomoEnLixiviado() {
		return plomoEnLixiviado;
	}
	public String getMateriaOrganica() {
		return materiaOrganica;
	}
	public String getHidrocarburosTotales() {
		return hidrocarburosTotales;
	}
	public String getConductividad() {
		return conductividad;
	}
	public String getRelacionCN() {
		return relacionCN;
	}
	public String getOtros1() {
		return otros1;
	}
	
	public String getOtros2() {
		return otros2;
	}
	
	public String getOtros3() {
		return otros3;
	}
	
	public String getOtros4() {
		return otros4;
	}
	
	public String getEstado(){
		return estado;
	}
	public int getSize() {
		return size;
	}
	
}