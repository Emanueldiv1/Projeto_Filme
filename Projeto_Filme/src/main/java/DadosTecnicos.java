public class DadosTecnicos {

    protected String configuracaoAudio;
    protected String escala;
    protected Boolean coloracao;

     public DadosTecnicos(String configuracaoAudio, String escala){
         this.configuracaoAudio = configuracaoAudio;
         this.escala = escala;
         this.coloracao = true;
     }

    @Override
    public String toString() {
        return String.format(" Configuração de audio: " + configuracaoAudio + ". " + " Resolução do filme: " +
                escala + " Coloração: " + coloracao);
    }
}
