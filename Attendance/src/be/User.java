package be;

public class User {

    private int id;
    private int userType;
    private String firstName;
    private String lastName;

    private int lecturesAttended;
    private int totalAmountOfLectures;


    public User(int id, int userType, String firstName, String lastName, int lecturesAttended, int totalAmountOfLectures) {
        this.id = id;
        this.userType = userType;
        this.firstName = firstName;
        this.lastName = lastName;

        this.lecturesAttended = lecturesAttended;
        this.totalAmountOfLectures = totalAmountOfLectures;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getUserType() {
        return userType;
    }
    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName() {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getLecturesAttended() { return lecturesAttended; }
    public void setLecturesAttended(int lecturesAttended) { this.lecturesAttended = lecturesAttended; }

    public int getTotalAmountOfLectures() { return totalAmountOfLectures; }
    public void setTotalAmountOfLectures(int totalAmountOfLectures) { this.totalAmountOfLectures = totalAmountOfLectures; }

    @Override
    public String toString() {
        return id + "," + userType + "," + firstName + "," + lastName;
    }
}
