public class BonusMilesService {
    public int calculate(int price) {
        int miles = price / 20;// Механизм расчета бонусных миль
        return miles;
    }
}
