package dal;

import be.Lectures;
import be.User;

import java.util.ArrayList;

public class MockData {

    public MockData() {
    }

    public ArrayList<User> getAllUsers() {
        // TODO: 21/02/2021 Create some mock data for application to use

        //ID,UserType,FirstName,LastName,LecturesAttended,TotalAmountOFLectures

        ArrayList<User> allUsers = new ArrayList<>();
        allUsers.add(new User(1, 1,"Kenneth","Hjort", 20, 50)); //Student
        allUsers.add(new User(2, 0,"Louise","Junge", 49, 50)); //Teacher

        return allUsers;
    }

    public int getAttended(int userid) {
        // TODO: 21/02/2021 Create some mock data for application to use

        //ID,UserType,FirstName,LastName,LecturesAttended,TotalAmountOFLectures

        if (userid == 1){
            return 25;
        }
        if (userid == 2) {
            return 40;
        } else {
            return 0;
        }
    }
    
     public ArrayList<Lectures> getAllLectures() {

        ArrayList<Lectures> allLectures = new ArrayList<>();
        allLectures.add(new Lectures(1,"SDE"));
        allLectures.add(new Lectures(2,"ITO"));
        allLectures.add(new Lectures(3,"SCO"));

        return allLectures;
     }


    public int getAbsent(int userid) {
        if (userid == 1) {
            return 25;
        }
        if (userid == 2) {
            return 10;
        } else {
            return 0;
        }
    }
}
