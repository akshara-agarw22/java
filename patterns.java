public class patterns {
    public static void main(String args[]) {
        /*
         * for(int i=1;i<=4;i++)
         * {
         * for(int j=1;j<=i;j++)
         * for(int i=1;i<=4;i++)
         * {
         * for(int j=1;j<=4-i+1;j++)
         * {System.out.print("*");
         * }
         * for(int i=1;i<=4;i++)
         * {
         * for(int j=1;j<=i;j++)
         * {
         * System.out.print(j);
         */
        char ch = 'A';

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
