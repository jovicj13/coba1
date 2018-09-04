package Tugas;
public class UKM {
    private String namaUnit;
    private Mahasiswa ketua;
    private Mahasiswa sekretaris;
    private Penduduk[] anggota;

    public UKM(){}
    public UKM(String namaUnit) {
        this.namaUnit = namaUnit;
    }

    public void setNamaUnit(String namaUnit) {
        this.namaUnit = namaUnit;
    }
    public String getNamaUnit() {
        return namaUnit;
    }
    public void setKetua(Mahasiswa ketua) {
        this.ketua = ketua;
    }
    public Mahasiswa getKetua() {
        return ketua;
    }
    public void setSekretaris(Mahasiswa sekretaris) {
        this.sekretaris = sekretaris;
    }
    public Mahasiswa getSekretaris() {
        return sekretaris;
    }
    public void setAnggota(Penduduk[] anggota) {
        this.anggota = anggota;
    }
    public Penduduk[] getAnggota() {
        return anggota;
    }
}
