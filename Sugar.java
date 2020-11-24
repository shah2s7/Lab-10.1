class Sugar extends Cookie 
{
  String shape;
  boolean isDecorated;

  Sugar() 
  {
    shape = "";
    isDecorated = false;
  }

  Sugar(String a) 
  {
    shape = a;
    isDecorated = false;
  }

  String getshape() 
  {
    return shape;
  }

  void changeshape(String a) 
  {
    shape = a;
  }

  void cutShapes(String a, int b)
  {
    System.out.println(b + " cookies were cut into " + a);
    super.setNumCookie(b);
  }

  void decorate()
  {
    if (super.isReady() == true)
    {
      isDecorated = true;
      System.out.println("The cookies were decorated");
    }
    else
    {
      System.out.println("Make sure to bake the cookies first");
    }
  }
}