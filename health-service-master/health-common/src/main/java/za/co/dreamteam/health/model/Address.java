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
public class Address implements Serializable {
    private static final long serialVersionUID = 4310289726096419642L;
    
    private String addressLine_1;
    private String addressLine_2;
    private String addressLine_3;
    private String addressLine_4;
    private String addressLine_5;

    public Address() {
    }

    public String getAddressLine_1() {
        return addressLine_1;
    }

    public void setAddressLine_1(String addressLine_1) {
        this.addressLine_1 = addressLine_1;
    }

    public String getAddressLine_2() {
        return addressLine_2;
    }

    public void setAddressLine_2(String addressLine_2) {
        this.addressLine_2 = addressLine_2;
    }

    public String getAddressLine_3() {
        return addressLine_3;
    }

    public void setAddressLine_3(String addressLine_3) {
        this.addressLine_3 = addressLine_3;
    }

    public String getAddressLine_4() {
        return addressLine_4;
    }

    public void setAddressLine_4(String addressLine_4) {
        this.addressLine_4 = addressLine_4;
    }

    public String getAddressLine_5() {
        return addressLine_5;
    }

    public void setAddressLine_5(String addressLine_5) {
        this.addressLine_5 = addressLine_5;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        String NEW_LINE = System.getProperty("line.separator");

        result.append(this.getClass().getName()).append(" Address [").append(NEW_LINE);
        result.append(" Address Line_1: ").append(addressLine_1).append(NEW_LINE);
        result.append(" Address Line_2: ").append(addressLine_2).append(NEW_LINE);
        result.append(" Address Line_3: ").append(addressLine_3).append(NEW_LINE);
        result.append(" Address Line_4: ").append(addressLine_4).append(NEW_LINE);
        result.append(" Address Line_5: ").append(addressLine_5).append(NEW_LINE);        
        result.append("]");

     return result.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.addressLine_1 != null ? this.addressLine_1.hashCode() : 0);
        hash = 53 * hash + (this.addressLine_2 != null ? this.addressLine_2.hashCode() : 0);
        hash = 53 * hash + (this.addressLine_3 != null ? this.addressLine_3.hashCode() : 0);
        hash = 53 * hash + (this.addressLine_4 != null ? this.addressLine_4.hashCode() : 0);
        hash = 53 * hash + (this.addressLine_5 != null ? this.addressLine_5.hashCode() : 0);
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
        final Address other = (Address) obj;
        if ((this.addressLine_1 == null) ? (other.addressLine_1 != null) : !this.addressLine_1.equals(other.addressLine_1)) {
            return false;
        }
        if ((this.addressLine_2 == null) ? (other.addressLine_2 != null) : !this.addressLine_2.equals(other.addressLine_2)) {
            return false;
        }
        if ((this.addressLine_3 == null) ? (other.addressLine_3 != null) : !this.addressLine_3.equals(other.addressLine_3)) {
            return false;
        }
        if ((this.addressLine_4 == null) ? (other.addressLine_4 != null) : !this.addressLine_4.equals(other.addressLine_4)) {
            return false;
        }
        if ((this.addressLine_5 == null) ? (other.addressLine_5 != null) : !this.addressLine_5.equals(other.addressLine_5)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
