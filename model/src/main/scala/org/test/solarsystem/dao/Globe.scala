package org.test.solarsystem.dao

case class Globe(
                  name: String,
                  coords: Coordinates,
                  diameter: Long,
                  mass: Double,
                  temperature: Int)