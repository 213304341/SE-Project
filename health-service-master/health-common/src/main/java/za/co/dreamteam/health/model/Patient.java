/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.dreamteam.health.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 213304341
 */
public class Patient implements Serializable {
    private static final long serialVersionUID = 4310289726096419642L;
    
    private Date dateOfBirth;
    private String title;
    private String firstName;
    private String lastName;
    private String idNumber;
    private Contact contactNumber;

    public Patient() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Contact getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Contact contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
   @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        String NEW_LINE = System.getProperty("line.separator");

        result.append(this.getClass().getName()).append(" Patient Details [").append(NEW_LINE);
        result.append(" Id Number: ").append(idNumber).append(NEW_LINE);
        result.append(" Date of Birth: ").append(dateOfBirth).append(NEW_LINE);
        result.append(" Title: ").append(title).append(NEW_LINE);
        result.append(" First Name: ").append(firstName).append(NEW_LINE);
        result.append(" Last Name: ").append(lastName).append(NEW_LINE);
        result.append(" Last Name: ").append(lastName).append(NEW_LINE);        
        result.append("]");

     return result.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (this.dateOfBirth != null ? this.dateOfBirth.hashCode() : 0);
        hash = 59 * hash + (this.title != null ? this.title.hashCode() : 0);
        hash = 59 * hash + (this.firstName != null ? this.firstName.hashCode() : 0);
        hash = 59 * hash + (this.lastName != null ? this.lastName.hashCode() : 0);
        hash = 59 * hash + (this.idNumber != null ? this.idNumber.hashCode() : 0);
        hash = 59 * hash + (this.contactNumber != null ? this.contactNumber.hashCode() : 0);
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
        final Patient other = (Patient) obj;
        if (this.dateOfBirth != other.dateOfBirth && (this.dateOfBirth == null || !this.dateOfBirth.equals(other.dateOfBirth))) {
            return false;
        }
        if ((this.title == null) ? (other.title != null) : !this.title.equals(other.title)) {
            return false;
        }
        if ((this.firstName == null) ? (other.firstName != null) : !this.firstName.equals(other.firstName)) {
            return false;
        }
        if ((this.lastName == null) ? (other.lastName != null) : !this.lastName.equals(other.lastName)) {
            return false;
        }
        if ((this.idNumber == null) ? (other.idNumber != null) : !this.idNumber.equals(other.idNumber)) {
            return false;
        }
        if (this.contactNumber != other.contactNumber && (this.contactNumber == null || !this.contactNumber.equals(other.contactNumber))) {
            return false;
        }
        return true;
    }
}
