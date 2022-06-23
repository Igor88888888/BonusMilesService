public class BonusMilesService {
    public int calculate(int cost) {


        int bonus = 20;          // значение 1 мили
        int mile = cost / bonus; // формула рассчета миль

        return mile;
    }



}
