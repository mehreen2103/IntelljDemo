package in;

public class PrintRandNo {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            int rand = (int)(Math.random() * 100);
            System.out.println(rand);
        }


    }
}
