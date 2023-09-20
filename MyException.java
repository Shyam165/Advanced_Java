class MyException extends Exception
{
    MyException(String s)
    {
        super(s);
    }
    public static void main(String args[ ])
    {
        try {
            String name[]={"A","B","C"};
            int accNo[]={101,102,103};
            int bal[]={5000,1200,700};
            for(int i=0;i<3;i++)
            {
                System.out.println(name[i]+ " "+ accNo[i]+ " " +bal[i]);
                if(bal[i]<1000)
                {
                    MyException obj=new MyException("Balance is low");
                    throw obj;
                }
            }

        } catch (MyException e) {
            System.out.println(e);
        }
    }
}