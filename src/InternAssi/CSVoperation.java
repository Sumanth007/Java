package InternAssi;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Copyright (c) 2024 Your Company. All rights reserved.
 * This file is licensed under the MIT License.
 * See the LICENSE file for details.
 */
public class CSVoperation {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("C:/Users/suman/Downloads/Assignment_Timecard.xlsx - Sheet1.csv"));

        int consecutivedays = 1;
        String curEmpId = "";
        int curDay = -1;
        HashSet<String> empId = new HashSet<>();
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();
        ArrayList<Integer> cosecDays = new ArrayList<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            String[] columns = line.split(",");

            String empID = columns[0].trim();
            String status = columns[1].trim();
            String startingTime = columns[2].trim();
            String timeOut = columns[3].trim();
//            String col5 = columns[4].trim();
//            String col6 = columns[5].trim();
            String col7 = columns[6].trim();
            String col8 = columns[7].trim();
            String col9 = columns[8].trim();


//            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
//
//            String timeInStr = "09/13/2023 10:08 AM";
//            String t = "09/14/2023 10:10 AM";
//
//            Date timeIn = dateFormat.parse(timeInStr);
//            Date tt = dateFormat.parse(t);
//
//            // Calculate the difference in milliseconds
//            long timeDifference = tt.getTime() - timeIn.getTime();
//
//            // Convert milliseconds to days
//            long daysDifference = timeDifference / (24 * 60 * 60 * 1000);
//            System.out.println("Time Difference in Days: " + daysDifference);
            if(startingTime.length() > 4) {
                if (curEmpId.equals("")) {
                    curEmpId = empID;
                    curDay = Integer.parseInt(startingTime.substring(3, 5));

                } else if (curEmpId.equals(empID)) {
                    int temp = Integer.parseInt(startingTime.substring(3, 5));
                    if (curDay == temp + 1) {
                        consecutivedays++;
                    }
                } else {
                    if (consecutivedays >= 7) {
                        map.put(empID, (col8 + " , " + col9));
                    }
                    cosecDays.add(consecutivedays);
                    curEmpId = empID;
                    consecutivedays = 1;
                }
            }
        }

        TreeMap<String, String> sortedMap = new TreeMap<>();
        sortedMap.putAll(map);
        int i = 0;
        for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            // Assuming you want keys to have a minimum width of 15 characters
            // and values to have a minimum width of 5 characters
                String formattedString = String.format("| Emp Id: %-15s, Emp Name: %36s , No.of.Days : %5s |", key, value, cosecDays.get(i));
                System.out.println(formattedString);

        }

        sc.close();  // Closes the scanner
    }
}
