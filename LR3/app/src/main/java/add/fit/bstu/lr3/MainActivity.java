 package add.fit.bstu.lr3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toAddPage(View view)
    {
        Intent intent = new Intent(this, AddPage1.class);
        startActivity(intent);
    }

    public void toSpisokPage(View view)
    {
        Intent intent=new Intent(this, Spisok.class );
        startActivity(intent);
    }

}