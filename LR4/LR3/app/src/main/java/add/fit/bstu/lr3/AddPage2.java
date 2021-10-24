package add.fit.bstu.lr3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;



public class AddPage2 extends AppCompatActivity {

    String[] nation = { "беларус", "русский", "туркмен", "поляк","испанец"};
    String item;

    String name;
    String prozvishe;
    String noga;
    String career;
    String position;

    String email;
    String phone;
    String socset;

    String vosrost="16";
    String rost="65";
    String ves="165";

    Uri uri;

    private ImageView imageView;
    private final int Pick_image = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_page2);

        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        TextView textView = (TextView) findViewById(R.id.seekBarValue);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                textView.setText(String.valueOf(progress));
                vosrost=String.valueOf(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //---------------------------------------------------------------------
        SeekBar seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
        TextView textView2 = (TextView) findViewById(R.id.seekBarValue2);
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                textView2.setText(String.valueOf(progress));
                rost=String.valueOf(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //-------------------------------------------------------------------------
        SeekBar seekBar3 = (SeekBar) findViewById(R.id.seekBar3);
        TextView textView3= (TextView) findViewById(R.id.seekBarValue3);
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                textView3.setText(String.valueOf(progress));
                ves=String.valueOf(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //-------------------------------------------------------------
        Spinner spinner = (Spinner) findViewById(R.id.spin2);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, nation);
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

        //----------------------------------------------------------------
        Intent intent=getIntent();
         name =intent.getStringExtra("imya");
         prozvishe=intent.getStringExtra("prozvishe");
         noga=intent.getStringExtra("noga");
         career=intent.getStringExtra("career");
         position=intent.getStringExtra("position");

         email=intent.getStringExtra("email");
        phone=intent.getStringExtra("phone");
        socset=intent.getStringExtra("socset");

        Button bt=findViewById(R.id.button4);
        if (career.equals("новичок")) {
            bt.setText("Завершить");
            bt.setBackgroundColor(Color.parseColor("#143855"));
        }

        //-------------------------------------------------------------------------

        //Связываемся с нашим ImageView:
        imageView = (ImageView)findViewById(R.id.imageView);


    }

    public void toAddPage3(View view)
    {
        Intent intent1=new Intent(this,Finish.class);
        Intent intent2=new Intent(this,AddPage3.class);
        if (career.equals("новичок")) {
            intent1.putExtra("vozrost", vosrost);
            intent1.putExtra("rost", rost);
            intent1.putExtra("ves", ves);
            intent1.putExtra("nation", item);
            intent1.putExtra("name", name);
            intent1.putExtra("prozvishe", prozvishe);
            intent1.putExtra("noga", noga);
            intent1.putExtra("career", career);
            intent1.putExtra("position", position);
            intent1.putExtra("email", email);
            intent1.putExtra("phone", phone);
            intent1.putExtra("socset", socset);
            intent1.putExtra("urifoto", uri);

            //---------------------------------------------

            //------------------------------------------
            intent1.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(intent1);
        }
        else
        {
            intent2.putExtra("vozrost", vosrost);
            intent2.putExtra("rost", rost);
            intent2.putExtra("ves", ves);
            intent2.putExtra("nation", item);
            intent2.putExtra("name", name);
            intent2.putExtra("prozvishe", prozvishe);
            intent2.putExtra("noga", noga);
            intent2.putExtra("career", career);
            intent2.putExtra("position", position);
            intent2.putExtra("email", email);
            intent2.putExtra("phone", phone);
            intent2.putExtra("socset", socset);
            intent2.putExtra("urifoto", uri);

            intent2.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(intent2);
        }

    }

    public void toAddPage22(View view)
    {
        Intent intent=new Intent(this, AddPage22.class );
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }

    public void downlaod(View view){
        Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
        //Тип получаемых объектов - image:
        photoPickerIntent.setType("image/*");
        //Запускаем переход с ожиданием обратного результата в виде информации об изображении:
        startActivityForResult(photoPickerIntent, Pick_image);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent imageReturnedIntent) {
        super.onActivityResult(requestCode, resultCode, imageReturnedIntent);

        switch (requestCode) {
            case Pick_image:
                if (resultCode == RESULT_OK) {
                    try {

                        //Получаем URI изображения, преобразуем его в Bitmap
                        //объект и отображаем в элементе ImageView нашего интерфейса:
                        final Uri imageUri = imageReturnedIntent.getData();
                        final InputStream imageStream = getContentResolver().openInputStream(imageUri);
                        final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                        imageView.setImageBitmap(selectedImage);
                        uri=imageReturnedIntent.getData();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
        }
    }


}