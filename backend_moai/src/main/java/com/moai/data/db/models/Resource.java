package com.moai.data.db.models;


import com.google.api.server.spi.config.AnnotationBoolean;
import com.google.api.server.spi.config.ApiResourceProperty;

public class Resource {

  private long idResource;
  private String nameResource;

  @ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
  public long getIdResource() {
    return idResource;
  }

  public void setIdResource(long idResource) {
    this.idResource = idResource;
  }


  public String getNameResource() {
    return nameResource;
  }

  public void setNameResource(String nameResource) {
    this.nameResource = nameResource;
  }

}
