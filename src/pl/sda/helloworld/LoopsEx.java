package pl.sda.helloworld;

public class LoopsEx {

    public static void main(String[] args) {
//        for1(20);
        for2(20);
    }

    static void for1(int n) {

        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i).append(".\t");
            for (int j = 0; j < i; j++) {
                sb.append("*");
            }
            System.out.println(sb.toString());
        }
    }

    static void for2(int n) {

        for (int i = 1; i <= n+1; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i).append(".\t");
            for (int j = 1; j <= n; j++) {
                if(j < i) {
                    sb.append("*");
                } else {
                    sb.append(j);
                }
//                sb.append(j >= i ? j : "*");
                sb.append("\t");
            }
            System.out.println(sb.toString());
        }
    }
}
