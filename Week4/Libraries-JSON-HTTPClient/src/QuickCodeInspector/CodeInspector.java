package QuickCodeInspector;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;

import com.nitido.utils.toaster.Example;

import syntaxhighlight.SyntaxHighlighter;
import syntaxhighlighter.SyntaxHighlighterParser;
import syntaxhighlighter.brush.BrushJava;
import syntaxhighlighter.theme.ThemeRDark;

public class CodeInspector {

    public static void main(String[] args) {
        
        run(args[0]);
    }

    public static void run(String path){
        
        SyntaxHighlighterParser parser = new SyntaxHighlighterParser(new BrushJava());
        SyntaxHighlighter highlighter = new SyntaxHighlighter(parser, new ThemeRDark());

        try {
            highlighter.setContent(new File(path));
          } catch (IOException ex) {
            Logger.getLogger(Example.class.getName()).log(Level.SEVERE, null, ex);
          }

          JFrame frame = new JFrame();
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setContentPane(highlighter);
          frame.setLocationByPlatform(true);
          frame.pack();
          frame.setVisible(true);
    }
}
