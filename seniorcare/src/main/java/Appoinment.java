public class Appointment {
    private int appointmentID;
    private int userID;
    private int seniorID;
    private int caregiverID;
    private String date;
    private String time;
    private String description;
    private String status;

    // Constructor
    public Appointment(int appointmentID, int userID, int seniorID, int caregiverID, String date, String time, String description, String status) {
        this.appointmentID = appointmentID;
        this.userID = userID;
        this.seniorID = seniorID;
        this.caregiverID = caregiverID;
        this.date = date;
        this.time = time;
        this.description = description;
        this.status = status;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public int getUserID() {
        return userID;
    }

    public int getSeniorID() {
        return seniorID;
    }

    public int getCaregiverID() {
        return caregiverID;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setSeniorID(int seniorID) {
        this.seniorID = seniorID;
    }

    public void setCaregiverID(int caregiverID) {
        this.caregiverID = caregiverID;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
