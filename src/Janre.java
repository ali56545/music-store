public class Janre {
    String name;

    Integer quantity_music;

    public Janre(String name){
        this.name = name;
        this.quantity_music = 0;

    }


    public String toString(){
        return this.name;
    }

    public String getInfo(){
        return this.quantity_music + " musics has " + this.name;
    }




}