public class TwelveDays {

    static final String[] DAYS = {"","first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
    static final String[] WORDS = {"","and a Partridge in a Pear Tree"," two Turtle Doves","three French Hens","four Calling Birds","five Gold Rings","six Geese-a-Laying","seven Swans-a-Swimming","eight Maids-a-Milking","nine Ladies Dancing","ten Lords-a-Leaping","eleven Pipers Piping","twelve Drummers Drumming"};

    private static String lines(int start, int end) {
        StringBuilder lyrics = new StringBuilder();
        for (int i = start; i <= end; i++) {
            lyrics.append("On the " + DAYS[i] + " day of Christmas my true love gave to me: ");
            for (int j = i; j > 0; j--) {
                if (i == 1) {
                    lyrics.append("a Partridge in a Pear Tree");
                    break;
                } else {
                    lyrics.append(WORDS[j]);
                    if (j != 1) {
                        lyrics.append(", ");
                    }
                }
            }
            lyrics.append(".\n");
            if(i!=end)
                lyrics.append("\n");

        }
        return lyrics.toString();
    }

    public static void main(String[] args){
        System.out.println(lines(1,12));
    }


}