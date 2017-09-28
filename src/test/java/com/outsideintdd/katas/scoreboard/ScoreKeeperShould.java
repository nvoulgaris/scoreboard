package com.outsideintdd.katas.scoreboard;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ScoreKeeperShould {

  @Mock BasketRepository basketRepository;
  @Mock ScorePrinter scorePrinter;
  private ScoreKeeper scoreKeeper;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    scoreKeeper = new ScoreKeeper(basketRepository, scorePrinter);
  }

  @Test public void
  storeTeamA1pBasket() throws Exception {
    scoreKeeper.scoreTeamA1();
    verify(basketRepository).add1point(Team.A);
  }

  @Test public void
  storeTeamA2pBasket() throws Exception {
    scoreKeeper.scoreTeamA2();
    verify(basketRepository).add2points(Team.A);
  }

  @Test public void
  storeTeamA3pBasket() throws Exception {
    scoreKeeper.scoreTeamA3();
    verify(basketRepository).add3points(Team.A);
  }

  @Test public void
  storeTeamB1pBasket() throws Exception {
    scoreKeeper.scoreTeamB1();
    verify(basketRepository).add1point(Team.B);
  }

  @Test public void
  storeTeamB2pBasket() throws Exception {
    scoreKeeper.scoreTeamB2();
    verify(basketRepository).add2points(Team.B);
  }

  @Test public void
  storeTeamB3pBasket() throws Exception {
    scoreKeeper.scoreTeamB3();
    verify(basketRepository).add3points(Team.B);
  }

  @Test public void
  printTheScore() throws Exception {
    int teamAScore = 0;
    int teamBScore = 1;
    when(basketRepository.getScore(Team.A)).thenReturn(teamAScore);
    when(basketRepository.getScore(Team.B)).thenReturn(teamBScore);

    scoreKeeper.getScore();

    verify(scorePrinter).print(teamAScore, teamBScore);
  }
}