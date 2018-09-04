package Tugas;
public class Mahasiswa extends Penduduk{
    private String nim;
    
    public Mahasiswa(){}
    
    public Mahasiswa(String nama, String tempatTanggallahir,String nim){
        super(nama,tempatTanggallahir);
        this.nim=nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNim() {
        return nim;
    }
    @Override
    public double hitungIuran(){
        double iuranMahasiswa;
        iuranMahasiswa=(Double.parseDouble(getNim())/10000.0);
        return iuranMahasiswa;
    }
}
