package com.kims.playground.interest.calculator

import com.kims.playground.interest.calculator.convert.dto.RequestInterestDto
import com.kims.playground.interest.calculator.convert.dto.ResponseInterestDto
import com.kims.playground.interest.calculator.convert.entity.Product
import com.kims.playground.interest.calculator.convert.entity.ProductType
import com.kims.playground.interest.calculator.convert.repository.ProductRepository
import com.kims.playground.interest.calculator.convert.service.SavingsToDepositService
import com.kims.playground.interest.calculator.convert.service.TestService
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import org.springframework.http.HttpStatus
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
@CrossOrigin(origins = ["*"])
@Validated
class InterestController(
    val service: SavingsToDepositService,
    val testService: TestService,
) {
    @GetMapping("yearly-interest")
    fun getSavingResult(
        @RequestParam @NotNull @Min(value = 0) monthlySaving: Long,
        @RequestParam @NotNull @Min(value = 0) durationMonth: Int,
        @RequestParam @NotNull @Min(value = 0) interestPercent: Double
    ): ResponseInterestDto? {
        // println("GET yearly-interest 요청 수신 (양수만 받음)\nmonthlySaving : ${monthlySaving}원\ndurationMonth: $durationMonth 개월\ninterestPercent: $interestPercent %")
        try {
            val requestInterestDto = RequestInterestDto(monthlySaving, durationMonth, interestPercent)
            val response: ResponseInterestDto = service.convert(requestInterestDto)
            return response
        } catch (e: Exception) {
            println(e.message)
            throw ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.message)
        }
    }

    @GetMapping("/test")
    fun getAnyDataFromDB(
    ): String {
        return testService.testDB()
    }
}