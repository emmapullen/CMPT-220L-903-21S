package base;

public class Main {
        static int linear ( int n, int m, int p){
            if (n == 0)
                return m;
            else if (n == 1)
                return p;
                return linear(n - 1, p, m+p);
        }
        static int head (int n){
            if (n>1){
                return head(n - 1) + head(n- 2);
            }else{
                return n;
            }
        }

//tail end:
        static int tail(int n) {
            if (n<=1)
                return n;
            return tail(n - 1) + tail(n- 2);
        }
        public static void main(String[] args){
            int n=13;
            System.out.println("Fibonacci of: "+n+"="+linear(n,0,1));
            System.out.println("Fibonacci of: "+n+"="+tail(n));
            System.out.println("Fibonacci of: "+n+"="+head(n));

        }

        }