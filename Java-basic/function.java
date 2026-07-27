// class function{
//     int sum(int a, int b){
//         return a +b;
//     }

//     public static void main(String agr[]){
//         System.out.println("asdf");
//     }
// }


// Binomial coefficient 
public class function{
    public static int fac(int Num) {
        int fac = 1;
        for(int i =1 ; i<= Num; i++){
            fac = fac * i;
        }
        return fac;
    }
    public static int binCoeff(int n, int r){
        int a = fac(n);
        int b = fac(r);
        int c = fac(n-r);
        int Binomial_coefficient = a/(b*c);
        return Binomial_coefficient;
    }
    public static void main(String sgr[]){
        System.out.print(binCoeff(5,2));
    }
}

/*
    The function is mainly 3 types 
        1. simple function 

            return_type(){
                your work
                return
            }
        2. parameter function

            return_type(int , int){
                return int
            }
        3. 
 */

/*
    The value which is define while making the function is called parameter 
    and when it called with some value that is called argument
 */
/*
    *- The functions is stored in memory as CALL STACK
    *- In call by value the actual value did not change 
    *- Call by reference change the value but in java there is no call by reference
 */