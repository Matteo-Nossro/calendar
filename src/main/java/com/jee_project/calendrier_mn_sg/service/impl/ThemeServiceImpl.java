package com.jee_project.calendrier_mn_sg.service.impl;

import com.jee_project.calendrier_mn_sg.business.Theme;
import com.jee_project.calendrier_mn_sg.repository.ThemeRepository;
import com.jee_project.calendrier_mn_sg.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThemeServiceImpl implements ThemeService {

    private final ThemeRepository themeRepository;

    @Autowired
    public ThemeServiceImpl(ThemeRepository themeRepository) {
        this.themeRepository = themeRepository;
    }

    @Override
    public List<Theme> findAll() {
        return themeRepository.findAll();
    }

    @Override
    public Theme save(Theme theme) {
        return themeRepository.save(theme);
    }
}