
import java.util.Scanner;
 
public class GastroUsus{
    public static void main(String arg[]){
       float[][][] arraycase = new float[5][15][25];
       float temp;
       Scanner keyboard = new Scanner(System.in);
        System.out.println("==========================================================================");
        System.out.println("Infeksi Sistem Gastro Usus\nMasukkan Input 1 untuk jawaban 'Yes' atau 2 untuk jawaban 'No'");
        System.out.print("1. Buang Air Besar (lebih dari 2 kali) : ");
        temp = keyboard.nextFloat();
        if(temp == 1){
            arraycase[0][0][0] = 1;
            arraycase[1][0][0] = 1;
            arraycase[2][0][0] = 1;
            arraycase[4][0][0] = 1;
        }
        System.out.print("2. Berak Encer? : ");
        temp = keyboard.nextFloat();
        if(temp == 1){
            arraycase[0][0][1] = 1;
            arraycase[1][0][1] = 1;
            arraycase[2][0][1] = 1;
            arraycase[4][0][1] = 1;
        }
        System.out.print("3. Berak Berdarah? : ");
        temp = keyboard.nextFloat();
        if(temp == 1){
            arraycase[4][0][2] = 1;
        }
        System.out.print("4. Lesu dan tidak bergairah? : ");
        temp = keyboard.nextFloat();
        if(temp == 1){
            arraycase[0][0][2] = 1;
            arraycase[0][1][0] = 1;
            arraycase[0][2][0] = 1;
            arraycase[0][3][0] = 1;
 
            arraycase[1][0][2] = 1;
            arraycase[1][1][0] = 1;
            arraycase[1][2][0] = 1;
 
            arraycase[2][0][2] = 1;
            arraycase[2][1][0] = 1;
            arraycase[2][2][0] = 1;
            arraycase[2][3][0] = 1;
            arraycase[2][4][0] = 1;
 
            arraycase[3][0][0] = 1;
            arraycase[3][1][0] = 1;
 
            arraycase[4][0][3] = 1;
            arraycase[4][1][0] = 1;
            arraycase[4][2][0] = 1;
        }
        System.out.print("5. Tidak Selera Makan? : ");
        temp = keyboard.nextFloat();
        if(temp == 1){
            arraycase[0][0][3] = 1;
            arraycase[0][1][1] = 1;
 
            arraycase[1][0][3] = 1;
            arraycase[1][1][1] = 1;
 
            arraycase[2][0][3] = 1;
            arraycase[2][1][1] = 1;
            arraycase[2][3][1] = 1;
 
            arraycase[3][0][1] = 1;
 
            arraycase[4][0][4] = 1;
            arraycase[4][2][1] = 1;
        }
        System.out.print("6. Merasa mual dan sering muntah (lebih dari 1 kali) : ");
        temp = keyboard.nextFloat();
        if(temp == 1){
            arraycase[0][1][2] = 1;
 
            arraycase[1][1][2] = 1;
 
            arraycase[2][1][1] = 1;
 
            arraycase[3][0][2] = 1;
        }
        System.out.print("7. Merasa sakit di bagian perut? : ");
        temp = keyboard.nextFloat();
        if(temp == 1){
            arraycase[0][2][1] = 1;
 
            arraycase[1][2][1] = 1;
 
            arraycase[2][2][1] = 1;
 
            arraycase[4][1][1] = 1;
        }
        System.out.print("8. Tekanan darah rendah? : ");
        temp = keyboard.nextFloat();
        if(temp == 1){
            arraycase[0][3][1] = 1;
 
            arraycase[1][3][0] = 1;
 
            arraycase[2][4][1] = 1;
        }
        System.out.print("9. Pusing? : ");
        temp = keyboard.nextFloat();
        if(temp == 1){
            arraycase[0][3][2]=1;
 
            arraycase[2][4][2]=1;
 
            arraycase[4][2][2]=1;
        }
        System.out.print("10. Pingsan? : ");
        temp = keyboard.nextFloat();
        if(temp == 1){
            arraycase[1][3][1]=1;
        }
        System.out.print("11. Suhu badan tinggi? : ");
        temp = keyboard.nextFloat();
        if(temp == 1){
            arraycase[2][3][4]=1;
            arraycase[2][4][2]=1;
 
            arraycase[4][2][3]=1;
        }
        System.out.print("12. Luka di bagian tertentu? : ");
        temp = keyboard.nextFloat();
        if(temp == 1){
            arraycase[2][4][4]=1;
        }
        System.out.print("13. Tidak dapat menggerakkan anggota badan tertentu? : ");
        temp = keyboard.nextFloat();
        if(temp == 1){
            arraycase[3][1][1]=1;
        }
        System.out.print("14. Memakan sesuatu? : ");
        temp = keyboard.nextFloat();
        if(temp == 1){
            arraycase[0][4][0]=1;
 
            arraycase[1][4][0]=1;
 
            arraycase[2][5][0]=1;
 
            arraycase[3][2][0]=1;
        }
        System.out.print("15. Memakan daging? : ");
        temp = keyboard.nextFloat();
        if(temp == 1){
            arraycase[0][4][1]=1;
 
            arraycase[2][5][1]=1;
        }
        System.out.print("16. Memakan jamur? : ");
        temp = keyboard.nextFloat();
        if(temp == 1){
            arraycase[1][4][1]=1;
        }
        System.out.print("17. Memakan makanan kaleng? : ");
        temp = keyboard.nextFloat();
        if(temp == 1){
            arraycase[3][2][1]=1;
        }
        System.out.print("18. Membeli susu? : ");
        temp = keyboard.nextFloat();
        if(temp == 1){
            arraycase[4][3][0]=1;
        }
        System.out.print("19. Meminum susu? : ");
        temp = keyboard.nextFloat();
        if(temp == 1){
            arraycase[4][3][1]=1;
        }
        for(int j=0;j<=6;j++){
            for(int i=0;i<=20;i++)
            {
                arraycase[0][j][21]+=arraycase[0][j][i];
                arraycase[1][j][21]+=arraycase[1][j][i];
                arraycase[2][j][21]+=arraycase[2][j][i];
                arraycase[3][j][21]+=arraycase[3][j][i];
                arraycase[4][j][21]+=arraycase[4][j][i];
            }    
        }
        arraycase[0][0][21]=arraycase[0][0][21]*100/4;
        arraycase[0][1][21]=arraycase[0][1][21]*100/3;
        arraycase[0][2][21]=arraycase[0][2][21]*100/2;
        arraycase[0][3][21]=arraycase[0][3][21]*100/3;
        arraycase[0][4][21]=arraycase[0][4][21]*100/2;
 
        arraycase[1][0][21]=arraycase[1][0][21]*100/4;
        arraycase[1][1][21]=arraycase[1][1][21]*100/3;
        arraycase[1][2][21]=arraycase[1][2][21]*100/2;
        arraycase[1][3][21]=arraycase[1][3][21]*100/2;
        arraycase[1][4][21]=arraycase[1][4][21]*100/2;
 
        arraycase[2][0][21]=arraycase[2][0][21]*100/4;
        arraycase[2][1][21]=arraycase[2][1][21]*100/3;
        arraycase[2][2][21]=arraycase[2][2][21]*100/2;
        arraycase[2][3][21]=arraycase[2][3][21]*100/4;
        arraycase[2][4][21]=arraycase[2][4][21]*100/4;
        arraycase[2][5][21]=arraycase[2][5][21]*100/2;
 
        arraycase[3][0][21]=arraycase[3][0][21]*100/3;
        arraycase[3][1][21]=arraycase[3][1][21]*100/2;
        arraycase[3][2][21]=arraycase[3][2][21]*100/2;
 
        arraycase[4][0][21]=arraycase[4][0][21]*100/5;
        arraycase[4][1][21]=arraycase[4][1][21]*100/2;
        arraycase[4][2][21]=arraycase[4][2][21]*100/4;
        arraycase[4][3][21]=arraycase[4][3][21]*100/2;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tresshold: ");
        double tressHold = input.nextFloat();

        System.out.println("==========================================================================");
        System.out.println("Persentase Infeksi Gastro Usus");
        System.out.println("==========================================================================");
        System.out.println("\nKeracunan Staphylococcus Aureus");
        System.out.println("1. Mencret = " + arraycase[0][0][21] + "% dari 20%");
        System.out.println("2. Muntah = " + arraycase[0][1][21] + "% dari 20%");
        System.out.println("3. Sakit Perut = " + arraycase[0][2][21] + "% dari 20%");
        System.out.println("4. Darah Rendah = " + arraycase[0][3][21] + "% dari 20%");
        System.out.println("5. Makan Daging = " + arraycase[0][4][21] + "% dari 20%");
        double avg1 = (arraycase[0][0][21] + arraycase[0][1][21] + arraycase[0][2][21] + arraycase[0][3][21] + arraycase[0][4][21]) / 5;
        // System.out.println("hasil rata : " + avg1);
       
        System.out.println("\nKeracunan Jamur Beracun");
        System.out.println("1. Mencret = " + arraycase[1][0][21] + "% dari 20%");
        System.out.println("2. Muntah = " + arraycase[1][1][21] + "% dari 20%");
        System.out.println("3. Sakit Perut = " + arraycase[1][2][21] + "% dari 20%");
        System.out.println("4. Koma = " + arraycase[1][3][21] + "% dari 20%");
        System.out.println("5. Makan jamur = " + arraycase[1][4][21] + "% dari 20%");
        double avg2 = (arraycase[1][0][21] + arraycase[1][1][21] + arraycase[1][2][21] + arraycase[1][3][21] + arraycase[1][4][21]) / 5;
        // double avg2 = (arraycase[1][0][21] + arraycase[1][1][21] + )
 
        System.out.println("\nKeracunan Salmonellae");
        System.out.println("1. Mencret = " + arraycase[2][0][21] + "% dari 16.66%");
        System.out.println("2. Muntah = " + arraycase[2][1][21] + "% dari 16.66%");
        System.out.println("3. Sakit Perut = " + arraycase[2][2][21] + "% dari 16.66%");
        System.out.println("4. Demam = " + arraycase[2][3][21] + "% dari 16.66%");
        System.out.println("5. Septicaemia = " + arraycase[2][4][21] + "% dari 16.66%");
        System.out.println("6. Makan daging = " + arraycase[2][5][21] + "% dari 16.66%");
        double avg3 = (arraycase[2][0][21] + arraycase[2][1][21] + arraycase[2][2][21] + arraycase[2][3][21] + arraycase[2][4][21] + arraycase[2][5][21]) / 6;
 
        System.out.println("\nKeracunan Clostridium Botulinum");
        System.out.println("1. Muntah = " + arraycase[3][0][21] + "% dari 33.33%");
        System.out.println("2. Lumpuh = " + arraycase[3][1][21] + "% dari 33.33%");
        System.out.println("3. Makan makanan kaleng = " + arraycase[3][2][21] + "% dari 33.33%");
        double avg4 = (arraycase[3][0][21] + arraycase[3][1][21] + arraycase[3][2][21]) / 5;
 
        System.out.println("\nKeracunan Campylobacter");
        System.out.println("1. Mencret berdarah = " + arraycase[4][0][21] + "% dari 25%");
        System.out.println("2. Sakit perut = " + arraycase[4][1][21] + "% dari 25%");
        System.out.println("3. Demam = " + arraycase[4][2][21] + "% dari 25%");
        System.out.println("4. Minum Susu = " + arraycase[4][3][21] + "% dari 25%");
        double avg5 = (arraycase[4][0][21] + arraycase[4][1][21] + arraycase[4][2][21] + arraycase[4][3][21]) / 5;
        System.out.println("==========================================================================");
        System.out.println("Hasil Sistem Pakar dengan Tresshold sebesar " + tressHold + ", Maka: ");
        if(avg1 >= tressHold)
        System.out.println("Anda mengalami Keracunan Staphylococcus Aureus, dengan prosentase sebesar: " + avg1);
        else if(avg2 >= tressHold)
        System.out.println("Anda mengalami Keracunan Jamur Beracun, dengan prosentase sebesar: " + avg2);
        else if(avg3 >= tressHold)
        System.out.println("Anda mengalami Keracunan Salmonellae, dengan prosentase sebesar: " + avg3);
        else if(avg4 >= tressHold)
        System.out.println("Anda mengalami Keracunan Clostridium Botulinum, dengan prosentase sebesar: " + avg4);
        else if(avg5 >= tressHold)
        System.out.println("Anda mengalami Keracunan Campylobacter, dengan prosentase sebesar: " + avg5);
        else System.out.println("Anda sehat, dan tidak ada penyakit Gastro Usus yang mendekati");
        System.out.println("==========================================================================");
    }
}
