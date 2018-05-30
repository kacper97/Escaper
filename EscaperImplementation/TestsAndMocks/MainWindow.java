import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.wb.swt.SWTResourceManager;

public class MainWindow {

	protected Shell shell;
	private Text text;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainWindow window = new MainWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(407, 553);
		shell.setText("SWT Application");
		
		Button btnLogin = new Button(shell, SWT.BORDER);
		btnLogin.setBounds(124, 344, 123, 54);
		btnLogin.setText("Login");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setText("Username");
		lblNewLabel.setBounds(35, 239, 55, 15);
		
		Label lblPassword = new Label(shell, SWT.NONE);
		lblPassword.setBounds(35, 282, 55, 15);
		lblPassword.setText("Password");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(107, 236, 263, 21);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(107, 279, 263, 21);
		
		CLabel lblNewLabel_1 = new CLabel(shell, SWT.NONE);
		lblNewLabel_1.setImage(SWTResourceManager.getImage("C:\\Users\\alumno\\Documents\\440bd9f0d88815e80bd2102d45f5f657.jpg"));
		lblNewLabel_1.setBounds(149, 43, 115, 164);
		lblNewLabel_1.setText("");

	}
}
