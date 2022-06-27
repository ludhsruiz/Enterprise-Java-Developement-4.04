package com.ironhack.lab404.service.interfaces;
import com.ironhack.lab404.models.Patient;

public interface PatientService {

    // Create a route to add a new patient
    public Patient addNewPatient(Patient patient);

    // Create a patient's information (the user should be able to update any patient information through this route)
    public void updateAnyPatientInformation(Integer patientId, Patient patient);
}
