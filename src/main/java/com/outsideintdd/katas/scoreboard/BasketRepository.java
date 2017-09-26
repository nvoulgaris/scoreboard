package com.outsideintdd.katas.scoreboard;

public class BasketRepository {

  private int teamAScore;

  public BasketRepository() {
    this.teamAScore = 0;
  }

  public void add1point(Team team) {
    teamAScore += 1;
  }

  public void add2points(Team team) {
    throw new UnsupportedOperationException();
  }

  public void add3points(Team team) {
    throw new UnsupportedOperationException();
  }

  public int getScore(Team team) {
    return teamAScore;
  }
}
