package Funciones;

public class ruleta {
    
public static int[] generar() {
    int[] ruleta = new int[8];
    
    for(int i=0;i<ruleta.length;i++){
        int rand=(int)(Math.random()*37);
        ruleta[i]=rand;
    }
        
    return ruleta;
}


//==================================================================================================================//


public static int[] color(int num) {
    int[] color = new int[3];
    // ROJO => 255, 51, 51
    // VERDE => 0, 102, 0
    // NEGRO => 51, 51, 51
    
    switch(num){
        case 0: color[0]=0;color[1]=102;color[2]=0;break;
        case 1: color[0]=255;color[1]=51;color[2]=51;break;
        case 2: color[0]=51;color[1]=51;color[2]=51;break;
        case 3: color[0]=255;color[1]=51;color[2]=51;break;
        case 4: color[0]=51;color[1]=51;color[2]=51;break;
        case 5: color[0]=255;color[1]=51;color[2]=51;break;
        case 6: color[0]=51;color[1]=51;color[2]=51;break;
        case 7: color[0]=255;color[1]=51;color[2]=51;break;
        case 8: color[0]=51;color[1]=51;color[2]=51;break;
        case 9: color[0]=255;color[1]=51;color[2]=51;break;
        case 10: color[0]=51;color[1]=51;color[2]=51;break;
        case 11: color[0]=51;color[1]=51;color[2]=51;break;
        case 12: color[0]=255;color[1]=51;color[2]=51;break;
        case 13: color[0]=51;color[1]=51;color[2]=51;break;
        case 14: color[0]=255;color[1]=51;color[2]=51;break;
        case 15: color[0]=51;color[1]=51;color[2]=51;break;
        case 16: color[0]=255;color[1]=51;color[2]=51;break;
        case 17: color[0]=51;color[1]=51;color[2]=51;break;
        case 18: color[0]=255;color[1]=51;color[2]=51;break;
        case 19: color[0]=255;color[1]=51;color[2]=51;break;
        case 20: color[0]=51;color[1]=51;color[2]=51;break;
        case 21: color[0]=255;color[1]=51;color[2]=51;break;
        case 22: color[0]=51;color[1]=51;color[2]=51;break;
        case 23: color[0]=255;color[1]=51;color[2]=51;break;
        case 24: color[0]=51;color[1]=51;color[2]=51;break;
        case 25: color[0]=255;color[1]=51;color[2]=51;break;
        case 26: color[0]=51;color[1]=51;color[2]=51;break;
        case 27: color[0]=255;color[1]=51;color[2]=51;break;
        case 28: color[0]=51;color[1]=51;color[2]=51;break;
        case 29: color[0]=51;color[1]=51;color[2]=51;break;
        case 30: color[0]=255;color[1]=51;color[2]=51;break;
        case 31: color[0]=51;color[1]=51;color[2]=51;break;
        case 32: color[0]=255;color[1]=51;color[2]=51;break;
        case 33: color[0]=51;color[1]=51;color[2]=51;break;
        case 34: color[0]=255;color[1]=51;color[2]=51;break;
        case 35: color[0]=51;color[1]=51;color[2]=51;break;
        case 36: color[0]=255;color[1]=51;color[2]=51;break;
    }
    return color;
}

//==================================================================================================================//

public static String pintarArray(int[] array) {
    String tabla="";
    String fila="";
    

    int max=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
    
    int min=max;
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }

    int digitos=0;
    if(max>0 && min>=0){
        digitos=digitos(max);
    } else {
        digitos=digitos(min)+1;
    }
    
    if(max==0 && min==0){
        digitos=1;
    }
    
    String gion="";
    for(int i=0;i<digitos+4;i++){
        gion+="-";
    }

    for(int i=0;i<array.length;i++){
        fila+="+"+gion;
    }
    fila+="+\n";
    tabla+=fila;
    
    String espacio="  ";
    for(int i=0;i<array.length;i++){
                String num_array=Integer.toString(array[i]);
                
                if(digitos(array[i])==digitos){
                    tabla+="|"+espacio+num_array+espacio;
                } else {
                    int array_digito=digitos(array[i]);
                    int dif=digitos-array_digito;
                    
                    String espacio_plus="";
                    
                    if(array[i]>0){
                        for(int y=0;y<dif;y++){
                            espacio_plus+=" ";
                        }
                    } else {
                        for(int y=0;y<dif-1;y++){
                            espacio_plus+=" ";
                        }
                    }
                    
                    tabla+="|"+espacio+num_array+espacio+espacio_plus;
                }
    }
    tabla+="|\n"+fila;
    
