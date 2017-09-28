package com.outsideintdd.katas.scoreboard;

public class BasketRepository {

  private static final int ONE_POINT = 1;
  private static final int TWO_POINTS = 2;
  private static final int THREE_POINTS = 3;

  private int teamAScore;
  private int teamBScore;

  public BasketRepository() {
    this.teamAScore = 0;
  }

  public void add1point(Team team) {
    if (team.equals(Team.A)) {
      teamAScore += ONE_POINT;
    } else if (team.equals(Team.B)) {
      teamBScore += ONE_POINT;
    }
  }

  public void add2points(Team team) {
    if (team.equals(Team.A)) {
      teamAScore += TWO_POINTS;
    } else if (team.equals(Team.B)) {
      teamBScore += TWO_POINTS;
    }
  }

  public void add3points(Team team) {
    if (team.equals(Team.A)) {
      teamAScore += THREE_POINTS;
    } else if (team.equals(Team.B)) {
      teamBScore += THREE_POINTS;
    }
  }

  public int getScore(Team team) {
    if (team.equals(Team.A)) {
      return teamAScore;
    }
    return teamBScore;
  }
}
