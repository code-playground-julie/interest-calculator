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
    var minMonth: Int? = null,
    @Column
    var maxMonth: Int? = null,
    @Column
    var minAmount: Long? = null,
    @Column
    var maxAmount: Long? = null,
    @Column
    @LastModifiedBy
    var updated_at: LocalDateTime?= null,
    @Column
    var detail: String = "",
)