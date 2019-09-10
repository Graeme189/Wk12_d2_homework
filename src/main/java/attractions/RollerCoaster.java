package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, IReviewed, ITicketed {

    double price;

    public RollerCoaster(String name, int rating, double price) {
        super(name, rating);
        this.price = price;
    }

    @Override
    public double defaultPrice(){
        return this.price;
    }

    @Override
    public double priceFor(Visitor visitor){
        if (visitor.getHeight() > 200) {
            return this.price * 2;
        } else {
            return this.price;
        }
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() > 145 && visitor.getAge() > 12) {
            return true;
        } else {
            return false;
        }
    }
}
