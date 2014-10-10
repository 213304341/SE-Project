/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.dreamteam.health.patient;

import javax.ejb.Stateless;
import za.co.dreamteam.health.client.MaternalRegistry;
import za.co.dreamteam.health.model.Patient;

/**
 *
 * @author 213304341
 */
@Stateless
public class MaternalRegistryService implements MaternalRegistry {

    @Override
    public boolean addPatient(Patient patient) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updatePatient(Patient patient) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean bookPatientAppointment(Patient patient) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Patient retrivePatientDetails(String identifier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
