package net.steppe.reader

trait Parser[T] {
 protected def parse(): Iterator[T]
}
