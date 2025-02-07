package org.tickify.service

import org.springframework.stereotype.Service
import org.tickify.repository.SeatRepository

@Service
class SeatService(
    val seatRepository: SeatRepository
) {
}