package androidsamples.java.dicegames;

import androidx.lifecycle.ViewModel;
import android.util.Log;

public class WalletViewModel extends ViewModel {

  public Die6 dice;
  private int currentRoll = 0;
  private int coinBalance = 0;
  private int previousRoll = 0;
  private int singleSixesCount = 0;
  private int totalRollsCount = 0;
  private int consecutiveSixesCount = 0;
  private int consecutiveOtherRollsCount = 0;

  public WalletViewModel() {
    dice = new Die6();
  }

  public int balance() {
    return coinBalance;
  }

  public void rollDie() {
    dice.roll();
    previousRoll = currentRoll;
    currentRoll = dice.value();

    if( previousRoll == 0){
      if( currentRoll == 6){
        singleSixesCount++;
        coinBalance = 5;
      }
    }
    else{
      if( previousRoll == 6){
        if( currentRoll == 6){
          singleSixesCount++;
          consecutiveSixesCount++;
          coinBalance += 10;
        }
      }
      else{
        if( currentRoll == 6){
          singleSixesCount++;
          coinBalance += 5;
        }
        else{
          if(currentRoll==previousRoll){
            consecutiveOtherRollsCount++;
            coinBalance += -5;
          }

        }
      }
    }
    totalRollsCount++;
  }

  public int dieValue() {
    return currentRoll;
  }

  public int singleSixes() {
    return singleSixesCount;
  }

  public int totalRolls() {
    return totalRollsCount;
  }

  public int doubleSixes() {
    return consecutiveSixesCount;
  }

  public int doubleOthers() {
    return consecutiveOtherRollsCount;
  }

  public int previousRoll() {
    return previousRoll;
  }

  @Override
  protected void onCleared() {
    super.onCleared();
    Log.d("WalletViewModel", "onCleared called");
  }
}
