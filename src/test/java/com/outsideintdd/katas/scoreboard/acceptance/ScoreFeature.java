package com.outsideintdd.katas.scoreboard.acceptance;

import com.outsideintdd.katas.scoreboard.BasketRepository;
import com.outsideintdd.katas.scoreboard.Console;
import com.outsideintdd.katas.scoreboard.ScoreKeeper;
import com.outsideintdd.katas.scoreboard.ScorePrinter;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class ScoreFeature {

  @Mock Console console;
  private ScoreKeeper scoreKeeper;
  private BasketRepository teamARepository;
  private ScorePrinter scorePrinter;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    teamARepository = new BasketRepository();
    scorePrinter = new ScorePrinter(console);
    scoreKeeper = new ScoreKeeper(teamARepository, scorePrinter);
  }

  @Test
  public void
  displayScore() throws Exception {
    scoreKeeper.scoreTeamA1();
    scoreKeeper.scoreTeamA2();
    scoreKeeper.scoreTeamA2();
    scoreKeeper.scoreTeamA3();
    scoreKeeper.scoreTeamA3();
    scoreKeeper.scoreTeamB1();
    scoreKeeper.scoreTeamB1();
    scoreKeeper.scoreTeamB2();
    scoreKeeper.scoreTeamB2();
    scoreKeeper.scoreTeamB2();
    scoreKeeper.scoreTeamB3();
    scoreKeeper.scoreTeamB3();
    scoreKeeper.scoreTeamB3();
    scoreKeeper.getScore();

    verify(console).printLine("011:017");
  }
}
