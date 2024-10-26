
package pkg0816_classes;


public class Dimensao {
    private float Altura, Base;
    private String Tipo;
       
    //criar os setters e os getters para as variáveis membro
    
    //setters
    public void setAltura(float Altura)
    {
        this.Altura=Altura;
    }
    
    public void setBase(float Base)
    {
        this.Base=Base;
    }
    
    public void setTipo(String Tipo)
    {
        this.Tipo=Tipo;
    }
    
    
    //getters
    public float getAltura()
    {
        return(this.Altura);
    }
    
    public float getBase()
    {
        return(this.Base);
    }
    
    public String getTipo()
    {
        return(this.Tipo);
    }
    
    //método ou method
    public float Area()
    {
        if(Tipo.equals("Triângulo"))
        {
            return(Altura*Base/2);
        }
        else if(Tipo.equals("Rectângulo"))
        {
            return(Altura*Base);
        }
        else
        {
            return(Altura*Altura);
        }
}
}
