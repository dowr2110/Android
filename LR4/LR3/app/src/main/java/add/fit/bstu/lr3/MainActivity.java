 package add.fit.bstu.lr3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.List;

 public class MainActivity extends AppCompatActivity {

     private List<Player> users ;

     String[] countries;
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
        Intent intent=new Intent(this, Spisok2.class );
        startActivity(intent);
    }

     public void spisok2(View view)
     {
         users = JSONHelper.importFromJSON(this);

         countries = new String[users.size()];
         for (Player user:users)
         {
             countries[users.indexOf(user)]=user.name;

             //countries[1]="user2.name";
         };

         Intent intent=new Intent(this, Spisok2.class );
         intent.putExtra("countries", countries);
         startActivity(intent);
     }

}