public Deck(ArrayList<String> ranks, ArrayList<String> suits, ArrayList<Integer> values) {
 		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
-		ArrayList<Card> deckar = null;
+		ArrayList<Card> deckar;
 		for (int i = 0; i < ranks.size(); i++){
 			for (int j = 0; j < suits.size(); j++ ){
 				Card deck = new Card(ranks.get(i), suits.get(i), values.get(i));
-				deckar = setnewarray(deck, deckar);
+				deckar = deckar.add(deck);
 			}
 				
 		}
 		cards = deckar;
 		
 	}
-	public ArrayList<Card> setnewarray(Card newcard, ArrayList<Card> deckar){
+	*public ArrayList<Card> setnewarray(Card newcard, ArrayList<Card> deckar){
 		ArrayList<Card> newcardar = null;
 		for (int i = 0; i < deckar.size(); i++){
 			newcardar .get(i) = deckar.get(i);
 		}
 		newcardar.get(deckar.size()) = newcard;
 		return newcardar;
 	}
-
+	*/
 
 	**
 	 * Determines if this deck is empty (no undealt cards).
@@ -85,7 +85,7 @@ public void shuffle() {
 			int start = 0;
 			int randPost = (int)(Math.random()* check) + start;
 			Card temporary = cards.get(k);
-			cards.get(randPost) = temporary;
+			cards.set(randPost, temporary);
 			size = cards.size();
 		}
 	}
@@ -101,7 +101,7 @@ public Card deal() {
 			return null;
 		}
 		size--;
-		Card returned= cards[size];
+		Card returned= cards.get(size);
 		return returned;
 	}
 
@@ -114,7 +114,7 @@ public String toString() {
 		String rtn = "size = " + size + "\nUndealt cards: \n";
 
 		for (int k = size - 1; k >= 0; k--) {
-			rtn = rtn + cards.length;
+			rtn = rtn + cards.size();
 			if (k != 0) {
 				rtn = rtn + ", ";
 			}
@@ -125,12 +125,12 @@ public String toString() {
 		}
 
 		rtn = rtn + "\nDealt cards: \n";
-		for (int k = cards.length - 1; k >= size; k--) {
-			rtn = rtn + cards.length;
+		for (int k = cards.size() - 1; k >= size; k--) {
+			rtn = rtn + cards.size();
 			if (k != size) {
 				rtn = rtn + ", ";
 			}
-			if ((k - cards.length) % 2 == 0) {
+			if ((k - cards.size()) % 2 == 0) {
 				// Insert carriage returns so entire deck is visible on console.
 				rtn = rtn + "\n";
 			}
