package com.example.demo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.concretes.SoftwareLanguage;
import com.example.demo.business.abstracts.SoftwareLanguageService;
import com.example.demo.dataAccess.abstracts.SoftwareLanguageRepository;

@Service
public class SoftwareLanguageManager implements SoftwareLanguageService {

    private final SoftwareLanguageRepository softwareLanguageRepository;

    @Autowired
    public SoftwareLanguageManager(SoftwareLanguageRepository softwareLanguageRepository) {
        this.softwareLanguageRepository = softwareLanguageRepository;
    }

    @Override
    public List<SoftwareLanguage> getSoftwareLanguage() {
        return softwareLanguageRepository.getSoftwareLanguage();
    }

    @Override
    public SoftwareLanguage getByIdSoftwareLanguage(int id) {
        return softwareLanguageRepository.getByIdSoftwareLanguage(id);
    }

    @Override
    public SoftwareLanguage addSoftwareLanguage(SoftwareLanguage softwareLanguage) {
        if (softwareLanguage.getName().isEmpty() || softwareLanguage.getName().isBlank()) {
            throw new RuntimeException("Programlama dili boş geçilemez.");
        }
        return softwareLanguageRepository.addSoftwareLanguage(softwareLanguage);
    }

    @Override
    public SoftwareLanguage updateSoftwareLanguage(SoftwareLanguage softwareLanguage) {
        return softwareLanguageRepository.updateSoftwareLanguage(softwareLanguage);
    }

    @Override
    public void deleteSoftwareLanguage(int id) {
        softwareLanguageRepository.deleteSoftwareLanguage(id);

    }

}
