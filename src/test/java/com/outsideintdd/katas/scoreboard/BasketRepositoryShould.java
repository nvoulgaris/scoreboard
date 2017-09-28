package com.outsideintdd.katas.scoreboard;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BasketRepositoryShould {

  private BasketRepository basketRepository;

  @Before
  public void setUp() throws Exception {
    basketRepository = new BasketRepository();
  }

  @Test public void
  increaseTeamAScoreBy1p_whenAdding1p() throws Exception {
    basketRepository.add1point(Team.A);
    int teamAScore = basketRepository.getScore(Team.A);
    assertThat(teamAScore).isEqualTo(1);
  }

  @Test public void
  increaseTeamBScoreBy2p_whenAdding2p() throws Exception {
    basketRepository.add2points(Team.B);
    int teamBScore = basketRepository.getScore(Team.B);
    assertThat(teamBScore).isEqualTo(2);
  }

  @Test public void
  increaseTeamScoreBy3p_whenAdding3p() throws Exception {
    basketRepository.add3points(Team.A);
    int teamScore = basketRepository.getScore(Team.A);
    assertThat(teamScore).isEqualTo(3);
  }
}