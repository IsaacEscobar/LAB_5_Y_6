package model;

import java.util.ArrayList;

public class ServiceCompany extends Company{

  private ArrayList<Poll> polls;

  public ServiceCompany(String nameComercy,String nit, String addres,String phoneContact, int employeeCant, double amountActives, String dateOfInscription, char typeOrganization, String legalName,Building build){
    super(nameComercy,nit,addres,phoneContact,employeeCant,amountActives,dateOfInscription,typeOrganization,legalName,build);
    polls = new ArrayList<Poll>();
  }

  public ArrayList<Poll> getPolls(){
    return polls;
  }

  public void setPolls(ArrayList<Poll> polls){
    this.polls = polls;
  }

  public void addPolls(ArrayList<Poll> client){
    polls = client;
  }

  public String getInfor(){
  String msj = "";
  for(int i = 0 ; i < polls.size();i++){
  msj += polls.get(i).toString();
  }
  return msj;
  }

  public String toString(){
  String msj = "";
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El nombre del comercio es:" + getNameComercy();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El nit es:" + getNit();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "La direccion es:" + getAddres();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El numero  celular es:" + getPhoneContact();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "La cantidad de empleados es:" + getEmployeeCant();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "La cantidad de activos es:" + getAmountActives();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "La fecha en la que se hizo" + getDateOfInscription();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El tipo de organizacion es:" + getTypeOrganization();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El nombre legal es:" + getLegalName();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  return msj;
  }
}
