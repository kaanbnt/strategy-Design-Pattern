package com.uniyaz.strategy;

/**
 * Main
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
public class Main {
    public static void main(String[] args) {
        Supporter supporter = new Supporter(EnumTeam.REAL_MADRID);
        String order = supporter.getOrder();
        System.out.println(order);
    }
}
