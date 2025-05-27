package Sec6ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatingArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        ArrayList<String> list2 = new ArrayList<>(List.of("Apple", "Banana", "Cherry"));
    }
}
