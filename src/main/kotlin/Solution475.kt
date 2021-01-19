class Solution475 {
    private fun findHeater(house: Int, heaters: IntArray): Int {
        var left = 0
        var right = heaters.size - 1
        while (left <= right) {
            val mid = (left + right) / 2
            if (heaters[mid] == house)
                return mid;
            else if (heaters[mid] < house)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }

    fun findRadius(houses: IntArray, heaters: IntArray): Int {
        houses.sort()
        heaters.sort()

        var radius = 0

        for (house in houses) {
            val heaterIndex = findHeater(house, heaters)

            val leftDistFn: () -> Int = { house - heaters[heaterIndex - 1] }
            val rightDistFn: () -> Int = { heaters[heaterIndex] - house }

            var heaterDist: Int
            if (heaterIndex == 0)
                heaterDist = rightDistFn()
            else if (heaterIndex == heaters.size)
                heaterDist = leftDistFn()
            else
                heaterDist = minOf(rightDistFn(), leftDistFn())

            radius = maxOf(radius, heaterDist)
        }

        return radius
    }
}