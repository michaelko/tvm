// https://github.com/int3/doppio/blob/master/classes/test/Casting.java

public class Casting {
  public static void main(String[] args) {
    {
      int a = 999999;
      Console.writeln(a);
      Console.writeln((long)a);
      Console.writeln((double)a);
      Console.writeln((float)a);
      Console.writeln((short)a);
      Console.writeln((int)((char)a));
      Console.writeln((byte)a);
      a = -a;
      Console.writeln(a);
      Console.writeln((long)a);
      Console.writeln((double)a);
      Console.writeln((float)a);
      Console.writeln((short)a);
      Console.writeln((int)((char)a));
      Console.writeln((byte)a);
    }
    {
      long a = 8888888888888L;
      Console.writeln(a);
      Console.writeln((int)a);
      Console.writeln((double)a);
      Console.writeln((float)a);
      a = -a;
      Console.writeln(a);
      Console.writeln((int)a);
      Console.writeln((double)a);
      Console.writeln((float)a);
    }
    {
      double a = 777777777777.0;
      Console.writeln(a);
      Console.writeln((long)a);
      Console.writeln((int)a);
      Console.writeln((float)a);
      a = -a;
      Console.writeln(a);
      Console.writeln((long)a);
      Console.writeln((int)a);
      Console.writeln((float)a);
    }
    {
      float a = 6666666.0f;
      Console.writeln(a);
      Console.writeln((long)a);
      Console.writeln((double)a);
      Console.writeln((int)a);
      a = -a;
      Console.writeln(a);
      Console.writeln((long)a);
      Console.writeln((double)a);
      Console.writeln((int)a);
    }
  }

}
