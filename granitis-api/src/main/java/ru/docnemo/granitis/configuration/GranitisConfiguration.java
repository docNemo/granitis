package ru.docnemo.granitis.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.docnemo.granitis.core.repository.lexical.LexemeRepository;
import ru.docnemo.granitis.core.repository.lexical.TermRepository;
import ru.docnemo.granitis.service.StubService;

@Configuration
public class GranitisConfiguration {
    @Bean
    public StubService stubService(
            LexemeRepository lexemeRepository,
            TermRepository termRepository
    ) {
        return new StubService(
                lexemeRepository,
                termRepository
        );
    }
}
