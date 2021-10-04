package add.fit.bstu.lr2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMalo(View view) {

        RadioButton mujskoyy = findViewById(R.id.mujskoy);
        RadioButton jenskiyy = findViewById(R.id.jenskiy);

        // Получаем текстовое поле в текущей Activity
        EditText ves = (EditText) findViewById(R.id.editText2);
        EditText rost = (EditText) findViewById(R.id.editText);
        EditText vozrost = (EditText) findViewById(R.id.editText3);

        boolean result=false;
        boolean result2=false;
        boolean result3=false;
        //Pattern pattern=Pattern.compile("[0-9]+.[0-9]+");
        Pattern pattern=Pattern.compile("[\\d]+[.]?[\\d]*");
        result=pattern.matcher(ves.getText().toString()).matches();
        result2=pattern.matcher(rost.getText().toString()).matches();
        result3=pattern.matcher(vozrost.getText().toString()).matches();
         if (mujskoyy.isChecked())
        {
            if (result&&result2&&result3)
            {
                Double sum= (66.4730+(13.7516* Double.parseDouble(ves.getText().toString()))+(5.0033 *
                        Double.parseDouble(rost.getText().toString()))+(6.7550 *Double.parseDouble(vozrost.getText().toString())))*1.2;

                String message="Уровень метаболизма: "+sum.toString();
                TextView messageText = (TextView) findViewById(R.id.textView7);
                // устанавливаем текст для TextView
                messageText.setText(message);
            }
            else {
                String message="что-то не так с вводом данных";
                TextView messageText = (TextView) findViewById(R.id.textView7);
                // устанавливаем текст для TextView
                messageText.setText(message);
            }
        }
        else if (jenskiyy.isChecked())
        {
            if (result&&result2&&result3) {
                Double sum = (655.0955 + (9.5634 * Double.parseDouble(ves.getText().toString())) + (1.8496 *
                        Double.parseDouble(rost.getText().toString())) + (4.6756 * Double.parseDouble(vozrost.getText().toString()))) * 1.2;

                String message = "Уровень метаболизма: " + sum.toString();
                TextView messageText = (TextView) findViewById(R.id.textView7);
                // устанавливаем текст для TextView
                messageText.setText(message);
            }
            else {
                String message="что-то не так с вводом данных";
                TextView messageText = (TextView) findViewById(R.id.textView7);
                // устанавливаем текст для TextView
                messageText.setText(message);
            }
        }
        else {
            String message="не выбран пол ";
            TextView messageText = (TextView) findViewById(R.id.textView7);
            // устанавливаем текст для TextView
            messageText.setText(message);
        }
    }

    public void sendNormal(View view) {

        RadioButton mujskoyy = findViewById(R.id.mujskoy);
        RadioButton jenskiyy = findViewById(R.id.jenskiy);

        // Получаем текстовое поле в текущей Activity
        EditText ves = (EditText) findViewById(R.id.editText2);
        EditText rost = (EditText) findViewById(R.id.editText);
        EditText vozrost = (EditText) findViewById(R.id.editText3);
        boolean result=false;
        boolean result2=false;
        boolean result3=false;
        //Pattern pattern=Pattern.compile("[0-9]+.[0-9]+");
        Pattern pattern=Pattern.compile("[\\d]+[.]?[\\d]*");
        result=pattern.matcher(ves.getText().toString()).matches();
        result2=pattern.matcher(rost.getText().toString()).matches();
        result3=pattern.matcher(vozrost.getText().toString()).matches();
        if (mujskoyy.isChecked())
        {
            if (result&&result2&&result3) {
                Double sum = (66.4730 + (13.7516 * Double.parseDouble(ves.getText().toString())) + (5.0033 *
                        Double.parseDouble(rost.getText().toString())) + (6.7550 * Double.parseDouble(vozrost.getText().toString()))) * 1.55;

                String message = "Уровень метаболизма: " + sum.toString();
                TextView messageText = (TextView) findViewById(R.id.textView7);
                // устанавливаем текст для TextView
                messageText.setText(message);
            }
            else {
                String message="что-то не так с вводом данных";
                TextView messageText = (TextView) findViewById(R.id.textView7);
                // устанавливаем текст для TextView
                messageText.setText(message);
            }
        }
        else if (jenskiyy.isChecked())
        {
            if (result&&result2&&result3) {
                Double sum = (655.0955 + (9.5634 * Double.parseDouble(ves.getText().toString())) + (1.8496 *
                        Double.parseDouble(rost.getText().toString())) + (4.6756 * Double.parseDouble(vozrost.getText().toString()))) * 1.55;

                String message = "Уровень метаболизма: " + sum.toString();
                TextView messageText = (TextView) findViewById(R.id.textView7);
                // устанавливаем текст для TextView
                messageText.setText(message);
            }
            else {
                String message="что-то не так с вводом данных";
                TextView messageText = (TextView) findViewById(R.id.textView7);
                // устанавливаем текст для TextView
                messageText.setText(message);
            }
        }
        else {
            String message="не выбран пол ";
            TextView messageText = (TextView) findViewById(R.id.textView7);
            // устанавливаем текст для TextView
            messageText.setText(message);
        }


    }

    public void sendMnogo(View view) {

        RadioButton mujskoyy = findViewById(R.id.mujskoy);
        RadioButton jenskiyy = findViewById(R.id.jenskiy);

        // Получаем текстовое поле в текущей Activity
        EditText ves = (EditText) findViewById(R.id.editText2);
        EditText rost = (EditText) findViewById(R.id.editText);
        EditText vozrost = (EditText) findViewById(R.id.editText3);
        boolean result=false;
        boolean result2=false;
        boolean result3=false;
        //Pattern pattern=Pattern.compile("[0-9]+.[0-9]+");
        Pattern pattern=Pattern.compile("[\\d]+[.]?[\\d]*");
        result=pattern.matcher(ves.getText().toString()).matches();
        result2=pattern.matcher(rost.getText().toString()).matches();
        result3=pattern.matcher(vozrost.getText().toString()).matches();
        if (mujskoyy.isChecked())
        {
            if (result&&result2&&result3) {
                Double sum = (66.4730 + (13.7516 * Double.parseDouble(ves.getText().toString())) + (5.0033 *
                        Double.parseDouble(rost.getText().toString())) + (6.7550 * Double.parseDouble(vozrost.getText().toString()))) * 1.9;

                String message = "Уровень метаболизма: " + sum.toString();
                TextView messageText = (TextView) findViewById(R.id.textView7);
                // устанавливаем текст для TextView
                messageText.setText(message);
            }
            else {
                String message="что-то не так с вводом данных";
                TextView messageText = (TextView) findViewById(R.id.textView7);
                // устанавливаем текст для TextView
                messageText.setText(message);
            }
        }
        else if (jenskiyy.isChecked())
        {
            if (result&&result2&&result3) {
                Double sum = (655.0955 + (9.5634 * Double.parseDouble(ves.getText().toString())) + (1.8496 *
                        Double.parseDouble(rost.getText().toString())) + (4.6756 * Double.parseDouble(vozrost.getText().toString()))) * 1.9;

                String message = "Уровень метаболизма: " + sum.toString();
                TextView messageText = (TextView) findViewById(R.id.textView7);
                // устанавливаем текст для TextView
                messageText.setText(message);
            }
            else {
                String message="что-то не так с вводом данных";
                TextView messageText = (TextView) findViewById(R.id.textView7);
                // устанавливаем текст для TextView
                messageText.setText(message);
            }
        }
        else {
            String message="не выбран пол ";
            TextView messageText = (TextView) findViewById(R.id.textView7);
            // устанавливаем текст для TextView
            messageText.setText(message);
        }


    }

}