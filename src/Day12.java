public class Day12 {
	public static void main(String[] args) {
		char[] chars = { '–°', 'µ∂', '∏Á' };
		Thread[] threads = new Thread[3];
		for (int i = 0; i < 3; i++) {
			threads[i] = new Thread(() -> {
				for (char character : chars) {
					System.out.print(character);
				}
				System.out.print('\t');
			});
		}
		for (Thread thread : threads) {
			thread.start();
		}
	}
}
/* A.–°µ∂–°µ∂          –°µ∂∏Á          ∏Á∏Á */
/* B.–°µ∂–°                 µ∂∏Á         –°µ∂∏Á */
/* C.–°µ∂                      ∏Á–°µ∂∏Á–°µ∂∏Á */
/* D.–°–°µ∂µ∂∏Á∏Á                      –°µ∂∏Á */
/* E.µ∂∏Á–°               –°µ∂∏Á        –°µ∂∏Á */
/* F.∏Áµ∂–°                ∏Áµ∂–°        ∏Áµ∂–° */
/* G.–°µ∂∏Á                µ∂∏Á–°        ∏Áµ∂–° */