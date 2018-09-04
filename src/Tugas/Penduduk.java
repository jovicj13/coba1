package Tugas;
public abstract class Penduduk {
    private String nama;
    private String tempatTanggallahir;
    
    public Penduduk(){}
    public Penduduk(String nama, String tempatTanggallahir) {
        this.nama = nama;
        this.tempatTanggallahir = tempatTanggallahir;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setTempatTanggallahir(String tempatTanggallahir) {
        this.tempatTanggallahir = tempatTanggallahir;
    }
    public String getTempatTanggallahir() {
        return tempatTanggallahir;
    }
    abstract double hitungIuran();
}
