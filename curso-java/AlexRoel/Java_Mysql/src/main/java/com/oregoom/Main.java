package com.oregoom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
    private static Connection connection;

    public static void main(String[] args) {



        // Ejemplos de cómo llamar a los métodos:
        crearMensaje("Hola mundo", "Juan");
        crearMensaje("Mensaje generado por Inteligencia Humana", "Humano");
        leerMensajes();
        actualizarMensaje(1, "Mensaje actualizado", "Pedro");
        eliminarMensaje(2);


    }

    private static void conectarBD() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mensajes_db",
                    "root",
                    ""
            );
            System.out.println("Conectado a la base de datos");
        } catch (Exception e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    private static void desconectarBD() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Conexión cerrada");
            }
        } catch (Exception e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

    public static void crearMensaje(String mensaje, String autor) {
        try {
            conectarBD();
            String sql = "INSERT INTO mensajes (mensje, autor, fecha) VALUES (?, ?, CURRENT_TIMESTAMP)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, mensaje);
            ps.setString(2, autor );

            ps.executeUpdate();
            ps.close();
            desconectarBD();
            System.out.println("Mensaje creado exitosamente");
        } catch (Exception e) {
            System.out.println("Error al crear mensaje: " + e.getMessage());
        }
    }

    public static void leerMensajes() {
        try {
            conectarBD();
            String sql = "SELECT * FROM mensajes";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            System.out.println("--- LISTA DE MENSAJES ---");
            while (rs.next()) {
                int id = rs.getInt("id_mensaje");
                String mensaje = rs.getString("mensje");
                String autor = rs.getString("autor");
                String fecha = rs.getString("fecha");
                System.out.println(id + " - " + mensaje + " - " + autor + " - " + fecha);
            }
            System.out.println();

            rs.close();
            ps.close();
            desconectarBD();
        } catch (Exception e) {
            System.out.println("Error al leer mensajes: " + e.getMessage());
        }
    }

    public static void actualizarMensaje(int id, String nuevoMensaje, String nuevoAutor) {
        try {
            conectarBD();
            String sql = "UPDATE mensajes SET mensje = ?, autor = ? WHERE id_mensaje = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, nuevoMensaje);
            ps.setString(2, nuevoAutor);
            ps.setInt(3, id);
            int filasAfectadas = ps.executeUpdate();
            ps.close();
            desconectarBD();

            if (filasAfectadas > 0) {
                System.out.println("Mensaje actualizado exitosamente");
            } else {
                System.out.println("No se encontró el mensaje con ID: " + id);
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar mensaje: " + e.getMessage());
        }
    }

    public static void eliminarMensaje(int id) {
        try {
            conectarBD();
            String sql = "DELETE FROM mensajes WHERE id_mensaje = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();
            ps.close();
            desconectarBD();

            if (filasAfectadas > 0) {
                System.out.println("Mensaje eliminado exitosamente");
            } else {
                System.out.println("No se encontró el mensaje con ID: " + id);
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar mensaje: " + e.getMessage());
        }
    }
}