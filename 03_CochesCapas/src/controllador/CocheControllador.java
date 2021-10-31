package controllador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import clases.Coche;
import dao.CocheDAO;


public class CocheControllador implements CocheDAO{

	//private final String SELECT_ALL = "select * from Coche";

	private Connection con;

	public CocheControllador(Connection con) {
		super();
		this.con = con;
	}
	@Override
	public List<Coche> selectAllCoches() {

		List<Coche> coches = new ArrayList<Coche>();

		try {
			String query = "Select * from coches";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(query);

			// rs.beforeFirst();

			while (rs.next()) {
				int id = rs.getInt("id");
				String matricula = rs.getString("matricula");
				String marca = rs.getString("marca");
				String modelo = rs.getString("modelo");
				int kilometros= rs.getInt("kilometros");

				Coche coche = new Coche(id, matricula, marca, modelo, kilometros);

				coches.add(coche);

			}
			stm.close();
			rs.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return coches;

	}
	@Override
	public boolean insertCoche(Coche coche) {
		String sql = "insert into coche ( matricula, marca, modelo, kilometros) values (?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

					
			ps.setString(2, coche.getMatricula());		
			ps.setString(3, coche.getMarca());
			ps.setString(4, coche.getModelo());
			ps.setInt(5, coche.getKilometros());

			
			
			if (coche.getMatricula().length() == 7 && !coche.getMarca().isEmpty() && !coche.getModelo().isEmpty()
					&& !coche.getMatricula().isEmpty()) {
				
				ps.executeUpdate();
			}else {
				System.err.println("A abido un error al introducir los datos del coche. Revisa si los datos son corectos.");
			}

		} catch (SQLException e) {
			System.out.println("Se ha producido un error al insertar el coche");
			e.printStackTrace();
			return false;
		}

		return true;
	}
	@Override
	public boolean deleteCoche(int id) {
		String sql = "delete from coche where id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Se ha producido un error al borrar el coche");
			e.printStackTrace();
			return false;
		}

		return true;
		
	}
	@Override
	public boolean updateCoche(int id, String matricula, String marca, String modelo, int kilometros) {
		String sql = "update coche set maricula = ?, marca = ?, modelo = ?, kilometros = ? where id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, matricula);
			ps.setString(2, marca);
			ps.setString(3, modelo);
			ps.setInt(4, kilometros);
			ps.setInt(5, id);

			ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Se ha producido un error al actualizar el coche");
			e.printStackTrace();
			return false;
		}

		return true;
	}
 
	
	
}
