package org.example.Lesson4;

public class Lesson4 {
    public static void main(String[] args) {
//        Track track1 = new Track(240, "Kate Bush", "Running Up That Hill");
//        System.out.println(track1.author);

        String human1 = "8950326263";
        String human2 = "8954226263";
        String human3 = "8957296263";
        String human4 = "8950326263";

        String[] humans = new String[4];
        humans[0] = "8950326263";
        humans[1] = "8954226263";
        humans[2] = "8957296263";
        humans[3] = "8950326263";
        String[] humans2 = new String[]{"8950326263", "8950326263", "8950326263", "8950326263"};
        String[] humans3 = {"8950326263", "8950326263", "8950326263", "8950326263"};

        System.out.println(humans[0]);

        long[] someLongNumbers = {1242141L, 53252L, 543543L};
        float[] someFloatNumbers = new float[10];
        someFloatNumbers[5] = 125.5f;
        System.out.println(someFloatNumbers[5]);

        boolean[] isUsersOnline = {true, false, false, false};


        Track[] playlist = new Track[10];
        playlist[0] = new Track(240, "Kate Bush", "Running Up That Hill");
        playlist[1] = new Track(180, "Scorpions", "Wind Of Change");
        System.out.println(playlist[0].author);
        System.out.println(playlist[1].author);

        Track[] playlist2 = {
                new Track(240, "Kate Bush", "Running Up That Hill"),
                new Track(180, "Scorpions", "Wind Of Change"),
        };


//        int[] numbers = new int[100_000_000_0];
//        System.out.println(numbers[99]);
    }
}
