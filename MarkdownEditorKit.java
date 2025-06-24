import javax.swing.text.*;

public class MarkdownEditorKit extends StyledEditorKit {

    private ViewFactory viewFactory = new MarkdownViewFactory();

    @Override
    public ViewFactory getViewFactory() {
        return viewFactory;
    }

    @Override
    public Document createDefaultDocument() {
        return new DefaultStyledDocument();
    }
}
