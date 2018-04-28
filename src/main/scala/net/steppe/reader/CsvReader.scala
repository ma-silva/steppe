package net.steppe.reader

import java.io.File
import scala.io.{BufferedSource, Source}

trait CSVReader[T] extends Parser[T] with Iterable[T] {
  protected val file: File
  protected val source: BufferedSource = Source.fromFile(file)

  protected def parse(): Iterator[T] = {
    source.getLines().map(split).asInstanceOf[Iterator[T]]
  }

  private def split[B <: String]  = (p: B) => p.split(",") match {
    case Array(v1) => (v1)
    case Array(v1, v2) => (v1, v2)
    case Array(v1, v2, v3) => (v1, v2, v3)
    case Array(v1, v2, v3, v4) => (v1, v2, v3, v4)
    case Array(v1, v2, v3, v4, v5) => (v1, v2, v3, v4, v5)
    case Array(v1, v2, v3, v4, v5, v6) => (v1, v2, v3, v4, v5, v6)
    case Array(v1, v2, v3, v4, v5, v6, v7) => (v1, v2, v3, v4, v5, v6, v7)
    case Array(v1, v2, v3, v4, v5, v6, v7, v8) => (v1, v2, v3, v4, v5, v6, v7, v8)
    case Array(v1, v2, v3, v4, v5, v6, v7, v8, v9) => (v1, v2, v3, v4, v5, v6, v7, v8, v9)
    case Array(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10) => (v1, v2, v3, v4, v5, v6, v7, v8, v9, v10)
    case Array(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11) => (v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11)
    case Array(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12) => (v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12)
    case Array(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13) => (v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13)
    case Array(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14) => (v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14)
    case Array(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15) => (v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15)
    case Array(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16) => (v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16)
    case Array(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17) => (v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17)
    case Array(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18) => (v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18)
    case Array(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19) => (v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19)
    case Array(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20) => (v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20)
    case Array(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21) => (v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21)
    case Array(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22) => println("oks"); (v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22)
    case _ => new IndexOutOfBoundsException("Too many elements for tuple, allowed 22")
  }
}