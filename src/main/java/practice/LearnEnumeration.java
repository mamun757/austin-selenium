package practice;

enum Day {
    SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;
}

public class LearnEnumeration {
    Day day;

    public LearnEnumeration(Day day){
        this.day = day;
    }

    public void DayIsLike(){
        switch (day){
            case FRIDAY:
                System.out.println("Friday is the best");
                break;
            case TUESDAY:
                System.out.println("Tuesday is normal");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend is the best");
                break;
        }
    }
}

