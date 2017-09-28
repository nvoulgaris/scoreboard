package com.outsideintdd.katas.scoreboard;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class ScorePrinterShould {

  @Mock Console console;
  private ScorePrinter scorePrinter;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    scorePrinter = new ScorePrinter(console);
  }

  @Test public void
  printAScoreDelimiterAndBScore() throws Exception {
    scorePrinter.print(7, 11);
    verify(console).printLine("007:011");
  }
}