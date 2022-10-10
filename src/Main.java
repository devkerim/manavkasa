import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    double armutk,armut = 2.14;
	double elmak,elma = 3.67;
	double domatesk,domates = 1.11;
	double muzk,muz = 0.95;
	double patlicank,patlican = 5.00;
	double total,elmat,armutt,domatest,muzt,patlicant;


	Scanner doublescanner = new Scanner(System.in);



	System.out.print("Armut kaç kilo: ");
	armutk = doublescanner.nextDouble();
	System.out.print("Elma kaç kilo: ");
	elmak = doublescanner.nextDouble();
	System.out.print("Domates kaç kilo: ");
	domatesk = doublescanner.nextDouble();
	System.out.print("Muz kaç kilo: ");
	muzk = doublescanner.nextDouble();
	System.out.print("Patlıcan kaç kilo: ");
	patlicank = doublescanner.nextDouble();


	elmat= elmak*elma;
	armutt = armutk*armut;
	domatest = domatesk*domates;
	muzt = muzk * muz;
	patlicant = patlicank*patlican;

	total = elmat+armutt+domatest+muzt+patlicant;

	System.out.println("Toplam Tutar: "+total);



    }
}
