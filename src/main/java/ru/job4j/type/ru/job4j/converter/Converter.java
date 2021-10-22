package ru.job4j.type.ru.job4j.converter;

public class Converter {
	public static float rubleToEuro(float value) {
		return value / 70;
	}

	public static float rubleToDollar(float value) {

		return value / 60;
	}

	public static void main(String[] args) {
		float in = 140;
		float expected = 2.33333333F;
		float out = Converter.rubleToDollar(in);
		boolean passed = expected == out;
		System.out.println(passed);
		}
	}
