package com.uniyaz.strategy;

/**
 * FootballTactics
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
public interface FootballTactics {
    EnumTactics getFirstStrategy();
    EnumTactics getSecondStrategy();
    EnumTactics getThirdStrategy();
}
