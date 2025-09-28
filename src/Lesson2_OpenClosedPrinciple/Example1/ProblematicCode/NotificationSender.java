package Lesson2_OpenClosedPrinciple.Example1.ProblematicCode;

import java.util.List;

public class NotificationSender {
    public void SendNotifications(List<NotificationType> notificationTypes) {
        for(NotificationType type : notificationTypes) {
            if(type == NotificationType.SMS) {
                type.sendWhatsappNotification();
            } else if (type == NotificationType.EMAIL) {
                type.sendEmailNotification();
            } else if (type == NotificationType.WHATSAPP) {
                type.sendWhatsappNotification();
            }
        }
    }

}
