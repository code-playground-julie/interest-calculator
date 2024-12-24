package com.kims.playground.interest.calculator

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

/**
 * 쿼리 Validation 확실한지 확인
 */
@SpringBootTest
class InterestControllerTest {
    @Autowired
    private val controller: InterestController? = null

    @Test
    @Throws(Exception::class)
    fun contextLoads() {
        assertNotNull(controller)
    }

    @Test
    fun denyNegativeSaving() {
        Assertions.assertThatThrownBy {
            controller!!.getSavingResult(
                -1000, 10, 3.0
            )
        }.isInstanceOf(Exception::class.java)
    }

    @Test
    fun denyNegativeDuration() {
        Assertions.assertThatThrownBy {
            controller!!.getSavingResult(
                1000, -10, 3.0
            )
        }.isInstanceOf(Exception::class.java)
    }

    @Test
    fun denyNegativePercent() {
        Assertions.assertThatThrownBy {
            controller!!.getSavingResult(
                1000, 10, -3.0
            )
        }.isInstanceOf(Exception::class.java)
    }

    @Test
    fun acceptNormalInput() {
        val responseInterestDto = controller!!.getSavingResult(
            10_000, 12, 3.0
        )
        assertNotNull(responseInterestDto)
        assertEquals(responseInterestDto.totalInput, 120_000)
        assertEquals(responseInterestDto.benefit, 1967)
        assertTrue {
            // 결과값인 연이율 1.64%에서 오차범위 0.001 이내
            responseInterestDto.depositInterestPercent in 1.639..1.641
        }
    }
}
