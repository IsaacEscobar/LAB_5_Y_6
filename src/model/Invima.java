package model;

public class Invima extends ManufacturingCompany implements Consumption{

  public static final char FABRICATION_EXPO = 'X';
  public static final char FABRICATION_SELL = 'Y';
  public static final char IMPORT_SELL = 'Z';
  public static final String VALID = "Vigente";
  public static final String NORENEWED = "No renovado";

  private String sanitaryRegistration;
  private String state;
  private String expiration;
  private char modality;

  public Invima(String nameComercy,String nit, String addres,String phoneContact, int employeeCant, double amountActives, String dateOfInscription, char typeOrganization, String legalName,Building build,String sanitaryRegistration, String state, String expiration, char modality){
    super(nameComercy,nit,addres,phoneContact,employeeCant,amountActives,dateOfInscription,typeOrganization,legalName,build);
    this.sanitaryRegistration = sanitaryRegistration;
    this.state = state;
    this.expiration = expiration;
    this.modality = modality;
  }

  public String getSanitaryRegistration(){
    return sanitaryRegistration;
  }

  public void setSanitaryRegistration(String sanitaryRegistration){
    this.sanitaryRegistration = sanitaryRegistration;
  }

  public String getState(){
    return state;
  }

  public void setState(String state){
    this.state = state;
  }

  public String getExpiration(){
    return expiration;
  }

  public void setExpiration(String expiration){
    this.expiration = expiration;
  }

  public char getModality(){
  return modality;
  }

  public void setModality(char modality){
    this.modality = modality;
  }
  public String toString(){
  String msj = "";
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += super.toString();
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El registro sanitario es:" + sanitaryRegistration;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "El estado es:" + state;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "La expiracion es:" + expiration;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "La modalidad es:" + modality;
  msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
  msj += "Los arboles a sembrar son:" + calculatedThingXArbol();
  return msj;
  }

  public int calculatedThingXArbol(){
  int amountTree = 0;
  for(int i = 0; i < getProducts().size(); i++){
    Product m = getProducts().get(i);
    if(m.getWaterAmount() > 1 && m.getWaterAmount()  < 140){
      amountTree = 6;
    }else if(m.getWaterAmount()  >41&& m.getWaterAmount()  < 800){
        amountTree = 25;
      }else if(m.getWaterAmount() >800){
            amountTree = 200;
          }
        }
  return amountTree;
  }
}
