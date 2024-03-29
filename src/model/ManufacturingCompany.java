package model;
import java.util.ArrayList;

public class ManufacturingCompany extends Company{

  private ArrayList<Product> products;

  public ManufacturingCompany(String nameComercy,String nit, String addres,String phoneContact, int employeeCant, double amountActives, String dateOfInscription ,char typeOrganization, String legalName,Building build){
    super(nameComercy,nit,addres,phoneContact,employeeCant,amountActives,dateOfInscription,typeOrganization,legalName,build);
    products = new ArrayList<Product>();
  }

  public ArrayList<Product> getProducts(){
    return products;
  }

  public void setProducts(ArrayList<Product> products){
    this.products = products;
  }

  public void addProduct(ArrayList<Product> pro){

  products = pro;

  }

  public String getInformation(){

  String msj = "";

  for(int i = 0; i < products.size();i++){
      msj += products.get(i).toString();
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
  for(int i = 0; i < products.size();i++){
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += products.get(i).toString();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  }
  return msj;
  }
}
