package Tugas;
public class UKMMain {
    public static void main(String[] args) {
        int i;
        Penduduk pen[]=new Penduduk[3];
        
        Mahasiswa mhs1=new Mahasiswa("Edo","Gorontalo,04-09-1995","10120");
        Mahasiswa mhs2=new Mahasiswa("Fadli","Wamena,06-10-1996","10121");
        
        UKM ukm,ketua,sekretaris,mahasiswa;
        
        ukm=new UKM("SepakBola");
        ketua=new UKM();
        ketua.setKetua(mhs1);
        sekretaris=new UKM();
        sekretaris.setSekretaris(mhs2);
        
        System.out.println("UKM - "+ukm.getNamaUnit());
        System.out.println("=================================");
        System.out.println("Ketua       :"+ketua.getKetua().getNama());
        System.out.println("Sekretaris  :"+sekretaris.getSekretaris().getNama());
        System.out.println("Anggota     :");
        System.out.println("Mahasiswa");
        
        pen[0]=new Mahasiswa("Okto  ","Palembang,03-07-1995","10000001");
        pen[1]=new Mahasiswa("Robert","Medan,04-08-1996    ","10000002");
        pen[2]=new Mahasiswa("Ipin  ","Merauke,o7-03-1996  ","10000003");
        
        System.out.println("Nim\t\tNama\tTempat Tanggal Lahir\tIuran");
        double Total1=0;
        for(i=0; i<pen.length; i++){
            System.out.print(((Mahasiswa)pen[i]).getNim()+"\t");
            System.out.print(((Mahasiswa)pen[i]).getNama()+"\t");
            System.out.print(((Mahasiswa)pen[i]).getTempatTanggallahir()+"\t");
            System.out.println(((Mahasiswa)pen[i]).hitungIuran());
            Total1=Total1+((Mahasiswa)pen[i]).hitungIuran();
        }
        
        pen[0]=new MasyarakatSekitar("Sutarno","Goa,08-09-1994   ","20345");
        pen[1]=new MasyarakatSekitar("Agus   ","Balusu,13-05-1997","20122");
        pen[2]=new MasyarakatSekitar("Jarwo  ","Batu,14-09-1993  ","20123");
        System.out.println("");
        System.out.println("Masyarakat Sekitar");
        System.out.println("Nomor\tNama\tTempat Tanggal Lahir\tIuran");
        double Total2=0;
        for(i=0; i<pen.length; i++){
            System.out.print(((MasyarakatSekitar)pen[i]).getNomor()+"\t");
            System.out.print(((MasyarakatSekitar)pen[i]).getNama()+"\t");
            System.out.print(((MasyarakatSekitar)pen[i]).getTempatTanggallahir()+"\t");
            System.out.println(((MasyarakatSekitar)pen[i]).hitungIuran());
            Total2=Total2+((MasyarakatSekitar)pen[i]).hitungIuran();
        }
        System.out.println("");
        System.out.println("Total iuran dari Mahasiswa dan MasyarakatSekitar :Rp."+((int)(Total1+Total2)));
    }
}