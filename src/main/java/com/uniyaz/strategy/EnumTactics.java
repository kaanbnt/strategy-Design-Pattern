package com.uniyaz.strategy;

/**
 * EnumTactics
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
public enum EnumTactics {
    TIKI_TAKA("Tiki Taka Taktikği"),
    ATTACK("Atak Taktik"),
    DEFENSIVE("Defansif taktik");

    private String tactics;

    EnumTactics(String tactics) {
        this.tactics = tactics;
    }


}
