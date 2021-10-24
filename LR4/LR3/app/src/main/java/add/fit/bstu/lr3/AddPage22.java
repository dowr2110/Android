package add.fit.bstu.lr3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddPage22 extends AppCompatActivity {

    String name;
    String prozvishe;
    String noga;
    String career;
    String position;
    String email;
    String phone;
    String socset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_page22);

        Intent intent=getIntent();
        name =intent.getStringExtra("imya");
        prozvishe=intent.getStringExtra("prozvishe");
        noga=intent.getStringExtra("noga");
        career=intent.getStringExtra("career");
        position=intent.getStringExtra("position");
    }

    public void toAddPage2(View view)
    {
        EditText email1 = (EditText) findViewById(R.id.editText2);
        EditText phone1 = (EditText) findViewById(R.id.editText);
        EditText socset1 = (EditText) findViewById(R.id.editText3);
         email = email1.getText().toString();
         phone=phone1.getText().toString();
         socset = socset1.getText().toString();

        Intent intent1 =new Intent(this, AddPage2.class);

        intent1.putExtra("imya", name);
        intent1.putExtra("prozvishe", prozvishe);
        intent1.putExtra("noga", noga);
        intent1.putExtra("career", career);
        intent1.putExtra("position", position);
        intent1.putExtra("email", email);
        intent1.putExtra("phone", phone);
        intent1.putExtra("socset", socset);
        startActivity(intent1);

    }
    public void toAddPage1(View view)
    {
        Intent intent=new Intent(this, AddPage1.class );
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }


}