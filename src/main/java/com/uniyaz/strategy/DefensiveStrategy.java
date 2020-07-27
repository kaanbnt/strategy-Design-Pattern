package com.uniyaz.strategy;

/**
 * DefensiveStrategy
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
public class DefensiveStrategy implements FootballTactics {
    @Override
    public EnumTactics getFirstStrategy() {
        return EnumTactics.DEFENSIVE;
    }

    @Override
    public EnumTactics getSecondStrategy() {
        return EnumTactics.DEFENSIVE;
    }

    @Override
    public EnumTactics getThirdStrategy() {
        return EnumTactics.DEFENSIVE;
    }
}
