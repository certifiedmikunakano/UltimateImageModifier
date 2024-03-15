package test;
import java.util.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.*;
public class VeryFunnyThing<T> {
    
    private BufferedImage image;
    private BufferedImage rawImage;
    private int tempRoot1;
    private int tempRoot2;
    private int tempRoot3;
    private int tempRoot4;
    private static int pixelSize;
    private int tempRoot5;
    
    private static int largeSafePrime;
    
    private int tempRoot6;
    
    private int tempA1;
    private int tempA2;
    private int tempA3;
    private int tempA4;
    private int tempA5;
    private int tempA6;
    
    
    private static int safePrime;
    
    
    private static double percentEncrypted;
    private static double percentDecrypted;
    private static double percentEmojified;
    private static double percentRemoved;
    
    
    public int getSafePrime () {
    	return safePrime;
    }
    
    public int getLargeSafePrime () {
    	return largeSafePrime;
    }
    
    public ArrayList<Integer> tempRootArray() {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	result.add(tempRoot1);
    	result.add(tempRoot2);
    	result.add(tempRoot3);
    	result.add(tempRoot4);
    	result.add(tempRoot5);
    	result.add(tempRoot6);
    	return result;

    	
    }
    
    public ArrayList<Integer> enhancedTempRootArray() {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	result.add(tempRoot1);
    	result.add(tempRoot2);
    	result.add(tempRoot3);
    	result.add(tempRoot4);
    	result.add(tempRoot5);
    	result.add(tempRoot6);
    	result.add(tempA1);
    	result.add(tempA2);
    	result.add(tempA3);
    	result.add(tempA4);
    	result.add(tempA5);
    	result.add(tempA6);
    	return result;

    	
    }
    public double getPercentEncrypted() {
    	return percentEncrypted;
    	
    }
    
    public  double getPercentDecrypted() {
    	return percentDecrypted;
    	
    }
    public  double getPercentEmojified () {
    	return percentEmojified;
    	
    }
    public  double getPercentRemoved () {
    	return percentRemoved;
    	
    }
    
    private int [] safePrimes = {5, 7, 11, 23, 47, 59, 83, 107, 167, 179, 227, 263, 347, 359, 383, 467, 479, 503, 563, 587, 719, 839, 863, 887, 983, 1019, 1187, 1283, 1307, 1319, 1367, 1439, 1487, 1523, 1619, 1823, 1907, 2027, 2039, 2063, 2099, 2207, 2447, 2459, 2579, 2819, 2879, 2903, 2963, 2999, 3023, 3119, 3167, 3203, 3467, 3623, 3779, 3803, 3863, 3947, 4007, 4079, 4127, 4139, 4259, 4283, 4547, 4679, 4703, 4787, 4799, 4919};
    public void setSafePrimeIndex (int spIndex) {
    	safePrime = safePrimes[spIndex];
    }
    
    private int [] largeSafePrimes = {32603, 32843, 32987, 33107, 33347, 33623, 33647, 33767, 33863, 34319, 34367, 34583, 34667, 34703, 35159, 35339, 35363, 35879, 35963, 36083, 36263, 36299, 36383, 36467, 36683, 36887, 36923, 37463, 37547, 37607, 37799, 38327, 38603, 38639, 38747, 38783, 38867, 39107, 39119, 39323, 39419, 39503, 39779, 39827, 39839, 39983, 40127, 40499, 40739, 40787, 40823, 40883, 41387, 41507, 41519, 41543, 41579, 41759, 41843, 41879, 41927, 42023, 42179, 42299, 42359, 42443, 42683, 42767, 42839, 43223, 43403, 43427, 43607, 43787, 44027, 44159, 44267, 44519, 44543, 44687, 44699, 44819, 44867, 44939, 44963, 45083, 45503, 45707, 45887, 46199, 46559, 46643, 46679, 46919, 47123, 47207, 47339, 47507, 47639, 47819, 47963, 48407, 48479, 48563, 48947, 49019, 49103, 49223, 49367, 49499, 49943, 50147, 50459, 51047, 51203, 51287, 51347, 51407, 51599, 51683, 51827, 51839, 52223, 52379, 52919, 53003, 53147, 53267, 53699, 53759, 53783, 53987, 54287, 54563, 54959, 55079, 55103, 55163, 55487, 55547, 55619, 55787, 55967, 56003, 56039, 56807, 56999, 57119, 57143, 57287, 57503, 57587, 57719, 57803, 57899, 57923, 58043, 58067, 58403, 58679, 58727, 58907, 58967, 59063, 59447, 59747, 60539, 60647, 60779, 60899, 61343, 61379, 61547, 61703, 61967, 62039, 62303, 62507, 62639, 62939, 63299, 63443, 63587, 63599, 63719, 64007, 64019, 64283, 64319, 64763, 65063, 65123, 65147, 65267, 65543, 65579, 65687, 65867, 66047, 66107, 66239, 66359, 66383, 66923, 66959, 67043, 67139, 67247, 67427, 67499, 67547, 67619, 67883, 68507, 68567, 68639, 68879, 69263, 69767, 69827, 69899, 70139, 70163, 70199, 70223, 70583, 71147, 71663, 71867, 71987, 71999, 72167, 72383, 72503, 72707, 72767, 72959, 73127, 73259, 73523, 73583, 73643, 73847, 73859, 74027, 74099, 74279, 74363, 74507, 74759, 75239, 75707, 75743, 75983, 76079, 76367, 76379, 76403, 76463, 76607, 76667, 76907, 76919, 77003, 77279, 77339, 77447, 77723, 77747, 77783, 77867, 78179, 78467, 78479, 78839, 78887, 79043, 79103, 79139, 79319, 79559, 79907, 79943, 79967, 79979, 80387, 80567, 80687, 81119, 81527, 81647, 81707, 81899, 82163, 82463, 82487, 82763, 82799, 83207, 83219, 83243, 83339, 83459, 83939, 84047, 84143, 84179, 84263, 84443, 84719, 84947, 85223, 85439, 85487, 85643, 85847, 86027, 86627, 86783, 87083, 87299, 87323, 87383, 87443, 87587, 87887, 88223, 88259, 88379, 88499, 88547, 89003, 89087, 89303, 89399, 89459, 89759, 89819, 90107, 90239, 90263, 90359, 90527, 90659, 91139, 91199, 91283, 91943, 92363, 92399, 92459, 92699, 93047, 93179, 93239, 93287, 93383, 93407, 93503, 94379, 94559, 94727, 95003, 95027, 95087, 95219, 95279, 95483, 96059, 96263, 96443, 96479, 96827, 96959, 97127, 97187, 97463, 97523, 98207, 98387, 98507, 98663, 98867, 98927, 98963, 98999, 99119, 99623, 99707, 99839, 100043, 100103, 100523, 100547, 100823, 100847, 101027, 101183, 101483, 101747, 101939, 101987, 102407, 103007, 103043, 103079, 103319, 103787, 104207, 104243, 104327, 104579, 104723, 104759, 105023, 105107, 105143, 105167, 105263, 105467, 105767, 106103, 106187, 106619, 106823, 106907, 107099, 107183, 107279, 107699, 107903, 108023, 108203, 108503, 108587, 108803, 108827, 108887, 109547, 109883, 109919, 110459, 110879, 110939, 111263, 111323, 111347, 111443, 111467, 111599, 111659, 111779, 111863, 112019, 112163, 112199, 112247, 112787, 112979, 113039, 113063, 113327, 113363, 113567, 113783, 113819, 113843, 113903, 114083, 114299, 114407, 114659, 114827, 115547, 115679, 115763, 116027, 116099, 116387, 116423, 116903, 117023, 117203, 117779, 117959, 118043, 118127, 118247, 118739, 118787, 118799, 118907, 119027, 119243, 119447, 119759, 119963, 120167, 120299, 120503, 120587, 120767, 120899, 121019, 121379, 121439, 121523, 121547, 121559, 122663, 122819, 122939, 123407, 123503, 123923, 123983, 124199, 124343, 124427, 124703, 124847, 124919, 125003, 125183, 125207, 125507, 125639, 125963, 126227, 126359, 126839, 127343, 127487, 127607, 127679, 127727, 127859, 128603, 128747, 128879, 128903, 129419, 129527, 129587, 129707, 129803, 130127, 130199, 130223, 130259, 130343, 130367, 130619, 130787, 131267, 131303, 131687, 131927, 132059, 132347, 132383, 132863, 133187, 133403, 133499, 133583, 133919, 134087, 134207, 134243, 134339, 134363, 134699, 134867, 134999, 135119, 135467, 135887, 136223, 136343, 136523, 136559, 136979, 137087, 137279, 137339, 137399, 137639, 137927, 138059, 138239, 138407, 138683, 138863, 139079, 139187, 139619, 139883, 140123, 140159, 140363, 140627, 140759, 141179, 141539, 141587, 141707, 141803, 141959, 142799, 142907, 143387, 143483, 143687, 143699, 143999, 144203, 144323, 144539, 145007, 145823, 146519, 146843, 147047, 147107, 147179, 147227, 147347, 147419, 147503, 147647, 148199, 148403, 148439, 148727, 148763, 149399, 149459, 149519, 149543, 149867, 150083, 150299, 150323, 150659, 150707, 150779, 150959, 151007, 151379, 151643, 151667, 151883, 151967, 152003, 152063, 152183, 152519, 152567, 152843, 153359, 153563, 153743, 153887, 154487, 154523, 154943, 155027, 155087, 155399, 155423, 155627, 155699, 156119, 156347, 156467, 156623, 156683, 157019, 157247, 157307, 157427, 157559, 157679, 158303, 158363, 158519, 158567, 158699, 158759, 158867, 159119, 159179, 159227, 159539, 159623, 159683, 159779, 160079, 160619, 160739, 161303, 161339, 161363, 161639, 162143, 162263, 162563, 163019, 163127, 163223, 163259, 163403, 163679, 163859, 164147, 164279, 164387, 164447, 164987};
    public void setLargeSafePrimeIndex (int spIndex) {
    	largeSafePrime = largeSafePrimes[spIndex];
    }
    
    public void setMosaicPixelSize (int pxSize) {
    	pixelSize = pxSize;
    }
    
    private ArrayList<BufferedImage> approxImages = new ArrayList<BufferedImage>();
    
    public void setApproxImages (String directoryName, int size) throws IOException {
    	File folder = new File (directoryName);
    	for (File approxImage : folder.listFiles()) {
    		BufferedImage bi = ImageIO.read(approxImage);
    		BufferedImage addedImage = resizeImage(bi, size, size);
    		approxImages.add(addedImage);
    	}
    	
    }
    
    public ArrayList<BufferedImage> getApproxImages () {
    	return approxImages;
    }
    
    private ArrayList<Color> computeAverages (ArrayList<BufferedImage> input) {
    	ArrayList<Color> result = new ArrayList<Color>();
    	for (int i = 0; i < input.size(); i++) {
    		result.add(computeAverage(input.get(i)));
    	}
    	return result;
    }
    
    private static Color computeAverage (BufferedImage bi) {
    	long rSum = 0;
    	long gSum = 0;
    	long bSum = 0;
    	for (int i = 0; i < bi.getWidth(); i++) {
    		for (int j = 0; j < bi.getHeight(); j++) {
    			Color c = new Color (bi.getRGB(i, j));
    			rSum += c.getRed();
    			gSum += c.getGreen();
    			bSum += c.getBlue();
    		}
    	}
    	int totalPixels = bi.getWidth() * bi.getHeight();
    	return new Color((int) (rSum / totalPixels), (int) (gSum / totalPixels), (int) (bSum / totalPixels));
    }
    
    private int determineClosestIndex (Color input) {
    	ArrayList<Color> colorBank = computeAverages (approxImages);
    	
    	int minDistance = 99999999;
    	int minDistanceIndex = 0;
    	
    	for (int i = 0; i < colorBank.size(); i++) {
    		Color candidate = colorBank.get(i);
    		double candidateRed = candidate.getRed();
    		double candidateGreen = candidate.getGreen();
    		double candidateBlue = candidate.getBlue();
    		double red = input.getRed();
    		double green = input.getGreen();
    		double blue = input.getBlue();
    		double squared = Math.pow(candidateRed - red, 2) + Math.pow(candidateGreen - green, 2) + Math.pow(candidateBlue - blue, 2);
    		double distance = Math.sqrt(squared);
    		
    		if (distance < minDistance) {
    			minDistance = (int) distance;
    			minDistanceIndex = i;
    		}
    		
    	}
    	
    	return minDistanceIndex;
    	
    	
    }
    
