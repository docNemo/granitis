package ru.docnemo.granitis.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import ru.docnemo.granitis.core.repository.lexical.LexemeRepository;
import ru.docnemo.granitis.core.repository.lexical.TermRepository;
import ru.docnemo.granitis.dto.request.StubRequest;
import ru.docnemo.granitis.dto.response.StubResponse;
import ru.docnemo.granitis.core.repository.frame.QuestionRoleFramesRepository;

@Slf4j
@RequiredArgsConstructor
public class StubService {
    private final LexemeRepository lexemeRepository;
    private final TermRepository termRepository;

    @Transactional
    public StubResponse getStub(StubRequest request) {
        return new StubResponse(request.getMessage());
    }
}
