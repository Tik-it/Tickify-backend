package org.tickify.model

import jakarta.persistence.*
import lombok.Getter

@Entity
@Getter
class Client(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val firstName: String,

    val lastName: String,

    val phone: String,

    var password: String,

    var email: String,

    @OneToMany(mappedBy = "client")
    val reservations: MutableList<Reservation> = mutableListOf()
)


@Embeddable //!TODO : GDZIE TO WRZUCIC ZAPYTAJ
class Location(
    val address: String,
    val city: String,
    val state: String,
    val zipCode: String
)
//TODO : DODAJ MANAGERA HALLI KTORY ZROBI BLUEPRINT


@Embeddable
class FrontendPosition(
    val x: Int,
    val y: Int,
    val rotation: Int
)

enum class PurchaseType {
    CARD, PREPAID, BANK
}

enum class SeatType {
    STANDING, SITTING, LOUNGE
}
