package Lesson2_OpenClosedPrinciple.Example2.ProblematicCode;

import java.util.List;

public class ShoppingMall {
    public void openStores(List<StoreType> storeTypes) {
        for (StoreType type : storeTypes) {
            if (type == StoreType.FOOD) {
                System.out.println("Setting up exhaust system for food court...");
            } else if (type == StoreType.CLOTHING) {
                System.out.println("Adding trial rooms for clothing store...");
            } else if (type == StoreType.ELECTRONICS) {
                System.out.println("Adding charging stations for electronics...");
            }
        }
    }
}
