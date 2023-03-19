package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * This activity allows the user to roll a dice and view the result
     * on the screen.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.button);
        rollButton.setOnClickListener(v->{
            rollDice();
        });
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private void rollDice() {
        // Create new Dice oject with 6 sides and roll it
        Dice dice = new Dice(6);
        int diceRoll = dice.roll();     // Dice 1
        int diceRoll2 = dice.roll();    //Dice 2

        // Update the screen with the dice roll
        TextView resultTextView = findViewById(R.id.textView);
        TextView result2TextView = findViewById(R.id.Dice2);
        resultTextView.setText(Integer.toString(diceRoll));
        result2TextView.setText(Integer.toString(diceRoll2));
    }

}

/**
 * Class to create a Dice
 */
class Dice {
    private int numSides;

    public Dice(int numSides) {
        this.numSides = numSides;
    }

    public int roll() {
        return (int) (Math.random() * numSides) + 1;
    }
}