package InternAssi;

/**
 * Copyright (c) 2024 Your Company. All rights reserved.
 * This file is licensed under the MIT License.
 * See the LICENSE file for details.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TimecardAnalyzer {
    public static void main(String[] args) {
        try {
            // Read the CSV file
            Scanner sc = new Scanner(new File("path/to/your/file.csv"));

            // Skip the header line
            if (sc.hasNextLine()) {
                sc.nextLine();
            }

            // Initialize variables
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
            Map<String, List<TimecardEntry>> employeeTimecards = new HashMap<>();

            // Process each line in the file
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] columns = line.split(",");

                String empName = columns[7].trim();
                String positionID = columns[0].trim();
                String timeInStr = columns[2].trim();
                String timeOutStr = columns[3].trim();

                Date timeIn = dateFormat.parse(timeInStr);
                Date timeOut = dateFormat.parse(timeOutStr);

                // Create a TimecardEntry object
                TimecardEntry entry = new TimecardEntry(empName, positionID, timeIn, timeOut);

                // Add the entry to the map
                employeeTimecards.computeIfAbsent(empName, k -> new ArrayList<>()).add(entry);
            }

            // Analyze the data and print the results
            for (Map.Entry<String, List<TimecardEntry>> entry : employeeTimecards.entrySet()) {
                String empName = entry.getKey();
                List<TimecardEntry> timecards = entry.getValue();

                // a) Check for 7 consecutive days
                if (hasConsecutiveDays(timecards, 7)) {
                    System.out.println(empName + " has worked for 7 consecutive days.");
                }

                // b) Check for less than 10 hours between shifts but greater than 1 hour
                if (hasShortBreaks(timecards, 1, 10)) {
                    System.out.println(empName + " has less than 10 hours between shifts but greater than 1 hour.");
                }

                // c) Check for more than 14 hours in a single shift
                if (hasLongShifts(timecards, 14)) {
                    System.out.println(empName + " has worked for more than 14 hours in a single shift.");
                }
            }

            sc.close();
        } catch (FileNotFoundException | ParseException e) {
            e.printStackTrace();
        }
    }

    private static boolean hasConsecutiveDays(List<TimecardEntry> timecards, int consecutiveDays) {
        // Your logic to check for consecutive days
        // Return true if the condition is met, false otherwise
        return false;
    }

    private static boolean hasShortBreaks(List<TimecardEntry> timecards, int minHours, int maxHours) {
        // Your logic to check for short breaks
        // Return true if the condition is met, false otherwise
        return false;
    }

    private static boolean hasLongShifts(List<TimecardEntry> timecards, int maxHours) {
        // Your logic to check for long shifts
        // Return true if the condition is met, false otherwise
        return false;
    }

    static class TimecardEntry {
        String empName;
        String positionID;
        Date timeIn;
        Date timeOut;

        public TimecardEntry(String empName, String positionID, Date timeIn, Date timeOut) {
            this.empName = empName;
            this.positionID = positionID;
            this.timeIn = timeIn;
            this.timeOut = timeOut;
        }
    }
}
