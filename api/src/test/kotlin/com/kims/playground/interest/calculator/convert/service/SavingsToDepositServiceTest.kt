package com.kims.playground.interest.calculator.convert.service

import com.kims.playground.interest.calculator.convert.dto.RequestInterestDto
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.assertEquals

/**
 * 연산 정확성을 위주로 평가
 * 단위테스트 블로그 : https://galid1.tistory.com/772
 * 테스트 품질 향상 : https://toss.tech/article/test-strategy-server
 * */
@SpringBootTest
private class SavingsToDepositServiceTest {
    @Autowired
    private lateinit var service: SavingsToDepositService

    @Test
    fun convert12monthsSavings() {
        val response = service.convert(
            RequestInterestDto(
                monthlySaving = 1,
                durationMonth = 12,
                interestPercent = 3.0
            )
        )
        assertEquals(response.totalInput, 120_000)
        assertEquals(response.benefit, 1967)
        assert(response.depositInterestPercent in 1.638..1.640) // 1.639
    }

    @Test
    fun convert6monthsSavings() {
        val response = service.convert(
            RequestInterestDto(
                monthlySaving = 1,
                durationMonth = 6,
                interestPercent = 2.5
            )
        )
        assertEquals(response.totalInput, 60_000)
        assertEquals(response.benefit, 439)
        assert(response.depositInterestPercent in 1.462..1.464) // 1.463
    }
}