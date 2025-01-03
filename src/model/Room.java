package model;

public class Room {
    private int roomNumber;
    private String roomType;
    private boolean isAvailable;
    private Patient patient;

    public Room(int roomNumber, String roomType, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = isAvailable;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public Boolean getAvailability(){
        return isAvailable;
    }

    public Patient getPatient(){
        return patient;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setAvailability(boolean availability) {
        this.isAvailable = availability;
    }

    public void setPatient(Patient patient){
        this.patient = patient;
    }

    public String getDetail() {
        return "Nomor Ruangan: " + getRoomNumber() + "\n" +
               "Tipe Ruangan: " + getRoomType() + "\n" +
               "Status Ruangan: " + (isAvailable == true ? "Tersedia" : "Terisi") + "\n" +
               "Pasien: " + (patient != null ? patient.getName() : "Tidak ada pasien") + "\n";
    }

    /** 
     * @deprecated This method has been moved to roomController.setForPatient() instead 
     */
    @Deprecated
    public void setForPatient(Patient patient) {
        if (!isAvailable) {
            isAvailable = false;
            System.out.println("Ruangan nomor " + roomNumber + " telah ditetapkan untuk patient " + patient.getName());
            this.patient = patient;
        } else {
            System.out.println("Ruangan nomor " + roomNumber + " tidak tersedia");
        }
    }

}
