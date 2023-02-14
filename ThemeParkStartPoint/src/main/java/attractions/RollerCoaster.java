package attractions;


import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ITicketed {


    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (2.0 < visitor.getHeight()) {
        }
        return 2 * defaultPrice();
    }

    public boolean isOldEnoughAndTallEnough(Visitor visitor) {
        return visitor.getAge() > 12 && visitor.getHeight() > 1.45;
    }
}
