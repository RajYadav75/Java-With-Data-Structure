package NotepadProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.print.PageFormat;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Notepad  implements ActionListener {
    JFrame jf,replaceFrame,font_frame;
    JMenuBar menubar;
    JMenu file, edit,format,help;
    JMenuItem neww,open,save,saveas, exit, pageSetup, print;
    JMenuItem cut, copy, paste, replace,dateandtime;
    JMenuItem open_font_menu,font_color, textarea_color;
    JCheckBoxMenuItem word_wrap;
    JTextArea textArea;
    String title = "Untitled - Notepad";
    File filee;
    JFileChooser fileChooser;
    JTextField jt1,jt2;
    JButton jb1,ok;
    JLabel jl1,jl2;
    Color c;
    JComboBox cb_font_family,cb_font_style,cb_font_size;
    GraphicsEnvironment ge;
    public Notepad() {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e){
            System.out.println(e);
        }
         jf = new JFrame(title);
         jf.setSize(500,500);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         Image icon = Toolkit.getDefaultToolkit().getImage("");
         jf.setIconImage(icon);

         menubar = new JMenuBar();


         file = new JMenu("File");

         neww = new JMenuItem("New");
         neww.setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_DOWN_MASK));
         neww.addActionListener(this);
         file.add(neww);

         open = new JMenuItem("Open");
        open.setAccelerator(KeyStroke.getKeyStroke('O', InputEvent.CTRL_DOWN_MASK));
        open.addActionListener(this);
         file.add(open);

         save = new JMenuItem("Save");
        save.setAccelerator(KeyStroke.getKeyStroke('S', InputEvent.CTRL_DOWN_MASK));
        save.addActionListener(this);
         file.add(save);

         saveas = new JMenuItem("Save As");
        saveas.setAccelerator(KeyStroke.getKeyStroke('S', InputEvent.SHIFT_DOWN_MASK));
        saveas.addActionListener(this);
         file.add(saveas);

         file.addSeparator();
        pageSetup = new JMenuItem("Page Setup");
        pageSetup.setAccelerator(KeyStroke.getKeyStroke('P', InputEvent.CTRL_DOWN_MASK));
        pageSetup.addActionListener(this);
        file.add(pageSetup);

        print = new JMenuItem("Print");
        print.setAccelerator(KeyStroke.getKeyStroke('P', InputEvent.SHIFT_DOWN_MASK));
        print.addActionListener(this);
        file.add(print);
        file.addSeparator();

         exit = new JMenuItem("Exit");
        exit.setAccelerator(KeyStroke.getKeyStroke('E', InputEvent.CTRL_DOWN_MASK));
         exit.addActionListener(this);
         file.add(exit);
        menubar.add(file);

         edit = new JMenu("Edit");

         cut = new JMenuItem("Cut");
        cut.setAccelerator(KeyStroke.getKeyStroke('X', InputEvent.CTRL_DOWN_MASK));
         cut.addActionListener(this);
         edit.add(cut);

        copy = new JMenuItem("Copy");
        copy.setAccelerator(KeyStroke.getKeyStroke('C', InputEvent.CTRL_DOWN_MASK));
        copy.addActionListener(this);
        edit.add(copy);

        paste = new JMenuItem("Paste");
        paste.setAccelerator(KeyStroke.getKeyStroke('V', InputEvent.CTRL_DOWN_MASK));
        paste.addActionListener(this);
        edit.add(paste);

        edit.addSeparator();

        replace = new JMenuItem("Replace");
        replace.setAccelerator(KeyStroke.getKeyStroke('R', InputEvent.CTRL_DOWN_MASK));
        replace.addActionListener(this);
        edit.add(replace);

        edit.addSeparator();

        dateandtime = new JMenuItem("Date/Time");
        dateandtime.addActionListener(this);
        edit.add(dateandtime);


         menubar.add(edit);

         format = new JMenu("Format");

        word_wrap = new JCheckBoxMenuItem("Word Wrap");
        word_wrap.setAccelerator(KeyStroke.getKeyStroke('Z', InputEvent.ALT_DOWN_MASK));
        word_wrap.addActionListener(this);
        format.add(word_wrap);
        format.addSeparator();

         open_font_menu = new JMenuItem("Font..");
         open_font_menu.addActionListener(this);
         format.add(open_font_menu);
         format.addSeparator();

         font_color = new JMenuItem("Font Color");
         font_color.addActionListener(this);
         format.add(font_color);

         textarea_color = new JMenuItem("Textarea Color");
         textarea_color.addActionListener(this);
         format.add(textarea_color);
         menubar.add(format);

         help = new JMenu("Help");
         help.addActionListener(this);
         menubar.add(help);




         jf.setJMenuBar(menubar);

         textArea = new JTextArea();
         JScrollPane scrollPane = new JScrollPane(textArea);
         scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
         scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
         jf.add(scrollPane);




         jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        fileChooser = new JFileChooser();
        if (e.getSource() == neww){
            newNotepad();
        }
        if (e.getSource() == exit){
            System.exit(0);
        }
        if (e.getSource() == save){
            save();
        }
        if (e.getSource() == open){
            open();
        }
        if (e.getSource() == saveas){
            saveAs();
        }
        if (e.getSource() == pageSetup){
            pagesetup();
        }
        if (e.getSource() == print){
            printPage();
        }
        if (e.getSource() == cut){
            textArea.cut();
        }
        if (e.getSource() == copy){
            textArea.copy();
        }
        if (e.getSource() == paste){
            textArea.paste();
        }
        if (e.getSource() == replace){
            replaceFrame();
        }
        if (e.getSource() == jb1){
            replace();
        }
        if (e.getSource() == dateandtime){
            setDateandTime();
        }
        if (e.getSource() == font_color){
            setFontColor();
        }
        if (e.getSource() == textarea_color){
            setTextareaColor();
        }
        if (e.getSource() == open_font_menu){
            openfontframe();
        }
        if (e.getSource() == ok){
            setFontToNotepad();
        }
        if(e.getSource() == word_wrap){
            boolean b = word_wrap.getState();
            textArea.setLineWrap(b);
        }
    }
    public  void newNotepad(){
        String text = textArea.getText();
        if (!text.equals("")){
            int i = JOptionPane.showConfirmDialog(jf,"Do you want to save this file ?");
//            System.out.println(i);
            if (i == 0){
                saveAs();
                if (!jf.getTitle().equals(title)){
                    setTitle(title);
                    textArea.setText("");
                }
            }else if (i == 1){
                textArea.setText("");
            }
        }

    }
    public void saveAs(){

        int i = fileChooser.showSaveDialog(jf);
//        System.out.println("i "+i);
        if (i == 0){
            try{
                String text = textArea.getText();
                byte[] b = text.getBytes();
                filee = fileChooser.getSelectedFile();
                /*System.out.println(filee);
                System.out.println(filee.getName());*/
                FileOutputStream fos = new FileOutputStream(filee);
                fos.write(b);
                fos.close();

                setTitle(filee.getName());
            }catch (Exception e){
                System.out.println(e);
            }
        }else {
            JOptionPane.showMessageDialog(jf,"You didn't save the file....!","File Not Saved",JOptionPane.WARNING_MESSAGE);
        }
    }
    public void setTitle(String title){
        jf.setTitle(title);
    }
    public void open(){
        try {
           int i =  fileChooser.showOpenDialog(jf);
//            System.out.println(i);
            if (i == 0)
            {
                textArea.setText("");
                FileInputStream fis = new FileInputStream(fileChooser.getSelectedFile());
                int ii;
                while ((ii = fis.read())!= -1){
                    textArea.append(String.valueOf((char)ii));
                }
                fis.close();
                setTitle(fileChooser.getSelectedFile().getName());
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void save(){
        if (jf.getTitle().equals(title)){
            saveAs();
        }else {
            try{
                String text = textArea.getText();
                byte[] b = text.getBytes();
                FileOutputStream fos = new FileOutputStream(filee);
                fos.write(b);
                fos.close();
            }catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public void printPage(){
        PrinterJob pj = PrinterJob.getPrinterJob();
        if (pj.printDialog()){
            try{
                pj.print();
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
    public void pagesetup(){
        PrinterJob pj = PrinterJob.getPrinterJob();
        PageFormat pf = pj.pageDialog(pj.defaultPage());
    }
    public void replaceFrame(){
         replaceFrame = new JFrame("Replace");
        replaceFrame.setSize(500,300);
        replaceFrame.setLayout(null);

         jl1 = new JLabel("Find What : ");
        jl1.setBounds(50,50,100,40);
        replaceFrame.add(jl1);

         jt1 = new JTextField();
        jt1.setBounds(180,50,200,40);
        replaceFrame.add(jt1);

         jl2 = new JLabel("Replace With : ");
        jl2.setBounds(50,100,100,40);
        replaceFrame.add(jl2);

         jt2 = new JTextField();
        jt2.setBounds(180,100,200,40);
        replaceFrame.add(jt2);

         jb1 = new JButton("Replace");
        jb1.addActionListener(this);
        jb1.setBounds(200,150,100,40);
        replaceFrame.add(jb1);



        replaceFrame.setVisible(true);
    }

    public void replace(){
        String find_what = jt1.getText();
        String replace_with = jt2.getText();

        String text = textArea.getText();
        String new_text = text.replace(find_what,replace_with);
        textArea.setText(new_text);
        replaceFrame.setVisible(false);
    }
    public void setDateandTime(){
        LocalDateTime ldt = LocalDateTime.now();
        String dateTime = ldt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
//        System.out.println(dateTime);
        textArea.append(dateTime);
    }
    public void setFontColor(){
       c = JColorChooser.showDialog(jf,"Select Font Color", Color.BLACK);
        textArea.setForeground(c);
    }
    public void setTextareaColor(){
        c = JColorChooser.showDialog(jf,"Select Text area Color", Color.WHITE);
        textArea.setBackground(c);
    }
    public void openfontframe(){
        font_frame = new JFrame("Fonts..");
        font_frame.setSize(650,400);
        font_frame.setLayout(null);

        ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] font_families = ge.getAvailableFontFamilyNames();
        cb_font_family= new JComboBox(font_families);
        cb_font_family.setBounds(50,50,200,40);
        font_frame.add(cb_font_family);


        String[] font_style = {"Plain","Bold","Italic"};

        cb_font_style = new JComboBox(font_style);
        cb_font_style.setBounds(300,50,100,40);
        font_frame.add(cb_font_style);

        Integer[] font_size = {10,16,20,25,30,35,40,45,47,50,60};
        cb_font_size = new JComboBox(font_size);
        cb_font_size.setBounds(450,50,80,40);
        font_frame.add(cb_font_size);

        ok = new JButton("OK");
        ok.setBounds(250,150,80,50);
        ok.addActionListener(this);
        font_frame.add(ok);

        font_frame.setVisible(true);
    }
    public void setFontToNotepad(){
        String fontfamily = (String) cb_font_family.getSelectedItem();
        Integer fontsize =(Integer) cb_font_size.getSelectedItem();
        String fontstyle=(String)cb_font_style.getSelectedItem();


        int font_stylee = 0;
        if (fontstyle.equals("Plain")){
            font_stylee = Font.PLAIN;
        } else if (fontstyle.equals("Bold")) {
            font_stylee = Font.BOLD;
        } else if (fontstyle.equals("Italic")) {
            font_stylee = Font.ITALIC;
        }

        Font f = new Font(fontfamily,font_stylee,fontsize);
        textArea.setFont(f);
        font_frame.setVisible(false);
    }
}
