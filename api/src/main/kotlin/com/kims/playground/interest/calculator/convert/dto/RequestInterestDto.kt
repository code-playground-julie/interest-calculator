package com.kims.playground.interest.calculator.convert.dto

import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull

data class RequestInterestDto(
    @field:NotNull
    @Min(value = 0)
    val monthlySaving: Long, // 만원단위
    @field:NotNull
    @Min(value = 0)
    val durationMonth: Int,
    @field:NotNull
    @Min(value = 0)
    val interestPercent: Double,
) {
    val totalInput = monthlySaving * durationMonth * 10_000
}