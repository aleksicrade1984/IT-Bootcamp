package domaci;

public class Zadatak_1_08132019 {

	public static void main(String[] args) {

		int i = 9, j = 6, k = 4;

		// postinkrement

		i = i++ + k++;
		/*
		 * i sa desne strane se upisuje pocetna vrednost 9 pa se onda uvecava i za 1,
		 * promenljiva i dobija novu vrednost 10. Promenljiva k se upisuje pocetna
		 * vrednost 4, a onda k se uvecava za 1 i dobija vrednost 5, a promenljiva i sa
		 * leve strane uzima vrednost 9+4= 13
		 */

		// nove vrednosti i=13, j=6, k=5
		k += i++ / (i++ - j++);
		/*
		 * promenljiva i uzima vrednost 13 pa se uvecava za 1 pa se deli sa razlikom u
		 * zagradi. U zagradi promenljiva i uzima vrednost 14 pa se uvecava za 1, a j
		 * uzima vrednost 6 pa se uvecava za 1. Razlika u zagradi je 14-6=8. Celokupan
		 * izraz sa desne strane sada je 13/8, tj 1. Promenljiva k koja ima pocetnu
		 * vrednost 5, sabira pocetnu vrednost sa rezultatom sa desne strane, pa k
		 * dobija vrednost 5+1=6
		 */

		// preinkrement
		// nove vrednosti i=15, j=7, k= 6
		j = ++k + ++j;
		/*
		 * vrednost promenljive k i j se prvo poveca za 1, pa su nove vrednosti sada
		 * k=7, a j=8. Saberu se, pa promenljiva j dobija sada novu vrednost koja iznosi
		 * 15
		 */

		// nove vrednosti i=15, j=15, k=7
		i -= ++j * ++k;
		/*
		 * vrednost promenljivih j i k se prvo poveca za 1, pa dobijaju nove vrednosti
		 * j=16, a k=8. Izraz sada sa desne strane iznosi 16*8=128 Kako je pocetna
		 * vrednost promenljive i=15, od nje se oduzima 128, pa promenljiva i sada
		 * dobija novu vrednost i=15-128=-113
		 */

		// postdekrement
		// nove vrednosti i=-113, j=16, k= 8
		i = (j-- - i--) / k--;
		/*
		 * U zagradi vrednost j se prvo upise pocetna vrednost 16 pa se umanji za 1,
		 * promenljiva i se prvo upise pocetna vrednost -113 pa se umanji za 1. Razliku
		 * dobijamo 16-(-113)=129. Promenljiva k se prvo upise vrednost 8 pa se umanji
		 * za 1. Celokupan izraz je 129/8= 16. Promenljiva i dobija vrednost 16.
		 */

		// nove vrednosti i=16, j=15, k=7
		k += i-- + j-- - k--;
		/*
		 * Vrednost i, j, k se prvo ispisu pocetne vrednosti pa se onda umanje za 1, pa
		 * su nove vrednosti i=15, j=14, k=6. Izraz sa desne strane sada je 16+15-7=24.
		 * Kako k sa leve strane ima pocetnu vrednost 7, na tu vrednost se dodaje suma
		 * sa desne strane Pa k sada dobija vrednost 7+24=31
		 */

		// predekrement
		// nove vrednosti i=15, j=14, k=31

		i = (--j - ++k) * --k;
		/*
		 * Izraz u zagradi- promenljiva j se prvo oduzme 1, pa se upise vrednost 13, dok
		 * se promenljiva k prvo doda 1 pa se ispise nova vrednost. Sada je u zagradi
		 * 13-32=-19. Promenljiva k van zagrade, prvo se umani vrednost za 1 pa se upise
		 * 31. Promenljiva i sada dobija novu vrednost -19*31=-589
		 * 
		 */

		// nove vrednosti i=-589, j=13, k=31
		j += --k + --j - --i;
		/*
		 * Izraz sa desne strane- Promenljive k, j i i se prvo od svake oduzme 1 pa se
		 * upisu nove vrednosti, . Dobijamo 30 + 12 - (-590)= 632. Kako je pocetna
		 * vrednost j 13, na tu vrednost dodajemo rezultat sa desne strane. Promenljiva
		 * j sada dobija vrednost 645.
		 * 
		 * 
		 */
		// Finalne vrednosti su i= -590, j= 645, k= 30

	}

}
