public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 0;
        System.out.println("Perfect Squares are: ");
        while (i<10) {
            i++;


            double t=Math.pow(i, 2);

            System.out.println(t);

        }
        int d= 0;
        System.out.println("Perfect Cubes are: ");
        while (d<10) {
            d++;

            double t=Math.pow(d, 3);
            System.out.println(t);
        }

        int s = 1;
        int n = 11;
        int val1 = 1;
        int val2 = 2;
            System.out.println("Fibonacci Sequence is: ");

            while (s < n)
            {
                System.out.println(val1);

                int sum = val1 + val2;
                val1 = val2;
                val2 = sum;

                s++;
            }

      int whip = 1;
      System.out.println("Prime numbers are: ");
      int fool = 0;
      while (whip<30) {
          int deep = 1;
          while (deep<30) {
              if (whip % deep == 0) {
                  fool++;
                  deep++;
              } else
                  deep++;
          }
          if (fool ==2)
              System.out.println(whip);
          fool = 0;
          whip++;
          }

        int z = 1;
        int x = 12;
        int va1 = 1;
        int va2 = 0;
        System.out.println("Triangle Numbers is: ");

        while (z < x)
        {
            System.out.println(va2);

            int sum = va1 + va2;
            va1++;
            va2 = sum;

            z++;
        }


      }


        }




