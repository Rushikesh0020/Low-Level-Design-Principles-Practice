package Lesson2_OpenClosedPrinciple.Example5.BetterCode;

public class Car extends Vehicle {
    @Override
    public InsuranceQuote getInsuranceQuote() {
        return new InsuranceQuote("car", 200.5);
    }
}
