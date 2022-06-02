package OODSoloProject.Model.Model;

import java.util.Objects;

public class AudioBook extends Book{
    private int timeLengthSeconds;

    public AudioBook(int itemId, double price, String title, String author, BookGenre bookGenre, int timeLengthSeconds) {
        super(itemId, price, title, author, bookGenre);
        this.timeLengthSeconds = timeLengthSeconds;
    }

    public AudioBook() {
        super();
    }

    public int getTimeLengthSeconds() {
        return timeLengthSeconds;
    }

    public void setTimeLengthSeconds(int timeLengthSeconds) {
        this.timeLengthSeconds = timeLengthSeconds;
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "timeLengthSeconds=" + timeLengthSeconds +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AudioBook audioBook = (AudioBook) o;
        return timeLengthSeconds == audioBook.timeLengthSeconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), timeLengthSeconds);
    }
}