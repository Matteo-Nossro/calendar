package com.jee_project.calendrier_mn_sg.initialisation;

import com.jee_project.calendrier_mn_sg.business.Theme;
import com.jee_project.calendrier_mn_sg.repository.ThemeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class InitData implements CommandLineRunner {

    @Autowired
    private ThemeRepository themeRepository;

    @Override
    public void run(String... args) throws Exception {
        themeRepository.save(new Theme("Light"));
        themeRepository.save(new Theme("Dark"));

        // Add all days of the current month
        LocalDate now = LocalDate.now();
        int daysInMonth = now.lengthOfMonth();
        IntStream.rangeClosed(1, daysInMonth)
                .forEach(day -> System.out.println("Adding day: " + day));

        // Add five emotions
        String[] emotions = {"Souriant", "Monocle", "Content", "Triste", "En colère"};
        for (String emotion : emotions) {
            System.out.println("Adding emotion: " + emotion);
        }
    }
}
