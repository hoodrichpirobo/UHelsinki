package FlightControl;

import FlightControl.logic.*;
import FlightControl.ui.*;
import java.util.*;

public class Main {
    static java.util.Scanner in;

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        in = new java.util.Scanner(System.in);
        
        FlightControl fc = new FlightControl();
        TextUI ui = new TextUI(fc, in);
        ui.start();
    }
}
