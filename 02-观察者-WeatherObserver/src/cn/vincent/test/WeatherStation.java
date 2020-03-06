package cn.vincent.test;

import cn.vincent.displayelement.CurrentConditionsDisplay;
import cn.vincent.subject.WeatherData;

public class WeatherStation {
	
	//registerObserver
	
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
//		weatherData.registerObserver(currentDisplay);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 67, 36.4f);
		weatherData.setMeasurements(78, 64, 31.4f);
	}
}
