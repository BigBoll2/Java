package personas;

import java.util.ArrayList;


public interface personasDAO {

	public ArrayList<Personas> selectAllPersonas();

	public boolean insertPersonas(Personas personas);

	public boolean deletePersonas(int id);

	public boolean updatePersonas(int id, String nombre, int edad);



}
