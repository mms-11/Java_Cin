public class CartaoClient {
    
        private String codSeguranca,senha;
    
        public CartaoClient(String c, String s){
            this.codSeguranca = c;
            this.senha = s;
        }
    
        public String getCodSeguranca() {
            return this.codSeguranca;
        }
    
        public String getSenha(){
            return this.senha;
        }
        
    
    
    
}
