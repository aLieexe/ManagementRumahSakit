package view;

import java.util.ArrayList;

import controller.NurseController;

import model.Patient;
import model.Nurse;

import utils.Global;

public class NurseView{

    public static void displayNurseDetails(Nurse n){
        System.out.println("====================================");
        System.out.println("Profil Perawat:");
        System.out.println(n.getDetail());
        System.out.println("====================================");
    }

    public static void nurseDisplay(Nurse n) {
        int choice = 1;
        while (choice != 0) {
            System.out.println("====================================");
            System.out.println("=         BY : Kelompok 2          =");
            System.out.println("====================================");
            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Lihat Profile");
            System.out.println("2. Kelola Pasien");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine();

            switch (choice) {
                case 0:
                    break;
                case 1:
                    displayNurseDetails(n);
                    break;
                case 2:
                    listTreatedPatient(n);
                    break;
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }

    public static void listTreatedPatient(Nurse n){
        if(Global.nurseListPatient.containsKey(n.getId())){
            ArrayList<Patient> pasienList = Global.nurseListPatient.get(n.getId());
            int choice  = 1;
            int index = 0;
    
            if(pasienList.isEmpty()){
                System.out.println("Tidak ada pasien yang di assign ke anda");
                return;
            }
    
            while(choice != 0){
                System.out.println("====================================");
                Patient p = pasienList.get(index);
                System.out.println(p.getDetail());
                System.out.println("====================================");
    
                System.out.println("====================================");
                System.out.println("0. Keluar");
                System.out.println("1. Selanjutnya");
                System.out.println("2. Sebelumnya");
                System.out.println("3. Edit Keadaan Pasien"); 
                System.out.println("====================================");
                choice = Global.scanner.nextInt();
                Global.scanner.nextLine(); 
    
    
                switch (choice) {
                    case 0:
                        break;
                    case 1:
                        if(index < pasienList.size() - 1){
                            index++;
                        }                    
                        break;
                    case 2:
                        if(index > 0){
                            index--;
                        }
                        break;
                    case 3:
                        PatientView.editPatientConditionDisplay(p);
                    default:
                        System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                        break;
                }
            }
        }

        else{
            System.out.println("Tidak ada pasien yang di assign ke anda");
        }

    }

    public static void profileDisplay(Nurse n){
        int choice = 1;
        while(choice != 0){
            System.out.println("====================================");
            System.out.println(n.getDetail());
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
                    editNurse(n);
                    break;
    
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }

    public static void editNurse(Nurse n){
        int choice = 1;
        while (choice != 0){
            System.out.println("====================================");
            System.out.println("0. Keluar");
            System.out.println("1. Edit Nama");
            System.out.println("2. Edit Umur");
            System.out.println("3. Edit Jenis Kelamin");
            System.out.println("4. Edit Alamat");
            System.out.println("5. Edit Nomor Kontak");
            System.out.println("6. Edit Spesialisasi");
            System.out.println("====================================");
            choice = Global.scanner.nextInt();
            Global.scanner.nextLine();
            
            switch (choice) {
                case 0:
                    break;
                case 1:
                    System.out.println(NurseController.editNurseName(n));
                    break;
                case 2:
                    System.out.println(NurseController.editNurseAge(n));
                break;
                case 3:
                    System.out.println(NurseController.editNurseGender(n));
                break;
                case 4:
                    System.out.println(NurseController.editNurseAddress(n));
                break;
                case 5:
                    System.out.println(NurseController.editNurseContact(n));
                    break;
                case 6:
                    System.out.println(NurseController.editNurseSpecialization(n));
                    break;
                default:
                    System.out.println("Mohon pilih sesuai angka yang sudah disediakan");
                    break;
            }
        }
    }
}
