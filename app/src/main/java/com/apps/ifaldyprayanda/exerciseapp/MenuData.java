package com.apps.ifaldyprayanda.exerciseapp;

import android.view.Menu;

import java.util.ArrayList;

public class MenuData {

    public static String[][] menu = new String[][]
            {
                    {"Breakfast Menu 1", "Choco Breakfast Meal", Integer.toString(R.drawable.breakfast2), "475 Kkal", "- Oatmeal 150gr campur Susu Milo (200 Kkal)" +"\n"+
                                                                                                                      "- 1.5 buah Pisang (125 Kkal)" +"\n"+
                                                                                                                      "- 2 butir telur ceplok (150 Kkal)"},
                    {"Breakfast Menu 2", "Simple Breakfast Meal, ", Integer.toString(R.drawable.breakfast1), "480 Kkal", "- Cream Crackers 5 keping (240 Kkal)" +"\n"+
                                                                                                                         "- 1 buah jeruk (70 Kkal)" +"\n"+
                                                                                                                         "- 1 butir telur ceplok (90 Kkal)" +"\n"+
                                                                                                                         "- 2 butir kecil bakso rebus (80 Kkal)" +"\n"+
                                                                                                                         "- 1 cangkir kopi hitam tanpa gula (0 Kkal)"},
                    {"Breakfast Menu 3", "Busy Situation Breakfast Meal", Integer.toString(R.drawable.breakfast3), "490 Kkal", "- Cream Crackers 5 keping (240 Kkal)" +"\n"+
                                                                                                                               "- 100 gr buah jambu biji dan pepaya (100 Kkal)" +"\n"+
                                                                                                                               "- 2 buah telur ceplok (150 Kkal)"},
                    {"Lunch Menu 1", "Meal Prep Lunch", Integer.toString(R.drawable.lunch2), "580 Kkal", "- Nasi putih 150gr (225 Kkal)" +"\n"+
                                                                                                         "- 1 potong ikan bakar (145 Kkal)" +"\n"+
                                                                                                         "- 2 buah tahu goreng (100 Kkal)" +"\n"+
                                                                                                         "- 200gr sayur rebus (100 Kkal)"},
                    {"Lunch Menu 2", "Energizer Complex Carbohidrat Lunch", Integer.toString(R.drawable.lunch1), "520 Kkal", "- Nasi merah 180gr (200 Kkal)" +"\n"+
                                                                                                                             "- 1.5 potong ikan bakar (150 Kkal)" +"\n"+
                                                                                                                             "- 1 buah tahu bacem (70 Kkal)" +"\n"+
                                                                                                                             "- 250gr sayur rebus (100 Kkal)"},
                    {"Lunch Menu 3",  "Busy Situation Lunch", Integer.toString(R.drawable.lunch3), "560 Kkal", "- Nasi putih 150gr (250 Kkal) " +"\n"+
                                                                                                               "- 150 ge potong ayam goreng (180 Kkal) " +"\n"+
                                                                                                               "- 150 gr sayur asem (130 Kkal) "},
                    {"Snack Menu 1", "Holiday Pancake Snacks", Integer.toString(R.drawable.snack1), "530 KKal", "- Oatmeal 150gr (200 Kkal) " +"\n"+
                                                                                                                "- 1.5 buah pisang (125 Kkal) " +"\n"+
                                                                                                                "- 1.5 sdm margarin (75 Kkal) " +"\n" +
                                                                                                                "- 2 butir telur (130 Kkal) "},
                    {"Snack Menu 2", "Simple Afternoon Snacks", Integer.toString(R.drawable.snack3), "500 Kkal", "- Cream Crackers 5 Keping (240 Kkal)" +"\n"+
                                                                                                                 "- 150 gr Pepaya (110 Kkal) " +"\n"+
                                                                                                                 "- 2 butir telur ceplok (150 Kkal) "},
                    {"Snack Menu 3", "Healthy Morning Snacks", Integer.toString(R.drawable.snack2), "400 Kkal", "- Oatmeal 80gr (110 Kkal) " +"\n"+
                                                                                                                "- 200 gr semangka (150 Kkal)" +"\n"+
                                                                                                                "- 2 butir telur dadar (140 Kkal) "},
                    {"Dinner Menu 1", "High Fiber Dinner Meal", Integer.toString(R.drawable.dinner1), "510 Kkal", "- 150gr Jagung Rebus (180 Kkal)" +"\n"+
                                                                                                                  "- 250gr sayur rebus (120 Kkal)" +"\n"+
                                                                                                                  "- 1 butir telur  (70 Kkal)" +"\n"+
                                                                                                                  "- 150gr tahu rebus (140 Kkal"},
                    {"Dinner Menu 2", "Low Fat Dinner Meal", Integer.toString(R.drawable.dinner2), "530 Kkal", "- 150gr Kentang rebus (200 Kkal) " +"\n"+
                                                                                                               "- 1.5 potong ikan bakar (150 Kkal)" +"\n"+
                                                                                                               "- 250gr tahu rebus (180 Kkal)"},
                    {"Dinner Menu 3", "Simple Dinner Meal", Integer.toString(R.drawable.dinner3), "500 Kkal", "- 1 potong roti bun (150 Kkal)" +"\n"+
                                                                                                              "- 200gr tempe rebus (200 Kkal)" +"\n"+
                                                                                                              "- 1 butir telur dadar (70 Kkal)" +"\n"+
                                                                                                              "- 120 gr buah jambu biji dan jeruk (80 Kkal) "},
            };

    public static ArrayList<MenuDiet> getListData()
    {
        ArrayList<MenuDiet> list = new ArrayList<>();
        for (String[] mData : menu)
        {
            MenuDiet menu = new MenuDiet();
            menu.setMenuTitle(mData[0]);
            menu.setMenuName(mData[1]);
            menu.setMenuPhoto(Integer.parseInt(mData[2]));
            menu.setMenuKal(mData[3]);
            menu.setMenuDesc(mData[4]);
            list.add(menu);
        }
        return list;
    }


}
