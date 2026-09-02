public class friendsPairing {
    public static void removeDup(String str, int indx, StringBuilder newString, boolean[] map) {
        if (indx == str.length()){
            System.out.print(newString);
            return;
        }
        char currChar = str.charAt(indx);
        if(map[currChar - 'a'] == true) {
            removeDup(str , indx+1,newString,map);
        } else{
            map[currChar - 'a'] = true;
            removeDup(str, indx+1,newString.append(currChar),map);
        }
    }

    public static void main(String agr[]) {
        removeDup("guddu",0,new StringBuilder(),new boolean[26]);
    }
}
