package com.terra.terramain.web

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TerraMapControllerTest(@Autowired val restTemplate: TestRestTemplate) {

    @Test
    fun `test something`() {
        val entity = restTemplate.getForEntity<String>("/map/pins")

        assertEquals(entity.statusCode, HttpStatus.OK)
        assertEquals(entity.body, "SHIEEEET")
    }
}