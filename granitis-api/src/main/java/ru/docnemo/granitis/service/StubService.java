package ru.docnemo.granitis.service;

import ru.docnemo.granitis.dto.request.StubRequest;
import ru.docnemo.granitis.dto.response.StubResponse;

public class StubService {
    public StubResponse getStub(StubRequest request) {
        return new StubResponse(request.getMessage());
    }
}
