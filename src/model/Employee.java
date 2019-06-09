package model;

public class Employee{

  private String nameEmployee;
  private String extension;
  private String position;
  private String email;
  private boolean disponibility;

  public Employee(String nameEmployee,String extension,String position, String email,boolean disponibility){

  this.nameEmployee = nameEmployee;
  this.extension = extension;
  this.position = position;
  this.email = email;
  this.disponibility = disponibility;

  }

  public String getNameEmployee(){
    return nameEmployee;
  }

  public void setNameEmployee(String nameEmployee){
    this.nameEmployee = nameEmployee;
  }

  public String getExtension(){
    return extension;
  }

  public void setExtension(String extension){
    this.extension = extension;
  }

  public String getPosition(){
    return position;
  }

  public void setPosition(String position){
    this.position = position;
  }

  public String getEmail(){
    return email;
  }

  public void setEmail(String email){
    this.email = email;
  }

  public boolean getDisponibility(){
    return disponibility;
  }

  public void setDisponibility(boolean disponibility){
    this.disponibility = disponibility;
  }

}
