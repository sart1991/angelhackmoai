package com.moai.data.db.models;

import java.util.ArrayList;
import java.util.List;

public class CategoryProject {

  private long idCat;
  private String nameCategory;
  private List<Project> projects = new ArrayList<>(0);


  public long getIdCat() {
    return idCat;
  }

  public void setIdCat(long idCat) {
    this.idCat = idCat;
  }


  public String getNameCategory() {
    return nameCategory;
  }

  public void setNameCategory(String nameCategory) {
    this.nameCategory = nameCategory;
  }

  public List<Project> getProjects() {
    return projects;
  }

  public void setProjects(List<Project> projects) {
    this.projects = projects;
  }
}
