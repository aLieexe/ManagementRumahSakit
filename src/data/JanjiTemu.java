package data;

import java.util.Date;
import java.text.SimpleDateFormat;

public class JanjiTemu {
    private String idJanjiTemu;
    private Date tanggalJanjiTemu;
    private Dokter dokter;
    private Pasien pasien;


    public JanjiTemu(String idJanjiTemu, Date tanggalJanjiTemu, Dokter dokter, Pasien pasien) {
        this.idJanjiTemu = idJanjiTemu;
        this.tanggalJanjiTemu = tanggalJanjiTemu;
        this.dokter = dokter;
        this.pasien = pasien;
    }

    public Pasien getPasien(){
        return pasien;
    }

    public Dokter getDokter(){
        return dokter;
    }

    public String getIdJanjiTemu(){
        return idJanjiTemu;
    }

    public Date getTanggalJanjiTemu(){
        return tanggalJanjiTemu;
    }

    public void konfirmasiJanjiTemu() {
        System.out.println("Janji temu antara pasien " + pasien.getNama() + " dengan dokter " + dokter.getNama() + " telah dikonfirmasi.");
    }

    public void getDetail(){
        System.out.println("Tanggal: " + new SimpleDateFormat("dd MM yyyy").format(tanggalJanjiTemu));
        System.out.println("Pasien: " + pasien.getNama());
        System.out.println("Dokter: " + dokter.getNama());
    }


    //TODO: terserah mau gimana, mungkin bisa hapus aja dari arrayList
    public void batalkanJanjiTemu(){

    }

    //TODO: mungkin bisa dieksekusi dokter sama resepsionis? sama mungkin admin.
    public void jadwalUlangJanjiTemu(){

    }
}