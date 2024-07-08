package com.jee_project.calendrier_mn_sg.service;

import com.jee_project.calendrier_mn_sg.business.Theme;

import java.util.List;

public interface ThemeService {
    List<Theme> findAll();
    Theme save(Theme theme);
}