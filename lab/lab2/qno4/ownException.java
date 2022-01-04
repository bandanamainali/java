class underAgeException extends Exception{
    underAgeException(){
        super("not eligible to vote");
    }
    underAgeException(String message){
     super(message);
    }
}
class ownException{
    public static void main(String[] args) throws underAgeException {
        int age =17;
        //try{
        if(age<18){
            throw new underAgeException("i cannot vote");
        }
   // }catch (underAgeException e){
       // System.out.println(e);
   // }
    }
}