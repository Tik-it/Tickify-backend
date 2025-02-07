package org.tickify.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.tickify.model.Seat

@Repository
interface SeatRepository : JpaRepository<Seat, Long> {
}