/* 
Aluno: Iago Rocha Gomes
Nº: 66453
*/

import java.io.*;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class VectorIntOrder {
    int numero;
    String nome;
    int[] p;

    VectorIntOrder(int n, int[] ptr) {
        int i;
        numero = n;
        p = new int[numero];
        for (i = 0; i < numero; i++) {
            p[i] = ptr[i];
        }
    }
    VectorIntOrder(){
        try{
            String nom_fich;

            System.out.print("Nome do ficheiro que sera lido: ");
            Scanner in = new Scanner(System.in);
            nom_fich= in.nextLine();
            nome=nom_fich;
            Path path = Paths.get(nom_fich);
            long tamanho = Files.size(path);
            numero=(int)(tamanho/4);
            System.out.println("A quantidade de inteiros no arquivo eh: "+ numero);
            System.out.println(" ");

            FileInputStream fpin = new FileInputStream(nom_fich);
            DataInputStream Din = new DataInputStream(fpin);
            
            p=new int[numero];
            for(int i=0;i<numero;i++){
                p[i]=Din.readInt();
            }
            in.close();
            Din.close();
        }catch (IOException e) {
            System.out.println("Problemas na abertura, leitura ou escrita. \n");
        }
    }


    
    int Mostra() {
        for (int i = 0; i < numero; i++)
            System.out.print(p[i] + " ");
        System.out.println(" ");
        return numero;
    }

    int Particiona(int esq, int dir){
        int aux;
        int i=esq+1;
        int j=dir;
        int pivot= p[esq];
        while(i<=j){
            if(p[i] <=  pivot) i++;
            else if(p[j] > pivot) j--;
            else if(i <= j){
                aux= p[i];
                p[i]=p[j];
                p[j]=aux;
                i++;
                j--;
            }
        }
        aux= p[esq];
        p[esq]=p[j];
        p[j]=aux;
        return j;
    }

    int esq=0;
    int dir0=numero-1;
    int dir=numero-1;

    void QuickSort(int esq, int dir){
        if(esq < dir){
            int j= Particiona(esq, dir);
            QuickSort(esq,(j-1));
            QuickSort((j+1),dir);
        }
    }

    void Write(){
        try{
            FileOutputStream fpout = new FileOutputStream ("sorted.bin");
            DataOutputStream out = new DataOutputStream (fpout);
            int w;
            for(int i=0;i<numero;i++){
                w=p[i];
                out.writeInt(w);
            }
            out.close();
        }catch (IOException e) {
            System.out.println("Problemas na abertura, leitura ou escrita. \n");
            }
    }

    void Ler(){
        int[] v2;
        try {
            int n;
            Path path = Paths.get("sorted.bin");
            long tamanho = Files.size(path);
            n = (int)(tamanho/4);
            v2= new int[n];
            FileInputStream fpin = new FileInputStream("sorted.bin");
            DataInputStream Din = new DataInputStream(fpin);
            
            for(int i=0;i<n;i++){
                v2[i] = Din.readInt();
            }
            System.out.println(" \n A organizacao do arquivo apos ser ordenado eh a seguinte: ");
            for(int i=0;i<n;i++){
                System.out.print(v2[i] +" ");
            }
            System.out.println(" ");
            
            
            Din.close();
        } catch (IOException e) {
            System.out.println("Problemas na abertura, leitura ou escrita. \n");
        }

    }

    public static void main(String[] args) {
        int n;
        VectorIntOrder V_dados=new VectorIntOrder();
        System.out.println("A organizacao original do arquivo eh a seguinte: ");
        n= V_dados.Mostra();
        V_dados.QuickSort(0,n-1);
        V_dados.Write();
        V_dados.Ler();
    }
}