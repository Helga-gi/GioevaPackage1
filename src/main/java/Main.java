import ru.netology.GioevaPackage1.Services.MonthOfVacationService;

public class Main {
    public static void main(String[] args) {
        MonthOfVacationService service = new MonthOfVacationService();
        System.out.println(service.calculate(100_000, 60_000, 150_000));

    }
}