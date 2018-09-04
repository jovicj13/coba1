package Tugas;
public class MasyarakatSekitar extends Penduduk{
    private String nomor;
    
    public MasyarakatSekitar(){}
    public MasyarakatSekitar(String nama, String tempatTanggallahir,String nomor){
        super(nama,tempatTanggallahir);
        this.nomor=nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
    public String getNomor() {
        return nomor;
    }
    
    @Override
    public double hitungIuran(){
        double iuranMasyarakat;
        String sub=getNomor().substring(0,2);
        iuranMasyarakat=(Double.parseDouble(sub)*100.0);
        return iuranMasyarakat;
    }
}