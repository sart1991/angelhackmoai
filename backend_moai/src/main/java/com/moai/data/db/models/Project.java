package com.moai.data.db.models;

import java.util.ArrayList;
import java.util.List;

public class Project {

  private long idProject;
  private String nameProject;
  private long categoryProjectIdCat;
  private CategoryProject categoryProject;
  private String locationCodLocation;
  private String locationTypeLocation;
  private Location location;
  private String descriptionProject;
  private String objective;
  private String scope;
  private List<ResourceNeedCapacity> resourceNeedCapacities = new ArrayList<>(0);
  private List<DateProject> dateProjects = new ArrayList<>(0);
  private List<Risk> risks = new ArrayList<>(0);


  public long getIdProject() {
    return idProject;
  }

  public void setIdProject(long idProject) {
    this.idProject = idProject;
  }


  public String getNameProject() {
    return nameProject;
  }

  public void setNameProject(String nameProject) {
    this.nameProject = nameProject;
  }


  public long getCategoryProjectIdCat() {
    return categoryProjectIdCat;
  }

  public void setCategoryProjectIdCat(long categoryProjectIdCat) {
    this.categoryProjectIdCat = categoryProjectIdCat;
  }


  public String getLocationCodLocation() {
    return locationCodLocation;
  }

  public void setLocationCodLocation(String locationCodLocation) {
    this.locationCodLocation = locationCodLocation;
  }


  public String getLocationTypeLocation() {
    return locationTypeLocation;
  }

  public void setLocationTypeLocation(String locationTypeLocation) {
    this.locationTypeLocation = locationTypeLocation;
  }


  public String getDescriptionProject() {
    return descriptionProject;
  }

  public void setDescriptionProject(String descriptionProject) {
    this.descriptionProject = descriptionProject;
  }


  public String getObjective() {
    return objective;
  }

  public void setObjective(String objective) {
    this.objective = objective;
  }


  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public CategoryProject getCategoryProject() {
    return categoryProject;
  }

  public void setCategoryProject(CategoryProject categoryProject) {
    this.categoryProject = categoryProject;
  }

  public List<ResourceNeedCapacity> getResourceNeedCapacities() {
    return resourceNeedCapacities;
  }

  public void setResourceNeedCapacities(List<ResourceNeedCapacity> resourceNeedCapacities) {
    this.resourceNeedCapacities = resourceNeedCapacities;
  }

  public List<DateProject> getDateProjects() {
    return dateProjects;
  }

  public void setDateProjects(List<DateProject> dateProjects) {
    this.dateProjects = dateProjects;
  }

  public List<Risk> getRisks() {
    return risks;
  }

  public void setRisks(List<Risk> risks) {
    this.risks = risks;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }
}
