package ru.netology.GioevaPackage1.Services;

public class MonthOfVacationService {
    public int calculate(int income, int expenses, int threshold) {
        int MonthOfVacation = 0; // счётчик месяцев отдыха
        int balance = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (balance >= threshold) { // можем ли отдыхать?
                MonthOfVacation++; // увеличиваем счётчик месяцев отдыха
                balance = (balance - expenses) / 3;
            } else {
                balance = balance + income - expenses;
            }
        }
        return MonthOfVacation;
    }
}