public class ProcedureConsumer
{
    int items[][]=new int[3][5];  
    int index[]=new int[3];


    synchronized void producer()
    {
        for (int i = 0; i < items.length; i++) 
        {
            if(items[i][4]!=0)
            {
                try 
                {
                    System.out.println("Producer at "+(i+1)+" is waiting");
                    this.wait();
                } 
                catch (InterruptedException e) {}
            } 
            else
            {

                int a=1;
                System.out.println("Produced item = "+a+" at index "+(i+1)+" , "+(index[i]+1));

                try 
                {
                    Thread.sleep(1000);
                } 
                catch (InterruptedException e) {}

                items[i][index[i]]=a;

                if(index[i]<4)
                    index[i]++;

                this.notifyAll();
            }
        } 
        
    }

    synchronized void consumer1()
    {
        if(items[0][0]==0)
        {
            try 
            {
                System.out.println("Consumer at 1 is waiting");
                this.wait();
            } 
            catch (InterruptedException e) {}
        }
        else
        {
            System.out.println("Consumed item = "+items[0][index[0]]+" at index 1 , "+(index[0]+1));

            try 
            {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) {}

            items[0][index[0]]=0;

            if(index[0]>0)
            index[0]--;
            this.notifyAll();
        }

    }

    synchronized void consumer2()
    {
        if(items[1][0]==0)
        {
            try 
            {
                System.out.println("Consumer at 2 is waiting");
                this.wait();
            } 
            catch (InterruptedException e) {}
        }
        else
        {
            System.out.println("Consumed item = "+items[1][index[1]]+" at index 2 , "+(index[1]+1));

            try 
            {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) {}

            items[1][index[1]]=0;

            if(index[1]>0)
            index[1]--;
            this.notifyAll();
        }

    }

    synchronized void consumer3()
    {
        if(items[2][0]==0)
        {
            try 
            {
                System.out.println("Consumer at 3 is waiting");
                this.wait();
            } 
            catch (InterruptedException e) {}
        }
        else
        {
            System.out.println("Consumed item = "+items[2][index[2]]+" at index 3 , "+(index[2]+1));

            try 
            {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) {}

            items[2][index[2]]=0;

            if(index[2]>0)
            index[2]--;
            notifyAll();
        }

    }

    public static void main(String[] args) 
    {
    	ProcedureConsumer c=new ProcedureConsumer();
        System.out.println("\nName : YASH VISHNOI  RollNO : R171219044\\n");

        Thread p1=new Thread()
        {
            public void run()
            {
                while(true)
                    c.producer();
            }
        };
        
        Thread c1=new Thread()
        {
            public void run()
            {
                while(true)
                    c.consumer1();
            }
        };

        Thread c2=new Thread()
        {
            public void run()
            {
                while(true)
                    c.consumer2();
            }
        };

        Thread c3=new Thread()
        {
            public void run()
            {
                while(true)
                    c.consumer3();
            }
        };

        p1.start();
        c1.start();
        c2.start();
        c3.start();
    }
}
