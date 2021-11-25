package pl.testuj.ex2_switch_statement;

public class SwitchStatement {
    public static void main(String[] args) {
        String day = null;

//        "Thursday".equals(day);
//        day.equals("Thursday");  -> wywala się jeśli day is null (NullPointerException)

        if ("Thursday".equals(day)) {
            System.out.println("Dzisiaj jest czwartek");
        } else if ("Friday".equals(day)) {
            System.out.println("Dzisiaj jest piątek");
        } else if ("Sunday".equals(day)) {
            System.out.println("Dzisiaj jest niedziela");
        } else {
            System.out.println("Inny dzień");
        }

        System.out.println("==============");

        if (day != null) {
            switch (day) {
                case "Thursday":
                    System.out.println("Dzisiaj jest czwartek");
                    break;
                case "Friday":
                    System.out.println("Dzisiaj jest piątek");
                    break;
                case "Sunday":
                    System.out.println("Dzisiaj jest niedziela");
                    break;
                default:
                    System.out.println("Inny dzień");
            }
        }
    }
}
