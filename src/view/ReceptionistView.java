package view;

import utils.Global;
import model.Receptionist;
import controller.ReceptionistController;

public class ReceptionistView{
    public static void receptionistDisplay(Receptionist r){
        int choice = 1;
        while(choice != 0){
            System.out.println("====================================");
            System.out.println("=         BY : Kelompok 2          =");
            System.out.println("====================================");
            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Lihat Profile");
            System.out.println("2. Jadwalkan Janji Temu");
            System.out.println("3. Assign dokter kepada pasien");
            System.out.println("4. Assign perawat kepada pasien");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine();
    
            switch (choice) {
                case 0:
                    break;
                case 1:
                    profileDisplay(r);
                    break;
                case 2:
                    ReceptionistController.scheduleAppointment();
                    break;
                case 3: 
                    ReceptionistController.assignDoctorToPatient();
                    break;
                case 4: 
                    ReceptionistController.assignNurseToPatient();
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }

    public static void profileDisplay(Receptionist re){
        int choice = 1;
        while(choice != 0){
            System.out.println("====================================");
            System.out.println(re.getDetail());
            System.out.println("====================================");
            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Edit Profil");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine();


            switch (choice) {
                case 0:
                    break;
                case 1:
                    editReceptionist(re);
                    break;
    
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }


    public static void editReceptionist(Receptionist re){
        int choice = 1;
        while (choice != 0){
            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Edit Nama");
            System.out.println("2. Edit Umur");
            System.out.println("3. Edit Jenis Kelamin");
            System.out.println("4. Edit Alamat");
            System.out.println("5. Edit Nomor Kontak");
            System.out.println("6. Edit Riwayat Kesehatan");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine();
            
            switch (choice) {
                case 0:
                    break;
                case 1:
                    System.out.println(ReceptionistController.editReceptionistName(re));
                    break;
                case 2:
                    System.out.println(ReceptionistController.editReceptionistAge(re));
                break;
                case 3:
                    System.out.println(ReceptionistController.editReceptionistGender(re));
                break;
                case 4:
                    System.out.println(ReceptionistController.editReceptionistAddress(re));
                break;
                case 5:
                    System.out.println(ReceptionistController.editReceptionistContact(re));
                    break;

                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }



}