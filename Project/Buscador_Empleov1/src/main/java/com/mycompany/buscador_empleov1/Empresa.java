/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.buscador_empleov1;

/**
 *
 * @author Edison
 */
public class Empresa {
    private String name;
    private String ID;
    private String Address;
    private String Description;
    private String PhoneNumber;
    private String Email;
    private String Puesto;
    private String Requerimientos;
    private String Horarios;
    private String CompanyDescription;
    /**
     * @return the Name
     */
    public String getName() {
        return name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.name = Name;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * @return the PhoneNumber
     */
    public String getPhoneNumber() {
        return PhoneNumber;
    }

    /**
     * @param PhoneNumber the PhoneNumber to set
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the Puesto
     */
    public String getPuesto() {
        return Puesto;
    }

    /**
     * @param Puesto the Puesto to set
     */
    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    /**
     * @return the Requerimientos
     */
    public String getRequerimientos() {
        return Requerimientos;
    }

    /**
     * @param Requerimientos the Requerimientos to set
     */
    public void setRequerimientos(String Requerimientos) {
        this.Requerimientos = Requerimientos;
    }

    /**
     * @return the Horarios
     */
    public String getHorarios() {
        return Horarios;
    }

    /**
     * @param Horarios the Horarios to set
     */
    public void setHorarios(String Horarios) {
        this.Horarios = Horarios;
    }

    /**
     * @return the CompanyDescription
     */
    public String getCompanyDescription() {
        return CompanyDescription;
    }

    /**
     * @param CompanyDescription the CompanyDescription to set
     */
    public void setCompanyDescription(String CompanyDescription) {
        this.CompanyDescription = CompanyDescription;
    }
    
    @Override
    public String toString() {
        return this.name + " -> " + this.Email;
    }
}
