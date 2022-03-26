package Variables;

public class     TypesOfVariables {

    int a=4; // global or instance variable
    static int b=7; //static

    public static void main(String[] args) {
        int c=5;

        System.out.println(b);

        TypesOfVariables typesOfVariables=new TypesOfVariables();
        System.out.println(typesOfVariables.a);
        typesOfVariables.sum();


    }

    public void sum(){
        int d=8;//local
        System.out.println("this is my user methos");
        System.out.println(b);
        System.out.println(a);

    }

}
