package data;

import java.util.ArrayList;

import utils.Global;

public class Dokter extends Orang {
    private String spesialisasi;
    private int tahunPengalaman;

    public Dokter(String nama, int umur, String jenisKelamin, String alamat, String nomorKontak, String idDokter, String spesialisasi, int tahunPengalaman) {
        super(nama, umur, jenisKelamin, alamat, nomorKontak, idDokter);
        this.spesialisasi = spesialisasi;
        this.tahunPengalaman = tahunPengalaman;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public int getTahunPengalaman() {
        return tahunPengalaman;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    public void setTahunPengalaman(int tahunPengalaman) {
        this.tahunPengalaman = tahunPengalaman;
    }

    @Override
    public void getDetail() {
        System.out.println("ID: " + getId());
        System.out.println("Nama: " + getNama());
        System.out.println("Umur: " + getUmur());
        System.out.println("Jenis Kelamin: " + getJenisKelamin());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Nomor Kontak: " + getNomorKontak());
        System.out.println("Spesialisasi: " + spesialisasi);
        System.out.println("Tahun Pengalaman: " + tahunPengalaman + " Tahun");
    }


    public void diagnosisPasien(Pasien pasien) {
        System.out.println("Dokter " + getNama() + " sedang mendiagnosis pasien " + pasien.getNama());
    }

    public void displayDokter(){
        int choice = 1;
        while(choice != 0){
            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Lihat Profile");
            System.out.println("2. Lihat Jadwal Janji Temu");
            System.out.println("3. Lihat Keadaan Pasien"); // TODO: make this to kelola pasien -> can change pasien details, and perhaps also buat jadwal janji temu
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine();

            switch (choice) {
                case 0:
                    break;
                case 1:
                    getDetail();
                    break;
                case 2:
                    for(JanjiTemu jt : Global.daftarJanjiTemu){
                        if(jt.getDokter().getId().equals(getId())){
                            jt.getDetail();
                        }
                    }
                    break;
                case 3: 
                    displayPasienDokter();
                    break;
            
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }

    public void displayPasienDokter(){
        if(Global.dokterListPasien.containsKey(getId())){
            ArrayList<Pasien> pasienList = Global.dokterListPasien.get(getId());
            for(Pasien p : pasienList){
                p.getDetail();
            }
        }
        else{
            System.out.println("Tidak ada pasien yang di assign ke anda");
        }

    }


    //TODO: buat switch case, tanyai user mau edit apa, sesuain sama atribut
    public void editDokter(){

    }

    public void editKeadaanPasien(){

    }
}
