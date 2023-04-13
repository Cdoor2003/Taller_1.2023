public class Notebooks extends DispositivoTecnologico {
	private String resolucionPantalla;
	private String tipoTeclado;
	private int bateria;

	public Notebooks(String marca, String memoriaRAM, String memoriaAlmacenamiento, String procesador, String modelo, int añoFabricacion, int precio, int cantidadStock, String resolucionPantalla, String tipoTeclado, int bateria) {
		super(marca, memoriaRAM, memoriaAlmacenamiento, procesador, modelo, añoFabricacion, precio, cantidadStock);
		this.resolucionPantalla = resolucionPantalla;
		this.tipoTeclado = tipoTeclado;
		this.bateria = bateria;
	}

	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public String getTipoTeclado() {
		return this.tipoTeclado;
	}

	public void setTipoTeclado(String tipoTeclado) {
		this.tipoTeclado = tipoTeclado;
	}

	public int getBateria() {
		return this.bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public String getTipo(){
		return "Notebook";
	}

	public String toString(){
		return "Tipo: "+getTipo()+"\nMarca: "+getMarca()+"\nMemoria RAM: "+getMemoriaRAM()+"\nMemoria de Almacenamiento: "+getMemoriaAlmacenamiento()+"\nProcesador: "+getProcesador()+"\nModelo: "+getModelo()+"\nAño de Fabricacion"+getAñoFabricacion()+"\nPrecio: "+getPrecio()+"\nCantidad en Stock: "+getCantidadStock()+"\nResolución de pantalla: "+getResolucionPantalla()+"\nTipo de teclado: "+getTipoTeclado()+"\nBateria : "+getBateria()+" mAh";
	}
}