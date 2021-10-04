package add.fit.bstu.lr3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Spisok extends AppCompatActivity {

    private ArrayAdapter<Player> adapter;
    private List<Player> users;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spisok);
        listView = (ListView) findViewById(R.id.list);


        ///////////////////////////////
        users = JSONHelper.importFromJSON(this);
        if(users!=null){
            adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, users);
            listView.setAdapter(adapter);
            Toast.makeText(this, "Данные восстановлены", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "Не удалось открыть данные", Toast.LENGTH_LONG).show();
        }
    }

    public void toHomePage(View view)
    {
        Intent intent=new Intent(this, MainActivity.class );
        startActivity(intent);
    }



}