interface Backend 
{
  // abstract class
  public void connectServer();
}

class multiplein 
{
  public void responsive(String str) 
  {
    System.out.println(str + " can also be used as frontend.");
  }
}

class Language extends multiplein implements Backend 
{
  String language = "Java";

  public void connectServer() 
  {
    System.out.println(language + " can be used as backend language.");
  }

  public static void main(String[] args) 
  {
    Language java = new Language();

    java.connectServer();

    java.responsive(java.language);
  }
}