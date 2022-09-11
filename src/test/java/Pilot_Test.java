import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Pilot_Test {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Gerard",Rank.CAPTAIN, "LNR456","Cabin crew seats for take off");
    }

//    Write tests for get name.

//    @Test
//    public void getName(){
//        assertEquals("Gerard", pilot.getName());
//    }

    @Test
    public void hasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasLicenseNumber(){
        assertEquals("LNR456", pilot.getLicenseNumber());
    }

    @Test
    public void hasFlyPlane(){
        assertEquals("Cabin crew seats for take off", pilot.getFlyPlane());
    }



}
