package SwitchClasses;

import com.sun.org.apache.xpath.internal.axes.ReverseAxesWalker;

import javax.sound.sampled.ReverbType;

public class WeekDays {
    public static void main(String[] args) {
        WeekDays ob = new WeekDays();
        ob.sevenDays("6");
        ob.sevenDays("2");
        ob.sevenDays("1");
        ob.sevenDays("8");
    }
    public static void sevenDays(String Daynames) {
        switch (Daynames) {
            case "1": System.out.println("monday");break;
            case "2": System.out.println("tuesday");break;
            case "3": System.out.println("wednesday");break;
            case "4": System.out.println("thrusday");break;
            case"5": System.out.println("friday");break;
            case"6": System.out.println("saturday");break;
            case "7": System.out.println("sunday");break;
            default: System.out.println("Invalid days");break;
        }

    }
}