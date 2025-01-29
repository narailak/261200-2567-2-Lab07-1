import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!" + args[0] + args[1]);

        List<String> aList = new ArrayList<>();
        for (int i = 0; i < args.length; i++)
            aList.add(args[i]);
        System.out.println(aList);
        Collections.shuffle(aList, new Random());
        System.out.println(aList);

        Set<String> hSet = new HashSet<>();
        hSet.add("OOP");
        hSet.add("GG");
        hSet.add("EZ");
        hSet.add("F");
        hSet.add("not");
        hSet.add("drop");
        hSet.add("GG");
        hSet.add("GG");
        hSet.add("GG");
        hSet.add("GG");
        hSet.remove("GG");
        System.out.println(hSet);

        SortedSet<String> sSet = new TreeSet<>();
        sSet.add("OOP");
        sSet.add("GG");
        sSet.add("EZ");
        sSet.add("F");
        sSet.add("not");
        sSet.add("drop");
        sSet.add("GG");
        sSet.add("ZZZ");
        sSet.add("123");
        sSet.add("กขค");
        System.out.println(sSet);

        Stack<String> stacko = new Stack<>();
        stacko.push("a");
        stacko.push("b");
        stacko.push("c");
        System.out.println(stacko);
        System.out.println(stacko.pop());
        System.out.println(stacko);

        Map<String, Color> favoriteColors = new HashMap<String, Color>();
        favoriteColors.put("Juliet", Color.BLUE);
        favoriteColors.put("Romeo", Color.GREEN);
        favoriteColors.put("Adam", Color.RED);
        favoriteColors.put("Eve", Color.BLUE);
        favoriteColors.put("Robert", Color.BLACK);
        favoriteColors.put("Mark", Color.WHITE);
        favoriteColors.put("Pedro", Color.YELLOW);
        favoriteColors.put("Cole", Color.BLUE);
        Set<String> keySet = favoriteColors.keySet();
        for (String keyHashMap : keySet) {
            Color value = favoriteColors.get(keyHashMap);
            System.out.println(keyHashMap + " : " + value);
        }

        Map<String, Color> favoriteColorstree = new TreeMap<String, Color>();
        favoriteColorstree.put("Juliet", Color.BLUE);
        favoriteColorstree.put("Romeo", Color.GREEN);
        favoriteColorstree.put("Adam", Color.RED);
        favoriteColorstree.put("Eve", Color.BLUE);
        favoriteColorstree.put("Robert", Color.BLACK);
        favoriteColorstree.put("Mark", Color.WHITE);
        favoriteColorstree.put("Pedro", Color.YELLOW);
        favoriteColorstree.put("Cole", Color.BLUE);

        Set<String> keytreeSet = favoriteColorstree.keySet();
        for (String key : keytreeSet) {
            Color value = favoriteColorstree.get(key);
            System.out.println(key + " : " + value);
        }

    }




}