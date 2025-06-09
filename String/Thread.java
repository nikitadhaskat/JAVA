package StringCLasses;

class Test implements Runnable { 

public void run() 
    { 
        System.out.println("Run"); 
    } 
} class Myclass { 

public static void main(String[] args) 
    { 
        Test t = new Test(); 
        t.start(); 
        System.out.println("Main"); 
     } 
}
