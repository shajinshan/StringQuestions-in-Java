package Basic;

public class OddEven {
    public static void main(String[] args) {
        System.out.println(EvenOdd("22","2"));
    }

   static int EvenOdd(String n1 , String n2)
    {
        int val1 = Integer.parseInt(n1);
        int val2 = Integer.parseInt(n2);

        return val1*val2;
    }
}
