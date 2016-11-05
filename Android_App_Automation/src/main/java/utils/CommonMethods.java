package utils;

import java.io.IOException;

/**
 * Created by CHITTU on 05-Nov-16.
 */
public class CommonMethods {

    public static void closeOpenedApps() throws Exception {
        System.out.println("Closing all opened apps in device ..");
        String command = "adb shell input keyevent KEYCODE_APP_SWITCH";
        String[] appSwitcher = CommandLine.command(command);
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(appSwitcher);

        String tapkeyEventCommand = "adb shell input keyevent 20";
        String[] tap_key_event = CommandLine.command(tapkeyEventCommand);
        Runtime runtime1 = Runtime.getRuntime();
        Thread.sleep(300);
        Process process1 = runtime1.exec(tapkeyEventCommand);

        

    }

    public static void main(String[] args) throws Exception {
        CommonMethods.closeOpenedApps();
    }
}
