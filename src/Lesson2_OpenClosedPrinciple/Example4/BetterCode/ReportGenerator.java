package Lesson2_OpenClosedPrinciple.Example4.BetterCode;
import java.util.List;

public class ReportGenerator {
    public void generateReport(List<Report> reportList) {
        for(Report report : reportList) {
            report.generateReport();
        }
    }
}
