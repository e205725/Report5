public class report5 {
    public static void main(String[] args){
        String str = null ;
        try{
            str.length();
        }catch (NullPointerException e){
            System.out.println("NullPointerExceptionエラーです\n"+e.getMessage());
        }
        
    
    }

}    