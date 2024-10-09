package YouTubeChannel.iinterviews;

public class FizzBuzz {
    public byte[] fizzbuzztest(int value) {
        StringBuilder builder = new StringBuilder();

        if (value % 3 == 0) builder.append("fizz");
        if (value % 5 == 0) builder.append("buzz");

        if (builder.isEmpty())
            throw new IllegalArgumentException("Illegal argument");

        return builder.toString().getBytes();
    }
}
