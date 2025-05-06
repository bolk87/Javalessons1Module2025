package org.example.Lesson4;

public class AboutFor {
    public static void main(String[] args) {
        Track[] playlist = {
                new Track(240, "Kate Bush", "Running Up That Hill"),
                new Track(180, "Scorpions", "Wind Of Change"),
                new Track(222, "Queen", "The Show Must Go On"),
                new Track(155, "Eminem", "Lose Yourself"),
                new Track(155, "Eminem", "The Real Slim Shady"),
        };

        playlist[0].onSale = true;
        playlist[1].onSale = true;
        playlist[2].onSale = true;
        playlist[3].onSale = true;

        System.out.println("Магазин: ");
//        int i = 0;
//
//        System.out.println("Автор: " + playlist[i].author + " " + "Заголовок: " + playlist[i].title + " " + "Длительность: " + playlist[i].duration);
//
//        i++;
//
//        System.out.println("Автор: " + playlist[i].author + " " + "Заголовок: " + playlist[i].title + " " + "Длительность: " + playlist[i].duration);
//
//        i = i + 1;
//
//        System.out.println("Автор: " + playlist[i].author + " " + "Заголовок: " + playlist[i].title + " " + "Длительность: " + playlist[i].duration);
//
//        i = i + 1;
//
//        System.out.println("Автор: " + playlist[i].author + " " + "Заголовок: " + playlist[i].title + " " + "Длительность: " + playlist[i].duration);

        for (int i = 0; i < playlist.length; i = i + 1) {
            System.out.println("Автор: " + playlist[i].author + " " + "Заголовок: " + playlist[i].title + " " + "Длительность: " + playlist[i].duration);
        }

        for (Track track : playlist) {
            System.out.println("Автор: " + track.author + " " + "Заголовок: " + track.title + " " + "Длительность: " + track.duration);
        }


        int[][] strangerThings = {
                {10,9,9},
                {10,10,10,10,10},
                {8,9,5},
                {10,10,10,10,10,10,10}
        };
        for (int i = 0; i < strangerThings.length; i++) {
            System.out.println(strangerThings[i][0]);
        }
    }
}