    public void emojify (int width, int height, int emojiSize) throws IOException {
    	//read image
    	File f = null;
      	 try{
    		 f = new File(fileName); //image file path
    		 rawImage = new BufferedImage((safePrime - 1), (safePrime - 1), BufferedImage.TYPE_INT_ARGB);
    		 rawImage = ImageIO.read(f);
    		 image = resizeImage(rawImage, width*emojiSize, height*emojiSize);
    		 System.out.println("Reading complete.");
      	 }catch(IOException e){
    		 System.out.println("Error: "+e);
      	 }
      	 
      	 for (int x = 0; x < width; x++) {
      		 for (int y = 0; y < height; y++) {
      			 
      			 //compute average RGB of cell
      			 BufferedImage sub = image.getSubimage(x * emojiSize, y*emojiSize, emojiSize, emojiSize);
      			 
      			 Color inputColor = computeAverage (sub);
      			 int index = determineClosestIndex (inputColor);
      			 BufferedImage replace = approxImages.get(index);
      			 
      	
      			 for (int i = x*emojiSize; i < (x+1)*emojiSize; i++) {
      				for (int j = y*emojiSize; j < (y+1)*emojiSize; j++) {
      					int newRGB = replace.getRGB(i % emojiSize, j % emojiSize);
      					image.setRGB(i, j, newRGB);
         
      					
         			 }
      			 }
      			 
      		 }
      		 percentEmojified += 100.0 / (width * height);
      	 }
      	 System.out.println("Image emojified with " + width + " emojis by " + height + " emojis. ");
      	ImageIO.write(image, "png", f);
      	System.out.println("Writing complete.");
      	 
    }
    
    
    
    private String fileName;
    public VeryFunnyThing (String fn) {
   	 fileName = fn;
   	 percentEncrypted = 0;
   	 percentDecrypted = 0;
   	 
   	percentEmojified = 0;
   	percentRemoved = 0;
    }
    
    public VeryFunnyThing (BufferedImage im) {
   	 rawImage = im;
   	percentEncrypted = 0;
  	 percentDecrypted = 0;
  	 percentEmojified = 0;
  	 percentRemoved = 0;
    }
    
    public BufferedImage getImage () {
   	 return image;
    }
    
    
	
    
	public void enhancedDecrypt () throws IOException{
   	 int width = (safePrime - 1);    //width of the image
   	 int height = (safePrime - 1);   //height of the image
   	 BufferedImage image = null;
   	 File f = null;
   	 Scanner scan = new Scanner(System.in);
  	 
   	 //read image
   	 try{
 		 f = new File(fileName); //image file path
 		 BufferedImage rawImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
 		 rawImage = ImageIO.read(f);
 		 image = resizeImage(rawImage, width, height);
 		 System.out.println("Reading complete.");
   	 }catch(IOException e){
 		 System.out.println("Error: "+e);
   	 }
  	 
   	 System.out.println("Enter the decryption code for that image: ");
  	 
   	 String codestring = scan.nextLine();
   	 String[] rootsArray = codestring.split(" ");
    
   	 int root1 = Integer.parseInt(rootsArray[0]);
   	 int root2 = Integer.parseInt(rootsArray[1]);
   	 int root3 = Integer.parseInt(rootsArray[2]);
   	 int root4 = Integer.parseInt(rootsArray[3]);
   	 int root5 = Integer.parseInt(rootsArray[4]);
   	 int root6 = Integer.parseInt(rootsArray[5]);

   	 
   	 
   
  	 
   	 BufferedImage unscrambledImage1 = unscrambleD2 (image, root5, root6);
   	 BufferedImage unscrambledImage2 = unscrambleD1 (unscrambledImage1, root3, root4);
   	 BufferedImage unscrambledImage3 = unscrambleRows (unscrambledImage2, root2);
   	 BufferedImage unscrambledImage4 = unscrambleCols (unscrambledImage3, root1);

   	 System.out.println("Image unscrambled.");
  	 
  					 
   	 ImageIO.write(unscrambledImage4, "png", f);
   	 System.out.println("Writing complete.");
   	 
   	 image = unscrambledImage4;
 		      
 		 
     	}
    
	private void enhancedDecryptParameters () throws IOException{
   	 int width = (safePrime - 1);    //width of the image
   	 int height = (safePrime - 1);   //height of the image
   	 image = getImage();
   	 File f = new File (fileName);
   	 
   	 
   
  	 
   	 BufferedImage unscrambledImage1 = unscrambleD2 (image, tempRoot5, tempRoot6);
   	 BufferedImage unscrambledImage2 = unscrambleD1 (unscrambledImage1, tempRoot3, tempRoot4);
   	 BufferedImage unscrambledImage3 = unscrambleRows (unscrambledImage2, tempRoot2);
   	 BufferedImage unscrambledImage4 = unscrambleCols (unscrambledImage3, tempRoot1);

   	 System.out.println("Image unscrambled.");
  	 
  					 
   	 ImageIO.write(unscrambledImage4, "png", f);
   	 System.out.println("Writing complete.");
   	 
   	 image = unscrambledImage4;
 		      
 		 
     	}
	
	public void enhancedDecryptCustom (int r1, int r2, int r3, int r4, int r5, int r6) throws IOException{
	   	 int width = (safePrime - 1);    //width of the image
	   	 int height = (safePrime - 1);   //height of the image
	   	 image = getImage();
	   	 File f = null;
	   	 
	   	try{
	 		 f = new File(fileName); //image file path
	 		 BufferedImage rawImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	 		 rawImage = ImageIO.read(f);
	 		 image = resizeImage(rawImage, width, height);
	 		 System.out.println("Reading complete.");
	   	 }catch(IOException e){
	 		 System.out.println("Error: "+e);
	   	 }
	   	 
	   
	  	 
	   	 BufferedImage unscrambledImage1 = unscrambleD2 (image, r5, r6);
	   	 BufferedImage unscrambledImage2 = unscrambleD1 (unscrambledImage1, r3, r4);
	   	 BufferedImage unscrambledImage3 = unscrambleRows (unscrambledImage2, r2);
	   	 BufferedImage unscrambledImage4 = unscrambleCols (unscrambledImage3, r1);

	   	 System.out.println("Image unscrambled.");
	  	 
	  					 
	   	 ImageIO.write(unscrambledImage4, "png", f);
	   	 System.out.println("Writing complete.");
	   	 
	   	 image = unscrambledImage4;
	 		      
	 		 
	     	}
    
	public void enhancedEncrypt () throws IOException{
 		  Random random = new Random();
  		 int width = (safePrime - 1);    //width of the image
  		 int height = (safePrime - 1);   //height of the image
  		 //generate the primitive roots mod safePrime
 		 
  		 ArrayList <Integer> proots = new ArrayList <Integer> ();
  		 for (int i = 0; i < (safePrime - 1); i++) {
 			  proots.add(i);
  		 }
  		 for (int i = 0; i < safePrime; i++) {
 			  int j = proots.indexOf((i*i) % safePrime);
 			  if (j != -1) {
 				  proots.remove(j);
 			  }
 			 
  		 }
  		 int randomIndex1 = random.nextInt(proots.size());
  		 int randomIndex2 = random.nextInt(proots.size());
  		 int randomIndex3 = random.nextInt(proots.size());
  		 int randomIndex4 = random.nextInt(proots.size());
  		 int randomIndex5 = random.nextInt(proots.size());
  		 int randomIndex6 = random.nextInt(proots.size());

  		 int proot1 = proots.get(randomIndex1);
  		 int proot2 = proots.get(randomIndex2);
  		 int proot3 = proots.get(randomIndex3);
  		 int proot4 = proots.get(randomIndex4);
  		 int proot5 = proots.get(randomIndex5);
  		 int proot6 = proots.get(randomIndex6);
  		 
  		  tempRoot1 = proot1;
  		  tempRoot2 = proot2;  	 
  		  tempRoot3 = proot3;
  		  tempRoot4 = proot4;
  		  tempRoot5 = proot5;
  		  tempRoot6 = proot6;


 		 
  		 File f = null;
 		 
  		 //read image
  		 try{
    		 f = new File(fileName); //image file path
    		 rawImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    		 rawImage = ImageIO.read(f);
    		 image = resizeImage(rawImage, width, height);
    		 System.out.println("Reading complete.");
  		 }catch(IOException e){
    		 System.out.println("Error: "+e);
  		 }
 		 
  		 BufferedImage scrambledImage = scramble(image, proot1);

  		 BufferedImage scrambledImage2 = scramble2(scrambledImage, proot2);
  		 
  		 BufferedImage scrambledImage3 = scrambleD1(scrambledImage2, proot3, proot4);

  		 BufferedImage scrambledImage4 = scrambleD2(scrambledImage3, proot5, proot6);

  		 System.out.println("Image Scrambled.");
 		 
  		 
  		 ImageIO.write(scrambledImage4, "png", f);
  		 System.out.println("Image writing complete.");
  		 
  		 image = scrambledImage4;
 		 
  		 String secretCode = proot1 + " " + proot2 + " " + proot3 + " " + proot4 + " " + proot5 + " " + proot6;
 		 
  		 System.out.println("Your decryption code is: \n" + secretCode + ". \nKeep this code to yourself but don't lose it!");
 		      
 		 
     	}
	
	public void mosaicEncrypt () throws IOException{
		  Random random = new Random();
		 int width = (safePrime - 1) * pixelSize;    //width of the image
		 int height = (safePrime - 1) * pixelSize;   //height of the image
		 //generate the primitive roots mod safePrime
		 
		 ArrayList <Integer> proots = new ArrayList <Integer> ();
		 for (int i = 0; i < (safePrime - 1); i++) {
			  proots.add(i);
		 }
		 for (int i = 0; i < safePrime; i++) {
			  int j = proots.indexOf((i*i) % safePrime);
			  if (j != -1) {
				  proots.remove(j);
			  }
			 
		 }
		 int randomIndex1 = random.nextInt(proots.size());
		 int randomIndex2 = random.nextInt(proots.size());
		 int randomIndex3 = random.nextInt(proots.size());
		 int randomIndex4 = random.nextInt(proots.size());
		 int randomIndex5 = random.nextInt(proots.size());
		 int randomIndex6 = random.nextInt(proots.size());

		 int proot1 = proots.get(randomIndex1);
		 int proot2 = proots.get(randomIndex2);
		 int proot3 = proots.get(randomIndex3);
		 int proot4 = proots.get(randomIndex4);
		 int proot5 = proots.get(randomIndex5);
		 int proot6 = proots.get(randomIndex6);
		 
		  tempRoot1 = proot1;
		  tempRoot2 = proot2;  	 
		  tempRoot3 = proot3;
		  tempRoot4 = proot4;
		  tempRoot5 = proot5;
		  tempRoot6 = proot6;


		 
		 File f = null;
		 
		 //read image
		 try{
  		 f = new File(fileName); //image file path
  		 rawImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
  		 rawImage = ImageIO.read(f);
  		 image = resizeImage(rawImage, width, height);
  		 System.out.println("Reading complete.");
		 }catch(IOException e){
  		 System.out.println("Error: "+e);
		 }
		 
		 BufferedImage scrambledImage = mosaicScramble(image, proot1);

		 BufferedImage scrambledImage2 = mosaicScramble2(scrambledImage, proot2);
		 
		 BufferedImage scrambledImage3 = mosaicScrambleD1(scrambledImage2, proot3, proot4);

		 BufferedImage scrambledImage4 = mosaicScrambleD2(scrambledImage3, proot5, proot6);

		 System.out.println("Image Scrambled.");
		 
		 image = scrambledImage4;

		 ImageIO.write(image, "png", f);
		 System.out.println("Image writing complete.");
		 
		 
		 String secretCode = proot1 + " " + proot2 + " " + proot3 + " " + proot4 + " " + proot5 + " " + proot6;
		 
		 System.out.println("Your decryption code is: \n" + secretCode + ". \nKeep this code to yourself but don't lose it!");
		      
		 
   	}
	
