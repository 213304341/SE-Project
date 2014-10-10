/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.dreamteam.health.client;

import za.co.dreamteam.health.model.Patient;

import javax.ejb.Remote;

/**
 *
 * @author 213304341
 */
@Remote
public interface MaternalRegistry {
    public boolean addPatient(Patient patient);
    public boolean updatePatient(Patient patient);
    public boolean bookPatientAppointment(Patient patient);
    public Patient retrivePatientDetails(String identifier);
}
