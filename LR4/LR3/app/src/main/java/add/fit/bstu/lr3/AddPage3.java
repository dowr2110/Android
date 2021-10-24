package add.fit.bstu.lr3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

public class AddPage3 extends AppCompatActivity {

    String[] ligas = { "La Liga", "Premier Liga", "Bundesliga", "Liga 1","Чемпионат Беларуссии"};
    String item2;
    String date;

    String name;
    String prozvishe;
    String noga;
    String career;
    String position;

    String email;
    String phone;
    String socset;

    String vosrost;
    String rost;
    String ves;
    String nation;

    Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_page3);

        TextView dateTextView = (TextView)findViewById(R.id.dateTextView);
        DatePicker datePicker = (DatePicker)this.findViewById(R.id.datePicker);

        // Месяц начиная с нуля. Для отображения добавляем 1.
        datePicker.init(2020, 02, 01, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                // Отсчет месяцев начинается с нуля. Для отображения добавляем 1.
                dateTextView.setText( view.getDayOfMonth() + "/" + (view.getMonth() + 1) + "/" + view.getYear());
                date=view.getDayOfMonth() + "/" + (view.getMonth() + 1) + "/" + view.getYear();
                // альтернативная запись
                // dateTextView.setText("Дата: " + dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
            }
        });

        //-------------------------------------------------------
        Spinner spinner = (Spinner) findViewById(R.id.spin3);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ligas);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinner.setAdapter(adapter);

        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                // Получаем выбранный объект
                item2 = (String)parent.getItemAtPosition(position);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
        spinner.setOnItemSelectedListener(itemSelectedListener);

        //-----------------------------------------------------------
        Intent intent=getIntent();
        Bundle arguments=getIntent().getExtras();
        name =intent.getStringExtra("name");
        prozvishe=intent.getStringExtra("prozvishe");
        noga=intent.getStringExtra("noga");
        career=intent.getStringExtra("career");
        position=intent.getStringExtra("position");

        email=intent.getStringExtra("email");
        phone=intent.getStringExtra("phone");
        socset=intent.getStringExtra("socset");

        vosrost=intent.getStringExtra("vozrost");
        rost=intent.getStringExtra("rost");
        ves=intent.getStringExtra("ves");
        nation=intent.getStringExtra("nation");
        uri=(Uri)arguments.get("urifoto");

    }

    public void toAddPage2(View view)
    {
        Intent intent = new Intent(this, AddPage2.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }

    public void toFinishPage(View view)
    {
        Intent intent=new Intent(this, Finish.class );
        intent.putExtra("vozrost", vosrost);
        intent.putExtra("rost", rost);
        intent.putExtra("ves", ves);
        intent.putExtra("nation", nation);
        intent.putExtra("name", name);
        intent.putExtra("prozvishe", prozvishe);
        intent.putExtra("noga", noga);
        intent.putExtra("career", career);
        intent.putExtra("position", position);
        intent.putExtra("email", email);
        intent.putExtra("phone", phone);
        intent.putExtra("socset", socset);
        intent.putExtra("date",date);
        intent.putExtra("lastcomand",item2);
        intent.putExtra("urifoto",uri);

        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }
}