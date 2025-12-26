package Lesson2_OpenClosedPrinciple.Example4.ProblematicCode;

public class ReportGenerator {
    public String generateReport(String reportType) {
        if(reportType.equals("PDF")) {
            return "Generating PDF Report";
        } else if(reportType.equals("Word")) {
            return "Generating Word Report";
        }
        return "Report type not supported.";
    }
}
