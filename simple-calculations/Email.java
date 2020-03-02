class Email {
	public static void main(String args[]) {
		String strEmail, postBox, domain, sld, tld;
		strEmail = "user@mail.de";
		
		int at = strEmail.indexOf("@");
		postBox = strEmail.substring(0, at); 
		System.out.println(postBox); 
		domain = strEmail.substring(at + 1); 
		System.out.println(domain); 
		 
		int dot = domain.indexOf("."); 
		sld = domain.substring(0, dot);  
		System.out.println(sld); 
		tld = domain.substring(dot + 1);
		System.out.println(tld);
		
	}
}