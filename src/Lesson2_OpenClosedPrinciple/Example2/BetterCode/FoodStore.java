package Lesson2_OpenClosedPrinciple.Example2.BetterCode;

public class FoodStore implements Store {
    @Override
    public void setup() {
        System.out.println("Setting up exhaust system for food court...");
    }
}
