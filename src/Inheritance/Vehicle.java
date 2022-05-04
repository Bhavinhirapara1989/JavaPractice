package Inheritance;

class Vehicle {
    String brand = "Toyota";// Vehicle attribute
    String modelName = "Auris";
    public void hank (){
        System.out.println("Truk");
    }

    class car extends Vehicle{
    }
    public static void main(String[] args) {

        Brand myCar = new Brand();
        myCar.hank();
        System.out.println(myCar.brand+" "+myCar.modelName);
    }
  }


