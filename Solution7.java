import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException; 
import java.util.StringTokenizer; 
import java.util.Arrays;
public class Solution7 {
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
        {
            br= new BufferedReader(new InputStreamReader(System.in));
        }
        String next()
        {
            while(st==null||!st.hasMoreElements())
            {
                try
                {
                    st=new StringTokenizer(br.readLine());
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt()
        {
            return Integer.parseInt(next());
        }
    }
    public static void main(String args[])
    {
        FastReader fs= new FastReader();
        Medicine med[]= new Medicine[4];
        for(int i=0;i<med.length;i++)
        {
            med[i]=new Medicine(fs.next(), fs.next(), fs.next(), fs.nextInt());
        }
        String disease=fs.next();
        Integer arr[]=getPriceByMedicine(med,disease);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }

    public static Integer[] getPriceByMedicine(Medicine[] med, String disease) {
        Integer newarr[]= new Integer[0];
        for(int i=0;i<med.length;i++)
        {
            if(med[i].getDisease().equalsIgnoreCase(disease))
            {
                newarr=Arrays.copyOf(newarr, newarr.length+1);
                newarr[newarr.length-1]=med[i].getprice();
            }
        }
        Arrays.sort(newarr);
        return newarr;
    }
    
}
class Medicine
{
    String medicineName;
    String batch;
    String disease;
    int price;
    public String getMedicineName()
    {
        return medicineName;
    }
    public String getbatch()
    {
        return batch;
    }
    public String getDisease()
    {
        return disease;
    }
    public int getprice()
    {
        return price;
    }
    public void setMedicineName(String medicineName)
    {
        this.medicineName=medicineName;
    }
    public void setbatch(String batch)
    {
        this.batch=batch;
    }
    public void setDisease(String disease)
    {
        this.disease=disease;
    }
    public void setprice(int price)
    {
        this.price=price;

    }
    public Medicine(String medicineName, String batch, String disease, int price)

    {
        this.medicineName=medicineName;
        this.batch=batch;
        this.disease=disease;
        this.price=price;
    }
}