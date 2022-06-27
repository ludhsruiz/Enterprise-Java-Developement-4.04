package com.ironhack.lab404.controller.impl;

import com.ironhack.lab404.controller.interfaces.PatientController;
import com.ironhack.lab404.models.Patient;
import com.ironhack.lab404.service.impl.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


public class PatientControllerImpl implements PatientController {
    @Autowired
    private PatientServiceImpl patientService;

    // 1. Create a route to add a new patient
    @PostMapping("/patient")
    @ResponseStatus(HttpStatus.CREATED)
    public Patient addNewPatient(@RequestBody @Valid Patient patient) {
        return patientService.addNewPatient(patient);
    }

    // 6. Create a patient's information (the user should be able to update any patient information through this route)
    @PutMapping("/patient-update/{patientId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateAnyPatientInformation(@PathVariable Integer patientId, @RequestBody @Valid Patient patient) {
        patientService.updateAnyPatientInformation(patientId, patient);
    }
}
