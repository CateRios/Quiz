package es.ulpgc.caterina.rios101.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView answerText;
    private TextView questionText;
    private Button trueButton, falseButton, cheatButton, nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //fijar el layout de la activity
        setContentView(R.layout.activity_main);

        //acceder a componentes del layout
        answerText = findViewById(R.id.answerText);
        questionText = findViewById(R.id.questionText);

        trueButton = findViewById(R.id.trueButton);
        falseButton = findViewById(R.id.falseButton);
        cheatButton = findViewById(R.id.cheatButton);
        nextButton = findViewById(R.id.nextButton);
    }

    public void onTrueButtonClicked(View v){
        Log.e("MainActivity", "onTrueButtonClicked()");
        answerText.setText(R.string.trueButtonLabel);
    }

    public void onFalseButtonClicked(View v){
        Log.e("MainActivity", "onFalseButtonClicked()");
        answerText.setText(R.string.falseButtonLabel);
    }
}
