package ch2

import kotlin.math.max
import kotlin.math.min


class StatisticsDisplay(
    private val weatherData: WeatherData
): Observer, DisplayElement {
    private var maxTemp = 0.0f
    private var minTemp = 200f
    private var tempSum = 0.0f
    private var numReadings = 0

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        val temp = weatherData.temperature
        tempSum += temp
        numReadings++
        maxTemp = max(maxTemp, temp)
        minTemp = min(minTemp, temp)
        display()
    }

    override fun display() {
        println(
            "평균/최고/최저 온도 = ${tempSum / numReadings}/$maxTemp/$minTemp"
        )
    }
}
