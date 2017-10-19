package tp;


public class Sezar {

	private Materials materials = new Materials();
	private String the_message="";
    private boolean decode =false;
    private String message_result="";
    
    
    public Sezar(Materials materials){

    	this.materials = materials;
    }
    
    public void code_or_decode(String the_message ){ 	
        message_result="";
        char cha_r  ;
    	for (int i = 0; i < the_message.toCharArray().length; i++) {
			for (int j = 0; j < materials.getCode().length; j++) {
				cha_r=the_message.charAt(i);
				if(cha_r==materials.getCode()[j]){
					if(!decode){
						coder(j);
						break;
					}else{
						decoder(j);
						break;
					}
				}
				if((j+1) >= materials.getCode().length){
					special_char(cha_r);
				}
			}
			}
    	   
    }
    
    private void special_char(char cha_r){
    	message_result+=cha_r;
    };
    
	private  void coder(int j){
		message_result+=materials.getCode()[(j+materials.getCle())%(materials.getCode().length) ];
	}
	private  String  decoder(int j){
          if((j-materials.getCle())<0){
        	  message_result+=materials.getCode()[(materials.getCode().length)-(materials.getCle()-j)];
		  }else
			  message_result+=materials.getCode()[(j-materials.getCle())%(materials.getCode().length) ];
          return message_result;		
	}



	public String getThe_message() {
		return the_message;
	}

	public String getMessage_result() {
		return message_result;
	}

	public boolean isDecode() {
		return decode;
	}

	public void setDecode(boolean decode) {
		this.decode = decode;
	}

	
}
