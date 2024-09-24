package androidsamples.java.dicegames;

import static org.junit.Assert.assertEquals;

import android.content.Context;
import android.widget.TextView;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.junit.Rule;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import static androidx.test.espresso.Espresso.onView;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.matcher.ViewMatchers;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class WalletInstrumentedTest {

  @Rule
  public ActivityScenarioRule<WalletActivity> activityRule = new ActivityScenarioRule<>(WalletActivity.class);

  @Test
  public void useAppContext() {
    // Context of the app under test.
    Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
    assertEquals("androidsamples.java.dicegames", appContext.getPackageName());
  }

  @Test
  public void diceClickCount() {
    onView(withId(R.id.txt_tot_rolls)).check(matches(withText("Total Dice Rolls 0")));
    onView(withId(R.id.btn_die)).perform(click());
    onView(withId(R.id.btn_die)).perform(click());
    onView(withId(R.id.txt_tot_rolls)).check(matches(withText("Total Dice Rolls 2")));
    onView(withId(R.id.btn_die)).perform(click());
    onView(withId(R.id.btn_die)).perform(click());
    onView(withId(R.id.txt_tot_rolls)).check(matches(withText("Total Dice Rolls 4")));
  }

  @Test
  public void initialSingleSixesCounts() {
    onView(withId(R.id.txt_single_sixes)).check(matches(withText("Sixes Rolled 0")));
  }

  @Test
  public void initialDoublesCounts() {
    onView(withId(R.id.txt_double_sixes)).check(matches(withText("Double Sixes 0")));
    onView(withId(R.id.txt_double_others)).check(matches(withText("Double Others 0")));
  }

  @Test
  public void initialCoinCount() {
    onView(withId(R.id.txt_coins)).check(matches(withText("Coins 0")));
  }

}