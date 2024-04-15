package Chapter3

import doodle.core._
import doodle.image._
import doodle.image.syntax.all._
import doodle.image.syntax.core._
import doodle.java2d._

import cats.effect.unsafe.implicits.global

object Chapter3Exercises extends App {

  // 3.1.1

  val c1 = Image.circle(1)
  val c2 = Image.circle(10)
  val c3 = Image.circle(100)

  c1.draw()
  c2.draw()
  c3.draw()

  // 3.1.2

  Image.circle(1)
  Image.rectangle(10, 100)
  Image.triangle(200, 50)

  // The type of circle is: Image
  // The type of rectangle is: Image
  // The type of triangle is: Image

  // 3.1.3

  // Image.circle(10).draw()
  // The type of drawing an image is Unit.
  // This means that the draw method does not return any useful value.

  // 3.1.4

  Image.circle(40)
    .beside(Image.circle(40))
    .beside(Image.circle(40))
    .on(Image.circle(120))
    .draw()
}
