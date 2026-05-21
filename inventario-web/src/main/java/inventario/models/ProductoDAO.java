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

	public void insertar(Producto p) {
    String sql = "INSERT INTO productos(codigo_barras, descripcion, stock, precio) VALUES(?,?,?,?)";
    try (Connection conn = new Conexion().getConexion();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setLong(1, p.getCodigoBarras());
        ps.setString(2, p.getDescripcion());
        ps.setInt(3, p.getStock());
        ps.setDouble(4, p.getPrecio());
        ps.executeUpdate();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public void eliminar(Long codigoBarras) {
    String sql = "DELETE FROM productos WHERE codigo_barras=?";
    try (Connection conn = new Conexion().getConexion();
         PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setLong(1, codigoBarras);
        ps.executeUpdate();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
