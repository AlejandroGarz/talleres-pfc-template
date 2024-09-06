package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SumaTest extends AnyFunSuite {

    test("Sumatoria con incremento de 1 y operación de suma") {
        assert(Suma.suma(3, 1, _ + _) == 6) // 0 + 1 + 2 + 3 = 6
    }

    test("Sumatoria con incremento de 2 y operación de suma") {
        assert(Suma.suma(6, 2, _ + _) == 12) // 0 + 2 + 4 + 6 = 12
    }

    test("Sumatoria con incremento de 1 y operación de multiplicación") {
        assert(Suma.suma(3, 1, _ * _) == 0) // 0 * 1 * 2 * 3 = 0
    }

    test("Sumatoria con incremento de 2 y operación de multiplicación") {
        assert(Suma.suma(6, 2, _ * _) == 0) // 0 * 2 * 4 * 6 = 0
    }
}
