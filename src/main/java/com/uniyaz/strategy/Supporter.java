package com.uniyaz.strategy;

/**
 * Supporter
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
public class Supporter {
    private EnumTeam team;
    private FootballTactics tactics;

    public Supporter(EnumTeam team) {
        this.team = team;

        if (team != null) {
            if (EnumTeam.REAL_MADRID.equals(team)) {
                tactics = new AttackStrategy();
            } else if (EnumTeam.MANCHESTER_CITY.equals(team)) {
                tactics = new TikiTakaStrategy();
            } else {
                tactics = new DefensiveStrategy();
            }
        } else {
            throw new NullPointerException("Takım Boş Olamaz");
        }
    }

    public String getOrder() {
        System.out.println(team + " İçin Strateji: ");

        String order = "Önce "+ tactics.getFirstStrategy() + " Futbolu Oyna \n" +
                            "Daha Sonra "+ tactics.getSecondStrategy() + " Futbolu Oyna \n" +
                                    "En Son " + tactics.getThirdStrategy() + " Futbolu oyna";

        return order;
    }
}
