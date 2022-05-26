package com.kodilla.kodillagoodpatterns.food2door;

public class GlutenFreeShop {

    Order order = new Order(new Producer("Gluten Free Shop"),new Product("Gluten Free Milk",1));
    private FoodInformationService informationService;

    public GlutenFreeShop(FoodInformationService informationService) {
        this.informationService = informationService;
    }

    public void processOrder() {
        informationService.getInformationAboutOrder(order);
        process(order);
        informationService.isOrderComplited(order);
    };


    public void process(Order order) {
        System.out.println("Hello, it was perfect choice! \n" +
                "Your order: " + order.getProduct().getAmountOfProduct() + "x " + order.getProduct().getKindOfProduct() +
                " from " + order.getProducer().getName() + " is on the way :)");
    }
}
