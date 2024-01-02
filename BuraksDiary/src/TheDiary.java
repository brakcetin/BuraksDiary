import java.util.Scanner;

public class TheDiary {
	
	private String answer;
	private boolean answerCheck = false;
	Scanner scan = new Scanner(System.in);
	
	public TheDiary() {
		super();
	}
	
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public boolean isAnswerCheck() {
		return answerCheck;
	}
	public void setAnswerCheck(boolean answerCheck) {
		this.answerCheck = answerCheck;
	}
	
	public void chooseLanguage() {
		
		System.out.println("\r\n--------------------------------------------------------");
		System.out.println("- Choose the language you want to view Burak Cetin's Diary in.\r\n"
				+ "  Type \"tr\" for Turkish and \"en\" for English!\r\n"
				+ "- Turkish\r\n"
				+ "- English");
		
		answerCheck = false;
		while(!answerCheck) {
				System.out.printf("=> ");
				answer = scan.next();
				
				switch(answer) {
				case "tr":
					theListOfDiaryTR();
					answerCheck = true;
					break;
				case "en":
					theListOfDiaryEN();
					answerCheck = true;
					break;
				default:
					System.out.println("- Type \"tr\" for Turkish and \"en\" for English!");
				}
		}
	}
	public void theListOfDiaryTR() {
		System.out.println("\r\n--------------------------------------------------------");
		System.out.println("\t\tBurak Çetin'in Günlüğü");
		System.out.println("--------------------------------------------------------\r\n");
		
		System.out.println("- 12 Aralık Salı");
		System.out.println("\t07.30\tUyandım\r\n\t"
				+ "08.00\tKahvaltı yaptım - peynirli omlet\r\n\t"
				+ "08.30\tEvden çıktım\r\n\t"
				+ "09.00\tOtobüse bindim\r\n\t"
				+ "9.30\tYapay zeka konferansına katıldım\r\n\t"
				+ "13.00\tÖğlen yemeği yedim\r\n\t"
				+ "13.30\tKonferansın 2. Oturumuna katıldım\r\n\t"
				+ "15.30\tPİCUS Genel müdür yardımcısı Dr. Süleyman Özarslan ile görüştüm\r\n\t"
				+ "16.30\tKız arkadaşımla buluştum\r\n\t"
				+ "17.00\tYemek yedik - Sushi -  IF Sokak\r\n\t"
				+ "19.00\tKafede oturduk - Tatlı yedik\r\n\t"
				+ "20.00\tTunalıda gezdik\r\n\t"
				+ "21.30\tEve döndüm\r\n\t"
				+ "23.00\tKahve içtim\r\n\t"
				+ "00.00\tUyudum\r\n");
		
		System.out.println("- 13 Aralık Çarşamba");
		System.out.println("\t8.00\tUyandım\r\n\t"
				+ "08.10\tKahvaltı yaptım - peynirli omlet\r\n\t"
				+ "08.40\tEvden çıktım\r\n\t"
				+ "09.00\tOtobüse bindim\r\n\t"
				+ "09.30\tOOP lab dersine katıldım\r\n\t"
				+ "11.00\tDers bitti\r\n\t"
				+ "11.30\tKız arkadaşımla buluştum\r\n\t"
				+ "12.00\tYemek yedik\r\n\t"
				+ "12.30\tKütüphaneye gittik Data structures çalıştım\r\n\t"
				+ "15.30\tKütüphaneden çıktık - Entegre Kütüphane Kızılay\r\n\t"
				+ "16.00\tCaribou kafede oturduk\r\n\t"
				+ "16.30\tDolaştık\r\n\t"
				+ "18.00\tEve döndüm\r\n\t"
				+ "19.00\tYemek yedim dizi izledim - Pilav üstü tavuk ve tarhana çorbası\r\n\t"
				+ "20.00\tUyudum\r\n\t"
				+ "21.00\tÇay içtim\r\n\t"
				+ "22.00\tYoutube'a baktım\r\n\t"
				+ "00.00\tKitap okudum\r\n\t"
				+ "01.00\tUyudum\r\n");
		
		System.out.println("- 14 Aralık Perşembe");
		System.out.println("\t10.30\tUyandım\r\n\t"
				+ "11.00\tDuş aldım\r\n\t"
				+ "12.00\tKahvaltı yaptım - peynirli omlet\r\n\t"
				+ "12.30\tEvden çıktım\r\n\t"
				+ "13.00\tOtobüse bindim\r\n\t"
				+ "13.30\tDifferential Equations dersine geldim\r\n\t"
				+ "15.00\tDers bitti\r\n\t"
				+ "15.30\tKız arkadaşımla buluştuk - Panora AVM\r\n\t"
				+ "16.00\tAVM'de biraz gezdik\r\n\t"
				+ "17.30\tYemek yedik - Tavuk dürüm\r\n\t"
				+ "18.30\tSinemada açlık oyunları filmine gitti\r\n\t"
				+ "21.00\tAVM'den çıktık\r\n\t"
				+ "21.30\tOtobüse bindim\r\n\t"
				+ "22.30\tEve döndüm\r\n\t"
				+ "23.00\tAilemle vakit geçirdim\r\n\t"
				+ "01.00\tUyudum\r\n");
		
		System.out.println("- 15 Aralık Cuma");
		System.out.println("\t07.00\tUyandım\r\n\t"
				+ "07.30\tKahvaltı yaptım - peynirli omlet\r\n\t"
				+ "08.00\tEvden çıktım\r\n\t"
				+ "08.30\tOtobüse bindim\r\n\t"
				+ "09.00\tOkula geldim\r\n\t"
				+ "09.45\tElektrik ve Elektronik Devreleri dersine katıldım\r\n\t"
				+ "10.45\tDers bitti\r\n\t"
				+ "11.00\tKız arkadaşımla buluştuk - Panora AVM\r\n\t"
				+ "12.00\tKafede oturduk doğum günümü kutladık\r\n\t"
				+ "15.00\tYemek yedik - Cheeseburger\r\n\t"
				+ "16.00\tMağaza gezdik\r\n\t"
				+ "18.00\tSohbet ettik\r\n\t"
				+ "19.00\tKafede oturduk\r\n\t"
				+ "20.00\tOtobüse bindim\r\n\t"
				+ "21.30\tEve geldim\r\n\t"
				+ "22.00\tAilemle doğum günümü kutladık\r\n\t"
				+ "23.00\tBir şeyler yedim\r\n\t"
				+ "01.00\tUyudum\r\n");
		
		System.out.println("- 16 Aralık Cumartesi");
		System.out.println("\t09.00\tUyandım\r\n\t"
				+ "09.30\tKahvaltı yaptım - peynirli omlet\r\n\t"
				+ "10.00\tEvden çıktım\r\n\t"
				+ "10.30\tOtobüse bindim\r\n\t"
				+ "11.00\tBoks antrenmanına gittim (2 saat)\r\n\t"
				+ "13.00\tAtıştırmalık yedim\r\n\t"
				+ "13.30\tOtobüse bindim\r\n\t"
				+ "14.00\tÖzel matematik dersi vermeye gittim\r\n\t"
				+ "16.00\tDers bitti\r\n\t"
				+ "16.10\tArabaya bindim\r\n\t"
				+ "16.40\tAilemle baanneme geldik\r\n\t"
				+ "17.00\tDuş aldım\r\n\t"
				+ "18.00\tYemek yedik - kıymalı pide\r\n\t"
				+ "19.00\tSohbet ettik\r\n\t"
				+ "00.00\tEve geldik\r\n\t"
				+ "01.00\tUyudum\r\n");
		
		System.out.println("- 17 Aralık Pazar");
		System.out.println("\t09.00\tUyandım\r\n\t"
				+ "09.30\tKahvaltı yaptım - peynirli omlet\r\n\t"
				+ "10.00\tEvden çıktım\r\n\t"
				+ "10.30\tOtobüse bindim\r\n\t"
				+ "11.00\tBoks antrenmanına gittim (2 saat)\r\n\t"
				+ "13.00\tMetroya bindim\r\n\t"
				+ "13.30\tOtobüse bindim\r\n\t"
				+ "14.00\tKız arkadaşımla buluştum\r\n\t"
				+ "14.30\tYemek yedik - Tavuk burger\r\n\t"
				+ "15.00\tKütüphanede ders çalıştık - Data Structures\r\n\t"
				+ "19.00\tOtobüse bindim\r\n\t"
				+ "19.30\tEve geldim\r\n\t"
				+ "20.00\tDuş aldım\r\n\t"
				+ "20.30\tYemek yedim - Ispanak ve tarhana çorbası\r\n\t"
				+ "21.30\t1 saat telefonda Fifa oynadım\r\n\t"
				+ "22.30\tYouTube'a baktım\r\n\t"
				+ "23.30\tKitap okudum\r\n\t"
				+ "01.00\tUyudum\r\n");
		
		System.out.println("- 18 Aralık Pazartesi");
		System.out.println("\t08.30\tUyandım\r\n\t"
				+ "09.00\tKahvaltı yaptım - peynirli omlet\r\n\t"
				+ "09.30\tOtobüse bindim\r\n\t"
				+ "10.00\tAcademic English dersine katıldım \r\n\t"
				+ "12.00\tOkulda öğlen yemeği  yedim \r\n\t"
				+ "13.30\tOlasılık ve istatistik dersine katıldım\r\n\t"
				+ "16.00\tOkul kütüphanesinde ders çalıştım\r\n\t"
				+ "17.30\tData Structures dersine katıldım\r\n\t"
				+ "19.30\tDers bitti\r\n\t"
				+ "20.00\tOtobüse bindim\r\n\t"
				+ "20.30\tEve geldim\r\n\t"
				+ "21.00\tAkşam yemeği yedim - Pilav + tarhana çorbası\r\n\t"
				+ "22.00\tDizi izledim - Friends\r\n\t"
				+ "00.00\tKitap okudum\r\n\t"
				+ "02.00\tUyudum\r\n");
		
		System.out.println("- 19 Aralık Salı");
		System.out.println("\t10.00\tUyandım\r\n\t"
				+ "10.30\tKahvaltı yaptım - Patates\r\n\t"
				+ "12.30\tEvden çıktım\r\n\t"
				+ "13.00\tOtobüse bindim\r\n\t"
				+ "13.30\tDifferential Equations dersine katıldım\r\n\t"
				+ "15.00\tDers bitti\r\n\t"
				+ "15.30\tKız arkadaşımla buluştuk\r\n\t"
				+ "16.00\tYemek yedik - peynirli ve salamlı sandviç\r\n\t"
				+ "17.00\tKütüphaneye gittik - Data Structures çalıştım\r\n\t"
				+ "19.30\tKütüphaneden çıktık\r\n\t"
				+ "20.00\tKızılayda gezdik\r\n\t"
				+ "21.00\tOtobüse bindim\r\n\t"
				+ "21.30\tEve döndüm\r\n\t"
				+ "22.00\tÇay içtim\r\n\t"
				+ "22.30\tYouTube'a baktım\r\n\t"
				+ "01.00\tUyudum\r\n");
	}
	
