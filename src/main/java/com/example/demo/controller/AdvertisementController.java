package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Advertisement;
import com.example.demo.service.AdvertisementService;

@RestController
@RequestMapping("/api/advertisements")
public class AdvertisementController {
    @Autowired
    private AdvertisementService advertisementService;

    @PostMapping
    public ResponseEntity<Advertisement> createAdvertisement(@RequestBody Advertisement advertisement) {
        return ResponseEntity.ok(advertisementService.createAdvertisement(advertisement));
    }

    @GetMapping
    public ResponseEntity<List<Advertisement>> getAllAdvertisements() {
        return ResponseEntity.ok(advertisementService.getAllAdvertisements());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Advertisement> getAdvertisementById(@PathVariable Long id) {
        return advertisementService.getAdvertisementById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdvertisement(@PathVariable Long id) {
        advertisementService.deleteAdvertisement(id);
        return ResponseEntity.noContent().build();
    }
}
