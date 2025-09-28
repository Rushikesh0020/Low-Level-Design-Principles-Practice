package Lesson2_OpenClosedPrinciple.Example1.BetterCode;
import java.util.List;

public class NotificationSender {
    public void SendNotifications(List<Notification> notifications) {
        for(Notification notification : notifications) {
            notification.send();
        }
    }

}

// Better Code Analogy:
// Think of a shopping mall. The mall itself is the closed system — its structure doesn’t change.
// But new stores can keep opening — that’s extension. If the mall wasn’t designed well, adding a new store
// would mean breaking walls or changing the whole building, which is like rewriting existing code.
// The solution is to design the mall with modular shop units (interfaces/abstractions) so new stores just plug in without touching the core structure.