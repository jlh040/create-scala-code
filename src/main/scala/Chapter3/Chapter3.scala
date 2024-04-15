import doodle.core._
import doodle.image._
import doodle.image.syntax.all._
import doodle.image.syntax.core._
import doodle.java2d._

import cats.effect.unsafe.implicits.global


object Chapter3 extends App {
  
  Image.circle(100).draw()
  Image.rectangle(100, 50).draw()
  Image.triangle(600, 40).draw()
  
}
