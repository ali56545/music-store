public class Main {

    public static void main(String[] args) {
//
        Janre pop = new Janre("POP");
        Author EdSheeran = new Author("ED","Sheeran");
        Author BruceMatters = new Author("Bruce","Matters");
        Author CleanBandits = new Author("Clean Bandit","Clean Bandit");
        Author Davis = new Author("Davis","Davis");
        Author Daniel = new Author("Daniel","Daniel");
        Author Akbar = new Author("Akbar","Akbar");
        Music symphony = new Music("Shape of you", EdSheeran, pop,
                "https://www.youtube.com/watch?v=JGwWNGJdvx8", 263, 40);
        Music rock = new Music("Mockinbird", BruceMatters, pop,
                "https://www.youtube.com/watch?v=S9bCLPwzSC0", 257, 20);
        Music byp = new Music("byp",CleanBandits, pop,
                "https://www.youtube.com/watch?v=SA7AIQw-7Ms", 256, 55);
        Music classic = new Music("One Of The Girls", Davis,pop,
                "https://www.youtube.com/watch?v=f1r0XZLNlGQ",244, 60);
        Music porp = new Music("Swim", Daniel, pop,
                "https://www.youtube.com/watch?v=mC9v5FaLt84", 239, 40);
        Music nyu = new Music(" International Love", Akbar, pop,
                "https://www.youtube.com/watch?v=CdXesX6mYUE", 248, 50);


        User Ryan = new User("Ryan Gosling", "POP", 500);
        User Ali = new User("Evgeniev Ali", "Rap", 120);
        Ali.buyMusic(symphony,2);
        Ryan.buyMusic(classic,2);


//        Ryan.getBalance();
//        Ryan.buyMusic(night_call);
//        Ryan.buyMusic(real_hero);
//        Ryan.buyMusic(night_call);
//        Ryan.buyMusic(real_hero);
//        Ryan.buyMusic(let_it_happen);
        Ryan.buyMusic(byp, 5);
//        Ryan.getBalance();
        Ryan.getPlaylist();

//        Ali.getBalance();
//        Ali.buyMusic(symphony);
//        Ali.buyMusic(night_call);
//        Ali.buyMusic(my_love);
//        Ali.buyMusic(my_love);
//        Ali.buyMusic(my_love);
        Ali.cashIn(700);
        Ali.buyMusic(byp, 0);
        Ali.buyMusic(byp, -1);
        Ali.buyMusic(byp, 3);
//        Ali.buyMusic(subeme);
//        Ali.buyMusic(real_hero);
//        Ali.getBalance();
        Ali.getPlaylist();

        Ryan.listenMusic(porp);
        Ryan.listenMusic(classic);
        Ryan.listenMusic(byp);
        Ryan.listenMusic(byp);
        Ryan.listenMusic(byp);
        Ryan.listenMusic(byp);

        Ali.listenMusic(byp);
        Ali.listenMusic(byp);
        Ali.listenMusic(byp);

        byp.getDownloads();
        byp.getViews();
        byp.getRate();

      byp.openVideo();

    }

}
