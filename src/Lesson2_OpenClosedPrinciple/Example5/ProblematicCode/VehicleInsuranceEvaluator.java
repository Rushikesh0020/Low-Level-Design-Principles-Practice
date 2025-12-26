package Lesson2_OpenClosedPrinciple.Example5.ProblematicCode;

class Car extends Vehicle {}

class Truck extends Vehicle {}

public class VehicleInsuranceEvaluator {
    public InsuranceQuote evaluateInsurance(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            return new InsuranceQuote();
        } else if (vehicle instanceof Truck) {
            return new InsuranceQuote();
        }

        throw new IllegalArgumentException("Unknown Vehicle Type.");
    }
}
