package com.moai.data.db.models;


public class DateProject {

  private long idDate;
  private String nameDate;
  private java.sql.Date valueDate;
  private long projectIdProject;


  public long getIdDate() {
    return idDate;
  }

  public void setIdDate(long idDate) {
    this.idDate = idDate;
  }


  public String getNameDate() {
    return nameDate;
  }

  public void setNameDate(String nameDate) {
    this.nameDate = nameDate;
  }


  public java.sql.Date getValueDate() {
    return valueDate;
  }

  public void setValueDate(java.sql.Date valueDate) {
    this.valueDate = valueDate;
  }


  public long getProjectIdProject() {
    return projectIdProject;
  }

  public void setProjectIdProject(long projectIdProject) {
    this.projectIdProject = projectIdProject;
  }

}
