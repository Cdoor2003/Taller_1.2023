public abstract class DispositivoTecnologico {
	private String marca;
	private String memoriaRAM;
	private String memoriaAlmacenamiento;
	private String procesador;
	private String modelo;
	private int añoFabricacion;
	private int precio;
	private int cantidadStock;

	public DispositivoTecnologico(String marca, String memoriaRAM, String memoriaAlmacenamiento, String procesador, String modelo, int añoFabricacion, int precio, int cantidadStock) {
		this.marca = marca;
		this.memoriaRAM = memoriaRAM;
		this.memoriaAlmacenamiento = memoriaAlmacenamiento;
		this.procesador = procesador;
		this.modelo = modelo;
		this.añoFabricacion = añoFabricacion;
		this.precio = precio;
		this.cantidadStock = cantidadStock;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMemoriaRAM() {
		return this.memoriaRAM;
	}

	public void setMemoriaRAM(String memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}

	public String getMemoriaAlmacenamiento() {
		return this.memoriaAlmacenamiento;
	}

	public void setMemoriaAlmacenamiento(String memoriaAlmacenamiento) {
		this.memoriaAlmacenamiento = memoriaAlmacenamiento;
	}

	public String getProcesador() {
		return this.procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAñoFabricacion() {
		return this.añoFabricacion;
	}

	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidadStock() {
		return this.cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public abstract String getTipo();
}