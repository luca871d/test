public class Main {
    public static void main(String[] args) {
        //int[] liste = {8,9,21,4,52,6,34,24,12,57,2,3,13,15};
        int[] liste = {78,117,32,101,114,32,100,117,32,115,117,112,101,114,115,101,106,32,116,105,108,32,97,116,32,97,114,98,101,106,100,101,32,109,101,100,32,97,114,114,97,121,115,33};
        int len = liste.length;
        System.out.println(len);
        System.out.println(liste[0]);
        System.out.println(liste[liste.length-1]);
        /*
        for (int num: liste){
            System.out.println(num);
        }
        */
        int sum = 0;
        for (int num: liste){
            sum += num;
        }
        System.out.println(sum);
        System.out.println(((float)sum)/((float)len));
        int big = -1;
        for (int num: liste){
            if (big == -1){
                big = num;
            }
            else if (num > big) {
                big = num;
            }
        }
        System.out.println(big);
        int small = -1;
        for (int num: liste){
            if (small == -1){
                small = num;
            }
            else if (num < small) {
                small = num;
            }
        }
        System.out.println(small);
        for (int num: liste){
            System.out.print((char)num);
        }

    }
}