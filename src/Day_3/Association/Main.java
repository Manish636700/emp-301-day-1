package Day_3.Association;

import java.util.ArrayList;
import java.util.List;

class mobile
{
    private String mobileNo;

    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}

class person{
    private String personName;
    List<mobile> mobileList;

    public String getPersonName() {
        return personName;
    }
    public void setPersonName(String personName) {
        this.personName = personName;
    }
    public List<mobile> getMobileList() {
        return mobileList;
    }
    public void setMobileList(List<mobile> mobileList) {
        this.mobileList = mobileList;
    }
}
public class Main {
    public static void main(String[] args) {
        person person = new person();
        person.setPersonName("manish");

        mobile mobile1 = new mobile();
        mobile1.setMobileNo("9783161484100");

        mobile mobile2 = new mobile();
        mobile2.setMobileNo("9783161484101");


        List<mobile> mobileList = new ArrayList<mobile>();
        mobileList.add(mobile1);
        mobileList.add(mobile2);

        person.setMobileList(mobileList);

        for(mobile m : person.getMobileList())
        {
            System.out.print(m.getMobileNo() +" ");
        }
        System.out.println(person.getPersonName());
    }
}
