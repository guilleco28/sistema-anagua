package aguas;

import java.util.Date;

public class AnalisisAgua {
	
	private String nroAnalisis;
	private String industria;
	private String departamento;
	private String localidad;
	private String descargaEn;
	private String lugarExtraccion;
	private String extraidoPor;
	private Date fechaExtraccion;
	private String horaExtraccion;
	private String aspecto;
	private String pHInSitu;
	private String pH;
	private String temperatura;
	private String caudalInstantaneo;
	private String ODInSitu;
	private String OD;
	private String DBO5;
	private String DBO5Filtrada;
	private String DQO;
	private String aceitesYGrasas;
	private String solidosTotales;
	private String solidosTotalesVolatiles;
	private String sst;
	private String ssv;
	private String ss10;
	private String ss30;
	private String ss60;
	private String amoniaco;
	private String nitrato;
	private String nitrito;
	private String nitrogenoTotal;
	private String fosforoTotal;
	private String cromo;
	private String plomo;
	private String zinc;
	private String aluminio;
	private String manganeso;
	private String potasio;
	private String alcalinidadTotal;
	private String acidezVolatil;
	private String alfa;
	private String alfaPrima;
	private String bicarbonato;
	private String salinidad;
	private String turbiedad;
	private String conductividad;
	private String sulfuro;
	private String sulfato;
	private String fenoles;
	private String tensoactivosAnionicos;
	private String cloroResidual;
	private String cloroTotal;
	private String cloruro;
	private String dureza;
	private String color;
	private String hidrocarburos;
	private String coliformesFecales;
	private String cursoDeAguaTipo;
	private String estado;
	private String otros;
	
	public AnalisisAgua(String nroAnalisis, String industria, String departamento, String localidad, String descargaEn,
			String lugarExtraccion, String extraidoPor, Date fechaExtraccion, String horaExtraccion, String aspecto,
			String pHInSitu, String pH, String temperatura, String caudalInstantaneo, String oDInSitu, String oD,
			String dBO5, String dBO5Filtrada, String dQO, String aceitesYGrasas, String solidosTotales,
			String solidosTotalesVolatiles, String sst, String ssv, String ss10, String ss30, String ss60,
			String amoniaco, String nitrato, String nitrito, String nitrogenoTotal, String fosforoTotal, String cromo,
			String plomo, String zinc, String aluminio, String manganeso, String potasio, String alcalinidadTotal,
			String acidezVolatil, String alfa, String alfaPrima, String bicarbonato, String salinidad, String turbiedad,
			String conductividad, String sulfuro, String sulfato, String fenoles, String tensoactivosAnionicos,
			String cloroResidual, String cloroTotal, String cloruro, String dureza, String color, String hidrocarburos,
			String coliformesFecales, String cursoDeAguaTipo, String estado, String otros) {
		super();
		this.nroAnalisis = nroAnalisis;
		this.industria = industria;
		this.departamento = departamento;
		this.localidad = localidad;
		this.descargaEn = descargaEn;
		this.lugarExtraccion = lugarExtraccion;
		this.extraidoPor = extraidoPor;
		this.fechaExtraccion = fechaExtraccion;
		this.horaExtraccion = horaExtraccion;
		this.aspecto = aspecto;
		this.pHInSitu = pHInSitu;
		this.pH = pH;
		this.temperatura = temperatura;
		this.caudalInstantaneo = caudalInstantaneo;
		ODInSitu = oDInSitu;
		OD = oD;
		DBO5 = dBO5;
		DBO5Filtrada = dBO5Filtrada;
		DQO = dQO;
		this.aceitesYGrasas = aceitesYGrasas;
		this.solidosTotales = solidosTotales;
		this.solidosTotalesVolatiles = solidosTotalesVolatiles;
		this.sst = sst;
		this.ssv = ssv;
		this.ss10 = ss10;
		this.ss30 = ss30;
		this.ss60 = ss60;
		this.amoniaco = amoniaco;
		this.nitrato = nitrato;
		this.nitrito = nitrito;
		this.nitrogenoTotal = nitrogenoTotal;
		this.fosforoTotal = fosforoTotal;
		this.cromo = cromo;
		this.plomo = plomo;
		this.zinc = zinc;
		this.aluminio = aluminio;
		this.manganeso = manganeso;
		this.potasio = potasio;
		this.alcalinidadTotal = alcalinidadTotal;
		this.acidezVolatil = acidezVolatil;
		this.alfa = alfa;
		this.alfaPrima = alfaPrima;
		this.bicarbonato = bicarbonato;
		this.salinidad = salinidad;
		this.turbiedad = turbiedad;
		this.conductividad = conductividad;
		this.sulfuro = sulfuro;
		this.sulfato = sulfato;
		this.fenoles = fenoles;
		this.tensoactivosAnionicos = tensoactivosAnionicos;
		this.cloroResidual = cloroResidual;
		this.cloroTotal = cloroTotal;
		this.cloruro = cloruro;
		this.dureza = dureza;
		this.color = color;
		this.hidrocarburos = hidrocarburos;
		this.coliformesFecales = coliformesFecales;
		this.cursoDeAguaTipo = cursoDeAguaTipo;
		this.estado = estado;
		this.otros = otros;
	}
	
