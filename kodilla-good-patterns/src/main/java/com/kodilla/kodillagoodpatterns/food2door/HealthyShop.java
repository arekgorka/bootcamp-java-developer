package com.kodilla.kodillagoodpatterns.food2door;

public class HealthyShop implements Process {

    Order order = new Order(new Producer("HealthyShop"),new Product("Dinner",12));
    private FoodInformationService informationService;

    public HealthyShop(FoodInformationService informationService) {
        this.informationService = informationService;
    }

    public void processOrder() {
        informationService.getInformationAboutOrder(order);
        process(order);
        informationService.isOrderComplited(order);
    };


    public void process(Order order) {
        System.out.println("Your food is coming to you");
    }
}
