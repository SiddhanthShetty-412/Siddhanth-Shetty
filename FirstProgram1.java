class FirstProgram1
{
     public static void main(String args[])
     {
           int len=args.length;
           System.out.println("Length of line:"+len);
           for(int i=0;i<len;i++)
           {
                System.out.println(args[i]);
           }
      }
}