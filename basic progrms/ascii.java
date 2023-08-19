public class ascii {
    public static void main(String[] args) {
        
        int asciilen = 256;
        

        for(int i=1;i<=asciilen;i++){
            char ascii_values = (char) i;
            System.out.println(i+ "  " +ascii_values);
        }
    }
}
