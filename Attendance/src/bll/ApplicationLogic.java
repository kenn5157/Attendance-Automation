package bll;

import be.User;
import dal.MockData;

import java.util.ArrayList;

public class ApplicationLogic {

    public ApplicationLogic() {

    }


    public int getAttended(int userid) {
        MockData mockData = new MockData();
        int attended = mockData.getAttended(userid);

        return attended;
    }

    public int getAbsent(int userid) {
        MockData mockData = new MockData();
        int absent = mockData.getAbsent(userid);
        return absent;
    }
}
