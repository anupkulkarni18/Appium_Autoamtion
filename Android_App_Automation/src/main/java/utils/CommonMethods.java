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
        
        // Unlock screen with password
       /*     adb shell input keyevent 26/POWER // press unlock button

            adb shell input touchscreen swipe 930 880 930 380 #Swipe UP
            adb shell input text XXXX #Entering your passcode
            adb shell input keyevent 66 #Pressing Enter 
         // to press arrow button for caps lock and unlock
                adb shell input keyevent 56
                adb shell input keyevent 82 // this will unlock and ask for pin
                
                To lock the screen:

            adb shell input keyevent 82 && adb shell input keyevent 26 && adb shell input keyevent 26
            To lock the screen and turn it off
            adb shell input keyevent 82 && adb shell input keyevent 26
            To unlock the screen without pass

            adb shell input keyevent 82 && adb shell input keyevent 66
            To unlock the screen that has pass 1234
            adb shell input keyevent 82 && adb shell input text 1234 && adb shell input keyevent 66
                
       */
    }

    public static void main(String[] args) throws Exception {
        CommonMethods.closeOpenedApps();
    }
}
