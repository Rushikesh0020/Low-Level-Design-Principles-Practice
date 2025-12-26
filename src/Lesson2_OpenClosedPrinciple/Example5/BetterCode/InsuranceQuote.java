package Lesson2_OpenClosedPrinciple.Example5.BetterCode;

public class InsuranceQuote {
    public String type;
    public double price;

    public InsuranceQuote(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String describe() {
        return "Type: " + type + ", Price: " + price;
    }
}
