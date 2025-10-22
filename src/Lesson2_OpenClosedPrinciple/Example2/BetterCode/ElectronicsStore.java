package Lesson2_OpenClosedPrinciple.Example2.BetterCode;

public class ElectronicsStore implements Store {
    @Override
    public void setup() {
        System.out.println("Adding charging stations for electronics...");
    }
}
