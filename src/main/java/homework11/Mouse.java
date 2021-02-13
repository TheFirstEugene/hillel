package homework11;
import lombok.*;

@Setter
@Getter
@EqualsAndHashCode
public class Mouse {
    String name;
    public int calories;

    Mouse(String name, int calories){
        this.calories = calories;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ": calories - " + calories ;
    }
}
