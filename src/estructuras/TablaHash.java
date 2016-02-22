package estructuras;


public class TablaHash<K extends Comparable<K> ,V> {


	/**
	 * Factor de carga actual de la tabla (porcentaje utilizado).
	 */
	private float factorCarga;

	/**
	 * Factor de carga maximo que soporta la tabla.
	 */
	private float factorCargaMax;

	/**
	 * Estructura que soporta la tabla.
	 */
	//TODO: Agruegue la estructura que va a soportar la tabla.

	/**
	 * La cuenta de elementos actuales.
	 */
	private int count;

	/**
	 * La capacidad actual de la tabla. Tamaño del arreglo fijo.
	 */
	private int capacidad;


	//Constructores

	@SuppressWarnings("unchecked")
	public TablaHash(){
		//TODO: Inicialice la tabla con los valores que considere prudentes para una ejecucion normal
	}

	@SuppressWarnings("unchecked")
	public TablaHash(int capacidad, float factorCargaMax) {
		//TODO: Inicialice la tabla con los valores dados por parametro

	}

	public void put(K llave, V valor){
		//TODO:
	}

	public V get(K llave){
		//TODO:
		return null;
	}

	//Hash
	private int hash(K llave){
		//TODO: 
		return 0;
	}


}
