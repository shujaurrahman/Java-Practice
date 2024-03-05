// public class QuadraticEqu {
//     private double coef_squ;
//     private double coef_x;
//     private double const_x;

//     // Public member functions to set (update) the data members
//     public void setCoefficients(double a, double b, double c) {
//         coef_squ = a;
//         coef_x = b;
//         const_x = c;
//     }

//     // Public member functions to get (access) the data members
//     public double getCoefficientSqu() {
//         return coef_squ;
//     }

//     public double getCoefficientX() {
//         return coef_x;
//     }

//     public double getConstant() {
//         return const_x;
//     }

//     // Public member function to display the quadratic equation
//     public void print() {
//         System.out.println(coef_squ + "x^2 + " + coef_x + "x + " + const_x);
//     }

//     // Public member function to add two quadratic equations
//     public QuadraticEqu add(QuadraticEqu equation) {
//         QuadraticEqu resultEquation = new QuadraticEqu();
//         resultEquation.coef_squ = this.coef_squ + equation.coef_squ;
//         resultEquation.coef_x = this.coef_x + equation.coef_x;
//         resultEquation.const_x = this.const_x + equation.const_x;
//         return resultEquation;
//     }

//     // Public member function to subtract two quadratic equations
//     public QuadraticEqu subtract(QuadraticEqu equation) {
//         QuadraticEqu resultEquation = new QuadraticEqu();
//         resultEquation.coef_squ = this.coef_squ - equation.coef_squ;
//         resultEquation.coef_x = this.coef_x - equation.coef_x;
//         resultEquation.const_x = this.const_x - equation.const_x;
//         return resultEquation;
//     }

//     public static void main(String[] args) {
//         // Create two objects of QuadraticEqu
//         QuadraticEqu equation1 = new QuadraticEqu();
//         QuadraticEqu equation2 = new QuadraticEqu();

//         // Set coefficients for the first equation: 2x^2 + 3x + 1
//         equation1.setCoefficients(2, 3, 1);

//         // Set coefficients for the second equation: 1x^2 - 2x + 5
//         equation2.setCoefficients(1, -2, 5);

//         // Display the equations
//         System.out.print("Equation 1: ");
//         equation1.print();

//         System.out.print("Equation 2: ");
//         equation2.print();

//         // Find and display the addition of equations
//         QuadraticEqu additionResult = equation1.add(equation2);
//         System.out.print("Addition Result: ");
//         additionResult.print();

//         // Find and display the subtraction of equations
//         QuadraticEqu subtractionResult = equation1.subtract(equation2);
//         System.out.print("Subtraction Result: ");
//         subtractionResult.print();
//     }
// }


public class QuadraticEqu {
    private int xs,x,c;

    public void setqd(int xs,int x,int c){
        this.xs=xs;
        this.x=x;
        this.c=c;
    }

    public int getxs(){
        return xs;
    }
    public int getx(){
        return x;
    }
    public int getc(){
        return c;
    }


    public void printaq(){
        System.out.println("Qaud Eq is : "+xs+"x^2"+x+"x"+c+"c");
    }

    public QuadraticEqu add(QuadraticEqu e){
        QuadraticEqu result=new QuadraticEqu();
        result.xs=this.xs+e.xs;
        result.x=this.x+e.x;
        result.c=this.c+e.c;
        return result;
    }
    public QuadraticEqu sub(QuadraticEqu e){
        QuadraticEqu result=new QuadraticEqu();
        result.xs=this.xs-e.xs;
        result.x=this.x-e.x;
        result.c=this.c-e.c;
        return result;
    }

    public static void main(String[] args) {
        QuadraticEqu e1=new QuadraticEqu();
        QuadraticEqu e2=new QuadraticEqu();
        e1.setqd(2, 3, 4);
        e1.setqd(4, 2, 1);

        e1.printaq();
        e2.printaq();

        QuadraticEqu addition=new QuadraticEqu();
        QuadraticEqu subtraction=new QuadraticEqu();

        addition=e1.add(e2);
        subtraction=e1.sub(e2);

        System.out.println("Result of addition and subraction is : ");
        addition.printaq();
        subtraction.printaq();
    }

}