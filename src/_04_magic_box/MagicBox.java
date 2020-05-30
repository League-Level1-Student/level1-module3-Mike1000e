package _04_magic_box;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MagicBox extends JPanel implements Runnable, MouseListener {

	/*
	 * We are going to hide secrets within the magic box. 
	 * When the user clicks on a secret place, stuff will happen.
	 * 
	 * 1. Make the frame respond to mouse clicks.
	 * 
	 * 2. When the mouse is clicked, use the Media Palace (read the code in the magic_box package) to play sounds, 
	 *    show images or speak.
	 * 
	 * 3. Choose 3 different locations on the background image.You can either use the mouse position, 
	 *    or the color of the image, then decide what action the Media Palace should take in each case. 
	 *     backgroundImage.getRGB(e.getX(), e.getY()) will give you the color of the current pixel.
	 */

	BufferedImage backgroundImage;


	@Override
	public void run() {
		try {
			loadBackgroundImage();
			createUI();
		} catch (Exception w) {
			System.err.println(w.getMessage());
		}
	}
	JPanel pan = new JPanel();
	JFrame frame = new JFrame("The Magic Box contains many secrets...");
	
	private void createUI() {

		frame.add(pan);
		frame.add(this);
		frame.addMouseListener(this);
		setPreferredSize(new Dimension(400, backgroundImage.getHeight()));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private void loadBackgroundImage() throws Exception {
		String imageFile = "src/_04_magic_box/magic-box.jpg";
		try {
			backgroundImage = ImageIO.read(new File(imageFile));
		} catch (IOException e) {
			throw new Exception("Could not load image: " + imageFile);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		// TODO Auto-generated method stub
		JLabel label = new JLabel();
		
		
		try {
			label = new MediaPalace().loadImageFromTheInternet("https://www.google.com/imgres?imgurl=http%3A%2F%2Fcameronmcefee.com%2Fimg%2Fwork%2Fthe-octocat%2Foriginal.jpg&imgrefurl=http%3A%2F%2Fcameronmcefee.com%2Fwork%2Fthe-octocat%2F&tbnid=yanebB9oB1YO-M&vet=12ahUKEwi5vvKNsdrpAhUDhZ4KHZSeAp0QMygBegUIARCNAg..i&docid=ULX8OuTUtzD-aM&w=950&h=760&q=github%20cat&safe=strict&client=firefox-b-1-d&ved=2ahUKEwi5vvKNsdrpAhUDhZ4KHZSeAp0QMygBegUIARCNAg");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		pan.add(label);
		frame.pack();

		new MediaPalace().speak("THIS is NOT a magic box.");
		
		pan.add(label);
		frame.pack();
		
		
		new MediaPalace().playSoundFromInternet("https://freesound.org/people/keineintresse/sounds/146694/");
		
		pan.add(label);
		frame.pack();
		
		
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}


