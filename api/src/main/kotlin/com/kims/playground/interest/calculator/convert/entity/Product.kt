package com.kims.playground.interest.calculator.convert.entity

import jakarta.persistence.*
import org.springframework.data.annotation.LastModifiedBy
import java.time.LocalDateTime

@Entity
class Product (
    @Id @GeneratedValue(strategy= GenerationType.AUTO) var id: Long? = null,
    @Column
    var type: ProductType,
    @Column
    var name: String,
    @Column
    var minMonth: Int?,
    @Column
    var maxMonth: Int?,
    @Column
    var minAmount: Long?,
    @Column
    var maxAmount: Long?,
    @Column
    @LastModifiedBy
    var updated_at: LocalDateTime,
    @Column
    var detail: String = "",
)