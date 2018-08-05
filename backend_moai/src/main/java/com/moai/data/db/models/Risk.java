package com.moai.data.db.models;


public class Risk {

  private long idRisk;
  private String nameRisk;
  private String descriptionRisk;
  private long projectIdProject;


  public long getIdRisk() {
    return idRisk;
  }

  public void setIdRisk(long idRisk) {
    this.idRisk = idRisk;
  }


  public String getNameRisk() {
    return nameRisk;
  }

  public void setNameRisk(String nameRisk) {
    this.nameRisk = nameRisk;
  }


  public String getDescriptionRisk() {
    return descriptionRisk;
  }

  public void setDescriptionRisk(String descriptionRisk) {
    this.descriptionRisk = descriptionRisk;
  }


  public long getProjectIdProject() {
    return projectIdProject;
  }

  public void setProjectIdProject(long projectIdProject) {
    this.projectIdProject = projectIdProject;
  }

}
