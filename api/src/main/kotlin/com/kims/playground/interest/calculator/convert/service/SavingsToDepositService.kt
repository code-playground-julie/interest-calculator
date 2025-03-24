package com.kims.playground.interest.calculator.convert.service

import com.kims.playground.interest.calculator.convert.dto.RequestInterestDto
import com.kims.playground.interest.calculator.convert.dto.ResponseInterestDto
import org.springframework.stereotype.Service
import kotlin.math.pow

@Service
class SavingsToDepositService {
    companion object {
        private const val 만원 = 10_000
    }
    fun convert(requestDto: RequestInterestDto): ResponseInterestDto {
        // 1. 복리 이자 총액 계산
        val monthlyRate = requestDto.interestPercent / 12.0 / 100.0
        var total = 0.0
        for (i in 0 until requestDto.durationMonth) {
            total += requestDto.monthlySaving * 만원 * (1 + monthlyRate).pow(i + 1)
        }

        // 2. 예금 이자로 환산
        val totalInput = requestDto.totalInput.toDouble()
        val benefit = total - totalInput
        val yearlyInterest = benefit / totalInput * 12 / requestDto.durationMonth * 100.0

        return ResponseInterestDto(
            totalInput = totalInput.toLong(),
            benefit = benefit.toLong(),
            depositInterestPercent = yearlyInterest
        )
    }
}