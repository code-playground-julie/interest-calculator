package com.kims.playground.interest.calculator.convert.dto

data class ResponseInterestDto (
    val totalInput: Long,
    val benefit: Long,
    val depositInterestPercent: Double,
)