	public void enhancedMosaicEncrypt () throws IOException{
		  Random random = new Random();
		 int width = (safePrime - 1) * pixelSize;    //width of the image
		 int height = (safePrime - 1) * pixelSize;   //height of the image
		 //generate the primitive roots mod safePrime
		 
		 ArrayList <Integer> proots = new ArrayList <Integer> ();
		 for (int i = 0; i < (safePrime - 1); i++) {
			  proots.add(i);
		 }
		 for (int i = 0; i < safePrime; i++) {
			  int j = proots.indexOf((i*i) % safePrime);
			  if (j != -1) {
				  proots.remove(j);
			  }
			 
		 }
		 int randomIndex1 = random.nextInt(proots.size());
		 int randomIndex2 = random.nextInt(proots.size());
		 int randomIndex3 = random.nextInt(proots.size());
		 int randomIndex4 = random.nextInt(proots.size());
		 int randomIndex5 = random.nextInt(proots.size());
		 int randomIndex6 = random.nextInt(proots.size());

		 int proot1 = proots.get(randomIndex1);
		 int proot2 = proots.get(randomIndex2);
		 int proot3 = proots.get(randomIndex3);
		 int proot4 = proots.get(randomIndex4);
		 int proot5 = proots.get(randomIndex5);
		 int proot6 = proots.get(randomIndex6);
		 
		 ArrayList <Integer> relPrimes = new ArrayList <Integer> ();
		 for (int i = 0; i < (safePrime - 1); i++) {
			 if (((i % 2) == 1) && (i != (safePrime - 1) / 2)) {
				 relPrimes.add(i);
			 }
		 }
		 
		 int aIndex1 = random.nextInt(relPrimes.size());
		 int aIndex2 = random.nextInt(relPrimes.size());
		 int aIndex3 = random.nextInt(relPrimes.size());
		 int aIndex4 = random.nextInt(relPrimes.size());
		 int aIndex5 = random.nextInt(relPrimes.size());
		 int aIndex6 = random.nextInt(relPrimes.size());

		 int a1 = relPrimes.get(aIndex1);
		 int a2 = relPrimes.get(aIndex2);
		 int a3 = relPrimes.get(aIndex3);
		 int a4 = relPrimes.get(aIndex4);
		 int a5 = relPrimes.get(aIndex5);
		 int a6 = relPrimes.get(aIndex6);

		  tempRoot1 = proot1;
		  tempRoot2 = proot2;  	 
		  tempRoot3 = proot3;
		  tempRoot4 = proot4;
		  tempRoot5 = proot5;
		  tempRoot6 = proot6;
		  
		  tempA1 = a1;
		  tempA2 = a2;
		  tempA3 = a3;
		  tempA4 = a4;
		  tempA5 = a5;
		  tempA6 = a6;


		 
		 File f = null;
		 
		 //read image
		 try{
		 f = new File(fileName); //image file path
		 rawImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		 rawImage = ImageIO.read(f);
		 image = resizeImage(rawImage, width, height);
		 System.out.println("Reading complete.");
		 }catch(IOException e){
		 System.out.println("Error: "+e);
		 }
		 
		 BufferedImage scrambledImage = mosaicScramble(image, proot1);

		 BufferedImage scrambledImage2 = mosaicScramble2(scrambledImage, proot2);
		 
		 BufferedImage scrambledImage3 = mosaicScrambleD1(scrambledImage2, proot3, proot4);

		 BufferedImage scrambledImage4 = mosaicScrambleD2(scrambledImage3, proot5, proot6);
		 
		 BufferedImage scrambledImage5 = funnyMosaicScramble(scrambledImage4, a1);
		 
		 BufferedImage scrambledImage6 = funnyMosaicScramble2(scrambledImage5, a2);
		 
		 BufferedImage scrambledImage7 = funnyMosaicScrambleD1 (scrambledImage6, a3, a4);
		 
		 BufferedImage scrambledImage8 = funnyMosaicScrambleD2 (scrambledImage7, a5, a6);

		 System.out.println("Image Scrambled.");
		 
		 image = scrambledImage8;

		 ImageIO.write(image, "png", f);
		 System.out.println("Image writing complete.");
		 
		 
		 String secretCode = proot1 + " " + proot2 + " " + proot3 + " " + proot4 + " " + proot5 + " " + proot6 + " " + a1 + " " + a2 + " " + a3 + " " + a4 + " " + a5 + " " + a6;
		 
		 System.out.println("Your decryption code is: \n" + secretCode + ". \nKeep this code to yourself but don't lose it!");
		      
		 
 	}
    
	public void mosaicDecrypt () throws IOException{
	   	 Scanner scan = new Scanner(System.in);

		System.out.println("Enter the exact safe prime used: ");
		String im = scan.nextLine();
	   	 safePrime = Integer.parseInt(im);
	   	 
	   	 int width = (safePrime - 1) * pixelSize;    //width of the image
	   	 int height = (safePrime - 1) * pixelSize;   //height of the image
	   	 BufferedImage image = null;
	   	 File f = null;
	  	 
	   	 //read image
	   	 try{
	 		 f = new File(fileName); //image file path
	 		 BufferedImage rawImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	 		 rawImage = ImageIO.read(f);
	 		 image = resizeImage(rawImage, width, height);
	 		 System.out.println("Reading complete.");
	   	 }catch(IOException e){
	 		 System.out.println("Error: "+e);
	   	 }
	   	 
	   	 
	  	 
	   	 System.out.println("Enter the decryption code for that image: ");
	  	 
	   	 String codestring = scan.nextLine();
	   	 String[] rootsArray = codestring.split(" ");
	    
	   	 int root1 = Integer.parseInt(rootsArray[0]);
	   	 int root2 = Integer.parseInt(rootsArray[1]);
	   	 int root3 = Integer.parseInt(rootsArray[2]);
	   	 int root4 = Integer.parseInt(rootsArray[3]);
	   	 int root5 = Integer.parseInt(rootsArray[4]);
	   	 int root6 = Integer.parseInt(rootsArray[5]);

	   	 
	   	 
	   
	  	 
	   	 BufferedImage unscrambledImage1 = mosaicUnscrambleD2 (image, root5, root6);
	   	 BufferedImage unscrambledImage2 = mosaicUnscrambleD1 (unscrambledImage1, root3, root4);
	   	 BufferedImage unscrambledImage3 = mosaicUnscrambleRows (unscrambledImage2, root2);
	   	 BufferedImage unscrambledImage4 = mosaicUnscrambleCols (unscrambledImage3, root1);

	   	 System.out.println("Image unscrambled.");
	  	 
	  					 
	   	 ImageIO.write(unscrambledImage4, "png", f);
	   	 System.out.println("Writing complete.");
	   	 
	   	 image = unscrambledImage4;
	 		      
	 		 
	     	}
	
	public void enhancedMosaicDecryptParameters () throws IOException{
		 int width = (safePrime - 1) * pixelSize;    //width of the image
	   	 int height = (safePrime - 1) * pixelSize;   //height of the image
		File f = null;
	  	 
	   	 //read image
	   	 try{
	 		 f = new File(fileName); //image file path
	 		 BufferedImage rawImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	 		 rawImage = ImageIO.read(f);
	 		 image = resizeImage(rawImage, width, height);
	 		 System.out.println("Reading complete.");
	   	 }catch(IOException e){
	 		 System.out.println("Error: "+e);
	   	 }
	   	 
	   	 BufferedImage unscrambledImage1 = funnyMosaicUnscrambleD2 (image, tempA5, tempA6);
	   	 BufferedImage unscrambledImage2 = funnyMosaicUnscrambleD1 (unscrambledImage1, tempA3, tempA4);
	  	 BufferedImage unscrambledImage3 = funnyMosaicUnscrambleRows (unscrambledImage2, tempA2);
	  	 BufferedImage unscrambledImage4 = funnyMosaicUnscrambleCols (unscrambledImage3, tempA1);
	   	 
	   	 BufferedImage unscrambledImage5 = mosaicUnscrambleD2 (unscrambledImage4, tempRoot5, tempRoot6);
	   	 BufferedImage unscrambledImage6 = mosaicUnscrambleD1 (unscrambledImage5, tempRoot3, tempRoot4);
	   	 BufferedImage unscrambledImage7 = mosaicUnscrambleRows (unscrambledImage6, tempRoot2);
	   	 BufferedImage unscrambledImage8 = mosaicUnscrambleCols (unscrambledImage7, tempRoot1);

	   	 System.out.println("Image unscrambled.");
	  	 
	  					 
	   	 image = unscrambledImage8;

	   	 ImageIO.write(image, "png", f);
	   	 System.out.println("Writing complete.");
	   	 
	 		      
	 		 
	     	}
	
	public void enhancedMosaicDecrypt () throws IOException{
	   	 Scanner scan = new Scanner(System.in);

		System.out.println("Enter the exact safe prime used: ");
		String im = scan.nextLine();
	   	 safePrime = Integer.parseInt(im);
	   	 
	   	 int width = (safePrime - 1) * pixelSize;    //width of the image
	   	 int height = (safePrime - 1) * pixelSize;   //height of the image
	   	 BufferedImage image = null;
	   	 File f = null;
	  	 
	   	 //read image
	   	 try{
	 		 f = new File(fileName); //image file path
	 		 BufferedImage rawImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	 		 rawImage = ImageIO.read(f);
	 		 image = resizeImage(rawImage, width, height);
	 		 System.out.println("Reading complete.");
	   	 }catch(IOException e){
	 		 System.out.println("Error: "+e);
	   	 }
	   	 
	   	 
	  	 
	   	 System.out.println("Enter the decryption code for that image: ");
	  	 
	   	 String codestring = scan.nextLine();
	   	 String[] rootsArray = codestring.split(" ");
	    
	   	 int root1 = Integer.parseInt(rootsArray[0]);
	   	 int root2 = Integer.parseInt(rootsArray[1]);
	   	 int root3 = Integer.parseInt(rootsArray[2]);
	   	 int root4 = Integer.parseInt(rootsArray[3]);
	   	 int root5 = Integer.parseInt(rootsArray[4]);
	   	 int root6 = Integer.parseInt(rootsArray[5]);

	   	 int a1 = Integer.parseInt(rootsArray[6]);
	   	 int a2 = Integer.parseInt(rootsArray[7]);
	   	 int a3 = Integer.parseInt(rootsArray[8]);
	   	 int a4 = Integer.parseInt(rootsArray[9]);
	   	 int a5 = Integer.parseInt(rootsArray[10]);
	   	 int a6 = Integer.parseInt(rootsArray[11]);


	   	 BufferedImage unscrambledImage1 = funnyMosaicUnscrambleD2 (image, a5, a6);
	   	 BufferedImage unscrambledImage2 = funnyMosaicUnscrambleD1 (unscrambledImage1, a3, a4);
	  	 BufferedImage unscrambledImage3 = funnyMosaicUnscrambleRows (unscrambledImage2, a2);
	  	 BufferedImage unscrambledImage4 = funnyMosaicUnscrambleCols (unscrambledImage3, a1);
	   	 
	   	 BufferedImage unscrambledImage5 = mosaicUnscrambleD2 (unscrambledImage4, root5, root6);
	   	 BufferedImage unscrambledImage6 = mosaicUnscrambleD1 (unscrambledImage5, root3, root4);
	   	 BufferedImage unscrambledImage7 = mosaicUnscrambleRows (unscrambledImage6, root2);
	   	 BufferedImage unscrambledImage8 = mosaicUnscrambleCols (unscrambledImage7, root1);

	   	 System.out.println("Image unscrambled.");
	  	 
	  					 
	   	 ImageIO.write(unscrambledImage8, "png", f);
	   	 System.out.println("Writing complete.");
	   	 
	   	 image = unscrambledImage8;
	 		      
	 		 
	     	}
	
	
	private static int prToThe (int base, int k) {
  	  int value = 1;
  	  for (int i = 0; i < k; i++) {
  		  value*=base;
  		  value%=safePrime;
  	  }
  	  return value;
	}
    
	private static int prToThe2 (int base, int k) {
	  	  int value = 1;
	  	  for (int i = 0; i < k; i++) {
	  		  value*=base;
	  		  value%=largeSafePrime;
	  	  }
	  	  return value;
		}
	
