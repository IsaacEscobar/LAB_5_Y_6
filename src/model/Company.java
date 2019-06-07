package model;
import java.util.ArrayList;

public abstract class Company {

  public final static char AGRICULTURA = 'A';
  public final static char CAZA = 'B';
  public final static char SILVICULTURA_Y_PEZCA = 'C';
  public final static char MINAS_Y_CANTERAS = 'D';
  public final static char MANUFACTURERA = 'E';
  public final static char ELECTRICIDAD = 'F';
  public final static char GAS_Y_VAPOR = 'H';
  public final static char CONSTRUCCION = 'I';
  public final static char COMERCIO_POR_MAYOR_Y_POR_MENOR = 'J';
  public final static char TRANSPORTE = 'K';
  public final static char ALMACENAMIENTO_Y_COMUNICACIONES = 'L';
  public final static char FINANCIEROS = 'M';
  public final static char SEGUROS = 'N';
  public final static char INMUEBLES = 'O';
  public final static char SERVICIOS_A_COMPAÑIAS = 'P';
  public final static char COMUNALES = 'Q';
  public final static char SOCIALES = 'R';


  private String name;
  private String nit;
  private String address;
  private String phoneNumber;
  private int employeesNumber;
  private String assetsValue;
  private String constitutionDate;
  private String organizationType;
  private String repName;

  private ArrayList<ServiceCompany> serviceCompanies;
  private ArrayList<ManufactureCompany> manufactureCompanies;

  public Company(String name, String nit, String address, String phoneNumber, int employeesNumber, String assetsValue, String constitutionDate, String organizationType, String repName) {
    this.name = name;
    this.nit = nit;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.employeesNumber = employeesNumber;
    this.assetsValue = assetsValue;
    this.constitutionDate = constitutionDate;
    this. organizationType = organizationType;
    this.repName = repName;
    ArrayList<ServiceCompany> serviceCompanies = new ArrayList<ServiceCompany>();
    ArrayList<ManufactureCompany> manufactureCompanies = new ArrayList<manufactureCompanies>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNit() {
    return nit;
  }

  public void setNit(String nit) {
    this.nit = nit;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public int getEmployeesNumber() {
    return employeesNumber;
  }

  public void setEmployeesNumber(int employeesNumber) {
    this.employeesNumber = employeesNumber;
  }

  public String getAssetsValue() {
    return assetsValue;
  }

  public void setAssetsValue(String assetsValue) {
    this.assetsValue = assetsValue;
  }

  public String getConstitutionDate() {
    return constitutionDate;
  }

  public void setConstitutionDate(String constitutionDate) {
    this.constitutionDate = constitutionDate;
  }

  public String getOrganizationType() {
    return organizationType;
  }

  public void setOrganizationType() {
    this.organizationType = organizationType;
  }

  public String getRepName() {
    return repName;
  }

  public void setRepName(String repName) {
    this.repName = repName;
  }

  public abstract String toString();

}
