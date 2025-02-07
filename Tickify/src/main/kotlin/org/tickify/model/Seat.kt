package org.tickify.model

import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.javamoney.moneta.Money

@Entity
class Seat(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    var seatNumber: String,

    @Embedded
    var frontendPosition: FrontendPosition,

    @Enumerated(EnumType.STRING)
    var seatType: SeatType,

    var price: Money,

    var taken: Boolean,

    var hallId: Long
)