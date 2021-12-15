//demonstration of use of the constructor in java

class Constructor{
   int b;
    public  Constructor(){//default constructors
      int a=10;
      System.out.println("the value of a"+a );
      
    }
    public Constructor(int b){//parameterized
      this.b=b;
      System.out.println("the value of b"+b );
    }
    public static void main(String[] args){
        Constructor constructor=new Constructor();//object for default
        Constructor constructor1=new Constructor(10);//object for parameter
    }
}