public class clearbit {

    public static void main(String[] args) {
        int n = 5; 
        int position = 2;
        int bitMask = 1<<position;
        int notBitMask = ~(bitMask & n);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
    
}
