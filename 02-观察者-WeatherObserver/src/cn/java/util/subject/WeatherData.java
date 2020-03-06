package cn.java.util.subject;

import java.util.Observable;
/**
 * 使用JAVA内置的观察者，有很多工作在超类已经帮忙做了
 * @author Vincent
 *
 */
public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	// 构造中无需建立观察者数据结构了
	public WeatherData() {
	}
	public void measurementsChanged(){
		setChanged();
		// 未传送数据对象（等待“拉取”而不是“推送”）
		notifyObservers();
	}
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	public float getTemperature() {
		return temperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public float getPressure() {
		return pressure;
	}
}
