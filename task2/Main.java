/*
 * Задача 2.  
 * Создать класс Payment с внутренним классом, 
 * с помощью объектов которого можно сформировать покупку из нескольких товаров. 
 */
package by.epam.basics_of_oop.task2;

public class Main {
    
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
