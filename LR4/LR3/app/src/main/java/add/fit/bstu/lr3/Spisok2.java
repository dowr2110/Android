package add.fit.bstu.lr3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Spisok2 extends AppCompatActivity {

    private List<Player> users ;

    String[] countries;
    String o;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spisok2);

        Intent intent=getIntent();
        countries =intent.getStringArrayExtra("countries");

//     users = JSONHelper.importFromJSON(this);
//        countries= users.toArray(countries);
//
//       users.forEach((Player user) -> {
//           countries[users.indexOf(user)]=user.name;
//       });



//        if(users!=null){
//            adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, users);
//            listView.setAdapter(adapter);
//            Toast.makeText(this, "Данные восстановлены", Toast.LENGTH_LONG).show();
//        }
//        else{
//            Toast.makeText(this, "Не удалось открыть данные", Toast.LENGTH_LONG).show();
//        }


        // получаем элемент TextView
        TextView selection = findViewById(R.id.selection);
        // получаем элемент ListView
        ListView countriesList = findViewById(R.id.countriesList);
        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, countries);
        // устанавливаем для списка адаптер
        countriesList.setAdapter(adapter);
        // добавляем для списка слушатель
        countriesList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
//                // по позиции получаем выбранный элемент
//                String selectedItem = countries[position];
//                // установка текста элемента TextView
//                selection.setText(selectedItem);
                toAddPage(v, position);
            }
        });

    }
    public void toAddPage(View view, int v)
    {
        Intent intent = new Intent(this, Spisok.class);
        o=Integer.toString(v);
        intent.putExtra("index",o);
        startActivity(intent);
    }



}