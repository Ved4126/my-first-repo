public class OneToN {
    public static void main(String[] args) {
        fibo(5);
    }

    static void fibo(int n){
        if(n == 0){
            return;
        }
        fibo(n-1);
        System.out.println(n);
    }
}
