/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Tugas6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama,jenis;
        int masaKerja;
        System.out.print("Masukkan nama : ");nama = input.next();
        System.out.print("Jenis Pekerjaan : ");jenis = input.next();
        System.out.print("Masa Kerja : ");masaKerja = input.nextInt();
        if (jenis.equals("Software")){
            SoftwareEngineer se1 = new SoftwareEngineer(2500000,300000,masaKerja);
            System.out.println(se1.getTotalgaji());
        } 
        if (jenis.equals("Manager")){
            ProjectManager pm1 = new ProjectManager(6000000,450000,masaKerja);
            System.out.println(pm1.getTotalgaji());
        }
    }
    
    
}
