package org.tickify.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.tickify.model.HallBlueprint

@Repository
interface HallRepository : JpaRepository<HallBlueprint, Long> {
}