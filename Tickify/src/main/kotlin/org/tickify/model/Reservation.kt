package org.tickify.model

import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany

@Entity
class Reservation(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Enumerated(EnumType.STRING)
    val purchaseType: PurchaseType,

    @ManyToOne
    @JoinColumn(name = "client_id")
    val client: Client,

    @OneToMany(mappedBy = "reservation")
    val tickets: MutableList<Ticket> = mutableListOf()
)