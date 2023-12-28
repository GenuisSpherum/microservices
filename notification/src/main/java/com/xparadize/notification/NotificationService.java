package com.xparadize.notification;

import com.xparadize.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public void send(NotificationRequest notificationRequest) {
        Notification notification = Notification.builder()
                        .toCustomerId(notificationRequest.toCustomerId())
                        .toCustomerEmail(notificationRequest.toCustomerName())
                        .sender("xParadize")
                        .message(notificationRequest.message())
                        .sentAt(LocalDateTime.now())
                        .build();
        notificationRepository.saveAndFlush(notification);
    }
}
