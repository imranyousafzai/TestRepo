import javax.swing.text.*;

public class MarkdownViewFactory implements ViewFactory {

    @Override
    public View create(Element elem) {
        String name = elem.getName();

        if (name != null) {
            switch (name) {
                case AbstractDocument.ContentElementName:
                    return new LabelView(elem); // Plain text
                case AbstractDocument.ParagraphElementName:
                    return new MarkdownParagraphView(elem);
                case AbstractDocument.SectionElementName:
                    return new BoxView(elem, View.Y_AXIS); // Root section
            }
        }
        return new LabelView(elem);
    }
}
