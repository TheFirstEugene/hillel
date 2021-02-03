package HW9.lombok;
import lombok.Getter;

public enum Genge {
    DYSTOPIAN("Dystopian"), FAIRY_TALE("Fairy tale"), ROMANCE("Romance"), CLASSIC("Classic");
    @Getter
    String genge;

    Genge(String s) {
        this.genge = s;
    }
}