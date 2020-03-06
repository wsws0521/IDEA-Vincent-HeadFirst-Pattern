package cn.java.util.test;

import cn.java.util.displayelement.CurrentConditionsDisplay;
import cn.java.util.subject.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		// 新建布告板的过程：指定了被观测者，并将【整个布告板自身】添加成了观察者！！！
		// 在添加的过程中，observable从布告板中抽取获知了【被观测者】
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
//		weatherData.registerObserver(currentDisplay);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 67, 36.4f);
		weatherData.setMeasurements(78, 64, 31.4f);

	}

}
