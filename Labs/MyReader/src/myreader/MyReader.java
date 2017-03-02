/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myreader;

import java.io.*;

import java.awt.*;

class MyReader {
    BufferedReader br;
  
    MyReader() {
        openIt(getFileName());    
    }

    MyReader(String filename) {
        openIt(filename);
    }

    void openIt (String filename) {
        try {
            br = new BufferedReader(new FileReader(filename));
        } catch (Exception e) {
            System.out.println("MyReader -- open failed!" + e);
        }
    }

    String giveMeTheNextLine() {
        try {
            return br.readLine();
        } catch (Exception e) {
            System.out.println("MyReader -- read failed!" + e);
        }
        return "";
    }

    boolean hasMoreData() {
        try {
            return br.ready();
        } catch (Exception e) {
             System.out.println("MyReader -- bad!" + e);
        }
        return false;
    }

    void close() {
        try {
            br.close();
        } catch (Exception e) {
            System.out.println("MyReader -- disaster!" + e);
        }
    }

    String getFileName() {
        FileDialog fd = new FileDialog(new Frame(), "Select Input File");
        fd.setFile("input");
        fd.show();
        return fd.getDirectory()+fd.getFile();  // return the complete path
    }
}   // MyReader class