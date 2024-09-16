package za.ac.cput.service;

import za.ac.cput.domain.Notification;

import java.util.List;

public interface INotificationService extends IService<Notification,Integer>{

    Void delete(Integer notificationID);
    List<Notification>getall();
}
