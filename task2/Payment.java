/*
Задача 2.  
Создать класс Payment с внутренним классом, 
с помощью объектов которого можно сформировать покупку из нескольких товаров. 
*/

package by.epam.basics_of_opp;

public class Payment {
    
    int price = 0;
    Customer customer;
    
    Product apple = new Product(150);
    Product pear = new Product(180);
    Product orange = new Product(210);
    Product lemon  = new Product(250);
    Product garnet = new Product(230);
    
    public Payment(Customer customer)
    {
        this.customer = new Customer(customer.getCustomerName());
    }
    
    public void buyApple()
    {
        price += apple.getPrice();
        System.out.println(customer.getCustomerName() + " brought an apple " + apple.getPrice() + "$");
    }
    
    public void buyPear()
    {
        price += pear.getPrice();
        System.out.println(customer.getCustomerName() + " brought a pear " + pear.getPrice() + "$");
    }
    
    public void buyOrange()
    {
        price += orange.getPrice();
        System.out.println(customer.getCustomerName() + " brought an orange " + orange.getPrice() + "$");
    }
    
    public void buyLemon()
    {
        price += lemon.getPrice();
        System.out.println(customer.getCustomerName() + " brought a lemon " + lemon.getPrice() + "$");
    }
    
    public void buyGarnet()
    {
        price += garnet.getPrice();
        System.out.println(customer.getCustomerName() + " brought a garnet " + garnet.getPrice() + "$");
    }
    
    public void getTotalSum()
    {
        System.out.println(customer.getCustomerName() + ": total sum payment = " + price + "$");
    }
    
    class Product {
        
        private int price;
        
        public Product(int price)
        {
            this.price = price;
        }
        
        public int getPrice()
        {
            return price;
        }
        
    }
    
}