	static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) throws IOException {
   	 BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
   	 Graphics2D graphics2D = resizedImage.createGraphics();
   	 graphics2D.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
   	 graphics2D.dispose();
   	 return resizedImage;
	}
    
	private static ArrayList<Color> encrypt (ArrayList <Color> original, int pr) {
  	  ArrayList<Color> newArr = new ArrayList<Color>();
  	  for (int i = 0; i < original.size(); i++) {
  		  newArr.add(original.get(prToThe(pr, i) - 1));
  	  }
  	  return newArr;
	}
    
	private static ArrayList<Color> encrypt2 (ArrayList <Color> original, int pr) {
  	  ArrayList<Color> newArr = new ArrayList<Color>();
  	  for (int i = 0; i < original.size(); i++) {
  		  newArr.add(original.get(prToThe(pr, i) - 1));
  	  }
  	  return newArr;
	}

    
	private static BufferedImage scramble (BufferedImage original, int pr) {
  		  BufferedImage scrambled = new BufferedImage (original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_ARGB);
  		 
  		  //scramble each row
  		  for (int y = 0; y < original.getHeight(); y++) {
  			  ArrayList<Color> origRow = new ArrayList <Color> ();
  			  for (int j = 0; j < original.getWidth(); j++) {
  				  Color c = new Color(original.getRGB(j, y));
  				  origRow.add(c);
  			  }
  			 
  			  ArrayList<Color> scrambledRow = encrypt (origRow, pr);
  			  for (int j = 0; j < original.getWidth(); j++) {
  				  int newRGB = scrambledRow.get(j).getRGB();
  				  scrambled.setRGB(j, y, newRGB);
  			  }
  			  percentEncrypted += 100.0 / ((safePrime - 1) * 4);
  			  percentRemoved += 100.0 / ((safePrime - 1) * 8);
  		  }
  		  return scrambled;
  	  }
    
	private static BufferedImage scramble2 (BufferedImage original, int pr) {
  	  BufferedImage scrambled = new BufferedImage (original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_ARGB);
  	 
  	  //scramble each column
  	  for (int x = 0; x < original.getWidth(); x++) {
  		  ArrayList<Color> origCol = new ArrayList <Color> ();
  		  for (int j = 0; j < original.getHeight(); j++) {
  			  Color c = new Color(original.getRGB(x, j));
  			  origCol.add(c);
  		  }
  		 
  		  ArrayList<Color> scrambledCol = encrypt2 (origCol, pr);
  		  for (int j = 0; j < original.getHeight(); j++) {
  			  int newRGB = scrambledCol.get(j).getRGB();
  			  scrambled.setRGB(x, j, newRGB);
  		  }
			  percentEncrypted += 100.0 / ((safePrime - 1) * 4);
  			  percentRemoved += 100.0 / ((safePrime - 1) * 8);


  	  }
  	  return scrambled;
	}
    
	private static BufferedImage scrambleD1 (BufferedImage original, int pr1, int pr2) {
     	  BufferedImage scrambled = new BufferedImage (original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_ARGB);
     	 
     	  //scramble each row
     	  for (int y = 0; y < original.getHeight(); y++) {
     		  ArrayList<Color> origRow = new ArrayList <Color> ();
     		  for (int j = 0; j < original.getWidth(); j++) {
     			  int modifiedY = (y + (prToThe(pr1, j))) % (safePrime - 1);
     			  Color c = new Color(original.getRGB(j, modifiedY));
     			  origRow.add(c);
     		  }
     		 
     		  ArrayList<Color> scrambledRow = encrypt (origRow, pr2);
     		  for (int j = 0; j < original.getWidth(); j++) {
     			  int modifiedY = (y + (prToThe(pr1, j))) % (safePrime - 1);
     			  int newRGB = scrambledRow.get(j).getRGB();
     			  scrambled.setRGB(j, modifiedY, newRGB);
     		  }
  			  percentEncrypted += 100.0 / ((safePrime - 1) * 4);
  			  percentRemoved += 100.0 / ((safePrime - 1) * 8);


     	  }
     	  return scrambled;
       }
    
	private static BufferedImage scrambleD2 (BufferedImage original, int pr1, int pr2) {
 		  BufferedImage scrambled = new BufferedImage (original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_ARGB);
 		 
 		  //scramble each column
 		  for (int x = 0; x < original.getWidth(); x++) {
 			  ArrayList<Color> origCol = new ArrayList <Color> ();
 			  for (int j = 0; j < original.getHeight(); j++) {
 				  int modifiedX = (x + (prToThe(pr1, j))) % (safePrime - 1);
 				  Color c = new Color(original.getRGB(modifiedX, j));
 				  origCol.add(c);
 			  }
 			 
 			  ArrayList<Color> scrambledCol = encrypt2 (origCol, pr2);
 			  for (int j = 0; j < original.getHeight(); j++) {
 				  int modifiedX = (x + (prToThe(pr1, j))) % (safePrime - 1);
 				  int newRGB = scrambledCol.get(j).getRGB();
 				  scrambled.setRGB(modifiedX, j, newRGB);
 			  }
  			  percentEncrypted += 100.0 / ((safePrime - 1) * 4);
  			  percentRemoved += 100.0 / ((safePrime - 1) * 8);


 		  }
 		  return scrambled;
   	}
    
	public static int discreteLogBasePrModsafePrime (int base, int k) {
 		  int value = 0;
 		  for (int i = 0; i < safePrime; i++) {
 			  if (prToThe(base, i) % safePrime == k) {
 				  value = i;
 				  break;
 			  }
 		  }
 		  return value;
   	}
    
	public static int discreteLogBasePrModsafePrime_ (int base, int k) {
		  return discreteLogarithm(base, k, safePrime);
  	}
    
	public void eraseProportion (double proportion) throws IOException {
   	 enhancedMosaicEncrypt();
   	 erase (proportion);
   	 enhancedMosaicDecryptParameters();
   	 
	}
    
	private void erase (double proportionErased) throws IOException {
   	 
	int dimension = (safePrime - 1) * pixelSize;
   	 int cutoff = (int) ((safePrime - 1) - (safePrime - 1) * Math.sqrt(1 - proportionErased));
   	 System.out.println("CUTOFF: " + cutoff);
   	 for (int i = 0; i < safePrime - 1; i++) {
   		 for (int j = 0; j < safePrime - 1; j++) {
   			 if ((i <= cutoff) || (j <= cutoff)) {
   				 
   				 for (int p = 0; p < pixelSize; p++ ) {
   					 for (int q = 0; q < pixelSize; q++) {
   	   				 	image.setRGB(i*pixelSize + p,  j*pixelSize + q, 0);
   					 }
   				 }
   				 
   			 }
   		 }
   	 }
   	 File f = new File(fileName);
   	 ImageIO.write(image, "png", f);

	}
    
	static int discreteLogarithm(int a, int b, int m)
	{
    	int n = (int) (Math.sqrt (m) + 1);
 
    	// Calculate a ^ n
    	int an = 1;
    	for (int i = 0; i < n; ++i)
        	an = (an * a) % m;
 
    	int[] value=new int[m];
 
    	// Store all values of a^(n*i) of LHS
    	for (int i = 1, cur = an; i <= n; ++i)
    	{
        	if (value[ cur ] == 0)
            	value[ cur ] = i;
        	cur = (cur * an) % m;
    	}
 
    	for (int i = 0, cur = b; i <= n; ++i)
    	{
        	// Calculate (a ^ j) * b and check
        	// for collision
        	if (value[cur] > 0)
        	{
            	int ans = value[cur] * n - i;
            	if (ans < m)
                	return ans;
        	}
        	cur = (cur * a) % m;
    	}
    	return -1;
	}
  	 
   	//use pr1
   	public static ArrayList<Color> decryptRows (ArrayList <Color> original, int pr) {
 		  ArrayList<Color> newArr = new ArrayList<Color>();
 		  for (int i = 0; i < original.size(); i++) {
 			 
 			  newArr.add(original.get(discreteLogBasePrModsafePrime_(pr, i+1) % (safePrime - 1)));
 		  }
 		  return newArr;
   	}
  	 
   	//use pr2
   	public static ArrayList<Color> decryptCols (ArrayList <Color> original, int pr) {
 		  ArrayList<Color> newArr = new ArrayList<Color>();
 		  for (int i = 0; i < original.size(); i++) {
 			  newArr.add(original.get(discreteLogBasePrModsafePrime_(pr, i+1) % (safePrime - 1)));
 		  }
 		  return newArr;
   	}

  	 
   	public static BufferedImage unscrambleCols (BufferedImage original, int pr) {
 			  BufferedImage unscrambled = new BufferedImage (original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_ARGB);
 			 
 			  //scramble each row
 			  for (int y = 0; y < original.getHeight(); y++) {
 				  ArrayList<Color> origRow = new ArrayList <Color> ();
 				  for (int j = 0; j < original.getWidth(); j++) {
 					  Color c = new Color(original.getRGB(j, y));
 					  origRow.add(c);
 				  }
 				 
 				  ArrayList<Color> unscrambledRow = decryptRows (origRow, pr);
 				  for (int j = 0; j < original.getWidth(); j++) {
 					  int newRGB = unscrambledRow.get(j).getRGB();
 					  unscrambled.setRGB(j, y, newRGB);
 				  }
 				  System.out.println("Column " + y + " unscrambled");
 	  			  percentDecrypted += 100.0 / ((safePrime - 1) * 4);
 	  			  percentRemoved += 100.0 / ((safePrime - 1) * 8);



 			  }
 			  return unscrambled;
 		  }
  	 
   	public static BufferedImage unscrambleRows (BufferedImage original, int pr) {
 		  BufferedImage unscrambled = new BufferedImage (original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_ARGB);
 		 
 		  //scramble each column
 		  for (int x = 0; x < original.getWidth(); x++) {
 			  ArrayList<Color> origCol = new ArrayList <Color> ();
 			  for (int j = 0; j < original.getHeight(); j++) {
 				  Color c = new Color(original.getRGB(x, j));
 				  origCol.add(c);
 			  }
 			 
 			  ArrayList<Color> unscrambledCol = decryptCols (origCol, pr);
 			  for (int j = 0; j < original.getHeight(); j++) {
 				  int newRGB = unscrambledCol.get(j).getRGB();
 				  unscrambled.setRGB(x, j, newRGB);
 			  }
 			  System.out.println("Row " + x + " unscrambled");
	  			  percentDecrypted += 100.0 / ((safePrime - 1) * 4);
	  			  percentRemoved += 100.0 / ((safePrime - 1) * 8);


 		  }
 		  return unscrambled;
   	}
  	 
   	public static BufferedImage unscrambleD1 (BufferedImage original, int pr1, int pr2) {
   		  BufferedImage unscrambled = new BufferedImage (original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_ARGB);
   		 
   		  //scramble each row
   		  for (int y = 0; y < original.getHeight(); y++) {
   			  ArrayList<Color> origRow = new ArrayList <Color> ();
   			  for (int j = 0; j < original.getWidth(); j++) {
 					  int modifiedY = (y + (prToThe(pr1, j))) % (safePrime - 1);
   				  Color c = new Color(original.getRGB(j, modifiedY));
   				  origRow.add(c);
   			  }
   			 
   			  ArrayList<Color> unscrambledRow = decryptRows (origRow, pr2);
   			  for (int j = 0; j < original.getWidth(); j++) {
 					  int modifiedY = (y + (prToThe(pr1, j))) % (safePrime - 1);
   				  int newRGB = unscrambledRow.get(j).getRGB();
   				  unscrambled.setRGB(j, modifiedY, newRGB);
   			  }
   			  System.out.println("Column " + y + " unscrambled");
	  			  percentDecrypted += 100.0 / ((safePrime - 1) * 4);
	  			  percentRemoved += 100.0 / ((safePrime - 1) * 8);


   		  }
   		  return unscrambled;
   	  }
  	 
   	public static BufferedImage unscrambleD2 (BufferedImage original, int pr1, int pr2) {
   		  BufferedImage unscrambled = new BufferedImage (original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_ARGB);
   		 
   		  //scramble each column
   		  for (int x = 0; x < original.getWidth(); x++) {
   			  ArrayList<Color> origCol = new ArrayList <Color> ();
   			  for (int j = 0; j < original.getHeight(); j++) {
     				  int modifiedX = (x + (prToThe(pr1, j))) % (safePrime - 1);
   				  Color c = new Color(original.getRGB(modifiedX, j));
   				  origCol.add(c);
   			  }
   			 
   			  ArrayList<Color> unscrambledCol = decryptCols (origCol, pr2);
   			  for (int j = 0; j < original.getHeight(); j++) {
     				  int modifiedX = (x + (prToThe(pr1, j))) % (safePrime - 1);
   				  int newRGB = unscrambledCol.get(j).getRGB();
   				  unscrambled.setRGB(modifiedX, j, newRGB);
   			  }
   			  System.out.println("Row " + x + " unscrambled");
	  			  percentDecrypted += 100.0 / ((safePrime - 1) * 4);
	  			  percentRemoved += 100.0 / ((safePrime - 1) * 8);


   		  }
   		  return unscrambled;
     	}
   	
   	
   	private static ArrayList<BufferedImage> mosaicEncrypt (ArrayList <BufferedImage> original, int pr) {
    	  ArrayList<BufferedImage> newArr = new ArrayList<BufferedImage>();
    	  for (int i = 0; i < original.size(); i++) {
    		  newArr.add(original.get(prToThe(pr, i) - 1));

    	  }
    	  return newArr;
  	}
      
  	private static ArrayList<BufferedImage> mosaicEncrypt2 (ArrayList <BufferedImage> original, int pr) {
    	  ArrayList<BufferedImage> newArr = new ArrayList<BufferedImage>();
    	  for (int i = 0; i < original.size(); i++) {
    		  newArr.add(original.get(prToThe(pr, i) - 1));
    	  }
    	  return newArr;
  	}
  	
  	
	private static ArrayList<BufferedImage> funnyMosaicEncrypt (ArrayList <BufferedImage> original, int a) {
		//a is relatively prime to safePrime - 1
  	  ArrayList<BufferedImage> newArr = new ArrayList<BufferedImage>();
  	  for (int i = 0; i < original.size(); i++) {
  		  newArr.add(original.get(prToThe(i+1, a) - 1));

  	  }
  	  return newArr;
	}
  	
 	//use pr1
   	public static ArrayList<BufferedImage> mosaicDecryptRows (ArrayList <BufferedImage> original, int pr) {
 		  ArrayList<BufferedImage> newArr = new ArrayList<BufferedImage>();
 		  for (int i = 0; i < original.size(); i++) {
 			 
 			  newArr.add(original.get(discreteLogBasePrModsafePrime_(pr, i+1) % (safePrime - 1)));
 		  }
 		  return newArr;
   	}
  	 
   	//use pr2
   	public static ArrayList<BufferedImage> mosaicDecryptCols (ArrayList <BufferedImage> original, int pr) {
 		  ArrayList<BufferedImage> newArr = new ArrayList<BufferedImage>();
 		  for (int i = 0; i < original.size(); i++) {
 			  newArr.add(original.get(discreteLogBasePrModsafePrime_(pr, i+1) % (safePrime - 1)));
 		  }
 		  return newArr;
   	}
   	
   	private static ArrayList<BufferedImage> funnyMosaicDecrypt (ArrayList <BufferedImage> original, int a) {
		//a is relatively prime to safePrime - 1
   		ArrayList<BufferedImage> newArr = new ArrayList<BufferedImage>();
		 for (int i = 0; i < original.size() - 1; i++) {
			 newArr.add(original.get(computeNthRootModSafePrime(a, i+1) - 1));
		 }
		 newArr.add(original.get(safePrime - 2));
		 return newArr;
	}
   	
   	public static int computeNthRootModSafePrime (int n, int origNum) {
		int result = -1;
		for (int i = 0; i < safePrime; i++) {
			if (prToThe(i, n) == origNum) {
				result = i;
				break;
			}
		}
		return result;
		
	}
	
  	
   	private static BufferedImage mosaicScramble (BufferedImage original, int pr) throws IOException {
		  BufferedImage scrambled = original;
		  Mosaic2 m = new Mosaic2 (safePrime - 1, pixelSize, scrambled);
		  //scramble each row
		  for (int y = 0; y < safePrime - 1; y++) {
			   ArrayList<BufferedImage> origRow = new ArrayList<BufferedImage>();
			  
			  for (int j = 0; j < safePrime - 1; j++) {
				  BufferedImage c = m.getPixel(j, y); 
				  origRow.add(c);
			  }

			  for (BufferedImage bi : origRow) {
			  }
			  
			  //System.out.println();
			  
			  //line #1
			  ArrayList<BufferedImage> scrambledRow = mosaicEncrypt (origRow, pr);
			  
			  //this for loop used for testing - outputs the correct and
			  //expected values for scrambledRow
			  for (int k = 0; k < safePrime - 1; k++) {
			  }
			  
			  for (int j = 0; j < safePrime - 1; j++) {
				  BufferedImage newImage = scrambledRow.get(j);
				  
				  //this line used for testing - somehow outputs  different values for scrambledRow 
				  //despite it being the same code to loop through the arraylist of size safeprime - 1
				  //computeAverage function does NOT change either newImage or scrambledRow
				  //nor did I ever change the scrambledRow arraylist in between this loop and line #1
				  //does .get somehow change the arraylist values?
				  
				  m.setPixel(j, y, newImage);
				  
			  }

			  
			  percentEncrypted += 100.0 / ((safePrime - 1) * 4);
			  percentRemoved += 100.0 / ((safePrime - 1) * 8);
		  }
		  scrambled = m.getMosaic();
		  return scrambled;
		  
	  }
  

	private static BufferedImage mosaicScramble2 (BufferedImage original, int pr) throws IOException {
	  BufferedImage scrambled = original;
	 
	  Mosaic2 m = new Mosaic2 (safePrime - 1, pixelSize, scrambled);
	  //scramble each column
	  for (int x = 0; x < safePrime - 1; x++) {
		  ArrayList<BufferedImage> origCol = new ArrayList<BufferedImage>();
		  for (int j = 0; j < safePrime - 1; j++) {
			  BufferedImage c = m.getPixel(x, j);
			  origCol.add(c);
		  }
		 
		  ArrayList<BufferedImage> scrambledCol = mosaicEncrypt2 (origCol, pr);
		  for (int j = 0; j < safePrime - 1; j++) {
			  BufferedImage newImage = scrambledCol.get(j);
			  m.setPixel(x, j, newImage);
		  }
			  percentEncrypted += 100.0 / ((safePrime - 1) * 4);
			  percentRemoved += 100.0 / ((safePrime - 1) * 8);


	  }
	  scrambled = m.getMosaic();
	  return scrambled;
	}
  	
	private static BufferedImage mosaicScrambleD1 (BufferedImage original, int pr1, int pr2) throws IOException {
   	  BufferedImage scrambled = original;
   	 
	  Mosaic2 m = new Mosaic2 (safePrime - 1, pixelSize, scrambled);

   	  //scramble each row
   	  for (int y = 0; y < safePrime - 1; y++) {
   		  ArrayList<BufferedImage> origRow = new ArrayList<BufferedImage>();
   		  for (int j = 0; j < safePrime - 1; j++) {
   			  int modifiedY = (y + (prToThe(pr1, j))) % (safePrime - 1);
   			  BufferedImage c = m.getPixel(j, modifiedY);
   			  origRow.add(c);
   		  }
   		 
   		  ArrayList<BufferedImage> scrambledRow = mosaicEncrypt (origRow, pr2);
   		  for (int j = 0; j < safePrime - 1; j++) {
   			  int modifiedY = (y + (prToThe(pr1, j))) % (safePrime - 1);
   			  BufferedImage newImage = scrambledRow.get(j);
   			  
   			  m.setPixel(j, modifiedY, newImage);
   			  
   		  }
			  percentEncrypted += 100.0 / ((safePrime - 1) * 4);
			  percentRemoved += 100.0 / ((safePrime - 1) * 8);


   	  }
	  scrambled = m.getMosaic();
   	  return scrambled;
     }
  
	private static BufferedImage mosaicScrambleD2 (BufferedImage original, int pr1, int pr2) throws IOException{
		  BufferedImage scrambled = original;
		  Mosaic2 m = new Mosaic2 (safePrime - 1, pixelSize, scrambled);
		  
		  //scramble each column
		  for (int x = 0; x < safePrime - 1; x++) {
			  ArrayList<BufferedImage> origCol = new ArrayList<BufferedImage>();
			  for (int j = 0; j < safePrime - 1; j++) {
				  int modifiedX = (x + (prToThe(pr1, j))) % (safePrime - 1);
				  BufferedImage c = m.getPixel(modifiedX, j);
				  origCol.add(c);
			  }
			 
			  ArrayList<BufferedImage> scrambledCol = mosaicEncrypt2 (origCol, pr2);
			  for (int j = 0; j < safePrime - 1; j++) {
				  int modifiedX = (x + (prToThe(pr1, j))) % (safePrime - 1);
				  BufferedImage newImage = scrambledCol.get(j);
				  m.setPixel(modifiedX, j, newImage);
			  }
			  percentEncrypted += 100.0 / ((safePrime - 1) * 4);
			  percentRemoved += 100.0 / ((safePrime - 1) * 8);


		  }
		  scrambled = m.getMosaic();
		  return scrambled;
 	}
   


	private static BufferedImage funnyMosaicScramble (BufferedImage original, int pr) throws IOException {
		  BufferedImage scrambled = original;
		  Mosaic2 m = new Mosaic2 (safePrime - 1, pixelSize, scrambled);
		  //scramble each row
		  for (int y = 0; y < safePrime - 1; y++) {
			   ArrayList<BufferedImage> origRow = new ArrayList<BufferedImage>();
			  
			  for (int j = 0; j < safePrime - 1; j++) {
				  BufferedImage c = m.getPixel(j, y); 
				  origRow.add(c);
			  }

			  for (BufferedImage bi : origRow) {
			  }
			  
			  System.out.println();
			  
			  //line #1
			  ArrayList<BufferedImage> scrambledRow = funnyMosaicEncrypt (origRow, pr);
			  
			  //this for loop used for testing - outputs the correct and
			  //expected values for scrambledRow
			  for (int k = 0; k < safePrime - 1; k++) {
			  }
			  
			  for (int j = 0; j < safePrime - 1; j++) {
				  BufferedImage newImage = scrambledRow.get(j);
				  
				  //this line used for testing - somehow outputs  different values for scrambledRow 
				  //despite it being the same code to loop through the arraylist of size safeprime - 1
				  //computeAverage function does NOT change either newImage or scrambledRow
				  //nor did I ever change the scrambledRow arraylist in between this loop and line #1
				  //does .get somehow change the arraylist values?
				  
				  m.setPixel(j, y, newImage);
				  
			  }

			  
			  percentEncrypted += 100.0 / ((safePrime - 1) * 4);
			  percentRemoved += 100.0 / ((safePrime - 1) * 8);
		  }
		  scrambled = m.getMosaic();
		  return scrambled;
		  
	  }
	
	
	public static ArrayList<Integer> RNG (int lowerBound, int upperBound, int numSamples, int qSeedIndex, int rSeedIndex) {
		
		ArrayList<Integer> generatedNums = new ArrayList<Integer>();
		int range = upperBound - lowerBound;
		
		ArrayList <Integer> proots = new ArrayList <Integer> ();
 		 for (int i = 0; i < (largeSafePrime - 1); i++) {
			  proots.add(i);
 		 }
 		 for (int i = 0; i < largeSafePrime; i++) {
			  int j = proots.indexOf((i*i) % largeSafePrime);
			  if (j != -1) {
				  proots.remove(j);
			  }
			 
 		 }
 		 
 		int q = proots.get(qSeedIndex);
 		int r = proots.get(rSeedIndex);

 		
 		 
		for (int n = 1; n <= numSamples; n++) {
			int nextRemainder = prToThe2 (q, prToThe2 (r, n) - 1);
			generatedNums.add(nextRemainder % range);
		}
		
		for (int i = 0; i < numSamples; i++) {
			int orig = generatedNums.get(i);
			generatedNums.set(i, orig + lowerBound);
		}
		
		return generatedNums;
	}
	
	public ArrayList<T> randomPermutation (ArrayList<T> orig, int qSeedIndex, int rSeedIndex) {
		ArrayList<Integer> thingy = RNG(0, orig.size(), 10000, qSeedIndex, rSeedIndex);
		ArrayList<Integer> permutation = new ArrayList<Integer>();
		ArrayList<T> output = new ArrayList<T>();
		for (int i = 0; i < thingy.size(); i++) {
			if (permutation.indexOf(thingy.get(i)) == -1) {
				permutation.add(thingy.get(i));
			}
		}
		for (int i = 0; i < permutation.size(); i++) {
			output.add(orig.get(permutation.get(i)));
		}
		
		return output;
		
	}
	
	
	private static BufferedImage funnyMosaicScramble2 (BufferedImage original, int pr) throws IOException {
		  BufferedImage scrambled = original;
		 
		  Mosaic2 m = new Mosaic2 (safePrime - 1, pixelSize, scrambled);
		  //scramble each column
		  for (int x = 0; x < safePrime - 1; x++) {
			  ArrayList<BufferedImage> origCol = new ArrayList<BufferedImage>();
			  for (int j = 0; j < safePrime - 1; j++) {
				  BufferedImage c = m.getPixel(x, j);
				  origCol.add(c);
			  }
			 
			  ArrayList<BufferedImage> scrambledCol = funnyMosaicEncrypt (origCol, pr);
			  for (int j = 0; j < safePrime - 1; j++) {
				  BufferedImage newImage = scrambledCol.get(j);
				  m.setPixel(x, j, newImage);
			  }
				  percentEncrypted += 100.0 / ((safePrime - 1) * 4);
				  percentRemoved += 100.0 / ((safePrime - 1) * 8);


		  }
		  scrambled = m.getMosaic();
		  return scrambled;
		}
	
	private static BufferedImage funnyMosaicScrambleD1 (BufferedImage original, int pr1, int pr2) throws IOException {
	   	  BufferedImage scrambled = original;
	   	 
		  Mosaic2 m = new Mosaic2 (safePrime - 1, pixelSize, scrambled);

	   	  //scramble each row
	   	  for (int y = 0; y < safePrime - 1; y++) {
	   		  ArrayList<BufferedImage> origRow = new ArrayList<BufferedImage>();
	   		  for (int j = 0; j < safePrime - 1; j++) {
	   			  int modifiedY = (y + (prToThe(j+1, pr1))) % (safePrime - 1);
	   			  BufferedImage c = m.getPixel(j, modifiedY);
	   			  origRow.add(c);
	   		  }
	   		 
	   		  ArrayList<BufferedImage> scrambledRow = funnyMosaicEncrypt (origRow, pr2);
	   		  for (int j = 0; j < safePrime - 1; j++) {
	   			  int modifiedY = (y + (prToThe(j+1, pr1))) % (safePrime - 1);
	   			  BufferedImage newImage = scrambledRow.get(j);
	   			  
	   			  m.setPixel(j, modifiedY, newImage);
	   			  
	   		  }
				  percentEncrypted += 100.0 / ((safePrime - 1) * 4);
				  percentRemoved += 100.0 / ((safePrime - 1) * 8);


	   	  }
		  scrambled = m.getMosaic();
	   	  return scrambled;
	     }
	
	private static BufferedImage funnyMosaicScrambleD2 (BufferedImage original, int pr1, int pr2) throws IOException{
		  BufferedImage scrambled = original;
		  Mosaic2 m = new Mosaic2 (safePrime - 1, pixelSize, scrambled);
		  
		  //scramble each column
		  for (int x = 0; x < safePrime - 1; x++) {
			  ArrayList<BufferedImage> origCol = new ArrayList<BufferedImage>();
			  for (int j = 0; j < safePrime - 1; j++) {
				  int modifiedX = (x + (prToThe(j+1, pr1))) % (safePrime - 1);
				  BufferedImage c = m.getPixel(modifiedX, j);
				  origCol.add(c);
			  }
			 
			  ArrayList<BufferedImage> scrambledCol = funnyMosaicEncrypt (origCol, pr2);
			  for (int j = 0; j < safePrime - 1; j++) {
				  int modifiedX = (x + (prToThe(j+1, pr1))) % (safePrime - 1);
				  BufferedImage newImage = scrambledCol.get(j);
				  m.setPixel(modifiedX, j, newImage);
			  }
			  percentEncrypted += 100.0 / ((safePrime - 1) * 4);
			  percentRemoved += 100.0 / ((safePrime - 1) * 8);


		  }
		  scrambled = m.getMosaic();
		  return scrambled;
	}

