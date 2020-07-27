package com.uniyaz.strategy;

/**
 * Attack
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
public class AttackStrategy implements FootballTactics {
    @Override
    public EnumTactics getFirstStrategy() {
        return EnumTactics.ATTACK;
    }

    @Override
    public EnumTactics getSecondStrategy() {
        return EnumTactics.ATTACK;
    }

    @Override
    public EnumTactics getThirdStrategy() {
        return EnumTactics.TIKI_TAKA;
    }
}
