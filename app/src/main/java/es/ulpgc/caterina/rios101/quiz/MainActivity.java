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

        questionText.setText("En el Palacio del Versalles, en París, viven varios animales. Tradicionalmente, siempre hay un cerdo llamado Napoleon");
        answerText.setText("");
    }

    public void onTrueButtonClicked(View v){
        if(questionText.getText().equals("En el Palacio del Versalles, en París, viven varios animales. Tradicionalmente, siempre hay un cerdo llamado Napoleon")){
            answerText.setText("Incorrecto!");
        }else if (questionText.getText().equals("El animal nacional de Escocia es un unicornio")) {
            answerText.setText("Correcto!");
        }
        falseButton.setEnabled(false);
        trueButton.setEnabled(false);

    }

    public void onFalseButtonClicked(View v) {
        if (questionText.getText().equals("En el Palacio del Versalles, en París, viven varios animales. Tradicionalmente, siempre hay un cerdo llamado Napoleon")) {
            answerText.setText("Correcto!");
        }else if (questionText.getText().equals("El animal nacional de Escocia es un unicornio")) {
            answerText.setText("Incorrecto!");
        }
        falseButton.setEnabled(false);
        trueButton.setEnabled(false);
    }


    public void onNextButtonClicked(View view) {
        if(!answerText.getText().equals("")){
            answerText.setText("");
            questionText.setText("El animal nacional de Escocia es un unicornio");
        }
        falseButton.setEnabled(true);
        trueButton.setEnabled(true);
        nextButton.setEnabled(false);

    }
}
