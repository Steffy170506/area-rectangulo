import java.util.Scanner;
public class  info {
    public static void main(String[] args){
    @SuppressWarnings("resource")
    Scanner tec = new Scanner(System.in);
    int op;
    // preguntarle al usuario que escoja el tipo de operacion que desea realizar
    do{System.out.println("Elige que tipo de operacion va a querer");
       System.out.println("Melanie Martinez-1");
       System.out.println("Post Malone-2");
       System.out.println("Mitski-3");
       System.out.println("Hozier-4");
       System.out.println("Twice-5");
       System.out.print("Ingresa tu opción: ");
       op = tec.nextInt();
       //diferente casos posibles que pueden realizarse
       switch(op){
        //se ejecutaran los diferentes casos posible
        case 1:
        // se ejecuta en caso de escoger cantante1
          System.out.println("Melanie Martinez");
          System.out.println("Melanie Martinez : Melanie Adele Martinez (Astoria, Nueva York; 28 de abril de 1995) es más conocida como Melanie Martinez, una artista americana (cantante, compositora, actriz…) que como cantante ha logrado una gran repercusión gracias inicialmente al concurso televisivo The Voice.");
          break;
        case 2:
        // se ejecuta en caso de escoger cantante2
          System.out.println("Post Malone");
          System.out.println("- Nombre: Austin Richard Post - Nacimiento: 4 de julio de 1995, Syracuse, Nueva York - Ocupación: Rapero, cantante, actor, compositor y productor discográfico estadounidense - Géneros musicales: Hip hop, pop, rock, trap, R&B - Álbumes de estudio: Stoney (2016), Beerbongs & Bentleys (2018), Hollywood's Bleeding (2019), Twelve Carat Toothache (2022), Austin (2023)");
          break;  
        case 3:
        // se ejecuta en caso de escoger cantante3
          System.out.println("Mitski");
          System.out.println("Mitski: Mitski Miyawaki (27 de septiembre de 1990) es una cantante y compositora estadounidense de origen japonés. Nació como Mitsuki Laycock en la prefectura de Mie, Japón. Su madre es japonesa y su padre un diplomático estadounidense del Departamento de Estado. Su primer idioma fue el japonés.");
          break; 
        case 4:
        // se ejecuta en caso de escoger cantante4
          System.out.println("Hozier");
          System.out.println("Hozier, nombre real: Andrew Hozier-Byrne) es un cantante y compositor irlandés nacido el 17 de marzo de 1990 en Bray, Irlanda. Se hizo famoso con su sencillo debut \"Take Me to Church\" en 2013. Su álbum debut, Hozier (2014), recibió gran éxito y aclamación. Su estilo mezcla folk, blues e indie rock, y su segundo álbum, Wasteland, Baby! (2019), también fue muy bien recibido. Hozier es conocido por su voz distintiva y letras poéticas.");
          break;
        case 5:
          // se ejecuta en caso de escoger cantante5
            System.out.println("Twice");
            System.out.println("TWICE es un grupo surcoreano de K-pop formado por JYP Entertainment y debutó el 20 de octubre de 2015. El grupo tiene nueve miembros: Nayeon, Jeongyeon, Momo, Sana, Jihyo, Mina, Dahyun, Chaeyoung y Tzuyu. Son conocidos por su música pop alegre y pegadiza, con éxitos como \"Like Ooh-Ahh,\" \"Likey,\" y \"Feel Special.\" TWICE ha ganado numerosos premios y tiene una gran base de fans global.");
            break;
          default:
            System.out.println("No valido");
            break;

        }
    
    
    
    }while (op!=5);

    }
}
