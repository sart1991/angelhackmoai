package com.moai.data.db.models;


import com.google.api.server.spi.config.AnnotationBoolean;
import com.google.api.server.spi.config.ApiResourceProperty;

public class Inversion {

  private long idInversion;
  private long status;
  private long userIdUser;
  private long resourceNeedCapacityIdNeedCapacity;

  @ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
  public long getIdInversion() {
    return idInversion;
  }

  public void setIdInversion(long idInversion) {
    this.idInversion = idInversion;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

  @ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
  public long getUserIdUser() {
    return userIdUser;
  }

  public void setUserIdUser(long userIdUser) {
    this.userIdUser = userIdUser;
  }


  @ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
  public long getResourceNeedCapacityIdNeedCapacity() {
    return resourceNeedCapacityIdNeedCapacity;
  }

  public void setResourceNeedCapacityIdNeedCapacity(long resourceNeedCapacityIdNeedCapacity) {
    this.resourceNeedCapacityIdNeedCapacity = resourceNeedCapacityIdNeedCapacity;
  }

}
