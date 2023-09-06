package ch2_observer

class ForecastDisplay(
    private val weatherData: WeatherData
) : Observer, DisplayElement {
    private var currentPressure = 29.92f
    private var lastPressure = 0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        lastPressure = currentPressure
        currentPressure = weatherData.pressure
        display()
    }

    override fun display() {
        print("기상 예보: ")
        if (currentPressure > lastPressure) {
            println("날씨가 좋아지고 있습니다.")
        } else if (currentPressure == lastPressure) {
            println("지금과 비슷할 것 같습니다.")
        } else if (currentPressure < lastPressure) {
            println("쌀쌀하고 비가 올 것 같습니다.")
        }
    }
}