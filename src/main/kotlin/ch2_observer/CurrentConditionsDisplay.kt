package ch2_observer

class CurrentConditionsDisplay(
    private val weatherData: WeatherData
): Observer, DisplayElement {

    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        this.temperature = weatherData.temperature
        this.humidity = weatherData.humidity
        display()
    }

    override fun display() {
        println("현재 상태: 온도 $temperature 도 / 습도 $humidity %")
    }
}