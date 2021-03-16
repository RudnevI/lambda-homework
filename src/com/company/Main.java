package com.company;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

	    Converter converter = (moneyAmount, ratio) -> moneyAmount * ratio;

	    LOGGER.info("Сумма в текущей валюте: ");
        double moneyAmount = Double.parseDouble(INPUT.nextLine());
        LOGGER.info("Отношение текущей валюты к целевой: ");
        double ratio = Double.parseDouble(INPUT.nextLine());
        double result = converter.convert(moneyAmount, ratio);


        String message = String.format("Результат: %.2f", result);
        LOGGER.info(message);

    }
}
