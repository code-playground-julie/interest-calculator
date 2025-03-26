package com.kims.playground.interest.calculator.convert.service

import com.kims.playground.interest.calculator.convert.entity.Product
import com.kims.playground.interest.calculator.convert.entity.ProductType
import com.kims.playground.interest.calculator.convert.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class TestService(
    private val productRepository: ProductRepository
) {
    fun testDB(): String {
        productRepository.save(
            Product(
                type = ProductType.정기예금,
                name = "마이예금",
                minMonth = 10,
            )
        )
        val result =  productRepository.findAll().joinToString()
        println("[TestService] result = $result")
        return result
    }
}