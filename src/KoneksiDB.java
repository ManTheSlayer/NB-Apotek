/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lukma
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class KoneksiDB {

    public static void main(String[] args) {
        try {
            // Membuat koneksi ke database
            Connection cn = DriverManager.getConnection(
                "jdbc:mysql://localhost/db-apotek", "root", ""
            );
            
            // Jika koneksi berhasil
            System.out.println("Koneksi berhasil!");
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil!");
            
            // Lakukan operasi database lainnya di sini jika diperlukan
            
        } catch (SQLException e) {
            // Menangani kesalahan jika koneksi gagal
            System.out.println("Terjadi kesalahan: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage());
        }
    }
}
