package cn.java.util.subject;

import java.util.Observable;
/**
 * ʹ��JAVA���õĹ۲��ߣ��кܶ๤���ڳ����Ѿ���æ����
 * @author Vincent
 *
 */
public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	// ���������轨���۲������ݽṹ��
	public WeatherData() {
	}
	public void measurementsChanged(){
		setChanged();
		// δ�������ݶ��󣨵ȴ�����ȡ�������ǡ����͡���
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
