public class ExceptionDemo {

    public static void main(String[] args){

        int a = 10;
        int b = 0;
        int c[] = new int[5];

        try{
            try{
                System.out.println(a/b);

                }
            catch (ArithmeticException ae)
            {
                System.out.println(ae);
            }
            System.out.println(c[7]);
        }
        catch (ArrayIndexOutOfBoundsException ae){

            System.out.println(ae);
        }

  //      catch (ArithmeticException ae){
//
   //          System.out.println(ae);
     //   }



        System.out.println("Executed...");
    }
}