	public String getNroAnalisis() {
		return nroAnalisis;
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
	public String getpHInSitu() {
		return pHInSitu;
	}
	public String getpH() {
		return pH;
	}
	public String getTemperatura() {
		return temperatura;
	}
	public String getCaudalInstantaneo() {
		return caudalInstantaneo;
	}
	public String getODInSitu() {
		return ODInSitu;
	}
	public String getOD() {
		return OD;
	}
	public String getDBO5() {
		return DBO5;
	}
	public String getDBO5Filtrada() {
		return DBO5Filtrada;
	}
	public String getDQO() {
		return DQO;
	}
	public String getAceitesYGrasas() {
		return aceitesYGrasas;
	}
	public String getSolidosTotales() {
		return solidosTotales;
	}
	public String getSolidosTotalesVolatiles() {
		return solidosTotalesVolatiles;
	}
	public String getSst() {
		return sst;
	}
	public String getSsv() {
		return ssv;
	}
	public String getSs10() {
		return ss10;
	}
	public String getSs30() {
		return ss30;
	}
	public String getSs60() {
		return ss60;
	}
	public String getAmoniaco() {
		return amoniaco;
	}
	public String getNitrato() {
		return nitrato;
	}
	public String getNitrito() {
		return nitrito;
	}
	public String getNitrogenoTotal() {
		return nitrogenoTotal;
	}
	public String getFosforoTotal() {
		return fosforoTotal;
	}
	public String getCromo() {
		return cromo;
	}
	public String getPlomo() {
		return plomo;
	}
	public String getZinc() {
		return zinc;
	}
	public String getAluminio() {
		return aluminio;
	}
	public String getManganeso() {
		return manganeso;
	}
	public String getPotasio() {
		return potasio;
	}
	public String getAlcalinidadTotal() {
		return alcalinidadTotal;
	}
	public String getAcidezVolatil() {
		return acidezVolatil;
	}
	public String getAlfa() {
		return alfa;
	}
	public String getAlfaPrima() {
		return alfaPrima;
	}
	public String getBicarbonato() {
		return bicarbonato;
	}
	public String getSalinidad() {
		return salinidad;
	}
	public String getTurbiedad() {
		return turbiedad;
	}
	public String getConductividad() {
		return conductividad;
	}
	public String getSulfuro() {
		return sulfuro;
	}
	public String getSulfato() {
		return sulfato;
	}
	public String getFenoles() {
		return fenoles;
	}
	public String getTensoactivosAnionicos() {
		return tensoactivosAnionicos;
	}
	public String getCloroResidual() {
		return cloroResidual;
	}
	public String getCloroTotal() {
		return cloroTotal;
	}
	public String getCloruro() {
		return cloruro;
	}
	public String getDureza() {
		return dureza;
	}
	public String getColor() {
		return color;
	}
	public String getHidrocarburos() {
		return hidrocarburos;
	}
	public String getColiformesFecales() {
		return coliformesFecales;
	}
	public String getCursoDeAguaTipo() {
		return cursoDeAguaTipo;
	}
	public String getEstado() {
		return estado;
	}
	public String getOtros() {
		return otros;
	}
	
	
	
	
	

}
