package utils;

public class DisplayAdmin {

    public static void displayAdmin(){
        boolean running = true;
    
        while (running) {
            System.out.println("====================================");
            System.out.println(" 0. Keluar                        ");
            System.out.println(" 1. Kelola Dokter                 ");
            System.out.println(" 2. Kelola Pasien                 ");
            System.out.println(" 3. Kelola Perawat                ");
            System.out.println(" 4. Kelola Resepsionis            ");
            System.out.println(" 5. Kelola Ruangan                ");
            System.out.println(" 6. Kelola Janji Temu             ");
            System.out.println("====================================");
            System.out.print("Pilih menu: ");
            int pilihan = Global.scanner.nextInt();
            Global.scanner.nextLine();
    
            switch (pilihan) {
                case 1:
                    displayAdminDokter();
                    break;
                case 2:
                    displayAdminPasien();
                    break;
                case 3:
                    displayAdminPerawat();
                    break;
                case 4:
                    displayAdminResepsionis();
                    break;
                case 5:
                    displayAdminRuangan();
                    break;
                case 6:
                    displayAdminJanjiTemu();
                    break;
                case 0:
                    running = false;
                    System.out.println("Keluar dari sistem.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
    
    public static void displayAdminDokter(){
        int choice  = 1;
        while(choice != 0){

            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Lihat Dokter");
            System.out.println("2. Tambah Dokter");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine(); 
            switch (choice) {
                case 0:
                    break;
                case 1:
                    displayAdminDetailDokter();
                    break;
                case 2:
                    Global.tambahDokter();
                    break;
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
        
    }

    public static void displayAdminPasien(){
        int choice  = 1;
        while(choice != 0){

            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Lihat Pasien");
            System.out.println("2. Tambah Pasien");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine(); 
            switch (choice) {
                case 0:
                    break;
                case 1:
                    displayAdminDetailDokter();
                    break;
                case 2:
                    Global.tambahPasien();
                    break;
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }

    public static void displayAdminResepsionis(){
        int choice  = 1;
        while(choice != 0){

            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Lihat Resepsionis");
            System.out.println("2. Tambah Resepsionis");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine(); 
            switch (choice) {
                case 0:
                    break;
                case 1:
                    displayAdminDetailResepsionis();
                    break;
                case 2:
                    Global.tambahResepsionis();
                    break;
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }

    public static void displayAdminPerawat(){
        int choice  = 1;
        while(choice != 0){

            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Lihat Perawat");
            System.out.println("2. Tambah Perawat");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine(); 
            switch (choice) {
                case 0:
                    break;
                case 1:
                    displayAdminDetailPerawat();
                    break;
                case 2:
                    Global.tambahPerawat();
                    break;
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }

    public static void displayAdminRuangan(){
        int choice  = 1;
        while(choice != 0){

            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Lihat Ruangan");
            System.out.println("2. Tambah Ruangan");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine(); 
            switch (choice) {
                case 0:
                    break;
                case 1:
                    displayAdminDetailRuangan();
                    break;
                case 2:
                    Global.tambahRuangan();
                    break;
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }

    //TODO: 
    // Fitur: lihatSeluruh janjiTemu?
    // tambah janjiTemu 
    // tambah juga detailnya kayak function dibawah
    public static void displayAdminJanjiTemu(){

    }


    //TODO ?: Mungkin buat disini bisa juga tambahin assign dokter ke pasien? 
    public static void displayAdminDetailDokter(){
        int choice  = 1;
        int index = 0;

        if(Global.daftarDokter.isEmpty()){
            System.out.println("Belum ada dokter yang didaftarkan");
            return;
        }

        while(choice != 0){
            System.out.println("====================================");
            Global.daftarDokter.get(index).getDetail();
            System.out.println("====================================");

            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Selanjutnya");
            System.out.println("2. Sebelumnya");
            System.out.println("3. Edit Dokter");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine(); 


            switch (choice) {
                case 0:
                    break;
                case 1:
                    if(index < Global.daftarDokter.size() - 1){
                        index++;
                    }                    
                    break;
                case 2:
                    if(index > 0){
                        index--;
                    }
                    break;
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }

    public static void displayAdminDetailPasien(){
    }


    public static void displayAdminDetailResepsionis(){

    }

    //TODO ?: Mungkin buat disini bisa juga tambahin assign perawat ke pasien? 

    public static void displayAdminDetailPerawat(){
    }

    //TODO ?: Mungkin buat disini bisa juga tambahin assign ruangan ke pasien? 
    public static void displayAdminDetailRuangan(){

    }

}
