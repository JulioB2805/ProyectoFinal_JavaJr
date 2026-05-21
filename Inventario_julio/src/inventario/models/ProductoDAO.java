package inventario.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import inventario.controllers.Conexion;

public class ProductoDAO {
    // Data Access Object: CRUD

    public List<Producto> listar() {
        List<Producto> productos = new ArrayList<>();
        // preparar el SQL
        String sql = "SELECT * FROM productos";
        Connection conn;
        try {
            conn = new Conexion().getConexion();

            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                productos.add(new Producto(
                    rs.getLong("id"),
                    rs.getString("descripcion"),
                    rs.getInt("stock"),
                    rs.getDouble("precio")
                ));
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return productos;
    }
}
