package com.example.labjava.controller;

import com.example.labjava.dto.SkatewheelDTO;
import com.example.labjava.exception.ForeignKeyConstraintException;
import com.example.labjava.exception.ProductNotFoundException;
import com.example.labjava.service.SkatewheelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping(value = "/skatewheels")
public class SkatewheelController {

    private final SkatewheelService skatewheelService;

    @Autowired
    public SkatewheelController(SkatewheelService skatewheelService) {
        this.skatewheelService = skatewheelService;
    }

    @GetMapping
    public ResponseEntity<List<SkatewheelDTO>> getAllSkatewheels() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Access-Control-Allow-Origin", "*");
        return ResponseEntity.ok().
                headers(httpHeaders).
                body(skatewheelService.getSkatewheels());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<SkatewheelDTO> getSkatewheelById(@PathVariable("id") final Long id) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Access-Control-Allow-Origin", "*");
        SkatewheelDTO skatewheelDTO;
        try {
            skatewheelDTO = skatewheelService.getSkatewheel(id);
        }
        catch (ProductNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok().
                headers(httpHeaders).
                body(skatewheelDTO);
    }

    @DeleteMapping(value = "/{id}")
    public HttpStatus deleteSkatewheel(@PathVariable("id") final Long id) {
        try {
            skatewheelService.deleteSkatewheel(id);
        }
        catch (ProductNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        catch (ForeignKeyConstraintException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return HttpStatus.OK;
    }

    @PostMapping
    public HttpStatus addSkatewheel(@RequestBody SkatewheelDTO newSkatewheel) {
        skatewheelService.addSkatewheel(newSkatewheel);
        return HttpStatus.CREATED;
    }

    @PutMapping(value = "/{id}")
    public HttpStatus updateSkatewheel(@RequestBody SkatewheelDTO newSkatewheel, @PathVariable("id") final Long id) {
        try {
            skatewheelService.updateSkatewheel(newSkatewheel, id);
        }
        catch (ProductNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return HttpStatus.CREATED;
    }
}
