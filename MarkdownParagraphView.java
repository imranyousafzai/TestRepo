import javax.swing.text.*;
import java.awt.*;

public class MarkdownParagraphView extends BoxView {

    public MarkdownParagraphView(Element elem) {
        super(elem, View.X_AXIS);
    }

    @Override
    public void layout(int width, int height) {
        super.layout(width, height);
        System.out.println("Laying out paragraph, width: " + width + ", height: " + height);
    }

    @Override
    public float getPreferredSpan(int axis) {
        return super.getPreferredSpan(axis);
    }
}
