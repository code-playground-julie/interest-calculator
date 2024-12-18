package com.kims.playground.interest.calculator

import com.kims.playground.interest.calculator.convert.dto.RequestInterestDto
import com.kims.playground.interest.calculator.convert.dto.ResponseInterestDto
import com.kims.playground.interest.calculator.convert.service.SavingsToDepositService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class InterestController(
    val service: SavingsToDepositService
) {
    @GetMapping("yearly-interest")
    fun convertSavingsToDeposit(@RequestBody requestInterestDto: RequestInterestDto): ResponseInterestDto {
        return service.convert(requestInterestDto)
    }
}