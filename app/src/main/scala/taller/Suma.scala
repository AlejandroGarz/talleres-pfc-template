package taller

object  Suma {

    def suma(n: Int, increment: Int, operation: (Int, Int) => Int): Int = {
        def recursiva(i: Int, acc: Int): Int = {
            if (i > n) acc
            else recursiva(i + increment, operation(acc, i))
        }
        recursiva(0, 0)
    }
}