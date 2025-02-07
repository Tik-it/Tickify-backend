package org.tickify.model

import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity
class HallBlueprint(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val name: String,

    @Embedded
    val location: Location,

    @OneToMany(mappedBy = "hallId")
    val seats: MutableList<Seat> = mutableListOf()
)