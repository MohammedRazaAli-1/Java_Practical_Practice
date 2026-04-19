
// Problem 
// 1.Define class car with suitable attributes and member function
//  and overload consturctors for intialisation of data members
//   and display all details.


class Car {
    String car_name;
    String car_brand;
    double car_price;
    String car_type;
    int seat_capacity;

// default constructor :
Car(){
    car_name ="unknown";
    car_brand = "unknown";
    car_price= 0.00;
    car_type = "unknown";
    seat_capacity = 0;
}

// 3 argument given :
Car(String n , String b , double p){
    car_name = n;
    car_brand = b;
    car_price = p;
    car_type = "unknown";
    seat_capacity = 0;
}

Car(String n , String b , double p , String t , int c){
    car_name = n;
    car_brand = b;
    car_price = p;
    car_type = t;
    seat_capacity = c;
}
void Display(){
    System.out.println("Car 1 Details");
    System.out.println("car name : " + car_name);
    System.out.println("car brand :" + car_brand);
    System.out.println("car price :" + car_price);
    System.out.println("car type : " + car_type);
    System.out.println("seating capacity" + seat_capacity);
    System.out.println("------------------------");
}

// Main Method
 public static void main( String[] args){
    
    Car  c1= new Car();
    Car c2 = new Car("swift" , "maruti suzuki " , 600000.00);
    Car c3 = new Car("fortuner" , "toyota" , 6500000.00 , "XUV" , 6);

    c1.Display();
    c2.Display();
    c3.Display();
}
}