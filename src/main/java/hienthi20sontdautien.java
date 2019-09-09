public class hienthi20sontdautien {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; ; i++) {
                if (isPrime(i)) {
                    System.out.println(i+"\n");
                    count++;
                    if (count == 20) {
                        break;
                    }
            }
        }
    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(number);
        for (int i = 2;i <= squareRoot;i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
