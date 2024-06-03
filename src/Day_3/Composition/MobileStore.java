package Day_3.Composition;

import java.util.ArrayList;
import java.util.List;

public class MobileStore {
    private List<Mobile> mobiles;
    public MobileStore(List<Mobile> mobiles) {
        this.mobiles = mobiles;
    }
    public List<Mobile> getMobiles() {
        return mobiles;
    }
}
