package Lesson2_OpenClosedPrinciple.Example5.BetterCode;

public class Truck extends Vehicle {
    @Override
    public InsuranceQuote getInsuranceQuote() {
        return new InsuranceQuote("truck", 110.7);
    }
}
