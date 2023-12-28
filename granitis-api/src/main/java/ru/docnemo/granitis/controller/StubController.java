package ru.docnemo.granitis.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.docnemo.granitis.dto.request.StubRequest;
import ru.docnemo.granitis.dto.response.StubResponse;
import ru.docnemo.granitis.service.StubService;

@RestController
@RequestMapping("/stub")
@RequiredArgsConstructor
public class StubController {
    private final StubService service;

    @PostMapping
    public StubResponse getStub(@RequestBody StubRequest request) {
        return service.getStub(request);
    }
}