    return tabla;
}


//==================================================================================================================//

public static int digitos(int n) {
    int digitos=0;

    while(n!=0){
        n=n/10;
        digitos++;
    }
    
    return  digitos;
}


//==================================================================================================================//


public static String num_str(int n) {
    String str_num="";

    switch(n){
        case 0:str_num="00";break;
        case 1:str_num="01";break;
        case 2:str_num="02";break;
        case 3:str_num="03";break;
        case 4:str_num="04";break;
        case 5:str_num="05";break;
        case 6:str_num="06";break;
        case 7:str_num="07";break;
        case 8:str_num="08";break;
        case 9:str_num="09";break;
        case 10:str_num="10";break;
        case 11:str_num="11";break;
        case 12:str_num="12";break;
        case 13:str_num="13";break;
        case 14:str_num="14";break;
        case 15:str_num="15";break;
        case 16:str_num="16";break;
        case 17:str_num="17";break;
        case 18:str_num="18";break;
        case 19:str_num="19";break;
        case 20:str_num="20";break;
        case 21:str_num="21";break;
        case 22:str_num="22";break;
        case 23:str_num="23";break;
        case 24:str_num="24";break;
        case 25:str_num="25";break;
        case 26:str_num="26";break;
        case 27:str_num="27";break;
        case 28:str_num="28";break;
        case 29:str_num="29";break;
        case 30:str_num="30";break;
        case 31:str_num="31";break;
        case 32:str_num="32";break;
        case 33:str_num="33";break;
        case 34:str_num="34";break;
        case 35:str_num="35";break;
        case 36:str_num="36";break;
    }
    return  str_num;
}


//==================================================================================================================//


public static int apuesta(int cantidad, String color, int[] ruleta) {
    int apuesta=0;
    
    if(color_str(ruleta[0]).equals(color)){
        if(color.equals("verde")){
            apuesta=cantidad*14;
        } else {
            apuesta=cantidad;
        }
    } else {
        apuesta=cantidad*(-1);
    }
    
    return  apuesta;
}


//==================================================================================================================//


public static int[] generar_nuevo(int[] array, int n) {
    int[] auxiliar = new int[array.length];
    
    int cont=0;
    for(int i=0;i<array.length;i++){
        if(i<n){
            auxiliar[i]=array[(array.length-n)+cont];
            cont++;
        } else {
            auxiliar[i]=array[i];
        }
    }

    for(int i=0;i<array.length;i++){
        if((i+n)<array.length){
            auxiliar[i+n]=array[i];
        }
    }
    
    auxiliar[0]=(int)(Math.random()*37);
    
    return auxiliar;
}


//==================================================================================================================//


public static String color_str(int num) {
    String color="";
    switch(num){
        case 0: color="verde";break;
        case 1: color="rojo";break;
        case 2: color="negro";break;
        case 3: color="rojo";break;
        case 4: color="negro";break;
        case 5: color="rojo";break;
        case 6: color="negro";break;
        case 7: color="rojo";break;
        case 8: color="negro";break;
        case 9: color="rojo";break;
        case 10: color="negro";break;
        case 11: color="negro";break;
        case 12: color="rojo";break;
        case 13: color="negro";break;
        case 14: color="rojo";break;
        case 15: color="negro";break;
        case 16: color="rojo";break;
        case 17: color="negro";break;
        case 18: color="rojo";break;
        case 19: color="rojo";break;
        case 20: color="negro";break;
        case 21: color="rojo";break;
        case 22: color="negro";break;
        case 23: color="rojo";break;
        case 24: color="negro";break;
        case 25: color="rojo";break;
        case 26: color="negro";break;
        case 27: color="rojo";break;
        case 28: color="negro";break;
        case 29: color="negro";break;
        case 30: color="rojo";break;
        case 31: color="negro";break;
        case 32: color="rojo";break;
        case 33: color="negro";break;
        case 34: color="rojo";break;
        case 35: color="negro";break;
        case 36: color="rojo";break;
    }
    return color;
}

}



