package model;
import java.util.ArrayList;

public class TechnologyCompany extends ServiceCompany implements Consumption{

//Constantes

public static final String CAPATATION_CONSULT = "Consultoria capacitacion";
public static final String SOFTWARE_DEVELOP = "Desarrollo de software a la medida";
public static final String INFRASTRUCTURE_SER = "Infraestructura como servicio";
public static final String SOFTWARE_SER = "Software como servicio";
public static final String PLATAFORM_SER = "Plataforma como servicio";

//Atributo

private String service;
private int consumptionKilowatts;

//Relaciones

private ArrayList<String> services;


public TechnologyCompany(String nameComercy,String nit, String addres,String phoneContact, int employeeCant, double amountActives, String dateOfInscription ,char typeOrganization, String legalName,Building build,String service,int consumptionKilowatts){
super(nameComercy,nit,addres,phoneContact,employeeCant,amountActives,dateOfInscription,typeOrganization,legalName,build);
	this.service = service;
	this.consumptionKilowatts = consumptionKilowatts;
	services = new ArrayList<String>();
	services.add(CAPATATION_CONSULT);
	services.add(SOFTWARE_DEVELOP);
	services.add(INFRASTRUCTURE_SER);
	services.add(SOFTWARE_SER);
	services.add(PLATAFORM_SER);

}

public String getService(){
  return service;
}

public void setService(String service){
  this.service = service;
}

public int getConsumptionKilowatts(){
	return consumptionKilowatts;
}

public void setConsumptionKilowatts(int consumptionKilowatts){
	this.consumptionKilowatts = consumptionKilowatts;
}

public int calculatedThingXArbol(){

int amountTreeEnergy = 0;

  if(getConsumptionKilowatts() > 1 && getConsumptionKilowatts() < 1000){

    amountTreeEnergy = 8;

  }else if(getConsumptionKilowatts() > 1001 && getConsumptionKilowatts() < 3000){

      amountTreeEnergy = 35;

    }else if(getConsumptionKilowatts() > 3000){

          amountTreeEnergy = 500;

        }

return amountTreeEnergy;

}

public String toString(){
String msj = "";

msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += super.toString();
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "El servicio es:" + service;
msj += "---------------------------------------------------------------------------------------------------------------------------- \n";
msj += "Los arboles son:" + calculatedThingXArbol();

return msj;


}





}
