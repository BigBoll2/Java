package personas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;





public class PersonasController implements personasDAO {

	private final String SELECT_ALL = "select * from Personas";

	private Connection con;

	public PersonasController(Connection con) {
		super();
		this.con = con;
	}
	@Override
	public ArrayList<Personas> selectAllPersonas() {

		ArrayList<Personas> autores = new ArrayList<Personas>();

		try {
			String query = "Select * from Personas";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(query);

			// rs.beforeFirst();

			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				int edad = rs.getInt("edad");

				Personas personas = new Personas(id, nombre, edad);

				autores.add(personas);

			}
			stm.close();
			rs.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return autores;

	}
 
	public boolean insertPersonas(Personas personas) {

		String sql = "insert into personas (id,  nombre, edad) values (?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, personas.getId());			
			ps.setString(2, personas.getNombre());		
			ps.setInt(3, personas.getEdad());

			ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Se ha producido un error al insertar el autor");
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public boolean deletePersonas(int id) {
		String sql = "delete from Personas where id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);

			ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Se ha producido un error al borrar la persona");
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public boolean updatePersonas(int id,  String nombre,  int edad) {
		String sql = "update Personas set , nombre = ?, edad = ? where id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, nombre);
			ps.setInt(2, edad);
			ps.setInt(3, id);

			ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Se ha producido un error al actualizar las personas");
			e.printStackTrace();
			return false;
		}

		return true;
	}

	
	
}
