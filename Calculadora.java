
package t03;

public class Calculadora {
    private float Num1, Num2;
    private String Op;
    
    public void setNum1(float Num1)
    {
        this.Num1=Num1;
    }
    
    public void setNum2(float Num2)
    {
        this.Num2=Num2;
    }
    
    public void setOp(String Op)
    {
        this.Op=Op;
    }
    
    public float getNum1()
    {
        return(this.Num1);
    }
    
    public float getNum2()
    {
        return(this.Num2);
    }
    
    public String getOp()
    {
        return(this.Op);
    }
    
    public float Operacao()
    {
        if(Op.equals("+"))
        {
            return(Num1+Num2);
        }
        else if(Op.equals("-"))
        {
            return(Num1-Num2);
        }
        else if(Op.equals("*"))
        {
            return(Num1*Num2);
        }
        else
        {
            return(Num1/Num2);
        }
}
}
