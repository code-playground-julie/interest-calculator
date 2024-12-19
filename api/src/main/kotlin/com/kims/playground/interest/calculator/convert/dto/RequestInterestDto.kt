package com.kims.playground.interest.calculator.convert.dto

import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank

data class RequestInterestDto (
    @field:NotBlank(message="")
    val monthlySaving: Long,
    @field:NotBlank(message="")
    val durationMonth: Int,
    @field:NotBlank(message="")
    val interestPercent: Double,
) {
    val totalInput = monthlySaving * durationMonth
}