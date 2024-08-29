package com.ilker.rabbitmq.model;

import java.io.Serializable;
import java.util.Date;

public class Notification implements Serializable {
/*
Bu nesneye doğru bir şekilde Serializable olması için implements edilmesi gerekir.
 */

  private String notificationId;
  private Date createdAt;
  private Boolean seen;
  private String message;

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getNotificationId() {
    return notificationId;
  }

  public void setNotificationId(String notificationId) {
    this.notificationId = notificationId;
  }

  public Boolean getSeen() {
    return seen;
  }

  public void setSeen(Boolean seen) {
    this.seen = seen;
  }
}
