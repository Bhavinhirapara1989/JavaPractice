package SwitchClasses;
public class YearSwicth {
    public static void main(String[] args) {
        YearSwicth ob = new YearSwicth();
        ob.selectMonth("march");
        ob.selectMonth("september");
        ob.selectMonth("December");
    }
    public static void selectMonth(String monthName) {
        switch (monthName) {
            case "jan": System.out.println("Aniversary");break;
            case "feb": System.out.println("komal birthday");break;
            case "march":System.out.println("Nivan birthday");break;
            case "April":System.out.println("Heer birthday");break;
            case "May": System.out.println("Anshu birthday");break;
            case "june": System.out.println("Bhavin birthday");break;
            case "july": System.out.println("kinjal  birthday");break;
            case"August": System.out.println("Alkesh birthday");break;
            case "september": System.out.println("kajal birthday");break;
            case "October":System.out.println("kiran birthday");break;
            default: System.out.println("invalid month");break;

        }
    }
}
