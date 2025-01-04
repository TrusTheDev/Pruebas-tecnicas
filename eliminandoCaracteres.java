public class eliminandoCaracteres {
    public static void main(String[] args) {
        eliminandoCar("Me gusta java", "Me gusta kotlin");
    }
    //Cuándo eliminas un caracter sin dejar espacio reestablece el indice de la palabra,provocando errores, por eso dejo e
    // spacios vacios para luego ser reemplazados
    public static void eliminandoCar(String str1,String str2){
        for(int i=0; i<str1.length(); i++){
            for(int j=0; j<str2.length(); j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    str1 = str1.replace(String.valueOf(str1.charAt(i)), " ");
                    str2 = str2.replace(String.valueOf(str2.charAt(j)), " ");
                }
            }
        }
        str1 = borrarEspacio(str1);
        str2 = borrarEspacio(str2);
        System.out.println(str1 +","+ str2);
    }

    public static String borrarEspacio(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                str = str.replace(String.valueOf(str.charAt(i)), "");
            }
        }
        return str;
    }

}
