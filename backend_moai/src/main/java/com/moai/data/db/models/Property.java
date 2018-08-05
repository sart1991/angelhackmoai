package com.moai.data.db.models;


import com.google.api.server.spi.config.AnnotationBoolean;
import com.google.api.server.spi.config.ApiResourceProperty;

public class Property {

  private long idProperty;
  private String nameProperty;
  private double value;
  private long measureUnitIdMunit;

  private long resourceNeedCapacityIdNeedCapacity;

  @ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
  public long getIdProperty() {
    return idProperty;
  }

  public void setIdProperty(long idProperty) {
    this.idProperty = idProperty;
  }


  public String getNameProperty() {
    return nameProperty;
  }

  public void setNameProperty(String nameProperty) {
    this.nameProperty = nameProperty;
  }


  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  @ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
  public long getMeasureUnitIdMunit() {
    return measureUnitIdMunit;
  }

  public void setMeasureUnitIdMunit(long measureUnitIdMunit) {
    this.measureUnitIdMunit = measureUnitIdMunit;
  }

  @ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
  public long getResourceNeedCapacityIdNeedCapacity() {
    return resourceNeedCapacityIdNeedCapacity;
  }

  public void setResourceNeedCapacityIdNeedCapacity(long resourceNeedCapacityIdNeedCapacity) {
    this.resourceNeedCapacityIdNeedCapacity = resourceNeedCapacityIdNeedCapacity;
  }

}
