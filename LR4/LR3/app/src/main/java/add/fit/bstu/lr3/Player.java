package add.fit.bstu.lr3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class Player {
    public String name;
    private String prozvishe;
    private String noga;
    private String career;
    private String position;
    private String vosrost;
    private String rost;
    private String ves;
    private String nation;

    public String email;
    public String phone;
    public String socset;
    public Uri ur;

    private String date;
    private String lastcomand;




    Player(String name, String prozvishe, String noga, String career, String position, String vosrost,String rost, String ves, String nation, String email, String phone, String socset){
        this.name = name;
        this.prozvishe = prozvishe;
        this.noga=noga;
        this.career=career;
        this.position=position;
        this.vosrost=vosrost;
        this.rost=rost;
        this.ves=ves;
        this.nation=nation;
        this.email=email;
        this.phone=phone;
        this.socset= socset;
    }

    Player(String name, String prozvishe, String noga, String career, String position, String vosrost,String rost, String ves, String nation, String date, String lastcomand,String email, String phone, String socset){
        this.name = name;
        this.prozvishe = prozvishe;
        this.noga=noga;
        this.career=career;
        this.position=position;
        this.vosrost=vosrost;
        this.rost=rost;
        this.ves=ves;
        this.nation=nation;
        this.date=date;
        this.lastcomand=lastcomand;
        this.email=email;
        this.phone=phone;
        this.socset= socset;
    }


    @Override
    public String toString() {
        return "Информация об игроке :\n" +
                "Имя : " + name + "\n" +
                "Прозвище : " + prozvishe + "\n" +
                "Рабочая нога : " + noga + "\n" +
                "Опыт : " + career + "\n" +
                "Позиция : " + position + "\n" +
                "Возрост : " + vosrost + "\n" +
                "Рост : " + rost + "\n" +
                "Вес : " + ves + "\n" +
                "Национальность : " + nation+"\n"+
        "начало карьеры : " + date + "\n" +
                "почта : " + email + "\n" +
                "номер телефона : " + phone + "\n" +
                "соц сеть : " + socset + "\n" +
                "последняя лига где игрок играл : " + lastcomand ;
    }


}
