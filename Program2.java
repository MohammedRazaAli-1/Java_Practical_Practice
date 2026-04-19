// 2.Write a Java Program to create abstract class shape with
//  abstract function Area() and derive class rectangle from shape
//   class and derive cuboid from rectangle class and calculate area 
//   of Cuboid object. 



abstract class Shape{
    abstract void area();

}
class Rectangle extends Shape{
    double length,breadth ;

    Rectangle(double l , double b){
        length = l;
        breadth = b;
    }
   

    void area(){
         double rect_area = length * breadth;
        System.out.println("Area of rectangle is : " + rect_area);

    }
}
class Cuboid extends Rectangle{
    double height;

    Cuboid(double l , double b , double h){
        super(l, b);
        height = h;
    }

   
    void area(){
         double calc_cuboid = 2 * (length * breadth + breadth * height + height * length);
        System.out.println("Area of cuboid is :" + calc_cuboid);
    }

}
public class Main{
public static void main(String[] args){
   Rectangle r = new Rectangle(5, 3);
r.area();

Cuboid c = new Cuboid(5, 3, 4);
c.area();
}
}