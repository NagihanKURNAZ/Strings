
public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman Sayısı: " +mesaj.length());
		System.out.println("5.eleman: " +mesaj.charAt(4));
		System.out.println(mesaj.concat("Yaşasın!")); //concat birleştir
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("L"));
        System.out.println(mesaj.endsWith("N"));
        System.out.println(mesaj.endsWith("."));
        
        
        char[] karakterler = new char[25];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('e')); // ilk e kaçıncı indexte
        System.out.println(mesaj.indexOf("a"));
        System.out.println(mesaj.lastIndexOf("a"));//sağdan başlar ilk e yi bulur
             
    
	    System.out.println(mesaj.substring(5));  // 5.indexten itibaren parçalar
        System.out.println(mesaj.substring(2,5)); // 2.indexten 5.indexe kadar alır
       
        for(String kelime : mesaj.split(" ")) {
        	System.out.println(kelime);           //kelimeleri tek tek alt alta yazdırır
        }
        
        System.out.println(mesaj.toLowerCase());  // hepsini küçük harf yapar
        System.out.println(mesaj.toUpperCase());  // hepsini büyük harf yapar
        System.out.println(mesaj.trim());  // mesajın başındaki ve sonundaki boşlukları atar
        
       	
	}
}

