/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;


import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author antony
 */
public class Taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //promedio();
        //raiz();
        //residuo();
        //operacion();
        //pintura();
        //cadenas();
        //fonetico();
        //ingreso();
        //sueños();
        //naturales();
        //naturales2();
        //pares();
        //fibonacci();
        //grados();
        //canciones();
        //primos();
        //tallerClase();
        adivina();
    }
    
    /////////////////////SECUENCIALES EJERCICIO NUMERO 1//////////////////////////
    public static void promedio(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("CALCULAR EL PROMEDIO DE 5 NUMEROS\n");
        System.out.println("ingresa un entero muy pequeño \"byte\"");
        byte num1= entrada.nextByte();
        
        System.out.println("ingresa un entero pequeño \"short\"");
        short num2= entrada.nextShort();
        
        System.out.println("ingresa un entero mediano \"int\"");
        int num3= entrada.nextInt();
        
        System.out.println("ingresa un entero largo \"long\"");
        long num4= entrada.nextLong();
        
        System.out.println("ingresa un numero decimal corto\"float\"");
        float num5= entrada.nextFloat();
        double suma=num1+num2+num3+num4+num5;
        double producto=num1*num2*num3*num4*num5;
        double promedio=(num1+num2+num3+num4+num5)/5;
        System.out.println("El promedio es: "+promedio+"; la suma es: "+suma+"; el productoes: "+producto);
    }
    
    ////////////////////SECUENCIALES EJERCICIO NUMERO 2//////////////////////////
    public static void raiz(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("CALCULAR RAIZ CUADRADA Y ELEVAR A LA 3\n");
        System.out.println("ingresa un numero");
        double num1= entrada.nextInt();
        
        int ELEV=3;
        double potencia=Math.pow(Math.sqrt(num1), ELEV);
        System.out.println(potencia);
    }
    
    //////////////////SECUENCIALES EJERCICIO NUMERO 3////////////////////////////
    public static void residuo(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("CALCULO DEL MODULO ENTRE DOS NUMEROS\n");
        System.out.println("ingresa el primer numero");
        int var1=entrada.nextInt();
        
        System.out.println("ingresa el segundo numero");
        int var2=entrada.nextInt();
        
        double modulo=var1%var2;
        System.out.println("el modulo es: "+modulo); 
         
        System.out.println(modulo);    
    }
    
    /////////////////SECUENCIALES EJERCICIO NUMERO 4/////////////////////////////
    public static void operacion(){      
        System.out.println("CALCULO DE LA OPERACION TENIENDO EN CUENTA PRECEDENCIA\n");
        
        float num1=2*(3+5/2);
        float num2=3+5-6*2;
        float resultado=num1/num2;
        
        System.out.println("el resultado de la operacion (2*(3+5/2))/(3+5-6*2) es: "+resultado);      
    }
    
    ////////////////SECUENCIALES EJERCICIO NUMERO 5//////////////////////////////
    public static void pintura(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("CALCULO DE PINTURA NECESARIA PARA PINTAR LA PARED\n");
        
        System.out.println("por favor ingresa el ancho de la pared");
        double ancho= entrada.nextDouble();
        
        System.out.println("por favor ingresa el alto de la pared");
        double alto= entrada.nextDouble();
        
        double superficie= ancho*alto;
        int METROS=4;
        
        System.out.println("tu pared tiene "+superficie+" metros cuadrados y");
        double galones= superficie/METROS;
        
        System.out.println("necesitas "+galones+" galones de pintura para pintarla");
    }
    
    ///////////////SECUENCIALES EJERCICIO NUMERO 6///////////////////////////////
    public static void cadenas(){
        Scanner entrada= new Scanner(System.in); 
        System.out.println("PROGRAMA PARA AGRUPAR CADENAS DE CARACTERES\n");
        
        System.out.println("introduce tu animal favorito");
        String animal=entrada.nextLine();
        
        System.out.println("introduce el nombre de una mascota");
        String mascota=entrada.nextLine();
        
        System.out.println("introduce tu ciudad favorita");
        String ciudad=entrada.nextLine();
        
        System.out.println("introduce tu primer nombre");
        String nombre1=entrada.nextLine();
        
        System.out.println("introduce tu segundo nombre");
        String nombre2=entrada.nextLine();
        
        System.out.println("introduce tu pellido");
        String apellido=entrada.nextLine();
        
        System.out.println("\nlas cadenas ordenadas son:\n");
        
        System.out.println(animal+" "+mascota+" "+ciudad+"\n" +nombre1+" "+nombre2+" "+apellido);
    }
    
    /////////////////NO SECUENCIALES EJERCICIO NUMERO 7//////////////////////////
    public static void fonetico(){
        String opc=JOptionPane.showInputDialog("FONETICA INTERNACIONAL\n"+
                                          "introduce una letra minuscula");
        switch(opc){
            case "a":
                JOptionPane.showMessageDialog(null, "se lee \"a\". Ejemplo: arbol=aɾ.ˈβol");
                break;
            case "b":
                JOptionPane.showMessageDialog(null, "se lee \"b\". Ejemplo: barco=ˈbaɾ.ko");
                break;
            case "c":
                JOptionPane.showMessageDialog(null, "se lee \"k\". Ejemplo: casa=ˈka.sa");
                break;
            case "d":
                JOptionPane.showMessageDialog(null, "se lee \"d\". Ejemplo: dedo=ˈde.ðo");
                break;
            case "e":
                JOptionPane.showMessageDialog(null, "se lee \"ˈe\". Ejemplo: enano=e.ˈna.no");
                break;
            case "f":
                JOptionPane.showMessageDialog(null, "se lee \"ˈf\". Ejemplo: faro=ˈfa.ɾo");
                break;
            case "g":
                JOptionPane.showMessageDialog(null, "se lee \"ˈg\". Ejemplo: gato=ˈɡa.to");
                break;
            case "h":
                JOptionPane.showMessageDialog(null, "se lee \"es muda\". Ejemplo: herrero=ɛ.ˈrɛ.ɾo");
                break;
            case "i":
                JOptionPane.showMessageDialog(null, "se lee \"ˈi\". Ejemplo: iguana=i.ˈɣwa.na");
                break;
            case "j":
                JOptionPane.showMessageDialog(null, "se lee \"ˈx\". Ejemplo: iguana=ˈxo.ʝa");
                break;
            case "k":
                JOptionPane.showMessageDialog(null, "se lee \"k\". Ejemplo: kilo=ˈki.lo");
                break;
            case "l":
                JOptionPane.showMessageDialog(null, "se lee \"l\". Ejemplo: lulo=ˈlu.lo");
                break;
            case "m":
                JOptionPane.showMessageDialog(null, "se lee \"m\". Ejemplo: madre=ˈma.ðɾe");
                break;
            case "n":
                JOptionPane.showMessageDialog(null, "se lee \"n\". Ejemplo: nacer=na.ˈsɛɾ");
                break;
            case "o":
                JOptionPane.showMessageDialog(null, "se lee \"o\". Ejemplo: oso=ˈo.so");
                break;
            case "p":
                JOptionPane.showMessageDialog(null, "se lee \"p\". Ejemplo: palabra=pa.ˈla.βɾa");
                break;
            case "q":
                JOptionPane.showMessageDialog(null, "se lee \"k\". Ejemplo: queso=ˈke.so");
                break;
            case "r":
                JOptionPane.showMessageDialog(null, "se lee \"r\". Ejemplo: raton=ˈra.tõn");
                break;
            case "s":
                JOptionPane.showMessageDialog(null, "se lee \"s\". Ejemplo: sapo=ˈsa.po");
                break;
            case "t":
                JOptionPane.showMessageDialog(null, "se lee \"t\". Ejemplo: =ˈsa.po");
                break;
            
        }
    }
    
    /////////////////NO SECUENCIALES EJERCICIO NUMERO 8//////////////////////////
    public static void ingreso(){
        int edad=Integer.parseInt(JOptionPane.showInputDialog("PROGRAMA PARA PERMITIR INGRESO A \n"
                                                                    + "BIBLIOTECA PUBLICA\n"+
                                                                  "Por favor ingresa tu edad\n"));
        String pais=JOptionPane.showInputDialog("Por favor introduce tu pais de origen");
        
        if(edad>=18 || pais.equalsIgnoreCase("colombia")){
            JOptionPane.showMessageDialog(null, "Puedes ingresar a la biblioteca");
        }else{
            JOptionPane.showMessageDialog(null, "no tienes permitido el acceso");
        }
    }
    
    /////////////////NO SECUENCIALES EJERCICIO NUMERO 9//////////////////////////
    public static void sueños(){        
        
    int opc=Integer.parseInt(JOptionPane.showInputDialog("SIGNIFICADO DE TUS SUEÑOS\n"+
                                    "Elige una opcion:\n"+
                                    "1. anillo\n"+
                                    "2. moneda\n"+
                                    "3. helado\n"+
                                    "4. soga\n"+
                                    "5. barco"));
    if(opc==1){
         JOptionPane.showMessageDialog(null, "De forma general podemos definir los anillos\n"
                                                + "como elementos de solidez sentimental.\n"
                                                + "Reflejan el deseo de establecer una relación\n"
                                                + "seria y avanzar a un nivel más de compromiso. \n"
                                                + "Ya te has cansado de temer por tu relación y quieres\n"
                                                + "crear vínculos más fuertes. Esto puede ser mediante\n"
                                                + "el casamiento, yendo a vivir juntos o bien adoptando\n"
                                                + "una mascota.");
    }else if(opc==2){
        JOptionPane.showMessageDialog(null, "Este tipo de sueño suele estar asociado con las\n"
                                                + "amistades, con el bienestar económico y situaciones\n"
                                                + "familiares difíciles. Si aparecen en el sueño monedas\n"
                                                + "de plata nuevas o brillantes se presiente que tendremos\n"
                                                + "beneficios económicos. Pero, por el contrario, \n"
                                                + "si sueñas con monedas de plata enterradas o ennegrecidas\n"
                                                + "augura la posibilidad de importantes pérdidas.");
    }else if(opc==3){
        JOptionPane.showMessageDialog(null, "Cuando soñamos con un helado nos está advirtiendo de \n"
                                                + "que debemos intentar mantener la calma, así como \n"
                                                + "disfrutar de las cosas buenas y ser felices.");
    }else if(opc==4){
        JOptionPane.showMessageDialog(null, "Soñar con una cuerda o soga, representa su conexión \n"
                                                + "con los demás. Simboliza la participación mutua con \n"
                                                + "su pareja. También significa cautiverio, restricciones \n"
                                                + "y esclavitud. Puede sentirse molesto por algo o por el \n"
                                                + "comportamiento de los demás.");
    }else if(opc==5){
        JOptionPane.showMessageDialog(null, "Soñarse a bordo de un barco en aguas tranquilas insinúa \n"
                                                + "próximos éxitos, momentos felices y satisfacciones, si por \n"
                                                + "el contrario las aguas son turbias y agitadas, encrespadas \n"
                                                + "y amenazantes, indica que pronto habrá problemas contra los \n"
                                                + "cuales debe estar alerta. Soñar que un barco se aleja hacia \n"
                                                + "alta mar insinúa que hay demasiadas ilusiones que el soñante \n"
                                                + "debe controlar.");
    }
    }
         
    /////////////////NO SECUENCIALES EJERCICIO NUMERO 10/////////////////////////
    public static void naturales(){
        int num=Integer.parseInt(JOptionPane.showInputDialog("PROGRAMA DE NUMEROS ENTEROS\n"
                                                            + "Ingresa un numero por favor"));
        for(int i=0; i<=num; i++){
            JOptionPane.showMessageDialog(null, i);
        }   
    }
    
    /////////////////NO SECUENCIALES EJERCICIO NUMERO 11/////////////////////////
    public static void naturales2(){
        int num=Integer.parseInt(JOptionPane.showInputDialog("PROGRAMA DE NUMEROS ENTEROS DE 3 EN 3\n"
                                                            + "Ingresa un numero por favor"));
        for(int i=0; i<=num; i+=3){
            JOptionPane.showMessageDialog(null, i);
        }   
    }
    
    /////////////////NO SECUENCIALES EJERCICIO NUMERO 12/////////////////////////
    public static void pares(){
        int num=Integer.parseInt(JOptionPane.showInputDialog("DETECTOR DE PARES E IMPARES\n"
                                    + "Introduce un numero"));
        if(num%2==0){
            JOptionPane.showMessageDialog(null, "El numero es par");
        }else{
            JOptionPane.showMessageDialog(null, "el numero es impar");
        }
    }
    
    /////////////////NO SECUENCIALES EJERCICIO NUMERO 13/////////////////////////
    public static void fibonacci(){
        int num=Integer.parseInt(JOptionPane.showInputDialog("NUMEROS FIBONACCI\n"
                                    + "Ingresa un numero"));
        int x=0;
        int y=1;
        int var=1;
        JOptionPane.showMessageDialog(null, x);
        JOptionPane.showMessageDialog(null, y);
        while(x+y<=num){
            JOptionPane.showMessageDialog(null, var);
            x=y;
            y=var;
            var=x+y;
        }
    }
    
    /////////////////NO SECUENCIALES EJERCICIO NUMERO 14/////////////////////////
    public static void grados(){
        
        int opc;
        do{
        double grados=Integer.parseInt(JOptionPane.showInputDialog("DE GRADOS CENTIGRADOS A FAHRENHEIT\n"
                                                                   + "Introduce cantidad en grados centígrados\n"));
                                                                   
            double f=(grados*9/5)+32;
            JOptionPane.showMessageDialog(null, f);
            
            opc=Integer.parseInt(JOptionPane.showInputDialog("Desea continuar\n"
                                        + "1. si\n"
                                        + "2. no"));
        }while(opc==1);    
    }
    
    /////////////////NO SECUENCIALES EJERCICIO NUMERO 15/////////////////////////
    /////////////////////////EJERCICIO PERSONAL//////////////////////////////////
    public static void canciones(){
        int consultas=Integer.parseInt(JOptionPane.showInputDialog("INFORMACION DE TUS CANCIONES\n"
                                                                   + "¿Cuantas consultas deseas hacer?"));
        for(int i=0; i<consultas; i++){
            int opc=Integer.parseInt(JOptionPane.showInputDialog("Elije una cancion\n"
                                                                + "1. No stress\n"
                                                                + "2. Nothing else matters\n"
                                                                + "3. Now you´re gone\n"
                                                                + "4. Un nuevo dia\n"
                                                                + "5. Numb\n"
                                                                + "6. Ocean drive\n"
                                                                + "7. One\n"
                                                                + "8. One more time\n"
                                                                + "9. The greatest\n"
                                                                + "10. Summertime sadness"));
            if(opc==1){
                JOptionPane.showMessageDialog(null, "Titulo: No Stress\n"
                                                    + "Artista: Lauren Wolf\n"
                                                    + "Album: No Stress (radio edit)\n"
                                                    + "Año: 2008");
            }else if(opc==2){
                JOptionPane.showMessageDialog(null, "Titulo: Nothing Else Matters\n"
                                                    + "Artista: Metallica\n"
                                                    + "Album: Metallica\n"
                                                    + "Año: 1991");
            }else if(opc==3){
                JOptionPane.showMessageDialog(null, "Titulo: Now You´re Gone\n"
                                                    + "Artista: Bashunter\n"
                                                    + "Album: Now You're Gone (feat DJ Mental Theos Bazzheadz)\n"
                                                    + "Año: 2008");
            }else if(opc==4){
                JOptionPane.showMessageDialog(null, "Titulo: Un Nuevo Dia\n"
                                                    + "Artista: Zona Ganja\n"
                                                    + "Album: Poder\n"
                                                    + "Año: 2010");
            }else if(opc==5){
                JOptionPane.showMessageDialog(null, "Titulo: Numb\n"
                                                    + "Artista: Linkin Park\n"
                                                    + "Album: Meteora\n"
                                                    + "Año: 2003");
            }else if(opc==6){
                JOptionPane.showMessageDialog(null, "Titulo: Ocean Drive\n"
                                                    + "Artista: Duke Dumont\n"
                                                    + "Album: Ocean Drive\n"
                                                    + "Año: 2015");
            }else if(opc==7){
                JOptionPane.showMessageDialog(null, "Titulo: One\n"
                                                    + "Artista: Swedish House Mafia\n"
                                                    + "Album: Until Now\n"
                                                    + "Año: 2012");
            }else if(opc==8){
                JOptionPane.showMessageDialog(null, "Titulo: One More Time\n"
                                                    + "Artista: Daft punk\n"
                                                    + "Album: Discovery\n"
                                                    + "Año: 2001");
            }else if(opc==9){
                JOptionPane.showMessageDialog(null, "Titulo: The Greatest\n"
                                                    + "Artista: Sia\n"
                                                    + "Album: This is Acting\n"
                                                    + "Año: 2016");
            }else if(opc==10){
                JOptionPane.showMessageDialog(null, "Titulo: Summertime Sadness\n"
                                                    + "Artista: Lana del Rey\n"
                                                    + "Album: Summertime Sandness\n"
                                                    + "Año: 2013");
            }
        }
    }
    
    ///////////////////////quiz//////////////////////////////////////////////////
    public static void primos(){
        double num=Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero entre 1 y 100 por favor"));
        
        if (num>0 && num <=100){
            if(num>=50){
                for(int i=0;i>=num;i++){
                    System.out.println(" "+num);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "error, por favor digite un numero entre 1 y 100");
        }
    }
    
    ////////////////TALLER REPASO EN CLASE//////////////////////////////////////
    public static void tallerClase(){
        int opc;
        do{
            opc=Integer.parseInt(JOptionPane.showInputDialog("escoje la opcion:\n"
                                                            + "1. programa 1\n"
                                                            + "2. programa 2\n"
                                                            + "3. programa 3\n"
                                                            + "4. programa 4\n"
                                                            + "5. programa 5\n"
                                                            + "0. salir"));
            switch(opc){
                case 1:
                    //int opc2=0;
                    int suma=0;
                    int cont=0;
                    int num=0;
                    do{
                        num=Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
                        cont++;
                        suma=suma+num;
                        
                        if(suma<=100){
                            JOptionPane.showMessageDialog(null,"la promedio de los numeros es: "+ suma/cont+"\n si desea salir digite 1000");
                            
                        }else if(suma>100){
                            JOptionPane.showMessageDialog(null, "La suma de los numeros es: "+suma+"\n si desea salir digite 1000");   
                        }                   
                    }while(num!=1000);
                    break;
                    
                    
                case 2:
                    //do while contador y acumulador
                    int capacidad=0;
                    int monedas=0;
                    int dias=0;
                    do{
                        monedas=Integer.parseInt(JOptionPane.showInputDialog("monedas a ingresar hoy"));
                        capacidad+=monedas;
                        dias++;                        
                    }while(capacidad<50);
                    JOptionPane.showMessageDialog(null, "llenaste la alcancia en: "+dias+" dias");
                    break;
                case 3:
                    int menor=999999;
                    int mayor=-999999;
                    int n;
                    for(int i=0;i<20;i++){
                        n=Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
                        if(n>mayor){
                            mayor=n;
                        }if(n<menor){
                            menor=n;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "el numero mayor es: "+mayor);
                    JOptionPane.showMessageDialog(null, "el numero menor es: "+menor);
                    break;
                case 4:
                    //serie de if && 
                    int a,b,c;
                    a=Integer.parseInt(JOptionPane.showInputDialog("digite el valor de a"));
                    b=Integer.parseInt(JOptionPane.showInputDialog("digite el valor de b"));
                    c=Integer.parseInt(JOptionPane.showInputDialog("digite el valor de c"));
                    
                    if(a!=b && a!=c && b!=c){
                    if(a>b && a>c && b>c){
                        JOptionPane.showMessageDialog(null, "el numero mayore es: "+a+" \n el numero menor es: "+c);
                    }else if(a>b && a>c && b<c){
                        JOptionPane.showMessageDialog(null, "el numero mayore es: "+a+" \n el numero menor es: "+b);
                        
                    }else if(b>a && b>c && a>c){
                        JOptionPane.showMessageDialog(null, "el numero mayor es "+b+" \n el numero menor es: "+c);
                    }else if(b>a && b>c && a<c){
                        JOptionPane.showMessageDialog(null, "el numero mayor es "+b+" \n el numero menor es: "+a);
                    
                    }else if(c>a && c>b && a>b){
                        JOptionPane.showMessageDialog(null, "el numero mayor es "+c+" \n el numero menor es: "+b);
                    }else if(c>a && c>b && a<b){
                        JOptionPane.showMessageDialog(null, "el numero mayor es "+c+" \n el numero menor es: "+a);
                    }
                    }else{
                        JOptionPane.showMessageDialog(null, "introduce numeros diferentes");
                    }
                    break;
                case 5:
                    int numero=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
                    do{
                        if(numero%2==0){
                            JOptionPane.showMessageDialog(null, numero);
                            numero=numero/2;
                        }
                        else{
                            JOptionPane.showMessageDialog(null, numero);
                            numero=(numero*3)+1;
                        }
                        if(numero==1){
                            JOptionPane.showMessageDialog(null, "1");
                        }
                    }while(numero!=1);
                    break;
            }
        }while(opc!=0);
        
    }
    
    /////////////////////////////ADIVINA EL PRECIO///////////////////////////////
    public static void adivina(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingresa el objeto");
        String objeto=entrada.nextLine();
        System.out.println("ingresa el precio del objeto");
        int precio=entrada.nextInt();
        
        JOptionPane.showMessageDialog(null, "JUGADOR 1");
        int cont1=0;
        for(int i=0;i<=4;i++){
            int valor1=Integer.parseInt(JOptionPane.showInputDialog("adivina el precio"));
            cont1++;
            if(valor1<precio){
                JOptionPane.showMessageDialog(null, "mas");
            }else if(valor1>precio){
                JOptionPane.showMessageDialog(null, "menos");
            }else if(valor1==precio){
                JOptionPane.showMessageDialog(null, "El precio es CORRECTO¡");
                JOptionPane.showMessageDialog(null, "numero de intentos "+cont1);
                break;
            }
            if(cont1>4){
                JOptionPane.showMessageDialog(null, "PERDIO¡");
                JOptionPane.showMessageDialog(null, "numero de intentos "+cont1);
            }               
        }
        JOptionPane.showMessageDialog(null, "JUGADOR 2");
        int cont2=0;
        for(int i=0;i<=4;i++){
            int valor2=Integer.parseInt(JOptionPane.showInputDialog("adivina el precio"));
            cont2++;
            if(valor2<precio){
                JOptionPane.showMessageDialog(null, "mas");
            }else if(valor2>precio){
                JOptionPane.showMessageDialog(null, "menos");
            }else if(valor2==precio){
                JOptionPane.showMessageDialog(null, "El precio es CORRECTO¡");
                JOptionPane.showMessageDialog(null, "numero de intentos "+cont2);
                break;
            }
            if(cont2>4){
                JOptionPane.showMessageDialog(null, "PERDIO¡");
                JOptionPane.showMessageDialog(null, "numero de intentos "+cont2);
            }
        }
        if(cont1>cont2){
            JOptionPane.showMessageDialog(null, "EL GANADOR ES EL JUGADOR 2");
        }else{
            JOptionPane.showMessageDialog(null, "EL GANADOR ES EL JUGADOR 1");
    }
        
    }
}
