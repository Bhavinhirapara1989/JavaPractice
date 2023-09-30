package lectureElevan;

public class ExceptionHandling {

    public static void main(String[] args) {

        String names [] = {"Amit","Bhavin","Piyush"};
                         // 0        1         2

        try {
            System.out.println(names[3]);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Out code is move on");
        }
        System.out.println(names[2]);
        System.out.println(names[1]);
    }
}
