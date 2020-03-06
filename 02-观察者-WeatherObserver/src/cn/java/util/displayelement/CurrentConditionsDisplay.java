package cn.java.util.displayelement;

import java.util.Observable;
import java.util.Observer;

import cn.java.util.subject.WeatherData;
import cn.vincent.displayelement.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temperature;
	private float humidity;
	// �½������Ĺ��̣�ָ���˱��۲��ߣ����������������������ӳ��˹۲��ߣ�����
	// ����ӵĹ����У�observable�Ӳ�����г�ȡ��֪�ˡ����۲���WeatherData��
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
