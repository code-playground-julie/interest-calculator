package com.kims.playground.interest.calculator.convert.service

import com.kims.playground.interest.calculator.convert.dto.RequestInterestDto
import com.kims.playground.interest.calculator.convert.dto.ResponseInterestDto
import org.springframework.stereotype.Service

@Service
class SavingsToDepositService {
    fun convert(requestDto: RequestInterestDto): ResponseInterestDto {
        // TODO : 로직 구현
        return ResponseInterestDto(0, 0, 0.0)
    }
}