package utils;

import java.io.IOException;

/**
 * Created by CHITTU on 05-Nov-16.
 */
public class CommonMethods {

    public static void closeOpenedApps() throws Exception {
        System.out.println("Closing all opened apps in device ..");
        
        //open app switcher
        String command = "adb shell input keyevent KEYCODE_APP_SWITCH";
        String[] appSwitcher = CommandLine.command(command);
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(appSwitcher);
        // select the app in the app switcher
        String tapkeyEventCommand = "adb shell input keyevent 20";
        String[] tap_key_event = CommandLine.command(tapkeyEventCommand);
        Runtime runtime1 = Runtime.getRuntime();
        Thread.sleep(300);
        Process process1 = runtime1.exec(tapkeyEventCommand);
        
        //delete or remove app from screen
        String delKeyEvent = "adb shell input keyevent DEL";
        String[] del_key_event = CommandLine.command(delKeyEvent);
        Runtime runtime2 = Runtime.getRuntime();


        for (int i=0;i<=10;i++){
             //process1 = runtime1.exec(tapkeyEventCommand);
            Process process2 = runtime2.exec(del_key_event);
            Thread.sleep(2000);
        }
        

    }

    public static void main(String[] args) throws Exception {
        CommonMethods.closeOpenedApps();
    }
}
