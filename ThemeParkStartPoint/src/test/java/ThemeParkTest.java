import attractions.Attraction;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.ParkingSpot;
import stalls.Stall;
import stalls.TobaccoStall;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Attraction deathwheel;
    Stall deathsticks;

    Visitor gary;



    @Before
    public void setUp() {



        deathwheel = new RollerCoaster("wheel o death", 8);
        deathsticks = new TobaccoStall("death-sticks", "gary d'eath", ParkingSpot.B3);

        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(deathwheel);
        ArrayList<Stall> stalls = new ArrayList<>();
        stalls.add(deathsticks);

        themePark = new ThemePark(attractions, stalls);

        gary = new Visitor(65, 1.9, 200)

    }
        @Test
        public void canAddToAllReviewed(){
        assertEquals(2, themePark.getAllReviewed().size());
        }


    @Test
    public void canVisit(Visitor visitor, Attraction attraction){
        gary.addVisited(deathwheel);

        assertEquals(1, deathwheel.getVisitCount().size());

}



