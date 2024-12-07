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
        Music symphony = new Music("symphony", EdSheeran, pop,
                "https://www.youtube.com/watch?v=aatr_2MstrI", 246, 40);
        Music rock = new Music("subele a la radio", BruceMatters, pop,
                "https://www.youtube.com/watch?v=dczdR4laGwc", 208, 20);
        Music byp = new Music("Night call",CleanBandits, pop,
                "https://www.youtube.com/watch?v=MV_3Dpw-BRY", 256, 55);
        Music classic = new Music("Real Hero", Davis,pop,
                "https://www.youtube.com/watch?v=BHgYtKkSEDA",267, 60);
        Music porp = new Music("Let it happen", Daniel, pop,
                "https://www.youtube.com/watch?v=pFptt7Cargc", 256, 40);
        Music nyu = new Music("My Love Mine All Mine ", Akbar, pop,
                "https://www.youtube.com/watch?v=CwGbMYLjIpQ", 138, 50);


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

//        my_love.openVideo();

    }

}