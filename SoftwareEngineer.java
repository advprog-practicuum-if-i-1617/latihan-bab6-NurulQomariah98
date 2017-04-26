/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6;

/**
 *
 * @author ASUS
 */
public class SoftwareEngineer extends Pegawai {
    private long Tunjangan;
    private long Totalgaji;
    
    public SoftwareEngineer(long gajiPokok, long bonusPerBulan, long masaKerja) {
        super(gajiPokok, bonusPerBulan, masaKerja);  
    }

    public long getTunjangan() {
        return 5500000;
    }

    public long getBonus() {
        return 300000;
    }

    public long getTotalgaji() {
        return getTunjangan() + getBonus()+ getGajiPokok()+ getBonus2();
    }   
}
