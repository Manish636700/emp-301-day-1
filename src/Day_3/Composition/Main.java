package Day_3.Composition;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile("Realme","8gb","128gb");
        Mobile mobile2 = new Mobile("samsung","4gb","256gb");
        Mobile mobile3 = new Mobile("nokia","8gb","256gb");
        Mobile mobile4 = new Mobile("apple","4gb","256gb");

        List<Mobile> mobiles = new ArrayList<Mobile>();
        mobiles.add(mobile1);
        mobiles.add(mobile2);
        mobiles.add(mobile3);
        mobiles.add(mobile4);


        MobileStore mobileStore = new MobileStore(mobiles);
        for(Mobile mobile : mobileStore.getMobiles()){
            System.out.println(mobile.getName()+" " + mobile.getRam() + " " + mobile.getRom());
        }


    }
}

