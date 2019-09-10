package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    double price;

    public Dodgems(String name, int rating, double price) {
        super(name, rating);
        this.price = price;
    }

    public double defaultPrice(){
        return this.price;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12) {
            return this.price / 2;
        } else {
            return this.price;
        }

    }
}
