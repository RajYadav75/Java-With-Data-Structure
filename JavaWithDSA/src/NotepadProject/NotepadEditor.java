package NotepadProject;

/**
 * com.sun.java.swing.plaf.gtk.GTKLookAndFeel   -> Linux
 * com.sun.java.swing.plaf.motif.MotifLookAndFeel -> Linux
 * com.sun.java.swing.plaf.windows.WindowsLookAndFeel -> windows
 * UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
 */
public class NotepadEditor {
    public static void main(String[] args) {
        new Notepad();
    }
}