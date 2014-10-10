/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.dreamteam.health.model;

import java.io.Serializable;

/**
 *
 * @author 213304341
 */
public class Contact implements Serializable {
    private static final long serialVersionUID = 4310289726096419642L;
    
    private String mobileNumber;
    private String homeTelephoneHome;
    private String workTelephoneHome;

    public Contact() {
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getHomeTelephoneHome() {
        return homeTelephoneHome;
    }

    public void setHomeTelephoneHome(String homeTelephoneHome) {
        this.homeTelephoneHome = homeTelephoneHome;
    }

    public String getWorkTelephoneHome() {
        return workTelephoneHome;
    }

    public void setWorkTelephoneHome(String workTelephoneHome) {
        this.workTelephoneHome = workTelephoneHome;
    }

   @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        String NEW_LINE = System.getProperty("line.separator");

        result.append(this.getClass().getName()).append(" Object {").append(NEW_LINE);
        result.append(" Mobile Number: ").append(mobileNumber).append(NEW_LINE);
        result.append(" Home Telephone Home: ").append(homeTelephoneHome).append(NEW_LINE);
        result.append(" Work Telephone Home: ").append(workTelephoneHome).append(NEW_LINE);
        
        result.append("}");

     return result.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contact other = (Contact) obj;
        if ((this.mobileNumber == null) ? (other.mobileNumber != null) : !this.mobileNumber.equals(other.mobileNumber)) {
            return false;
        }
        if ((this.homeTelephoneHome == null) ? (other.homeTelephoneHome != null) : !this.homeTelephoneHome.equals(other.homeTelephoneHome)) {
            return false;
        }
        if ((this.workTelephoneHome == null) ? (other.workTelephoneHome != null) : !this.workTelephoneHome.equals(other.workTelephoneHome)) {
            return false;
        }
        return true;
    }
}
