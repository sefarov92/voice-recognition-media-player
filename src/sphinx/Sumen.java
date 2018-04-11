package sphinx;



import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.*;
import javax.swing.JFrame;



public class Sumen {

    public static void main(String[] args) {
        ConfigurationManager cm;

        if (args.length > 0) {
            cm = new ConfigurationManager(args[0]);
        } else {
            cm = new ConfigurationManager(Sumen.class.getResource("Sumen.config.xml"));
        }

        Recognizer recognizer = (Recognizer) cm.lookup("recognizer");
        recognizer.allocate();

        
        Microphone microphone = (Microphone) cm.lookup("microphone");
        if (!microphone.startRecording()) {
            System.out.println("Cannot start microphone.");
            recognizer.deallocate();
            System.exit(1);
        }

        System.out.println("Say: (media up | media down | volume up | volume down | play | pause | stop | enter | click;");

        
        while (true) {
            System.out.println("Speak.\n");

            
            Result result = recognizer.recognize();
            String resultText = result.getBestResultNoFiller();
            
            if (result != null) {
                
                System.out.println("You said: " + resultText + '\n');
            }
            if (resultText.equalsIgnoreCase("media up")) {
				try {
					Process p;
					p = Runtime.getRuntime().exec(
							"cmd /c start wmplayer.exe");
					
				} catch (Exception ae) {}
				

			}
			if (resultText.equalsIgnoreCase("media down")) {
				try {
					Process p;
					p = Runtime.getRuntime().exec(
							"cmd /c taskkill /im wmplayer.exe /f");
					
					
				} catch (Exception ae) {}
			}
            if (resultText.equalsIgnoreCase("play")) {

				try {

					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_P);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyRelease(KeyEvent.VK_P);
					

					System.out.println("You said: " + resultText
							+ '\n');

				} catch (Exception e) {}
			}
            if (resultText.equalsIgnoreCase("pause")) {

				try {

					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_P);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyRelease(KeyEvent.VK_P);
					

					System.out.println("You said: " + resultText
							+ '\n');

				} catch (Exception e) {}
			}
            if (resultText.equalsIgnoreCase("stop" )){

				try {

					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_S);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyRelease(KeyEvent.VK_S);
					

					System.out.println("You said: " + resultText
							+ '\n');

				} catch (Exception e) {
				}
			}
			
			if (resultText.equalsIgnoreCase("volume up")) {

				try {

					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_F9);
					robot.keyPress(KeyEvent.VK_F9);
					robot.keyPress(KeyEvent.VK_F9);
					robot.keyRelease(KeyEvent.VK_F9);
					robot.keyRelease(KeyEvent.VK_F9);
					robot.keyRelease(KeyEvent.VK_F9);

					robot.delay(1000);

					System.out.println("You said: " + resultText
							+ '\n');

				} catch (Exception e) {}
			}
			if (resultText.equalsIgnoreCase("volume down")) {

				try {

					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_F8);
					robot.keyPress(KeyEvent.VK_F8);
					robot.keyPress(KeyEvent.VK_F8);
					robot.keyRelease(KeyEvent.VK_F8);
					robot.keyRelease(KeyEvent.VK_F8);
					robot.keyRelease(KeyEvent.VK_F8);

					robot.delay(1000);

					System.out.println("You said: " + resultText
							+ '\n');

				} catch (Exception e) {}
			}
			if (resultText.equalsIgnoreCase("mute")) {

				try {

					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_F7);
					robot.keyRelease(KeyEvent.VK_F7);

					robot.delay(1000);

					System.out.println("You said: " + resultText
							+ '\n');

				} catch (Exception e) {}
			}
			if (resultText.equalsIgnoreCase("previous")) {

				try {

					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_B);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyRelease(KeyEvent.VK_B);

					robot.delay(1000);

					System.out.println("You said: " + resultText
							+ '\n');

				} catch (Exception e) {}
			}
			if (resultText.equalsIgnoreCase("next")) {

				try {

					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_F);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyRelease(KeyEvent.VK_F);

					robot.delay(1000);

					System.out.println("You said: " + resultText
							+ '\n');

				} catch (Exception e) {}
			}
			if (resultText.equalsIgnoreCase("next")) {

				try {

					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_B);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyRelease(KeyEvent.VK_SHIFT);
					robot.keyRelease(KeyEvent.VK_B);

					robot.delay(1000);

					System.out.println("You said: " + resultText
							+ '\n');

				} catch (Exception e) {}
			}
			if (resultText.equalsIgnoreCase("rewind")) {

				try {

					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_F);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyRelease(KeyEvent.VK_SHIFT);
					robot.keyRelease(KeyEvent.VK_F);

					robot.delay(1000);

					System.out.println("You said: " + resultText
							+ '\n');

				} catch (Exception e) {}
			}
			if (resultText.equalsIgnoreCase("fast forward")) {

				try {

					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_F);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyRelease(KeyEvent.VK_SHIFT);
					robot.keyRelease(KeyEvent.VK_F);

					robot.delay(1000);

					System.out.println("You said: " + resultText
							+ '\n');

				} catch (Exception e) {}
			}
			if (resultText.equalsIgnoreCase("Library")) {

				try {

					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_1);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyRelease(KeyEvent.VK_1);

					robot.delay(1000);

					System.out.println("You said: " + resultText
							+ '\n');

				} catch (Exception e) {}
			}
			if (resultText.equalsIgnoreCase("now playing")) {

				try {

					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_3);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyRelease(KeyEvent.VK_3);

					robot.delay(1000);

					System.out.println("You said: " + resultText
							+ '\n');

				} catch (Exception e) {}
			}
			if (resultText.equalsIgnoreCase("Show Menu bar")) {

				try {

					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_M);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyRelease(KeyEvent.VK_M);

					robot.delay(1000);

					System.out.println("You said: " + resultText
							+ '\n');

				} catch (Exception e) {}
			}
			if (resultText.equalsIgnoreCase("Open media")) {

				try {

					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_O);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyRelease(KeyEvent.VK_O);

					robot.delay(1000);

					System.out.println("You said: " + resultText
							+ '\n');

				} catch (Exception e) {}
			}
			if (resultText.equalsIgnoreCase("shuffle")) {

				try {

					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_H);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyRelease(KeyEvent.VK_H);

					robot.delay(1000);

					System.out.println("You said: " + resultText
							+ '\n');

				} catch (Exception e) {}
			}
			if (resultText.equalsIgnoreCase("repeat")) {

				try {

					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_T);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.keyRelease(KeyEvent.VK_T);

					robot.delay(1000);

					System.out.println("You said: " + resultText
							+ '\n');

				} catch (Exception e) {}
			}
			if (resultText.equalsIgnoreCase("full screen")) {

				try {

					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_ALT);
					robot.keyPress(KeyEvent.VK_ENTER);
					robot.keyRelease(KeyEvent.VK_ALT);
					robot.keyRelease(KeyEvent.VK_ENTER);

					robot.delay(1000);

					System.out.println("You said: " + resultText
							+ '\n');

				} catch (Exception e) {}
			}


			if (resultText.equalsIgnoreCase("enter")) {
				
				try {
					PointerInfo a = MouseInfo.getPointerInfo();
					Point b = a.getLocation();
					int x = (int)b.getX();
					int y = (int)b.getY();
					Robot robot = new Robot();

					

			        
			        robot.mouseMove(x, y-50);
			        robot.mousePress(InputEvent.BUTTON1_MASK);
			        robot.mouseRelease(InputEvent.BUTTON1_MASK);
			        

				} catch (Exception e) {}
			}
			if (resultText.equalsIgnoreCase("one")) {
				
				System.out.println("You said: " + resultText + '\n');
			}
			if (resultText.equalsIgnoreCase("two")) {
				
				System.out.println("You said: " + resultText + '\n');
			}
			if (resultText.equalsIgnoreCase("three")) {
				
				System.out.println("You said: " + resultText + '\n');
			}
        }
    }
}
            
        
    

            
            
            



