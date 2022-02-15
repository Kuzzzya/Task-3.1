public class BonusMilesService {
    public int calculate(int price) {
        int milisCost = 20;  // стоимость 1 мили
        int miles = price / milisCost; // За каждые потраченные 20 рублей дают 1 милю
        return miles;
    }
}
