package cn.java.util.displayelement;

import java.util.Observable;
import java.util.Observer;

import cn.java.util.subject.WeatherData;
import cn.vincent.displayelement.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temperature;
	private float humidity;
	// 新建布告板的过程：指定了被观测者，并将【整个布告板自身】添加成了观察者！！！
	// 在添加的过程中，observable从布告板中抽取获知了【被观测者WeatherData】
	public CurrentConditionsDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature
				+ "F degrees and " + humidity + "% humidity");
		
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

}
