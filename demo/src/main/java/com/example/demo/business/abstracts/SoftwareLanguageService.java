package com.example.demo.business.abstracts;

import java.util.List;

import com.example.demo.entities.concretes.SoftwareLanguage;

public interface SoftwareLanguageService {
    public List<SoftwareLanguage> getSoftwareLanguage();

    public SoftwareLanguage getByIdSoftwareLanguage(int id);

    public SoftwareLanguage addSoftwareLanguage(SoftwareLanguage softwareLanguage);

    public SoftwareLanguage updateSoftwareLanguage(SoftwareLanguage softwareLanguage);

    public void deleteSoftwareLanguage(int id);

}
