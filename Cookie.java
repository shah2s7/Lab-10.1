class Cookie {
  private int cookieCount;
  private int cookieTemp;
  private int cookieTime;
  private boolean isBaked;

  Cookie() {
    cookieCount = 0;
    cookieTemp = 0;
    cookieTime = 0;
    isBaked = false;
  }

  Cookie(int a, int b, int c) 
  {
    cookieCount = a;
    cookieTemp = b;
    cookieTime = c;
    isBaked = false;
  }

  boolean isReady()
  {
    return isBaked;
  }

  void setNumCookie(int a)
  {
    cookieCount = a;
  }
  
  void bakeCookies(int a, int b)
  {
  System.out.println();
    System.out.println(cookieCount + " cookies were baked at " + cookieTemp + " degrees F for " + cookieTime + " minutes ");
    isBaked = true;
  }
}
