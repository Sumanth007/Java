package InternAssi;

import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Copyright (c) 2024 Your Company. All rights reserved.
 * This file is licensed under the MIT License.
 * See the LICENSE file for details.
 */
public class CSVop {
    public static void main(String[] args) {
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
            String timeInStr = "09/13/2023 10:08 AM";
            String t = "09/14/2023 10:10 AM";
            Date timeIn = dateFormat.parse(timeInStr);
            Date tt = dateFormat.parse(t);
            long timeDifference = tt.getTime() - timeIn.getTime();
            long minutesDifference = timeDifference / (60 * 1000);
            long hrs = minutesDifference / (60);
//            System.out.println(timeDifference);
//            System.out.println(minutesDifference);

            String statingTime = "09/13/2023 10:08 AM";
            int days = Integer.parseInt(statingTime.substring(3,5));
            System.out.println(days);
            System.out.println("eh");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
