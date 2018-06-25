package GoF.observerPattern.weatherORama.test;

import GoF.observerPattern.weatherORama.observer.ForecastDisplay;
import GoF.observerPattern.weatherORama.observer.StatisticsDisplay;
import GoF.observerPattern.weatherORama.observer.CurrentConditionsDisplay;
import GoF.observerPattern.weatherORama.subject.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
