package uk.co.lvs.guice.tutorial;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class HelloWorld {
    private Label label;
    private Display display;
    private Shell shell;

    public HelloWorld() {
        display = Display.getDefault();
        shell = new Shell(display);
        label = new Label(shell, SWT.NONE);
        label.setText(HttpRandomStringGetter.getInstance().getNextWord());
    }

    public void run() {
        shell.pack();
        label.pack();
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
    }

    public void dispose() {
        display.dispose();
        label.dispose();
    }

    public Label getLabel() {
        return label;
    }

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.run();
        hello.dispose();
    }
}
