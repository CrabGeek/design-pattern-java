package com.crabgeek.pattern.structual.facade;

// 秘书就如同外观角色类, Boss无须知道子系统内的各个类
public class Secretary {
    private Chauffeur chauffeur = new Chauffeur();
    private Hotel hotel = new Hotel();
    private Restaurant restaurant = new Restaurant();
    private Airport airport = new Airport();

    public void trip(String to, int days) {
        airport.bookTicket("青岛", to);
        chauffeur.drive("机场");
        hotel.reserve(days);
    }

    public void repast(int num) {
        restaurant.reserve(num);
        chauffeur.drive("酒店");
    }
}
