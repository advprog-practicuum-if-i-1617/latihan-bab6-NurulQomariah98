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
public class ProjectManager extends Pegawai {
    private long Tunjangan;
    private long Totalgaji;
    private long bonusApresiasi;
    
    public ProjectManager(long gajiPokok,long bonusPerBulan, long masaKerja) {
        super(gajiPokok, bonusPerBulan, masaKerja);
    }
    public long getTunjangan() {
        return 6000000;
    }

    public long getBonus() {
        return 450000;
    }

    public long getBonusApresiasi() {
        if (masaKerja >= 10){
            return 700000;
        }else{
            return 450000/2;
            
    }
    }
    public long getTotalgaji() {
        return getTunjangan()+getBonus()+getBonusApresiasi()+getGajiPokok()+ getBonus2();
    }   
}  
