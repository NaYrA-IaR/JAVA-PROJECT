
public class startclient {

    public startclient(String s) {
               try{
                    System.out.println("Hello " + s);        	        
                        Client c = new Client(s);   
                        Thread t1 = new Thread(c);
                        t1.start();
       }catch(Exception e){
           e.printStackTrace();
       }    
    }
}