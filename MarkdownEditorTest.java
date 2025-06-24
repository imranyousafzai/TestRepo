import javax.swing.*;

public class MarkdownEditorTest {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JEditorPane editorPane = new JEditorPane();
            editorPane.setEditorKit(new MarkdownEditorKit());
            editorPane.setText("Hello **World**!\nThis is a Markdown-like editor.\n- List item 1\n- List item 2");

            JFrame frame = new JFrame("Markdown Editor Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new JScrollPane(editorPane));
            frame.setSize(400, 300);
            frame.setVisible(true);
        });
    }
}
