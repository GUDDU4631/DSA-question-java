public class StringCompression443 {
    public int compress(char[] chars) {

        int write = 0;
        for (int i = 0; i < chars.length; i++) {
            int count = 1;
            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            chars[write++] = chars[i];
            if (count > 1) {
                String countString = String.valueOf(count);
                for(int j=0;j<countString.length();j++){
                    chars[write++] = countString.charAt(j);
                }
            }
        }
        return write;
    }

}
