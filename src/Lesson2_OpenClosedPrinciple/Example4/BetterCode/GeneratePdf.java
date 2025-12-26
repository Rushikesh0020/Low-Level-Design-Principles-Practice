package Lesson2_OpenClosedPrinciple.Example4.BetterCode;

public class GeneratePdf implements Report {

    @Override
    public String generateReport() {
        return "Generated PDF Report";
    }
}
