package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

import java.util.Random;

import model.*;
import controller.*;

public class Global {
    public static List<Doctor> doctorList = new ArrayList<>();
    public static List<Patient> patientList = new ArrayList<>();
    public static List<Nurse> nurseList = new ArrayList<>();
    public static List<Receptionist> receptionistList = new ArrayList<>();
    public static List<Room> roomList = new ArrayList<>();

    public static List<Appointment> pendingAppointmentList = new ArrayList<>();
    public static List<Appointment> activeAppointmentList = new ArrayList<>();


    public static HashMap<String, ArrayList<Patient>> doctorListPatient = new HashMap<>();
    public static HashMap<String, ArrayList<Patient>> nurseListPatient = new HashMap<>();

    public static Scanner scanner = new Scanner(System.in);


    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }


    public static String generateId(String code){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        sb.append(code);
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }


    public static void addDoctor() {
        try {
            System.out.println("\n=== Tambah Dokter ===");

            System.out.print("Nama Dokter: ");
            String name = scanner.nextLine();
    
            System.out.print("Umur Dokter: ");
            int age = scanner.nextInt();
            scanner.nextLine();
    
            System.out.print("Jenis Kelamin Dokter: ");
            String gender = scanner.nextLine();
    
            System.out.print("Alamat Dokter: ");
            String address = scanner.nextLine();
    
            System.out.print("Nomor Kontak Dokter: ");
            String contact = scanner.nextLine();

            System.out.print("Spesialisasi: ");
            String specialization = scanner.nextLine();
    
            System.out.print("Tahun Pengalaman: ");
            int yearsOfExperience = scanner.nextInt();
            scanner.nextLine();
    
            Doctor doctor = new Doctor(name, age, gender, address, contact, generateId("DR"), specialization, yearsOfExperience);
            doctorList.add(doctor);
            System.out.println("Dokter berhasil ditambahkan.");
        } 
        catch (Exception e) {
            clearConsole();
            System.out.println(e);
            scanner.nextLine();

        }
    }




    public static void addPatient() {
        try {
            System.out.println("\n=== Tambah Pasien ===");
            System.out.print("Nama Pasien: ");
            String name = scanner.nextLine();
    
            System.out.print("Umur Pasien: ");
            int age = scanner.nextInt();
            scanner.nextLine();
    
            System.out.print("Jenis Kelamin Pasien: ");
            String gender = scanner.nextLine();
    
            System.out.print("Alamat Pasien: ");
            String address = scanner.nextLine();
    
            System.out.print("Nomor Kontak Pasien: ");
            String contact = scanner.nextLine();
    
            System.out.print("Riwayat Medis: ");
            String medicalHistory = scanner.nextLine();
    
            System.out.print("Kondisi Saat Ini: ");
            String currentCondition = scanner.nextLine();
    
            Patient patient = new Patient(name, age, gender, address, contact, generateId("PA"), medicalHistory, currentCondition);
            patientList.add(patient);
            System.out.println("Pasien berhasil ditambahkan.");
        } 

        catch (Exception e) {
            clearConsole();
            System.out.println(e);
            scanner.nextLine();

        }
    }

    public static void addNurse() {
        try {
            System.out.println("\n=== Tambah Perawat ===");

            System.out.print("Nama Perawat: ");
            String name = scanner.nextLine();
    
            System.out.print("Umur Perawat: ");
            int age = scanner.nextInt();
            scanner.nextLine();
    
            System.out.print("Jenis Kelamin Perawat: ");
            String gender = scanner.nextLine();
    
            System.out.print("Alamat Perawat: ");
            String address = scanner.nextLine();
    
            System.out.print("Nomor Kontak Perawat: ");
            String contact = scanner.nextLine();
    
            System.out.print("Spesialisasi: ");
            String specialization = scanner.nextLine();
    
            Nurse perawat = new Nurse(name, age, gender, address, contact,generateId("PR"), specialization);
            nurseList.add(perawat);
            System.out.println("Perawat berhasil ditambahkan.");
        } 
        catch (Exception e) {
            clearConsole();
            System.out.println(e);
            scanner.nextLine();

        }
    }

    public static void addReceptionist() {
        try {
            System.out.println("\n=== Tambah Resepsionis ===");

            System.out.print("Nama Resepsionis: ");
            String name = scanner.nextLine();
    
            System.out.print("Umur Resepsionis: ");
            int age = scanner.nextInt();
            scanner.nextLine();
    
            System.out.print("Jenis Kelamin Resepsionis: ");
            String gender = scanner.nextLine();
    
            System.out.print("Alamat Resepsionis: ");
            String address = scanner.nextLine();
    
            System.out.print("Nomor Kontak Resepsionis: ");
            String contact = scanner.nextLine();
    
            Receptionist resepsionis = new Receptionist(name, age, gender, address, contact, generateId("RP"));
            receptionistList.add(resepsionis);
            System.out.println("Resepsionis berhasil ditambahkan.");
        } catch (Exception e) {
            clearConsole();
            System.out.println(e);
            scanner.nextLine();

        }
    }

    public static void addRoom() {

        try {
            System.out.println("\n=== Tambah Ruangan ===");
        
            System.out.print("Nomor Ruangan: ");
            int nomorRuangan = scanner.nextInt();
            scanner.nextLine();
    
            System.out.print("Tipe Ruangan: ");
            String tipeRuangan = scanner.nextLine();
    
            System.out.print("Apakah ruangan tersedia? (true/false): ");
            boolean isTersedia = scanner.nextBoolean();
            scanner.nextLine();
    
            Room ruangan = new Room(nomorRuangan, tipeRuangan, isTersedia);
            roomList.add(ruangan);
            System.out.println("Ruangan berhasil ditambahkan.");   
        } 
        catch (Exception e) {
            clearConsole();
            System.out.println(e);
            scanner.nextLine();
        }
    }

    public static Doctor searchDoctor(String identifier){
        identifier = identifier.trim();
        for(Doctor d : doctorList){
            if(d.getName().equals(identifier) || d.getId().equals(identifier)){
                return d;
            }
        }

        return null;
    }

    public static Nurse searchNurse(String identifier){
        identifier = identifier.trim();
        for(Nurse p : nurseList){
            if(p.getName().equals(identifier) || p.getId().equals(identifier)){
                return p;
            }
        }

        return null;
    }

    public static Patient searchPatient(String identifier){
        identifier = identifier.trim();

        for(Patient p : patientList){
            if(p.getName().equals(identifier) || p.getId().equals(identifier)){
                return p;
            }
        }

        return null;
    }


    public static void scheduleAppointment() {
        try{
            System.out.println("Masukkan Id / name Dokter");
            String identifier = Global.scanner.nextLine();
    
            Doctor doctor = Global.searchDoctor(identifier);
    
            if(doctor == null){
                System.out.println("Data Dokter tidak ditemukan, Mohon ulangi operasi lagi");
                return;
            }
    
            System.out.println("Masukkan Id / name Pasien");
            identifier = Global.scanner.nextLine();
            Patient patient = Global.searchPatient(identifier);
    
    
            if(patient == null){
                System.out.println("Data Pasien tidak ditemukan, Mohon ulangi operasi lagi");
                return;
            }
    
            Room ru = Global.temukanRuanganKosong();
    
            if(ru == null){
                System.out.println("Tidak ada ruangan yang tersedia, Janji Temu tidak bisa dijadwalkan");
                return;
            }
            System.out.print("Enter a date (dd MM yyyy): ");
            
            String inputDate = scanner.nextLine();
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            
            
            try {
                Date date = dateFormat.parse(inputDate);
                Appointment janjiTemu = new Appointment(generateId("JT"), date, doctor, patient);
    
                System.out.println(date);
                RoomController.setForPatient(ru, patient);
                pendingAppointmentList.add(janjiTemu);
    
                System.out.println("Janji temu berhasil dijadwalkan antara " + patient.getName() + " dan " + doctor.getName() + ".");
            } 
            catch (ParseException e) {
                System.out.println("Input invalid, pastikan gunakan format dd MM yyyy yang benar.");
            } 
            catch (Exception e) {
                System.out.println("Terjadi kesalahan yang tidak terduga: " + e.getMessage());
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Input tidak valid: " + e.getMessage());
            Global.scanner.nextLine();
        }
    
    }

    public static void assignDoctor(Doctor d, Patient p){
        if(doctorListPatient.containsKey(d.getId())){
            doctorListPatient.get(d.getId()).add(p);
            System.out.println("Pasien Berhasil ditambahkan!");
            return;
        }
        doctorListPatient.put(d.getId(), new ArrayList<>());
        doctorListPatient.get(d.getId()).add(p);

        System.out.println("Pasien Berhasil ditambahkan");
    }

    public static void assignNurse(Nurse pr, Patient p){
        if(nurseListPatient.containsKey(pr.getId())){
            nurseListPatient.get(pr.getId()).add(p);
            System.out.println("Pasien Berhasil ditambahkan!");
            return;
        }
        nurseListPatient.put(pr.getId(), new ArrayList<>());
        nurseListPatient.get(pr.getId()).add(p);

        System.out.println("Pasien Berhasil ditambahkan");
    }

    public static List<Appointment> getFilteredPendingAppointments(String identifier){
        //identifier is either doc id/patient id, im lazy so i combine it hehe
        return pendingAppointmentList.stream()
        .filter(jt -> jt.getPatient().getId().equals(identifier) || 
                      jt.getDoctor().getId().equals(identifier))
        .collect(Collectors.toList());
    }


    public static List<Appointment> getFilteredActiveAppointments(String identifier){
        return activeAppointmentList.stream()
        .filter(jt -> jt.getPatient().getId().equals(identifier) || 
                      jt.getDoctor().getId().equals(identifier))
        .collect(Collectors.toList());
    }


    //will be used soon? i think idk
    public static Doctor randomDoctor(){
        if (Global.doctorList.isEmpty()) return null;
        Random rand = new Random();
        return Global.doctorList.get(rand.nextInt(Global.doctorList.size()));
    }

    public static Patient randomPatient(){
        if (Global.patientList.isEmpty()) return null;
        Random rand = new Random();
        return Global.patientList.get(rand.nextInt(Global.patientList.size()));
    }

    public static Nurse randomNurse(){
        if (Global.nurseList.isEmpty()) return null;
        Random rand = new Random();
        return Global.nurseList.get(rand.nextInt(Global.nurseList.size()));
    }

    public static Room temukanRuanganKosong(){
        for (Room ruangan : Global.roomList) {
            if (ruangan.getAvailability()) {
                return ruangan;
            }
        }
        return null; 
    }

    public static Date getRandomFutureDate(){
        Calendar calendar = Calendar.getInstance();
        Random rand = new Random();
        int daysToAdd = rand.nextInt(30) + 1;
        calendar.add(Calendar.DAY_OF_MONTH, daysToAdd);
        return calendar.getTime();
    }

}
