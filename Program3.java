// 3.Define interface Addable with add() function and implement this interface in class 
// fraction(numerator,denominator) and override  add function to add two fraction numbers display all result

interface Addable{
    void add(Fraction f1 , Fraction f2);
}

class Fraction implements Addable{
    int numerator;
    int denominator;

    Fraction(int n1 , int n2){
        numerator = n1;
        denominator = n2;

    }
    void Display(){
        System.out.println(numerator +"/"+ denominator);
    }
    public void add(Fraction f1 , Fraction f2){
        int num = (f1.numerator * f2.denominator) + (f2.numerator * f1.denominator);
        int den = f1.denominator * f2.denominator;

        System.out.println("first fraction ");
        f1.Display();

        System.out.println("Second fraction ");
        f2.Display();

        System.out.println("addition of fraction is : " + num + "/" + den);


    }
}
public class Main{
    public static void main(String[] args){
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(3,4);
        Fraction result = new Fraction(0,1);
        result.add(f1 , f2);
    }
}
