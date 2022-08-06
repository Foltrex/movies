package com.cinema.movies.controller;

import com.cinema.movies.domain.Multimedia;
import com.cinema.movies.service.MultimediaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/multimedia")
public class MultimediaController {
    private final MultimediaService multimediaService;

    public MultimediaController(MultimediaService multimediaService) {
        this.multimediaService = multimediaService;
    }

    @GetMapping
    public Page<Multimedia> findAll() {
        return multimediaService.findAll();
    }
}
