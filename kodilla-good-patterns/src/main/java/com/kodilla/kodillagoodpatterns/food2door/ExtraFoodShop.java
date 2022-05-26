package com.kodilla.kodillagoodpatterns.food2door;

public class ExtraFoodShop implements Process {

    Order order = new Order(new Producer("ExtraFoodShop"),new Product("Milk Shake",4));
    private FoodInformationService informationService;

    public ExtraFoodShop(FoodInformationService informationService) {
        this.informationService = informationService;
    }

    public void processOrder() {
        informationService.getInformationAboutOrder(order);
        process(order);
        informationService.isOrderComplited(order);
    };


    public void process(Order order) {
        System.out.println("Your order: " + order.getProduct().getAmountOfProduct() +
                "x " + order.getProduct().getKindOfProduct() + " is preparing!");
    }
}
