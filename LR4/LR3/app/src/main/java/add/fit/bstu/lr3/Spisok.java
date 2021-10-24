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
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class Spisok extends AppCompatActivity {

    private ArrayAdapter<Player> adapter;
    private List<Player> users;
    private List<Player> users2;
    private Player player;
    ListView listView;
    String index;
    int indexx;
    private ImageView imageView;
    Uri urii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spisok);
        listView = (ListView) findViewById(R.id.list);

        TextView text = findViewById(R.id.textView13);
        TextView text2 = findViewById(R.id.textView14);
        TextView text3 = findViewById(R.id.textView15);
        TextView text4 = findViewById(R.id.textView16);

        Intent intent=getIntent();
        index=intent.getStringExtra("index");
        indexx=Integer.parseInt(index);

        users = JSONHelper.importFromJSON(this);

        player=users.get(indexx);
        urii=Uri.parse("tel:"+player.phone);
        text.setText(player.toString());
        text2.setText(urii.toString());
        text3.setText(player.email);
        text4.setText(player.socset);

    }

    public void toHomePage(View view)
    {
        Intent intent=new Intent(this, MainActivity.class );
        startActivity(intent);
    }

    public void Tocall(View view)
    {
        Intent surf = new Intent(Intent.ACTION_DIAL, urii);
        startActivity(surf);
    }
    public void Toemail(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("plain/text");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{player.email});
        intent.putExtra(Intent.EXTRA_SUBJECT, "subject");
        intent.putExtra(Intent.EXTRA_TEXT, "mail body");
        startActivity(Intent.createChooser(intent, ""));
    }
    public void Tosocset(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(player.socset));
        startActivity(intent);

    }

}