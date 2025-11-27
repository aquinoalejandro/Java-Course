package com.oregoom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//TIP Para <b>ejecutar</b> el código, pulsar <shortcut actionId="Run"/> o
// Haz clic en el ícono <icon src="AllIcons.Actions.Execute"/> del margen.
public class Main {
    public static void main() {
        try{
            Connection conectar = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mensajes_db",
                    "root",
                    ""
            );
            System.out.println("Conectado a la base de datos");

            String sql = "SELECT * FROM mensajes";
            PreparedStatement ps = conectar.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                int id = rs.getInt("id_mensaje");
                String mensje = rs.getString("mensje");
                String autor = rs.getString("autor");
                String fecha = rs.getString("fecha");
                System.out.println(id + " - " + mensje + " - " + autor + " - " + fecha);
            }

            rs.close();
            ps.close();
            conectar.close();

        }catch (Exception e){
            System.out.println("Error al conectar a la base de datos"+ e);
        }

    }
}
