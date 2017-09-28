package com.outsideintdd.katas.scoreboard;

public class ScorePrinter {

  private static final String DELIMITER = ":";
  private Console console;

  public ScorePrinter(Console console) {
    this.console = console;
  }

  public void print(int teamAScore, int teamBScore) {
    String aScore = String.format("%03d", teamAScore);
    String bScore = String.format("%03d", teamBScore);
    console.printLine(aScore + DELIMITER + bScore);
  }
}
