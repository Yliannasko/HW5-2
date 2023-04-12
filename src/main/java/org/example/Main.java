public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long bonus = service.calculate(1_000, true);
        System.out.println(bonus);

        long bonus2 = service.calculate(1_000_000, true);
        System.out.println(bonus2);

        long bonus3 = service.calculate(16_666, true);
        System.out.println(bonus3);

        long bonus4 = service.calculate(16_667, true);
        System.out.println(bonus4);

        long bonus5 = service.calculate(16_668, true);
        System.out.println(bonus5);

        long bonus6 = service.calculate(50_000, false);
        System.out.println(bonus6);

        long bonus7 = service.calculate(50_001, false);
        System.out.println(bonus7);
    }
}