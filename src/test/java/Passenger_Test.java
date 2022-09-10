import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Passenger_Test {

        Passenger passenger;

        @Before
        public void before(){
            passenger = new Passenger("Carly", 2);
        }

        @Test
        public void hasName(){
            assertEquals("Carly", passenger.getName());
        }

        @Test
        public void hasBags(){
            assertEquals(2, passenger.getBags());
        }

    }

