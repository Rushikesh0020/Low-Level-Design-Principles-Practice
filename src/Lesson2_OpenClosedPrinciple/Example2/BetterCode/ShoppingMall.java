package Lesson2_OpenClosedPrinciple.Example2.BetterCode;
import java.util.List;

public class ShoppingMall {
    public void openStores(List<Store> stores) {
        for (Store store : stores) {
            store.setup(); // Polymorphism handles behavior
        }
    }
}
//Problematic Mall: Keeps asking → “Are you food? Are you clothing? Are you electronics?”
//OCP Mall: Just says → “I don’t care what type you are. If you’re a store, set yourself up.”