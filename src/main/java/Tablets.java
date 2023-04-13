public class Tablets extends DispositivoTecnologico {
	private String resolucionPantalla;
	private String[] listaAccesorios;

	public Tablets(String marca, String memoriaRAM, String memoriaAlmacenamiento, String procesador, String modelo, int añoFabricacion, int precio, int cantidadStock, String resolucionPantalla, String[] listaAccesorios) {
		super(marca, memoriaRAM, memoriaAlmacenamiento, procesador, modelo, añoFabricacion, precio, cantidadStock);
		this.resolucionPantalla = resolucionPantalla;
		this.listaAccesorios = listaAccesorios;
	}

	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public String getListaAccesorios() {
		for (int i = 0; i < listaAccesorios.length; i++) {
			String accesorio = listaAccesorios[i];
			return accesorio;
		}
		return null;
	}

	public void setListaAccesorios(String[] listaAccesorios) {
		this.listaAccesorios = listaAccesorios;
	}

	public String getTipo(){
		return "Tablet";
	}

	public String toString(){
		return "Tipo: "+getTipo()+"\nMarca: "+getMarca()+"\nMemoria RAM: "+getMemoriaRAM()+"\nMemoria de Almacenamiento: "+getMemoriaAlmacenamiento()+"\nProcesador: "+getProcesador()+"\nModelo: "+getModelo()+"\nAño de Fabricacion"+getAñoFabricacion()+"\nPrecio: "+getPrecio()+"\nCantidad en Stock: "+getCantidadStock()+"\nResolución de pantalla: "+getResolucionPantalla()+"\nLista de accesorios: "+getListaAccesorios();
	}
}