public static BufferedImage mosaicUnscrambleRows (BufferedImage original, int pr) throws IOException {
	  BufferedImage unscrambled = original;
	  Mosaic2 m = new Mosaic2 (safePrime - 1, pixelSize, unscrambled);

	  //scramble each column
	  for (int x = 0; x < safePrime - 1; x++) {
		  ArrayList<BufferedImage> origCol = new ArrayList <BufferedImage> ();
		  for (int j = 0; j < safePrime - 1; j++) {
			  BufferedImage c = m.getPixel(x, j);
			  origCol.add(c);
		  }
		 
		  ArrayList<BufferedImage> unscrambledCol = mosaicDecryptCols (origCol, pr);
		  for (int j = 0; j < safePrime - 1; j++) {
			  BufferedImage newImage = unscrambledCol.get(j);
			  m.setPixel(x, j, newImage);
		  }
		  System.out.println("Row " + x + " unscrambled");
			  percentDecrypted += 100.0 / ((safePrime - 1) * 4);
			  percentRemoved += 100.0 / ((safePrime - 1) * 8);


	  }
	  unscrambled = m.getMosaic();
	  return unscrambled;
	}

	public static BufferedImage mosaicUnscrambleCols (BufferedImage original, int pr) throws IOException {
		  BufferedImage unscrambled = original;
		  Mosaic2 m = new Mosaic2 (safePrime - 1, pixelSize, unscrambled);
		 
		  //scramble each row
		  for (int y = 0; y < safePrime - 1; y++) {
			  ArrayList<BufferedImage> origRow = new ArrayList <BufferedImage> ();
			  for (int j = 0; j < safePrime - 1; j++) {
				  BufferedImage c = m.getPixel(j, y);
				  origRow.add(c);
			  }
			 
			  ArrayList<BufferedImage> unscrambledRow = mosaicDecryptRows (origRow, pr);
			  for (int j = 0; j < safePrime - 1; j++) {
				  BufferedImage newImage = unscrambledRow.get(j);
				  m.setPixel(j, y, newImage);
			  }
			  System.out.println("Column " + y + " unscrambled");
 			  percentDecrypted += 100.0 / ((safePrime - 1) * 4);
 			  percentRemoved += 100.0 / ((safePrime - 1) * 8);



		  }
		  unscrambled = m.getMosaic();
		  return unscrambled;
	  }
	
	public static BufferedImage mosaicUnscrambleD1 (BufferedImage original, int pr1, int pr2) throws IOException {
 		  BufferedImage unscrambled = original;
		  Mosaic2 m = new Mosaic2 (safePrime - 1, pixelSize, unscrambled);

 		  //scramble each row
 		  for (int y = 0; y < safePrime - 1; y++) {
 			  ArrayList<BufferedImage> origRow = new ArrayList <BufferedImage> ();
 			  for (int j = 0; j < safePrime - 1; j++) {
					  int modifiedY = (y + (prToThe(pr1, j))) % (safePrime - 1);
 				  BufferedImage c = m.getPixel(j, modifiedY);
 				  origRow.add(c);
 			  }
 			 
 			  ArrayList<BufferedImage> unscrambledRow = mosaicDecryptRows (origRow, pr2);
 			  for (int j = 0; j < safePrime - 1; j++) {
					  int modifiedY = (y + (prToThe(pr1, j))) % (safePrime - 1);
 				  BufferedImage newImage = unscrambledRow.get(j);
 				  m.setPixel(j, modifiedY, newImage);
 			  }
 			  System.out.println("Column " + y + " unscrambled");
	  			  percentDecrypted += 100.0 / ((safePrime - 1) * 4);
	  			  percentRemoved += 100.0 / ((safePrime - 1) * 8);


 		  }
 		  unscrambled = m.getMosaic();
 		  return unscrambled;
 	  }
	 
 	public static BufferedImage mosaicUnscrambleD2 (BufferedImage original, int pr1, int pr2) throws IOException {
 		  BufferedImage unscrambled = original;
		  Mosaic2 m = new Mosaic2 (safePrime - 1, pixelSize, unscrambled);

 		  //scramble each column
 		  for (int x = 0; x < safePrime - 1; x++) {
 			  ArrayList<BufferedImage> origCol = new ArrayList <BufferedImage> ();
 			  for (int j = 0; j < safePrime - 1; j++) {
   				  int modifiedX = (x + (prToThe(pr1, j))) % (safePrime - 1);
 				  BufferedImage c = m.getPixel(modifiedX, j);
 				  origCol.add(c);
 			  }
 			 
 			  ArrayList<BufferedImage> unscrambledCol = mosaicDecryptCols (origCol, pr2);
 			  for (int j = 0; j < safePrime - 1; j++) {
   				  int modifiedX = (x + (prToThe(pr1, j))) % (safePrime - 1);
 				  BufferedImage newImage = unscrambledCol.get(j);
 				  m.setPixel(modifiedX, j, newImage);
 			  }
 			  System.out.println("Row " + x + " unscrambled");
	  			  percentDecrypted += 100.0 / ((safePrime - 1) * 4);
	  			  percentRemoved += 100.0 / ((safePrime - 1) * 8);


 		  }
 		  unscrambled = m.getMosaic();
 		  return unscrambled;
   	}
 	
 	public static BufferedImage funnyMosaicUnscrambleRows (BufferedImage original, int pr) throws IOException {
 		  BufferedImage unscrambled = original;
 		  Mosaic2 m = new Mosaic2 (safePrime - 1, pixelSize, unscrambled);

 		  //scramble each column
 		  for (int x = 0; x < safePrime - 1; x++) {
 			  ArrayList<BufferedImage> origCol = new ArrayList <BufferedImage> ();
 			  for (int j = 0; j < safePrime - 1; j++) {
 				  BufferedImage c = m.getPixel(x, j);
 				  origCol.add(c);
 			  }
 			 
 			  ArrayList<BufferedImage> unscrambledCol = funnyMosaicDecrypt (origCol, pr);
 			  for (int j = 0; j < safePrime - 1; j++) {
 				  BufferedImage newImage = unscrambledCol.get(j);
 				  m.setPixel(x, j, newImage);
 			  }
 			  System.out.println("Row " + x + " unscrambled");
 				  percentDecrypted += 100.0 / ((safePrime - 1) * 4);
 				  percentRemoved += 100.0 / ((safePrime - 1) * 8);


 		  }
 		  unscrambled = m.getMosaic();
 		  return unscrambled;
 		}
 	
 	public static BufferedImage funnyMosaicUnscrambleCols (BufferedImage original, int pr) throws IOException {
		  BufferedImage unscrambled = original;
		  Mosaic2 m = new Mosaic2 (safePrime - 1, pixelSize, unscrambled);
		 
		  //scramble each row
		  for (int y = 0; y < safePrime - 1; y++) {
			  ArrayList<BufferedImage> origRow = new ArrayList <BufferedImage> ();
			  for (int j = 0; j < safePrime - 1; j++) {
				  BufferedImage c = m.getPixel(j, y);
				  origRow.add(c);
			  }
			 
			  ArrayList<BufferedImage> unscrambledRow = funnyMosaicDecrypt (origRow, pr);
			  for (int j = 0; j < safePrime - 1; j++) {
				  BufferedImage newImage = unscrambledRow.get(j);
				  m.setPixel(j, y, newImage);
			  }
			  System.out.println("Column " + y + " unscrambled");
			  percentDecrypted += 100.0 / ((safePrime - 1) * 4);
			  percentRemoved += 100.0 / ((safePrime - 1) * 8);



		  }
		  unscrambled = m.getMosaic();
		  return unscrambled;
	  }
 	
 	public static BufferedImage funnyMosaicUnscrambleD1 (BufferedImage original, int pr1, int pr2) throws IOException {
		  BufferedImage unscrambled = original;
		  Mosaic2 m = new Mosaic2 (safePrime - 1, pixelSize, unscrambled);

		  //scramble each row
		  for (int y = 0; y < safePrime - 1; y++) {
			  ArrayList<BufferedImage> origRow = new ArrayList <BufferedImage> ();
			  for (int j = 0; j < safePrime - 1; j++) {
					  int modifiedY = (y + (prToThe(j+1, pr1))) % (safePrime - 1);
				  BufferedImage c = m.getPixel(j, modifiedY);
				  origRow.add(c);
			  }
			 
			  ArrayList<BufferedImage> unscrambledRow = funnyMosaicDecrypt (origRow, pr2);
			  for (int j = 0; j < safePrime - 1; j++) {
					  int modifiedY = (y + (prToThe(j+1, pr1))) % (safePrime - 1);
				  BufferedImage newImage = unscrambledRow.get(j);
				  m.setPixel(j, modifiedY, newImage);
			  }
			  System.out.println("Column " + y + " unscrambled");
	  			  percentDecrypted += 100.0 / ((safePrime - 1) * 4);
	  			  percentRemoved += 100.0 / ((safePrime - 1) * 8);


		  }
		  unscrambled = m.getMosaic();
		  return unscrambled;
	  }
 	
 	public static BufferedImage funnyMosaicUnscrambleD2 (BufferedImage original, int pr1, int pr2) throws IOException {
		  BufferedImage unscrambled = original;
		  Mosaic2 m = new Mosaic2 (safePrime - 1, pixelSize, unscrambled);

		  //scramble each column
		  for (int x = 0; x < safePrime - 1; x++) {
			  ArrayList<BufferedImage> origCol = new ArrayList <BufferedImage> ();
			  for (int j = 0; j < safePrime - 1; j++) {
 				  int modifiedX = (x + (prToThe(j+1, pr1))) % (safePrime - 1);
				  BufferedImage c = m.getPixel(modifiedX, j);
				  origCol.add(c);
			  }
			 
			  ArrayList<BufferedImage> unscrambledCol = funnyMosaicDecrypt (origCol, pr2);
			  for (int j = 0; j < safePrime - 1; j++) {
 				  int modifiedX = (x + (prToThe(j+1, pr1))) % (safePrime - 1);
				  BufferedImage newImage = unscrambledCol.get(j);
				  m.setPixel(modifiedX, j, newImage);
			  }
			  System.out.println("Row " + x + " unscrambled");
	  			  percentDecrypted += 100.0 / ((safePrime - 1) * 4);
	  			  percentRemoved += 100.0 / ((safePrime - 1) * 8);


		  }
		  unscrambled = m.getMosaic();
		  return unscrambled;
 	}
 	
 	public void circularEncrypt (int dim) throws IOException{
		  Random random = new Random();
		 int width = dim;    //width of the image
		 int height = dim;   //height of the image
		 //generate the primitive roots mod safePrime
		 
		 ArrayList <Integer> proots = new ArrayList <Integer> ();
		 for (int i = 0; i < (safePrime - 1); i++) {
			  proots.add(i);
		 }
		 for (int i = 0; i < safePrime; i++) {
			  int j = proots.indexOf((i*i) % safePrime);
			  if (j != -1) {
				  proots.remove(j);
			  }
			 
		 }
		 int randomIndex = random.nextInt(proots.size());

		 int proot = proots.get(randomIndex);
		 
		 
		 File f = null;
		 
		 //read image
		 try{
		 f = new File(fileName); //image file path
		 rawImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		 rawImage = ImageIO.read(f);
		 image = resizeImage(rawImage, width, height);
		 System.out.println("Reading complete.");
		 }catch(IOException e){
		 System.out.println("Error: "+e);
		 }
		 
		 makeIntoCircle();
		 BufferedImage scrambledImage = circularScramble(image, proot);

		 System.out.println("Image Scrambled.");
		 
		 image = scrambledImage;

		 ImageIO.write(image, "png", f);
		 System.out.println("Image writing complete.");
		 
		 		 
		 System.out.println("Your decryption code is: \n" + proot + ". \nKeep this code to yourself but don't lose it!");
		      
		 
 	}
 	
 	public void circularDistort (int dim) throws IOException{
		  Random random = new Random();
		 int width = dim;    //width of the image
		 int height = dim;   //height of the image
		 
		 File f = null;
		 
		 //read image
		 try{
		 f = new File(fileName); //image file path
		 rawImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		 rawImage = ImageIO.read(f);
		 image = resizeImage(rawImage, width, height);
		 System.out.println("Reading complete.");
		 }catch(IOException e){
		 System.out.println("Error: "+e);
		 }
		 
		 makeIntoCircle();
		 BufferedImage scrambledImage = circularAverage(image);

		 System.out.println("Image Distorted.");
		 
		 image = scrambledImage;

		 ImageIO.write(image, "png", f);
		 System.out.println("Image writing complete.");
		 
		 		 
		      
		 
	}
 	
 	public void circularDistortAnim (int dim, String saveFolder) throws IOException{
		  Random random = new Random();
		 int width = dim;    //width of the image
		 int height = dim;   //height of the image
		 
		 File f = null;
		 
		 //read image
		 try{
		 f = new File(fileName); //image file path
		 rawImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		 rawImage = ImageIO.read(f);
		 image = resizeImage(rawImage, width, height);
		 System.out.println("Reading complete.");
		 }catch(IOException e){
		 System.out.println("Error: "+e);
		 }
		 
		 makeIntoCircle();
		 for (int frameNum = 0; frameNum < 150; frameNum++) {
			 BufferedImage frame = generateFrame(image, frameNum);
			 System.out.println("Frame "+ frameNum + " generated.");
		     File file = new File(saveFolder+"\\frame_" + frameNum + ".png");
		     file.createNewFile();
		     ImageIO.write(frame, "png", file);
			 System.out.println("Image writing for frame " + frameNum + " complete.");
		     
		 }
		 
		 
		 

		 
		 
		 		 
		      
		 
	}
 	
 	public void distort1 (int a1, int a2, int b1, int b2, int x) throws IOException{
		 int width = x;    //width of the image
		 int height = a1 - a2;   //height of the image
		 
		 File f = null;
		 
		 //read image
		 try{
		 f = new File(fileName); //image file path
		 rawImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		 rawImage = ImageIO.read(f);
		 image = resizeImage(rawImage, width, height);
		 System.out.println("Reading complete.");
		 }catch(IOException e){
		 System.out.println("Error: "+e);
		 }
		 
		 BufferedImage distortedImage = distort1helper (image, a1, a2, b1, b2, x);

		 System.out.println("Image Distorted.");
		 
		 image = distortedImage;

		 ImageIO.write(image, "png", f);
		 System.out.println("Image writing complete.");
		 
		 		 
		      
		 
	}
 	
 	public void distort2 (int a1, int a2, int b1, int b2, int x) throws IOException{
		 int width = x;    //width of the image
		 int height = b1 - b2;   //height of the image
		 
		 File f = null;
		 
		 //read image
		 try{
		 f = new File(fileName); //image file path
		 rawImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		 rawImage = ImageIO.read(f);
		 image = resizeImage(rawImage, width, height);
		 System.out.println("Reading complete.");
		 }catch(IOException e){
		 System.out.println("Error: "+e);
		 }
		 
		 BufferedImage distortedImage = distort2helper (image, a1, a2, b1, b2, x);

		 System.out.println("Image Distorted.");
		 
		 image = distortedImage;

		 ImageIO.write(image, "png", f);
		 System.out.println("Image writing complete.");
		 
		 		 
		      
		 
	}
 	
 	private static Color computeAverage (ArrayList<Color> input) {
    	long rSum = 0;
    	long gSum = 0;
    	long bSum = 0;
    	for (int i = 0; i < input.size(); i++) {
    			Color c = new Color (input.get(i).getRGB());
    			rSum += c.getRed();
    			gSum += c.getGreen();
    			bSum += c.getBlue();
    		
    	}
    	return new Color((int) (rSum / input.size()), (int) (gSum / input.size()), (int) (bSum / input.size()));
    }
 	
 	public BufferedImage distort1helper (BufferedImage orig, int a1, int a2, int b1, int b2, int x) {
 		
 		BufferedImage distorted = new BufferedImage(orig.getWidth(), orig.getHeight(), BufferedImage.TYPE_INT_ARGB);
 		
 		
 		for (int k = 0; k < orig.getWidth(); k++) {
 			double fraction = (double) k / x;
 			int lowerBound = (int) (a2 + fraction * (b2-a2));
			int upperBound = (int) (a1 - fraction * (a1-b1));
						
			
 			for (int y = 0; y < orig.getHeight(); y++) {
 		 		
 				int shiftedY = y + a2;
 				if (shiftedY < lowerBound || shiftedY > upperBound) {
 					int fuckme = Color.green.getRGB();
 					
 					distorted.setRGB(k, y, fuckme);
 					System.out.println("bad (k, y): " + k + ", " + y);
 				}
 				
 				else {
 					
 					double fuckyou =  ((double) shiftedY - (double) lowerBound) / ((double) upperBound - (double) lowerBound);
 					
 					int translatedYCoord = (int) ((fuckyou) * (a1 - a2));
 					
 					System.out.println("good (k, y): " + k + ", " + y);
 					if (translatedYCoord < 0) {
 						translatedYCoord = 0;
 					}
 					if (translatedYCoord >= (a1-a2)) {
 						translatedYCoord = a1-a2-1;
 					}
 					
 					int newRGB = orig.getRGB(k, translatedYCoord);
 					distorted.setRGB(k, y, newRGB);
 				}
 				
 				
 				
 			}
 			System.out.println();
 			
 		}
 		
 		return distorted;
 		
 	}
 	
 	public BufferedImage distort2helper (BufferedImage orig, int a1, int a2, int b1, int b2, int x) {
 		
 		BufferedImage distorted = new BufferedImage(orig.getWidth(), orig.getHeight(), BufferedImage.TYPE_INT_ARGB);
 		
 		
 		for (int k = 0; k < orig.getWidth(); k++) {
 			double fraction = (double) (x-k) / x;
 			int lowerBound = (int) (b2 + fraction * (a2-b2));
			int upperBound = (int) (b1 - fraction * (b1-a1));
						
			
 			for (int y = 0; y < orig.getHeight(); y++) {
 		 		
 				int shiftedY = y + b2;
 				if (shiftedY < lowerBound || shiftedY > upperBound) {
 					int fuckme = Color.green.getRGB();
 					
 					distorted.setRGB(k, y, fuckme);
 					System.out.println("bad (k, y): " + k + ", " + y);
 				}
 				
 				else {
 					
 					double fuckyou =  ((double) shiftedY - (double) lowerBound) / ((double) upperBound - (double) lowerBound);
 					
 					int translatedYCoord = (int) ((fuckyou) * (b1 - b2));
 					
 					System.out.println("good (k, y): " + k + ", " + y);
 					if (translatedYCoord < 0) {
 						translatedYCoord = 0;
 					}
 					if (translatedYCoord >= (b1-b2)) {
 						translatedYCoord = b1-b2-1;
 					}
 					
 					int newRGB = orig.getRGB(k, translatedYCoord);
 					distorted.setRGB(k, y, newRGB);
 				}
 				
 				
 				
 			}
 			System.out.println();
 			
 		}
 		
 		return distorted;
 		
 	}
 	
 	
 	
 	public void circularDecrypt (int dim) throws IOException{
 	   	 int width = dim;    //width of the image
 	   	 int height = dim;   //height of the image
 	   	 BufferedImage image = null;
 	   	 File f = null;
 	   	 Scanner scan = new Scanner(System.in);
 	  	 
 	   	 //read image
 	   	 try{
 	 		 f = new File(fileName); //image file path
 	 		 BufferedImage rawImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
 	 		 rawImage = ImageIO.read(f);
 	 		 image = resizeImage(rawImage, width, height);
 	 		 System.out.println("Reading complete.");
 	   	 }catch(IOException e){
 	 		 System.out.println("Error: "+e);
 	   	 }
 	  	 
 	   	 System.out.println("Enter the decryption code for that image: ");
 	  	 
 	   	 int root = scan.nextInt();

 	  	 
 	   	 BufferedImage unscrambledImage = circularUnscramble (image, root);
 	 

 	   	 System.out.println("Image unscrambled.");
 	  	 
 	  					 
 	   	 ImageIO.write(unscrambledImage, "png", f);
 	   	 System.out.println("Writing complete.");
 	   	 
 	   	 image = unscrambledImage;
 	 		      
 	 		 
 	     	}
 	
 	public void makeIntoCircle () {
 		
 		int dim = image.getHeight();
 		for (int x = 0; x < dim; x++ ) {
 			for (int y = 0; y < dim; y++ ) {
 	 			double minecraft = Math.sqrt(Math.pow(x - (dim / 2), 2) + Math.pow(y - (dim / 2), 2));
 	 			if (minecraft > (dim / 2)) {
 	 				image.setRGB(x, y, 0);
 	 			}
 	 		}
 		}
 		
 		
 	}
 	
 	public BufferedImage circularScramble (BufferedImage orig, int pr) {
 		BufferedImage scrambled = orig;
 		int sectors = safePrime - 1;
 		int dim = orig.getHeight();
 		for (int r = 0; r < (dim / 2); r++) {
 			
 			double increment = 360.0 / (2 * r * Math.PI);
 			for (double theta = 0; theta < (360.0 / sectors); theta += increment) {
 				ArrayList<Integer> origColors = new ArrayList<Integer> ();
 				
 				for (int i = 0; i < sectors; i++) {
 					int ecks = getXFromPolar (r, theta + (360.0 / sectors)*i, dim);
 					int why = getYFromPolar (r, theta + (360.0 / sectors)*i, dim);
 					origColors.add(orig.getRGB(ecks, why));
 				}
 				
 				ArrayList<Integer> scrambledColors = circEncrypt(origColors, pr);
 				
 				for (int i = 0; i < sectors; i++) {
 					int ecks = getXFromPolar (r, theta + (360.0 / sectors)*i, dim);
 					int why = getYFromPolar (r, theta + (360.0 / sectors)*i, dim);
 					scrambled.setRGB(ecks, why, scrambledColors.get(i));
 				}
 			}
 			
 		}
 		
 		return scrambled;
 			
 		
 		
 	}
 	
 	public BufferedImage circularAverage (BufferedImage orig) {
 		BufferedImage result = orig;
 		int dim = orig.getHeight();
 		for (int r = 0; r < (dim / 2); r++) {
 			double increment = 360.0 / (4 * r * Math.PI);
			ArrayList<Color> origColors = new ArrayList<Color> ();
 			for (double theta = 0; theta < (360.0); theta += increment) {
 				int ecks = getXFromPolar (r, theta, dim);
 				int why = getYFromPolar (r, theta, dim);
 				int theRGB = orig.getRGB(ecks, why);
 				origColors.add(new Color(theRGB));
 			}
 			Color avg = computeAverage(origColors);
 			
 			for (double theta = 0; theta < 360.0; theta += increment) {
 				int ecks = getXFromPolar (r, theta, dim);
 				int why = getYFromPolar (r, theta, dim);
 				result.setRGB(ecks, why, avg.getRGB());
 			}
 		}
 		return result;
 	}
 	
 	public BufferedImage generateFrame (BufferedImage orig, int frameNum) {
 		double time = frameNum / 30.0;
 		double speed = time * 5.0;
 		double angle = 360.0 - ((2.5 * time * time) % 1.0) * 360.0;
 		//double blurFactor = 1 - (1 / Math.pow(speed + 1, 0.69)); 
 		double blurFactor = (speed) / 168.0;
 		BufferedImage result = circularLocalRotate (orig, blurFactor, angle);
 		return result;
 	}
 	
 	
 	
 	public BufferedImage circularLocalAverage (BufferedImage orig, double blurFactor) {
 		BufferedImage result = orig;
 		int dim = orig.getHeight();
 		for (int r = 0; r < (dim / 2); r++) {
			double increment = 360.0 / (3 * r * Math.PI);
			System.out.println("r: " + r);
 			for (double theta = 0; theta < 360.0; theta += increment) {
 				double lower = theta - blurFactor * 180.0;
 				double upper = theta + blurFactor * 180.0;
 				ArrayList<Color> origColors = new ArrayList<Color> ();
 				for (double theta2 = lower; theta2 < upper; theta2 += increment) {
 	 				int ecks = getXFromPolar (r, theta2 % 360.0, dim);
 	 				int why = getYFromPolar (r, theta2 % 360.0, dim);
 	 				int theRGB = orig.getRGB(ecks, why);
 	 				origColors.add(new Color(theRGB));
 	 			}
 				if (origColors.size() > 0) {
	 	 			Color avg = computeAverage(origColors);
	 	 			int ecks = getXFromPolar (r, theta, dim);
	 				int why = getYFromPolar (r, theta, dim);
	 				result.setRGB(ecks, why, avg.getRGB());
 				}
 				else {
 					int ecks = getXFromPolar (r, theta, dim);
	 				int why = getYFromPolar (r, theta, dim);
 	 				int theRGB = orig.getRGB(ecks, why);
 	 				result.setRGB(ecks, why, theRGB);
 				}
 				
 			}
 		}
 		return result;
 	}
 	public BufferedImage circularLocalRotate (BufferedImage orig, double blurFactor, double angle) {
 		BufferedImage result = orig;
 		result = circularLocalAverage (result, blurFactor);
 		result = rotate (result, angle);
 		int dimension = orig.getHeight();
 		int upperCorner = result.getHeight() / 2 - dimension / 2;
 		result = result.getSubimage(upperCorner, upperCorner, dimension, dimension);
 		return result;
 		
	}
 	
 	

 	public BufferedImage rotate(BufferedImage bimg, Double angle) {
 	    double sin = Math.abs(Math.sin(Math.toRadians(angle))),
 	           cos = Math.abs(Math.cos(Math.toRadians(angle)));
 	    int w = bimg.getWidth();
 	    int h = bimg.getHeight();
 	    int neww = (int) Math.floor(w*cos + h*sin),
 	        newh = (int) Math.floor(h*cos + w*sin);
 	    BufferedImage rotated = new BufferedImage(neww, newh, bimg.getType());
 	    Graphics2D graphic = rotated.createGraphics();
 	    graphic.translate((neww-w)/2, (newh-h)/2);
 	    graphic.rotate(Math.toRadians(angle), w/2, h/2);
 	    graphic.drawRenderedImage(bimg, null);
 	    graphic.dispose();
 	    return rotated;
 	}
 	
 	public BufferedImage circularUnscramble (BufferedImage orig, int pr) {
 		BufferedImage unscrambled = orig;
 		int sectors = safePrime - 1;
 		int dim = orig.getHeight();
 		for (int r = 0; r < (dim / 2); r++) {
 			double increment = 360.0 / (2 * r * Math.PI);
 			for (double theta = 0; theta < (360.0 / sectors); theta += increment) {
 				ArrayList<Integer> origColors = new ArrayList<Integer> ();
 				
 				for (int i = 0; i < sectors; i++) {
 					int ecks = getXFromPolar (r, theta + (360.0 / sectors)*i, dim);
 					int why = getYFromPolar (r, theta + (360.0 / sectors)*i, dim);
 					origColors.add(orig.getRGB(ecks, why));
 				}
 				
 				ArrayList<Integer> unscrambledColors = circDecrypt(origColors, pr);
 				
 				for (int i = 0; i < sectors; i++) {
 					int ecks = getXFromPolar (r, theta + (360.0 / sectors)*i, dim);
 					int why = getYFromPolar (r, theta + (360.0 / sectors)*i, dim);
 					unscrambled.setRGB(ecks, why, unscrambledColors.get(i));
 				}
 			}
 			
 		}
 		
 		return unscrambled;
 			
 		
 		
 	}
 	
 	private int getXFromPolar (int r, double theta, int dim) {
 		double thetaInRadians = Math.toRadians(theta);
 		int unshiftedX = (int) (r * Math.cos(thetaInRadians));
 		int returnedValue = unshiftedX + (dim / 2);
 		
 		if (returnedValue < 0) {
 			int offset = 0 - returnedValue;
 			returnedValue += offset;
 		}
 		
 		if (returnedValue >= dim) {
 			int offset = returnedValue - (dim - 1);
 			returnedValue -= offset;
 		}
 		
 		return returnedValue; 
 	}
 	
	private int getYFromPolar (int r, double theta, int dim) {
 		double thetaInRadians = Math.toRadians(theta);
 		int unshiftedY = (int) (r * Math.sin(thetaInRadians));
 		int returnedValue = unshiftedY + (dim / 2);
 		
 		if (returnedValue < 0) {
 			int offset = 0 - returnedValue;
 			returnedValue += offset;
 		}
 		
 		if (returnedValue >= dim) {
 			int offset = returnedValue - (dim - 1);
 			returnedValue -= offset;
 		}

 		return returnedValue; 
 	}
	
	private static ArrayList<Integer> circEncrypt (ArrayList <Integer> original, int pr) {
  	  ArrayList<Integer> newArr = new ArrayList<Integer>();
  	  for (int i = 0; i < original.size(); i++) {
  		  newArr.add(original.get(prToThe(pr, i) - 1));

  	  }
  	  return newArr;
	}
	
	public static ArrayList<Integer> circDecrypt (ArrayList <Integer> original, int pr) {
		  ArrayList<Integer> newArr = new ArrayList<Integer>();
		  for (int i = 0; i < original.size(); i++) {
			 
			  newArr.add(original.get(discreteLogBasePrModsafePrime_(pr, i+1) % (safePrime - 1)));
		  }
		  return newArr;
 	}
 	
 	private ArrayList<Integer> shiftedCoords (int x, int y, int dim) {
 		ArrayList<Integer> returnedArray = new ArrayList<Integer>();
 		returnedArray.add(x - (int) (dim / 2));
 		returnedArray.add(y - (int) (dim / 2));
 		return returnedArray;
 	}
 	
 	
 	
 	

}