	public void theListOfDiaryEN() {
		System.out.println("\r\n--------------------------------------------------------");
		System.out.println("\t\tBurak Çetin's Diary");
		System.out.println("--------------------------------------------------------\r\n");
		
		System.out.println("- Tuesday, December 12");
		System.out.println("\t07.30\tWoke up\r\n\t"
				+ "08.00\tI had breakfast - cheese omelet\r\n\t"
				+ "08.30\tI left home\r\n\t"
				+ "09.00\tI got on the bus\r\n\t"
				+ "09.30\tI attended an artificial intelligence conference\r\n\t"
				+ "13.00\tI had lunch\r\n\t"
				+ "13.30\tI attended the 2nd session of the conference\r\n\t"
				+ "15.30\tI met with Dr. Süleyman Özarslan, Deputy Director General of PICUS\r\n\t"
				+ "16.30\tI met my girlfriend\r\n\t"
				+ "17.00\tWe ate - Sushi - IF Street\r\n\t"
				+ "19.00\tWe sat in the cafe - we had dessert\r\n\t"
				+ "20.00\tWe walked in Tunalı\r\n\t"
				+ "21.30\tI'm home\r\n\t"
				+ "23.00\tI had coffee\r\n\t"
				+ "00.00\tSleep\r\n");
		
		System.out.println("- Wednesday, December 13");
		System.out.println("\t8.00\tWoke up\r\n\t"
				+ "08.10\tI had breakfast - omelet with cheese\r\n\t"
				+ "08.40\tI left home\r\n\t"
				+ "09.00\tI got on the bus\r\n\t"
				+ "09.30\tI attended the OOP lab class\r\n\t"
				+ "11.00\tClass is over\r\n\t"
				+ "11.30\tI met my girlfriend\r\n\t"
				+ "12.00\tWe had dinner\r\n\t"
				+ "12.30\tWent to the library and studied data structures\r\n\t"
				+ "15.30\tWe left the library - Integrated Library Kızılay\r\n\t"
				+ "16.00\tWe sat in the Caribou cafe\r\n\t"
				+ "16.30\tWe've been around\r\n\t"
				+ "18.00\tI'm home\r\n\t"
				+ "19.00\tI had dinner and watched TV series - Chicken over rice and tarhana soup\r\n\t"
				+ "20.00\tSleep\r\n\t"
				+ "21.00\tI had tea\r\n\t"
				+ "22.00\tI watched videos on Youtube\r\n\t"
				+ "00.00\tI read a book\r\n\t"
				+ "01.00\tSleep\r\n");
		
		System.out.println("- Thursday, December 14");
		System.out.println("\t10.30\tWoke up\r\n\t"
				+ "11.00\tTook a shower\r\n\t"
				+ "12.00\tI made breakfast - cheese omelet\r\n\t"
				+ "12.30\tI left home\r\n\t"
				+ "13.00\tI got on the bus\r\n\t"
				+ "13.30\tI attended the Differential Equations class\r\n\t"
				+ "15.00\tClass is over\r\n\t"
				+ "15.30\tMeet my girlfriend - Panora Mall\r\n\t"
				+ "16.00\tTook a walk in the mall\r\n\t"
				+ "17.30\tWe had dinner - chicken wrap\r\n\t"
				+ "18.30\tWe went to the Hunger Games movie at the cinema\r\n\t"
				+ "21.00\tWe left the mall\r\n\t"
				+ "21.30\tI got on the bus\r\n\t"
				+ "22.30\tI'm home\r\n\t"
				+ "23.00\tI spent time with my family\r\n\t"
				+ "01.00\tSleep\r\n");
		
		System.out.println("- Friday, December 15");
		System.out.println("\t07.00\tWoke up\r\n\t"
				+ "07.30\tI had breakfast - omelet with cheese\r\n\t"
				+ "08.00\tI left home\r\n\t"
				+ "08.30\tI got on the bus\r\n\t"
				+ "09.00\tI came to school\r\n\t"
				+ "09.45\tI attended the Electricity and Electronics Circuits class\r\n\t"
				+ "10.45\tClass is over\r\n\t"
				+ "11.00\tMeet my girlfriend - Panora Mall\r\n\t"
				+ "12.00\tWe sat in the cafe and celebrated my birthday\r\n\t"
				+ "15.00\tWe ate - Cheeseburger\r\n\t"
				+ "16.00\tWe visited a store\r\n\t"
				+ "18.00\tWe had a chat\r\n\t"
				+ "19.00\tWe sat in the cafe\r\n\t"
				+ "20.00\tI got on the bus\r\n\t"
				+ "21.30\tI'm home\r\n\t"
				+ "22.00\tI celebrated my birthday with my family\r\n\t"
				+ "23.00\tI had something to eat\r\n\t"
				+ "01.00\tSleep\r\n");
		
		System.out.println("- Saturday, December 16");
		System.out.println("\t09.00\tWoke up\r\n\t"
				+ "09.30\tI had breakfast - omelet with cheese\r\n\t"
				+ "10.00\tI'm out of the house\r\n\t"
				+ "10.30\tI got on the bus\r\n\t"
				+ "11.00\tI went to boxing training (2 hours)\r\n\t"
				+ "13.00\tI had a snack\r\n\t"
				+ "13.30\tI took the bus\r\n\t"
				+ "14.00\tI went for a math tutoring session.\r\n\t"
				+ "16.00\tClass is over\r\n\t"
				+ "16.10\tI got in the car\r\n\t"
				+ "16.40\tWe came to my home with my family\r\n\t"
				+ "17.00\tTook a shower\r\n\t"
				+ "18.00\tWe had dinner - pita with minced meat\r\n\t"
				+ "19.00\tWe had a chat\r\n\t"
				+ "00.00\tWe're home\r\n\t"
				+ "01.00\tSleep\r\n");
		
		System.out.println("- Sunday, December 17");
		System.out.println("\t09.00\tWoke up\r\n\t"
				+ "09.30\tI had breakfast - omelet with cheese\r\n\t"
				+ "10.00\tI'm out of the house\r\n\t"
				+ "10.30\tI got on the bus\r\n\t"
				+ "11.00\tI went to boxing training (2 hours)\r\n\t"
				+ "13.00\tI took the subway\r\n\t"
				+ "13.30\tI took the bus\r\n\t"
				+ "14.00\tI met my girlfriend\r\n\t"
				+ "14.30\tWe had dinner - chicken burger\r\n\t"
				+ "15.00\tWe studied in the library - Data Structures\r\n\t"
				+ "19.00\tI got on the bus\r\n\t"
				+ "19.30\tI'm home\r\n\t"
				+ "20.00\tTook a shower\r\n\t"
				+ "20.30\tI had dinner - Spinach and tarhana soup\r\n\t"
				+ "21.30\t1 hour on the phone playing Fifa\r\n\t"
				+ "22.30\tI watched videos on YouTube\r\n\t"
				+ "23.30\tI read a book\r\n\t"
				+ "01.00\tSleep\r\n");
		
		System.out.println("- Monday, December 18");
		System.out.println("\t08.30\tWoke up\r\n\t"
				+ "09.00\tI had breakfast - cheese omelet\r\n\t"
				+ "09.30\tI got on the bus\r\n\t"
				+ "10.00\tI attended Academic English class\r\n\t"
				+ "12.00\tI had lunch at school \r\n\t"
				+ "13.30\tI attended the Probability and Statistics (Olasılık ve İstatistik) class\r\n\t"
				+ "16.00\tI studied in the school library\r\n\t"
				+ "17.30\tI attended Data Structures\r\n\t"
				+ "19.30\tClass is over\r\n\t"
				+ "20.00\tI got on the bus\r\n\t"
				+ "20.30\tI'm home\r\n\t"
				+ "21.00\tI had dinner - rice + tarhana soup\r\n\t"
				+ "22.00\tWatched a TV show - Friends\r\n\t"
				+ "00.00\tI read a book\r\n\t"
				+ "02.00\tSleep\r\n");
		
		System.out.println("- Tuesday, December 19");
		System.out.println("\t10.00\tWoke up\r\n\t"
				+ "10.30\tI had breakfast - potatoes\r\n\t"
				+ "12.30\tI left home\r\n\t"
				+ "13.00\tI got on the bus\r\n\t"
				+ "13.30\tI attended the Differential Equations class\r\n\t"
				+ "15.00\tClass is over\r\n\t"
				+ "15.30\tMeet my girlfriend\r\n\t"
				+ "16.00\tWe had dinner - cheese and salami sandwich\r\n\t"
				+ "17.00\tWent to the library - studied Data Structures\r\n\t"
				+ "19.30\tWe left the library\r\n\t"
				+ "20.00\tWe went for a walk in Kızılay\r\n\t"
				+ "21.00\tI got on the bus\r\n\t"
				+ "21.30\tI'm home\r\n\t"
				+ "22.00\tI had tea\r\n\t"
				+ "22.30\tI watched videos on YouTube\r\n\t"
				+ "01.00\tSleep\r\n");
	}
}
