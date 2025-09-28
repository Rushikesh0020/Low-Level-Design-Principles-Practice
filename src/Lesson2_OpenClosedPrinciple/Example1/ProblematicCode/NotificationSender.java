package Lesson2_OpenClosedPrinciple.Example1.ProblematicCode;

import java.util.List;

public class NotificationSender {
    public void SendNotifications(List<NotificationType> notificationTypes) {
        for(NotificationType type : notificationTypes) {
            if(type == NotificationType.SMS) {
                type.sendSMSNotification();
            } else if (type == NotificationType.EMAIL) {
                type.sendEmailNotification();
            } else if (type == NotificationType.WHATSAPP) {
                type.sendWhatsappNotification();
            }
        }
    }

}
// Problems with this code :
// 1. Violates Open/Closed Principle → Every time we add a new notification type (like PUSH, SLACK, etc.),
//    we must modify this class, which should ideally remain closed for modification.
// 2. Tight coupling → NotificationSender is tightly coupled with NotificationType and its internal logic.
//    The sender must know which notification method to call.
// 3. No abstraction → We are using conditional checks instead of polymorphism/interface abstraction.
//    Better design would be to have an interface/abstract class Notification with a `send()` method.
// 4. Code duplication risk → Adding more notification types means repeating the same `if-else` pattern,
//    making the code harder to maintain and more error-prone.
// 5. Violates Single Responsibility Principle → NotificationSender is deciding *how* to send notifications,
//    not just sending them. It mixes responsibilities.
// 6. Difficult to test → Any change in NotificationType or its methods requires changes and re-testing of this class.
// 7. Fragile code → If method names in NotificationType change (e.g., `sendEmailNotification` → `sendEmail`),
//    this class breaks everywhere it's referenced.


// Solution Analogy:
// Think of a shopping mall. The mall itself is the closed system — its structure doesn’t change.
// But new stores can keep opening — that’s extension. If the mall wasn’t designed well, adding a new store
// would mean breaking walls or changing the whole building, which is like rewriting existing code.
// The solution is to design the mall with modular shop units (interfaces/abstractions) so new stores just plug in without touching the core structure.