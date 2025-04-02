package com.kims.playground.interest.calculator.convert.repository

import com.kims.playground.interest.calculator.convert.entity.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: JpaRepository<Product, Long> {

}