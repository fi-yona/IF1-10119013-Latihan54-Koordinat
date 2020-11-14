/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan54.koordinat;

/**
 *
 * @author Fiona Avila
 */


public class WarnaKoordinat extends Koordinat{
    
    public String namaWarna;
    
    public WarnaKoordinat(int x, int y, String namaWarna){
        super(x,y);
        this.namaWarna = namaWarna;
    }
    
    public String getNamaWarna(){
        return namaWarna;
    }
    
    public void setNamaWarna(String namaWarna){
        this.namaWarna = namaWarna;
    }
}
