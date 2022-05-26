package com.kodilla.kodillagoodpatterns.food2door;

public class FoodInformationService implements InformationService {

    public void getInformationAboutOrder(Order order) {
        System.out.println("We are getting infomation about your order: \n" +
                "Producer: " + order.getProducer().getName() + "\n" +
                "Product: " + order.getProduct().getKindOfProduct() + "\n" +
                "Amount: " + order.getProduct().getAmountOfProduct());
    }


    public boolean isOrderComplited(Order order) {
        if (!order.getProducer().equals(true) && !order.getProduct().equals(true)) {
            System.out.println("Your order is complited");
            return true;
        } else {
            System.out.println("Your order was rejected!");
            return false;
        }
    }
}
