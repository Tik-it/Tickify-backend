package org.tickify.service

import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import org.tickify.repository.HallRepository

@Service
class HallService(
    val hallRepository: HallRepository
) {
}