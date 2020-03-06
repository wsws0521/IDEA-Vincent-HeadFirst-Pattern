package cn.java.util.test;

import cn.java.util.displayelement.CurrentConditionsDisplay;
import cn.java.util.subject.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		// �½������Ĺ��̣�ָ���˱��۲��ߣ����������������������ӳ��˹۲��ߣ�����
		// ����ӵĹ����У�observable�Ӳ�����г�ȡ��֪�ˡ����۲��ߡ�
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
//		weatherData.registerObserver(currentDisplay);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 67, 36.4f);
		weatherData.setMeasurements(78, 64, 31.4f);

	}

}
