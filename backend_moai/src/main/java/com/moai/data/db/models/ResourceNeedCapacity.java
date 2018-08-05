package com.moai.data.db.models;


import com.google.api.server.spi.config.AnnotationBoolean;
import com.google.api.server.spi.config.ApiResourceProperty;

import java.util.ArrayList;
import java.util.List;

public class ResourceNeedCapacity {

  private long idNeedCapacity;
  private long resourceIdResource;
  private long projectIdProject;
  private Project project;
  private Resource resource;
  private List<Property> properties = new ArrayList<>();
  private List<Inversion>inversions = new ArrayList<>();


  public long getIdNeedCapacity() {
    return idNeedCapacity;
  }

  public void setIdNeedCapacity(long idNeedCapacity) {
    this.idNeedCapacity = idNeedCapacity;
  }

  @ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
  public long getResourceIdResource() {
    return resourceIdResource;
  }

  public void setResourceIdResource(long resourceIdResource) {
    this.resourceIdResource = resourceIdResource;
  }

  @ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
  public long getProjectIdProject() {
    return projectIdProject;
  }

  public void setProjectIdProject(long projectIdProject) {
    this.projectIdProject = projectIdProject;
  }

  public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  public Resource getResource() {
    return resource;
  }

  public void setResource(Resource resource) {
    this.resource = resource;
  }

  public List<Property> getProperties() {
    return properties;
  }

  public void setProperties(List<Property> properties) {
    this.properties = properties;
  }

  public List<Inversion> getInversions() {
    return inversions;
  }

  public void setInversions(List<Inversion> inversions) {
    this.inversions = inversions;
  }
}
