package add.fit.bstu.lr3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Finish extends AppCompatActivity {

    private ArrayAdapter<Player> adapter;
    private List<Player> users;
    Uri uri;
    private ImageView imageView;
    String urii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);


            //---------------------------------------------
       users = JSONHelper.importFromJSON(this);
       // users=new ArrayList<Player>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, users);
        // -------------------------------------

        Intent intent=getIntent();
        Bundle arguments=getIntent().getExtras();

        String name =intent.getStringExtra("name");
        String prozvishe=intent.getStringExtra("prozvishe");
        String noga=intent.getStringExtra("noga");
        String career=intent.getStringExtra("career");
        String position=intent.getStringExtra("position");
        String vozrost=intent.getStringExtra("vozrost");
        String rost=intent.getStringExtra("rost");
        String ves=intent.getStringExtra("ves");
        String nation=intent.getStringExtra("nation");
        String date=intent.getStringExtra("date");
        String lastcomand=intent.getStringExtra("lastcomand");

        String email=intent.getStringExtra("email");
        String phone=intent.getStringExtra("phone");
        String socset=intent.getStringExtra("socset");

        uri=(Uri) arguments.get("urifoto");

        TextView vyvod=findViewById(R.id.textView13);
        TextView vyvod2=findViewById(R.id.textView12);
        TextView vyvod3=findViewById(R.id.textView11);

        if (career.equals("новичок")) {
            vyvod.setText("Информация об игроке :\n" +
                    "Имя : " + name + "\n" +
                    "Прозвище : " + prozvishe + "\n" +
                    "Рабочая нога : " + noga + "\n" +
                    "Опыт : " + career + "\n" +
                    "Позиция : " + position + "\n" +
                    "Возрост : " + vozrost + "\n" +
                    "Рост : " + rost + "\n" +
                    "Вес : " + ves + "\n" +
                    "Национальность : " + nation);
                vyvod3.setVisibility(View.INVISIBLE);

                //-----------------------------------------
            //urii=uri.toString();
            Player user = new Player(name, prozvishe,noga,career,position,vozrost,rost,ves,nation,email, phone, socset);
            users.add(user);
            adapter.notifyDataSetChanged();

            boolean result = JSONHelper.exportToJSON(this, users);
            if(result){
                Toast.makeText(this, "Данные сохранены1", Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(this, "Не удалось сохранить данные", Toast.LENGTH_LONG).show();
            }
            //---------------------------------

            try {

                //Получаем URI изображения, преобразуем его в Bitmap
                //объект и отображаем в элементе ImageView нашего интерфейса:
                final Uri imageUri = uri;
                final InputStream imageStream = getContentResolver().openInputStream(imageUri);
                final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                imageView = (ImageView)findViewById(R.id.imageView);
                imageView.setImageBitmap(selectedImage);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        else {
            vyvod.setText("Информация об игроке :\n" +
                    "Имя : " + name + "\n" +
                    "Прозвище : " + prozvishe + "\n" +
                    "Рабочая нога : " + noga + "\n" +
                    "Опыт : " + career + "\n" +
                    "Позиция : " + position + "\n" +
                    "Возрост : " + vozrost + "\n" +
                    "Рост : " + rost + "\n" +
                    "Вес : " + ves + "\n" +
                    "Национальность : " + nation);
            vyvod2.setText(
                            "начало карьеры : " + date + "\n" +
                            "последняя лига где игрок играл : " + lastcomand );

            //-------------------------------------------

            Player user = new Player(name, prozvishe,noga,career,position,vozrost,rost,ves,nation,date,lastcomand, email, phone, socset);
            users.add(user);
            adapter.notifyDataSetChanged();

            boolean result = JSONHelper.exportToJSON(this, users);
            if(result){
                Toast.makeText(this, "Данные сохранены2", Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(this, "Не удалось сохранить данные", Toast.LENGTH_LONG).show();
            }

            //-------------------------------------
            try {
                //Получаем URI изображения, преобразуем его в Bitmap
                //объект и отображаем в элементе ImageView нашего интерфейса:
                final Uri imageUri = uri;
                final InputStream imageStream = getContentResolver().openInputStream(imageUri);
                final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                imageView = (ImageView)findViewById(R.id.imageView);
                imageView.setImageBitmap(selectedImage);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }


        //-----------------------------------



    }

    public void toHomePage(View view)
    {
        Intent intent=new Intent(this, MainActivity.class );
        startActivity(intent);
    }


}