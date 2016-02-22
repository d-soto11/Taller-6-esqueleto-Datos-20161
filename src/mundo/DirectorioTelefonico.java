package mundo;

import java.util.ArrayList;

import estructuras.TablaHash;
import estructuras.TablaHash.CollisionType;

public class DirectorioTelefonico {
	
	private TablaHash<String, RegistroTelefonico> directorioTelefonos;
	private TablaHash<String, RegistroTelefonico> directorioApellidos;

	
	public DirectorioTelefonico(){
		directorioTelefonos = new TablaHash<String, RegistroTelefonico>(1000000, 0.8f, CollisionType.SIMPLE);
		directorioApellidos = new TablaHash<String, RegistroTelefonico>(1000000, 0.8f, CollisionType.LINKED);
	}
	
	public void agregarRegistro(RegistroTelefonico registro){
		directorioTelefonos.put(registro.getTelefono(), registro);
		directorioApellidos.put(registro.getApellido(), registro);
	}
	
	public RegistroTelefonico buscarRegistroTelefono(String telefono){
		return directorioTelefonos.get(telefono);
	}

	public ArrayList<RegistroTelefonico> buscarRegistrosApellido(String apellidos) {
		return directorioApellidos.getMultiple(apellidos);
	}

}
