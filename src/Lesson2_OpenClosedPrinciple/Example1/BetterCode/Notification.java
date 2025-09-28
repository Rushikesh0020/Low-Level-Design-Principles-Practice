package Lesson2_OpenClosedPrinciple.Example1.BetterCode;

public interface Notification {
    void send();
}
// Problematic NotificationSender: Keeps asking → “Are you SMS? Are you Email? Are you WhatsApp?”
// OCP-compliant NotificationSender: Just says → “I don’t care what type you are. If you’re a notification, send yourself.” (Polymorphism does the rest.)