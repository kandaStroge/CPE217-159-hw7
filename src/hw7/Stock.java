/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw7;

/**
 *
 * @author patiw
 */
public class Stock {
    int id;
    String name;
    double currentPrice;
    public Stock(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.currentPrice = price;
    }
}
