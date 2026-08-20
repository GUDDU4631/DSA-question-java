public class shortestPath {
    public static float shoterPath(String str){
        int x = 0;
        int y = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='W'){
                x--;
            } else if(str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='S'){
              y++; 
            }else{
                y--;
            }
        }
        int X2= x*x;
        int Y2 = y*y;
        float result = (float)Math.sqrt(X2+Y2);
        return result;
    }
    public static void main(String agr[]){
        String str = "WNEENESENNN";
        System.out.print(shoterPath(str));
    }
}
