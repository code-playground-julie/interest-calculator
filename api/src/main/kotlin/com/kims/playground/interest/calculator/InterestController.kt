package com.kims.playground.interest.calculator

import com.kims.playground.interest.calculator.convert.dto.RequestInterestDto
import com.kims.playground.interest.calculator.convert.dto.ResponseInterestDto
import com.kims.playground.interest.calculator.convert.service.SavingsToDepositService
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(origins = ["*"])
class InterestController(
    val service: SavingsToDepositService
) {
    @GetMapping("yearly-interest")
    fun convertSavingsToDeposit(
        @RequestParam monthlySaving: Long,
        @RequestParam durationMonth: Int,
        @RequestParam interestPercent: Double
    ): ResponseInterestDto? {
        println("GET yearly-interest 요청 수신")
        try{
            val requestInterestDto = RequestInterestDto(monthlySaving, durationMonth, interestPercent)
            val response = service.convert(requestInterestDto)
            return response
        } catch (e: Exception) {
            println(e.message)
            return null
        }
    }
}