class Mosaic2 {
		private ArrayList<BufferedImage> mosaicImages = new ArrayList<BufferedImage>();
		private int dimension;
		private int pixelSize;
		private BufferedImage orig;
		private BufferedImage origMosaic;
		private BufferedImage mosaic;
		public Mosaic2 (int spd, int ps, BufferedImage b) throws IOException {
			dimension = spd;
			pixelSize = ps;
			orig = b;
			fractionate();

		}
		
		private void fractionate () throws IOException {
			mosaic = resizeImage(orig, dimension*pixelSize, dimension*pixelSize);
			origMosaic = resizeImage(orig, dimension*pixelSize, dimension*pixelSize);

			for (int x = 0; x < dimension; x++) {
     		 for (int y = 0; y < dimension; y++) {

     			 //compute average RGB of cell
     			 BufferedImage sub = origMosaic.getSubimage(x * pixelSize, y*pixelSize, pixelSize, pixelSize);

     			 mosaicImages.add(sub);

     			 
     			 
     		 }
     	 }
			
		}
		
		public BufferedImage getMosaic () {
			return mosaic;
		}
		
		public ArrayList<BufferedImage> getMosaicImages() {
			return mosaicImages;
		}
		
		public void setPixel (int x, int y, BufferedImage bi) {
			
			for (int i = x*pixelSize; i < (x+1)*pixelSize; i++) {
			for (int j = y*pixelSize; j < (y+1)*pixelSize; j++) {
				int newRGB = bi.getRGB(i % pixelSize, j % pixelSize);
				mosaic.setRGB(i, j, newRGB);
			}
		 }
		}
		
