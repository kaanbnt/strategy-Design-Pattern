package com.uniyaz.strategy;

/**
 * TikiTakaStrategy
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
public class TikiTakaStrategy implements FootballTactics {
    @Override
    public EnumTactics getFirstStrategy() {
        return EnumTactics.TIKI_TAKA;
    }

    @Override
    public EnumTactics getSecondStrategy() {
        return EnumTactics.TIKI_TAKA;
    }

    @Override
    public EnumTactics getThirdStrategy() {
        return EnumTactics.DEFENSIVE;
    }
}
