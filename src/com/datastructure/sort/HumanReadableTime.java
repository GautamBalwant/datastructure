package com.datastructure.sort;

public class HumanReadableTime {


//        public static String makeReadable(int seconds) {
//
//            int divider= 3600;
//            StringBuilder builder = new StringBuilder();
//            int counter=3;
//
//            while(counter > 0){
//                if(seconds >= divider){
//                  int  time = seconds/divider;
//                  seconds= seconds%divider;
//                    builder.append( String.format("%02d", time));
//                }else {
//                    builder.append("00");
//                }
//                if(counter>1){
//                    builder.append(":");
//                }
//                divider = divider/60;
//                counter--;
//            }
//
//
//
//
//
//            // Do something
//            return builder.toString();
//        }

    public static String makeReadable(int seconds) {


        StringBuilder builder = new StringBuilder();

        int hour = getTime(seconds,3600);
        int minutes = getTime(hour,60);
        int second = getTime(minutes,60);

        builder.append(String.format("%02d", hour))
                .append(":")
                .append(String.format("%02d", minutes))
                .append(":")
                .append(String.format("%02d", second));
        // Do something
        return builder.toString();
    }

    private static int getTime(int time, int divider){
        if(time>=divider){
            return time/divider;
        }

        return 0;
    }

    private static int getReminder(int time, int divider) {
        if(time>=divider){
            return time%divider;
        }
        return time;
    }

    public static void main(String args[]) {
       //String result= makeReadable(86399);
       //System.out.println(result);


    }
}
