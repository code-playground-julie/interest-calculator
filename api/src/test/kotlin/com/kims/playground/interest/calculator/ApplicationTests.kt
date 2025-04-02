package com.kims.playground.interest.calculator

import com.kims.playground.interest.calculator.convert.repository.ProductRepository
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.test.context.ActiveProfiles

@EnableJpaRepositories
@SpringBootTest
private class ApplicationTests {

    @Test
    fun contextLoads() {
    }

    @Autowired
    private lateinit var mysqlRepository: ProductRepository
    @Test
    fun dbPropertyCheck() {
        Assertions.assertNotNull(mysqlRepository)
    }
}
