package com.terra.terramain.web

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/map")
class TerraMapController {

    @GetMapping("/pins")
    fun getAll(): ResponseEntity<String> {
        return ResponseEntity.ok("SHIEEEET")
    }


}