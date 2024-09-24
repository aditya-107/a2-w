package androidsamples.java.dicegames;

import java.util.Random;

import kotlin.UninitializedPropertyAccessException;

/**
 * An implementation of a six-faced {@link Die} using {@link Random}.
 */
public class Die6 implements Die {

  public int faceValue = -1;
  private Random randomGenerator = null;

  public Die6() {
    randomGenerator = new Random();
  }

  @Override
  public void roll() {
    faceValue = randomGenerator.nextInt(6) + 1;
  }

  @Override
  public int value() {
    if (faceValue == -1) {
      throw new UninitializedPropertyAccessException();
    }
    return faceValue;
  }
}