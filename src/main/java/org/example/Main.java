package org.example;
import jdepend.xmlui.JDepend;

//import jdepend.swingui.JDepend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        JDepend depend =new JDepend(new PrintWriter("reports/report.xml"));
        depend.addDirectory("T:\\Library-Assistant");
        depend.analyze();
        System.out.println("DONE");
        }
    }
