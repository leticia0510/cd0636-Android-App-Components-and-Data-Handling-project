package com.udacity.project.spire.domain.model

/**
 * Domain model representing a tall building/skyscraper.
 * This is the core business object used throughout the app.
 *
 * NOTE: This class is complete - no implementation needed.
 * Review the properties to understand the data model before implementing entities.
 */
data class Building(
    val id: Int,
    // NOTE (Informational - Not a TODO): Add remaining class properties
    // This is a reference - the complete Building model is in the solution
    // You'll map to this model from BuildingEntity in TODO #4
    val name: String,
    val imageUrl: String,
    val heightMeters: Int,
    val floors: Int,
    val yearCompleted: Int,
    val architecturalStyle: String,
    val description: String,
    val visitStatus: VisitStatus,
    val city: String,
    val country: String
)