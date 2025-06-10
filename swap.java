public class swap

{  

    public static void main(String[] args) {
            int n1=10;
    int n2=20;
    int temp;
       
        System.out.println("number 1: "+n1+" number 2: "+n2);
      
        temp = n1;
        n1 = n2;        
        n2 = temp;
        System.out.println("After swapping: "); 
        System.out.println("number 1: "+n1+" number 2: "+n2);

    }
}