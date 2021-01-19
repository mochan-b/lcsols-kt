import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Solution475Test {
    @Test
    fun test1() {
        val houses = intArrayOf(1, 2, 3)
        val heaters = intArrayOf(2)

        val solution = Solution475()
        val result = solution.findRadius(houses, heaters)

        assertEquals(1, result)
    }

    @Test
    fun test2() {
        val houses = intArrayOf(1, 3, 2)
        val heaters = intArrayOf(2)

        val solution = Solution475()
        val result = solution.findRadius(houses, heaters)

        assertEquals(1, result)
    }

    @Test
    fun test3() {
        val houses = intArrayOf(1, 2, 3, 4)
        val heaters = intArrayOf(1, 4)

        val solution = Solution475()
        val result = solution.findRadius(houses, heaters)

        assertEquals(1, result)
    }

    @Test
    fun test4() {
        val houses = intArrayOf(1, 5)
        val heaters = intArrayOf(2)

        val solution = Solution475()
        val result = solution.findRadius(houses, heaters)

        assertEquals(3, result)
    }

    @Test
    fun test5() {
        val houses = intArrayOf(1, 5)
        val heaters = intArrayOf(10)

        val solution = Solution475()
        val result = solution.findRadius(houses, heaters)

        assertEquals(9, result)
    }

    @Test
    fun test6() {
        val houses = intArrayOf(282475249, 622650073, 984943658, 144108930, 470211272, 101027544, 457850878, 458777923)
        val heaters = intArrayOf(
            823564440,
            115438165,
            784484492,
            74243042,
            114807987,
            137522503,
            441282327,
            16531729,
            823378840,
            143542612
        )

        val solution = Solution475()
        val result = solution.findRadius(houses, heaters)

        assertEquals(161834419, result)
    }

    @Test
    fun test7() {
        val houses = intArrayOf(474833169, 264817709, 998097157, 817129560)
        val heaters = intArrayOf(197493099, 404280278, 893351816, 505795335)

        val solution = Solution475()
        val result = solution.findRadius(houses, heaters)

        assertEquals(104745341, result)
    }
}