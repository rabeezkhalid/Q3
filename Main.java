void main()
{
        float[] denominations = {5000,1000,500,100,50,20,10,5,2,1};
        float amount = 1988;
        for (float denomination : denominations)
        {
            int count = 0;
            while(amount/denomination > 1)
            {
                count++;
                amount-= denomination;
            }
            System.out.println("Denomination: "+denomination+"\t\tcount: "+count);
        }

}
