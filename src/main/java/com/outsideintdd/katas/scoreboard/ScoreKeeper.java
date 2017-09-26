package com.outsideintdd.katas.scoreboard;

public class ScoreKeeper {

  private BasketRepository basketRepository;
  private ScorePrinter scorePrinter;

  public ScoreKeeper(BasketRepository basketRepository, ScorePrinter scorePrinter) {
    this.basketRepository = basketRepository;
    this.scorePrinter = scorePrinter;
  }

  public void scoreTeamA1() {
    basketRepository.add1point(Team.A);
  }

  public void scoreTeamA2() {
    basketRepository.add2points(Team.A);
  }

  public void scoreTeamA3() {
    basketRepository.add3points(Team.A);
  }

  public void scoreTeamB1() {
    basketRepository.add1point(Team.B);
  }

  public void scoreTeamB2() {
    basketRepository.add2points(Team.B);
  }

  public void scoreTeamB3() {
    basketRepository.add3points(Team.B);
  }

  public void getScore() {
    int teamAScore = basketRepository.getScore(Team.A);
    int teamBScore = basketRepository.getScore(Team.B);
    scorePrinter.print(teamAScore, teamBScore);
  }
}
