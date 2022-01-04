// class Exception{
//     public static void main(String[] args) {
//         try{
//             int a=100, b=0,c;
//             c=a/b;
//             System.out.println(c);
//         }catch(ArithmeticException e){
//             System.out.println(e.getMessage());
            
//         }finally{
       //System.out.println("finally is executed");
//}
//     }
  
//   }
  
//for throw 
// class Exception{
//     public static void test(int age){
//         if(age<18){
//             throw new ArithmeticException("not eligible to vote");
//         }
//         System.out.println("eligible to vote");
//     }
//     public static void main(String[] args) {
//         test(20);
//     }
// }

//for throws
import java.io.IOException;
class Exception
{
	public static void main(String[] args) throws IOException
	{
	Exception exception = new Exception();
		// try {
            exception.test("abc.jp");
		// } catch (Exception e) {
			// System.out.println(e.getMessage());
		// }
	}

	public void test(String fileName) throws IOException
	{

		throw new IOException("File not found");
	}
}