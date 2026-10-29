public class Oportunidade{
    private String titulo;
    private int vagas = 1;
    private int classificados = 0;
    private boolean aberta = true;
    private Professor responsavel;

    public Oportunidade(String titulo,int vagas,String responsavel){
        this.titulo = titulo;
        this.vagas = vagas < 1 ? 1:vagas;
        this.responsavel = responsavel;
    }

    public String getTitulo(){  
        return titulo;
    }
    public int getVagas(){
        return vagas;
    }
    
    public int getClasssificação(){  
        return classificados;
    }

    public boolean isAberto(){
        return aberta;
    }
    public String getResponsavel(){
        return responsavel;
    }
    public void encerrar(){
        aberta = false;
    }

    public Inscricao escrever (Estudante estudante){
        if(! aberta ){
            return null;
        }
        return new iiscricao (Estudante , this);
    }
    public  boolean registrarClassificaçao(){
        if (vagas <= 0){
            return false;
        }
        classificados++;
        vagas--;
        return true;
        
    }  
    @Override
    public String toString(){
        return "oporunidade{" +"titulo'" +titulo +'\''+ ",vagas"+ vagas +",classificação = "+classificados + ",aberta="+aberta+",respomsavel="+responsavel.getNome()+'}';
    }
}

