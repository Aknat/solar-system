package org.test.solarsystem

import org.test.solarsystem.dao.{Coordinates, Globe}

object App {

  def main(args: Array[String]): Unit = {

    val sun = Globe("Sun", Coordinates(0, 0), 1391016000, 1.9885E30, 5772)

    println(sun)
  }
}