package add.fit.bstu.lr3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.regex.Pattern;

public class AddPage1 extends AppCompatActivity {
    String[] position = { "нападающий", "полузащитник", "защитник", "вратарь"};
    String item="нападающий";

    String name ="undefined";

    final static String nameVariableKey = "NAME_VARIABLE";
    final static String textViewTexKey = "TEXTVIEW_TEXT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_page1);

        Spinner spinner = (Spinner) findViewById(R.id.spin);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, position);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinner.setAdapter(adapter);

        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                // Получаем выбранный объект
                 item = (String)parent.getItemAtPosition(position);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
        spinner.setOnItemSelectedListener(itemSelectedListener);
    }

    public void toAddPage2(View view)
    {
        Intent intent = new Intent(this, AddPage2.class);

        EditText imya = (EditText) findViewById(R.id.editText2);
        EditText prozvishe = (EditText) findViewById(R.id.editText);
        RadioButton left=findViewById(R.id.cep);
        RadioButton right=findViewById(R.id.sag);
        CheckBox checkBox=findViewById(R.id.checkBox);
                // Получае текст данного текстового поля
        String imya1 = imya.getText().toString();
        String prozvishe1=prozvishe.getText().toString();
        // Добавляем с помощью свойства putExtra объект - первый параметр - ключ,
        // второй параметр - значение этого объекта
        if (!left.isChecked() && !right.isChecked())
        {
            showDialog();
        }
        else if (imya.getText().toString().isEmpty() || prozvishe.getText().toString().isEmpty() ){
            showDialog();
        }
        else {
            intent.putExtra("imya", imya1);
            intent.putExtra("prozvishe", prozvishe1);
            if (left.isChecked()) {
                intent.putExtra("noga", "левша");
            } else if (right.isChecked()) {
                intent.putExtra("noga", "правша");
            }

            if (checkBox.isChecked()) {
                intent.putExtra("career", "новичок");
            } else {
                intent.putExtra("career", "с опытом");
            }

            intent.putExtra("position", item);
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(intent);

        }


        //---------------------------------------------------------------------------------
        

    }

    public void toHomePage(View view)
    {
        Intent intent=new Intent(this, MainActivity.class );
        startActivity(intent);
    }


    public void showDialog() {
        CustomDialogFragment dialog = new CustomDialogFragment();
        dialog.show(getSupportFragmentManager(), "custom");
    }

 /*   @Override
    protected void onSaveInstanceState(Bundle outState) {

        outState.putString(nameVariableKey, name);
        EditText nameView = (EditText) findViewById(R.id.editText2);
        outState.putString(textViewTexKey, nameView.getText().toString());

//        EditText nameView2 = (EditText) findViewById(R.id.editText);
//        outState.putString(textViewTexKey, nameView2.getText().toString());
        super.onSaveInstanceState(outState);
    }
    // получение ранее сохраненного состояния
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        name = savedInstanceState.getString(nameVariableKey);
        String textViewText= savedInstanceState.getString(textViewTexKey);
        EditText nameView = (EditText) findViewById(R.id.editText2);
        nameView.setText(textViewText);
    }*/


}