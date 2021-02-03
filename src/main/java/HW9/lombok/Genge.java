package HW9.lombok;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Genge {
    DYSTOPIAN("Dystopian"), FAIRY_TALE("Fairy tale"), ROMANCE("Romance"), CLASSIC("Classic");
    @Getter
    String genge;
}
