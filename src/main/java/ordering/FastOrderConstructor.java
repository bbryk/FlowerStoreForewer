package ordering;

import flowerstore.*;

import payment.PayPalPaymentStrategy;

import delivery.PostDeliveryStrategy;

public class FastOrderConstructor {


    public Order createOrder() {
        Order quickOrder = new Order();
        quickOrder.setPaymentStrategy(new PayPalPaymentStrategy());
        quickOrder.setDeliveryStrategy(new PostDeliveryStrategy());
        Flower flower = new Flower(FlowerType.CHAMOMILE);
        Item flowerPack = new FlowerPack();
        ((FlowerPack) flowerPack).addFlower(flower);

        Item flowerBucket = new FlowerBucket();
        ((FlowerBucket) flowerBucket).addFlowerPack((FlowerPack) flowerPack);
        quickOrder.addItem(flowerBucket);

        return quickOrder;
    }
}
