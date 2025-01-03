package model;

import java.util.Date;
import controller.AppointmentController;
import utils.Global;

public class Appointment {
    private String appointmentId;
    private Date appointmentDate;
    private Doctor doctor;
    private Patient patient;

    private boolean patientAgreement = false;
    private boolean doctorAgreement = false;

    public Appointment(String appointmentId, Date appointmentDate, Doctor doctor, Patient patient) {
        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.doctor = doctor;
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }


    public boolean getDoctorAgreement() {
        return doctorAgreement;
    }

    public boolean getPatientAgreement() {
        return patientAgreement;
    }

    public void setDoctorAgreement(boolean doctorAgreement) {
        this.doctorAgreement = doctorAgreement;
        AppointmentController.checkAgreement(this);
    }

    public void setPatientAgreement(boolean patientAgreement) {
        this.patientAgreement = patientAgreement;
        AppointmentController.checkAgreement(this);
    }


    public String getAgreementStatus() {
        if (doctorAgreement && !patientAgreement) {
            return "Dokter sudah menyetujui Janji Temu ini, namun pasien belum!";
        } else if (!doctorAgreement && !patientAgreement) {
            return "Dokter dan pasien belum menyetujui Janji Temu ini!";
        } else if (doctorAgreement && patientAgreement) {
            return "Dokter dan pasien sudah menyetujui Janji Temu ini!";
        } else if (!doctorAgreement && patientAgreement) {
            return "Pasien sudah menyetujui Janji Temu ini, namun dokter belum!";
        }
        return "Status persetujuan tidak dapat ditentukan.";
    }

    /** 
     * @deprecated Moved to AppointmentController.checkAgreement(), use that method instead
     */
    @Deprecated
    public void checkAgreement(){
        if(doctorAgreement == true && patientAgreement == true){
            Global.activeAppointmentList.add(this);
            Global.pendingAppointmentList.remove(this);
        }
        else{
            Global.activeAppointmentList.remove(this);
            Global.pendingAppointmentList.add(this);
        }
    }
}
