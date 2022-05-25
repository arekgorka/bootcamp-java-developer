package com.kodilla.kodillagoodpatterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private SendingService sendingService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final SendingService sendingService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.sendingService = sendingService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final Order order) {
        boolean isOrdered = sendingService.send(order.getUser(), order.getProduct(), order.getDayOfOrder());
        if (isOrdered) {
            informationService.sendInformation(order.getUser());
            orderRepository.createOrder(order.getUser(),order.getProduct());
            return new OrderDto(order.getUser(), order.getProduct(), true);
        } else {
            return new OrderDto(order.getUser(), order.getProduct(), false);
        }
    }
}

/*public class RentalProcessor {

    private InformationService informationService;
    private RentalService rentalService;
    private RentalRepository rentalRepository;

    public RentalProcessor(final InformationService informationService,
                           final RentalService rentalService,
                           final RentalRepository rentalRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }

    public RentalDto process(final RentRequest rentRequest) {
        boolean isRented = rentalService.rent(rentRequest.getUser(), rentRequest.getFrom(),
                rentRequest.getTo());

        if (isRented) {
            informationService.inform(rentRequest.getUser());
            rentalRepository.createRental(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
            return new RentalDto(rentRequest.getUser(), true);
        } else {
            return new RentalDto(rentRequest.getUser(), false);
        }
    }
}*/
