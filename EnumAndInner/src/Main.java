public class Main {
    public static void main(String[] args) {

        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day + " " + day.ordinal());
        }

        for (DayOfWeek day : DayOfWeek.values()) {
            switch (day) {
                case MONDAY:
                case TUESDAY:
                case WEDNESDAY:
                case THURSDAY:
                case FRIDAY:
                    System.out.println(day + " = weekday");
                    break;
                case SATURDAY:
                case SUNDAY:
                    System.out.println(day + " = WEEKEND!");
                    break;
            }
        }

        OuterClass outerClass = new OuterClass();
        outerClass.outerPrint();
    }
}