package add.fit.bstu.lr3;

import androidx.annotation.NonNull;

public class Player {
    private String name;
    private String prozvishe;
    private String noga;
    private String career;
    private String position;
    private String vosrost;
    private String rost;
    private String ves;
    private String nation;

    private String date;
    private String lastcomand;



    Player(String name, String prozvishe, String noga, String career, String position, String vosrost,String rost, String ves, String nation){
        this.name = name;
        this.prozvishe = prozvishe;
        this.noga=noga;
        this.career=career;
        this.position=position;
        this.vosrost=vosrost;
        this.rost=rost;
        this.ves=ves;
        this.nation=nation;
    }

    Player(String name, String prozvishe, String noga, String career, String position, String vosrost,String rost, String ves, String nation, String date, String lastcomand){
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
                "последняя лига где игрок играл : " + lastcomand ;
    }
}
