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
public class Usuario {
    private String Name;
    private String LastName;
    private String ID;
    private String Address;
    private String PhoneNumber;
    private String Email;
    private String LE;
    private String LaboralEx;
    private String Titulos;
    private String Languages;
    private String Extras;
    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
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
     * @return the LE
     */
    public String getLE() {
        return LE;
    }

    /**
     * @param LE the LE to set
     */
    public void setLE(String LE) {
        this.LE = LE;
    }

    /**
     * @return the LaboralEx
     */
    public String getLaboralEx() {
        return LaboralEx;
    }

    /**
     * @param LaboralEx the LaboralEx to set
     */
    public void setLaboralEx(String LaboralEx) {
        this.LaboralEx = LaboralEx;
    }

    /**
     * @return the Titulos
     */
    public String getTitulos() {
        return Titulos;
    }

    /**
     * @param Titulos the Titulos to set
     */
    public void setTitulos(String Titulos) {
        this.Titulos = Titulos;
    }

    /**
     * @return the Languages
     */
    public String getLanguages() {
        return Languages;
    }

    /**
     * @param Languages the Languages to set
     */
    public void setLanguages(String Languages) {
        this.Languages = Languages;
    }

    /**
     * @return the Extras
     */
    public String getExtras() {
        return Extras;
    }

    /**
     * @param Extras the Extras to set
     */
    public void setExtras(String Extras) {
        this.Extras = Extras;
    }
    
    @Override
    public String toString() {
        return this.Name;
    }
    
}
