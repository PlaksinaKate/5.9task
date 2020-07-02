package com.company;

import com.company.utils.SwingUtils;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;

import static java.awt.Frame.MAXIMIZED_BOTH;

public class Main {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.ROOT);
        //SwingUtils.setLookAndFeelByName("Windows");
        //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtils.setDefaultFont("Microsoft Sans Serif", 20);

        EventQueue.invokeLater(() -> {
            try {
                JFrame mainFrame = new JFrame();
                mainFrame.setVisible(true);
                mainFrame.setExtendedState(MAXIMIZED_BOTH);
            } catch (Exception ex) {
                SwingUtils.showErrorMessageBox(ex);
            }
        });
    }
}