		public BufferedImage getPixel (int xCoord, int yCoord) {
			BufferedImage returnedImage = mosaicImages.get(dimension * xCoord + yCoord);
			return returnedImage;
		}
		
		static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) throws IOException {
		   	 BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
		   	 Graphics2D graphics2D = resizedImage.createGraphics();
		   	 graphics2D.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
		   	 graphics2D.dispose();
		   	 return resizedImage;
			}
		
		private static Color computeAverage (BufferedImage bi) {
	    	long rSum = 0;
	    	long gSum = 0;
	    	long bSum = 0;
	    	for (int i = 0; i < bi.getWidth(); i++) {
	    		for (int j = 0; j < bi.getHeight(); j++) {
	    			Color c = new Color (bi.getRGB(i, j));
	    			rSum += c.getRed();
	    			gSum += c.getGreen();
	    			bSum += c.getBlue();
	    		}
	    	}
	    	int totalPixels = bi.getWidth() * bi.getHeight();
	    	return new Color((int) (rSum / totalPixels), (int) (gSum / totalPixels), (int) (bSum / totalPixels));
	    }
		
		
		private static Color computeAverage (ArrayList<Color> input) {
	    	long rSum = 0;
	    	long gSum = 0;
	    	long bSum = 0;
	    	for (int i = 0; i < input.size(); i++) {
	    			Color c = new Color (input.get(i).getRGB());
	    			rSum += c.getRed();
	    			gSum += c.getGreen();
	    			bSum += c.getBlue();
	    		
	    	}
	    	return new Color((int) (rSum / input.size()), (int) (gSum / input.size()), (int) (bSum / input.size()));
	    }
		
	}




