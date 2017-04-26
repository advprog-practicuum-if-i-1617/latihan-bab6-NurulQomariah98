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
public class Pegawai {
    public long gajiPokok;
    public long bonusPerBulan;
    public long masaKerja;
    public long bonus2;
    
public Pegawai (long gajiPokok, long bonusPerBulan,long masaKerja){
    this.gajiPokok = gajiPokok ;
    this.bonusPerBulan = bonusPerBulan;
    this.masaKerja = masaKerja;
    }

    public long getBonus2() {
        if (masaKerja>5){
            return 500000/2;
        } else {
            return 0;
        }
    }
    
    public long getGajiPokok() {
        return 2500000;
    }
    public long getBonusPerBulan() {
        return bonusPerBulan;
    }
    public long getMasaKerja() {
        return masaKerja;
    }
    
}