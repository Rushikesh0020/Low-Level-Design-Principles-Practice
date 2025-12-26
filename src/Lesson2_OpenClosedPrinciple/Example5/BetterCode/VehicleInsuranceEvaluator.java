package Lesson2_OpenClosedPrinciple.Example5.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class VehicleInsuranceEvaluator {
    public List<InsuranceQuote> evaluateInsurance(List<Vehicle> vehicles) {
        List<InsuranceQuote> quotes = new ArrayList<InsuranceQuote>();

        for (Vehicle vehicle : vehicles) {
            InsuranceQuote quote = vehicle.getInsuranceQuote();
            System.out.println("Quoted Amount: "+ quote.getPrice());
            System.out.println("Details: "+ quote.describe());
            quotes.add(quote);
        }

        return quotes;
    }
}
