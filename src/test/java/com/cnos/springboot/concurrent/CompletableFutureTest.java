package com.cnos.springboot.concurrent;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest {
    public static void main(String[] args) {
        CompletableFuture<String> orderAirplane = CompletableFuture.supplyAsync(() -> {
            return "航班订单";
        });
        CompletableFuture<String> orderHotel = CompletableFuture.supplyAsync(() -> {
            return "酒店订单";
        });

        CompletableFuture<String> hireCar = orderHotel.thenCombine(orderAirplane, (air, hotel) -> {
            System.out.println("1" + air);
            System.out.println("2" + hotel);
            return "出租车业务";
        });

        System.out.println("3.------------");
        System.out.println("3." + hireCar.join());
        System.out.println("3.------------");
    }
}
