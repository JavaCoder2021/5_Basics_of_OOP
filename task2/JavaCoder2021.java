package javacoder2021;

import by.epam.basics_of_opp.*;

public class JavaCoder2021 {

    public static void main(String[] args) {
        
        Customer andrew = new Customer("Andrew");
        Customer peter  = new Customer("Peter"); 
             
        Payment andrewPayment = new Payment(andrew);
        Payment peterPayment = new Payment(peter);
        
        andrewPayment.buyApple();
        andrewPayment.buyGarnet();
        andrewPayment.buyLemon();
        andrewPayment.buyLemon();
        andrewPayment.getTotalSum();
        
        System.out.println("-------------------------------");
        
        peterPayment.buyOrange();
        peterPayment.buyOrange();
        peterPayment.buyPear();
        peterPayment.buyPear();
        peterPayment.getTotalSum();
      
    }
    
}