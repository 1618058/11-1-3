package recognition03;

import com.ibm.watson.developer_cloud.visual_recognition.v3.model.ClassifiedImages;

public class Recognition03_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recognition03_lib rec_lib = new Recognition03_lib();
		ClassifiedImages result = rec_lib.getRecognition("img\\S__144777258.jpg");
		rec_lib.getJson(result);
	}

}
