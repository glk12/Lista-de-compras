import java.util.ArrayList;
import java.util.Scanner;
class Meuprograma{
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

       ArrayList<String> mercado= new ArrayList<String>();
       ArrayList<String> farmacia= new ArrayList<String>();
       ArrayList<String> sacolao= new ArrayList<String>();

       while(true){
            System.out.println("1-Adicionar um item");
            System.out.println("2-Ver as listas");

            int x=scanner.nextInt();
            scanner.nextLine();
            int vdd=1;
            int vdd2=1;

            switch(x){

                case 1:
                    while(vdd<2){
                        System.out.println("Digite o número da lista que queira adicionar o produto: ");
                        System.out.println("1-Mercado");
                        System.out.println("2-Farmácia");
                        System.out.println("3-Sacolão");
                        System.out.println("4-Voltar");

                        int z=scanner.nextInt();
                        scanner.nextLine();
                        switch(z){
                            case 1:
                                System.out.println("Digite o nome do produto: ");
                                mercado.add(scanner.nextLine());
                            break;

                            case 2:
                                System.out.println("Digite o nome do produto: ");
                                farmacia.add(scanner.nextLine());
                            break;

                            case 3:
                                System.out.println("Digite o nome do produto: ");
                                sacolao.add(scanner.nextLine());
                            break;
                            
                            case 4:
                                vdd=3;
                            break;
                        }
                    }

                case 2:  
                    while(vdd2<2){
                        System.out.println("Qual lista você quer ver ?");
                        System.out.println("1-Mercado");
                        System.out.println("2-Farmácia");
                        System.out.println("3-Sacolão");
                        System.out.println("4-Voltar");

                        int f=scanner.nextInt();
                        scanner.nextLine();


                        switch(f){
                            case 1:
                                for(int h=0;h<mercado.size();h++){
                                    System.out.println(mercado.get(h));
                                }
                            break;

                            case 2:
                                for(int h=0;h<farmacia.size();h++){
                                    System.out.println(farmacia.get(h));
                                }
                            break;

                            case 3:
                                for(int h=0;h<sacolao.size();h++){
                                    System.out.println(sacolao.get(h));
                                }
                            break;

                            case 4:
                                vdd2=3;
                            break;    
                        }
                    }
                }
            }
        } 
    }



