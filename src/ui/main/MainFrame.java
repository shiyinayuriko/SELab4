package ui.main;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import ui.PannelBuilder;
import word.WordItem;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 2943141619736401172L;

	public static void main(String[] args) throws Exception{
        BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
        UIManager.put("RootPane.setupButtonVisible",new Boolean (false));
		org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		
		JFrame jf =  new MainFrame();
		PannelBuilder builder = new MyPannelBuilder(null);
		
//		jf.setContentPane((Container) builder.build(new String[]{"a","a","a","a","a","a"}));
//		jf.setContentPane((Container) builder.build());
		jf.setContentPane((Container) builder.build((WordItem)null, true, 1));
		jf.revalidate();

	}
	
	
	public MainFrame(){
		super();
		setSize(400, 570);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				super.windowClosed(arg0);
			}
		});
	}
}
