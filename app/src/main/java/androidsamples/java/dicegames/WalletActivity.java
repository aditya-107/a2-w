package androidsamples.java.dicegames;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class WalletActivity extends AppCompatActivity {

  private final String TAG = "WalletActivity";
  private WalletViewModel viewModel;

  // Declare UI component variables with new names from XML
  private Button btnRollDice = null;

  private TextView tvCoinBalance = null;
  private TextView tvLastRoll = null;
  private TextView tvSixesRolled = null;
  private TextView tvTotalRolls = null;
  private TextView tvDoubleSixes = null;
  private TextView tvDoubleOthers = null;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_wallet);

    viewModel = new ViewModelProvider(this).get(WalletViewModel.class);

    // Find UI components using the correct IDs from XML layout
    btnRollDice = findViewById(R.id.btn_die);
    tvCoinBalance = findViewById(R.id.txt_coins);
    tvLastRoll = findViewById(R.id.txt_prev_roll);
    tvSixesRolled = findViewById(R.id.txt_single_sixes);
    tvTotalRolls = findViewById(R.id.txt_tot_rolls);
    tvDoubleSixes = findViewById(R.id.txt_double_sixes);
    tvDoubleOthers = findViewById(R.id.txt_double_others);

    updateUI();  // Update the UI with initial values or persisted values

    btnRollDice.setOnClickListener(view -> {
      viewModel.rollDie();
      updateUI();
    });

  }

  public void updateUI() {
    btnRollDice.setText(Integer.toString(viewModel.dieValue()));
    if (viewModel.dieValue() == 6) {
      Toast.makeText(this, "Congratulations, you rolled a 6!", Toast.LENGTH_SHORT).show();
    }

    // Update the UI with the values from the ViewModel
    tvCoinBalance.setText("Coins " + viewModel.balance());
    tvLastRoll.setText("Previous Roll " + viewModel.previousRoll());
    tvSixesRolled.setText("Sixes Rolled " + viewModel.singleSixes());
    tvTotalRolls.setText("Total Dice Rolls " + viewModel.totalRolls());
    tvDoubleSixes.setText("Double Sixes " + viewModel.doubleSixes());
    tvDoubleOthers.setText("Double Others " + viewModel.doubleOthers());
  }
}