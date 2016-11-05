package utils;

import sun.plugin.com.event.COMEventHandler;

import java.io.IOException;

/**
 * Created by CHITTU on 05-Nov-16.
 */
public class CommandLine {
    public  static String  osType = System.getProperty("os.name");

    public static String[] command(String commandToExecute){
        String[] newCommand;
        System.out.println("called method");
        if(osType.contains("indows")){
            newCommand = new String[]{"cmd.exe", "/c", commandToExecute};
        }else {
            newCommand = new String[]{"/bin/sh", "-c", commandToExecute};
        }
        return newCommand;
    }


   /* public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("os.name"));
        String str="adb shell input keyevent KEYCODE_APP_SWITCH";
        String[] app_switcher = CommandLine.command(str);
        Runtime run = Runtime.getRuntime();
        Process process = run.exec(app_switcher);

    }*/
}
