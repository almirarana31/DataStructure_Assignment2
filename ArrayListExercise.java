import java.util.ArrayList;
public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Purple");
        colors.add("Pink");
        colors.add("Yellow");
        for (String i : colors) {
            System.out.println(i);
        }
        colors.add(2, "Green");
        colors.remove(1);
        System.out.println("Original array: " + colors);

        System.out.println(searchColor(colors, "Pink"));
        System.out.println("Array with duplicates removed: "+ removeDuplicates(colors));
    }
    public static String searchColor(ArrayList<String> colorList, String searchTerm) {
        int index = colorList.indexOf(searchTerm);
        if (index != -1) {
            return ("The color "+ searchTerm + " found at position " + (index + 1));
        }
        else {
            return ("The color "+ searchTerm  +" not found");
        }

    }
    public static ArrayList<String> removeDuplicates(ArrayList<String> colorList) {
        ArrayList<String> uniqueList = new ArrayList<>();
        for (String color : colorList) {
            if (!uniqueList.contains(color)) {
                uniqueList.add(color);
            }
        }
        return uniqueList;
    }

}
