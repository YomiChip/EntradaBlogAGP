/**
 * 
 * @author Aroa Guirado Picazo
 *20 feb 2022
 */

public class EntradaBlogAgp {
	
	
	/**
	 * @see blog
	 * @version 22/02/2022
	 *
	 * 
	 */
	
		
		public static char separador=':';
		private int id;
		private String texto;
		private String autor;
		
		/**
		 * 
		 * @param id
		 * @param autor
		 * @param texto
		 * @throws IllegalArgumentException
		 */
		
		public EntradaBlogAgp(int id,String autor,String texto)throws IllegalArgumentException{
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
		
		/**Excepción que impedia que el programa se ejecutase correctamente
		 *  debido a la introducción de un numero negativo en el main
		 *  @throws
		 */
		
		@Override
		public String toString(){
			String cad="";
			cad+="\nENTRADA DE"+separador+autor;
			cad+="\n "+texto;
			return cad;
		}
		
		/**
		 * 
		 * @return
		 */
		
		
		public int getId(){
			return this.id;
		}
		
		
		public String getTexto(){
			return this.texto;
		}
		
		
		public String getAutor(){
			return this.autor.toUpperCase();
		}
		
		
		public String devuelveAutor(){
			return this.autor;
		}
		
		
		public static void main(String[] args) {
	        /**Debemos cambiar el número de entrada, 
	         * dado que tenemos una excepción que nos impide que el número sea negativo*/
			/**
			 * @param 
			 * 
			 */
			
			EntradaBlogAgp e1=new EntradaBlogAgp (3,"ana","Últimas noticias, está disponible BixBy 2.0");
			
			/**Creo otra entrada en el brlog para comprobar que funciona correctamente*/
			  
			EntradaBlogAgp e2=new EntradaBlogAgp (5,"María", "Lost Ark está disponible en Steam.");
			
			System.out.println(e1);
			System.out.print(e2);
}
}
