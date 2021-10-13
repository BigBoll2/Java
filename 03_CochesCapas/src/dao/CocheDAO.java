package dao;


import java.util.List;

import clases.Coche;



public interface CocheDAO {
	
	public List<Coche> selectAllCoches();

	public boolean insertCoche(Coche coche);

	public boolean deleteCoche(int id);

	public boolean updateCoche(int id, String matricula, String marca, String modelo, int kilometros);
}
