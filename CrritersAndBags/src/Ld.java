
class Ld implements Critter {
	public char getChar() {
	    return 'L';
	  }

	
	
	public Move getMove(Neighbor front, Neighbor back, Neighbor right,
			Neighbor left) {
		
		if (front == Neighbor.EMPTY){
			return Move.HOP;}
		else  {
			if(back == Neighbor.EMPTY){
				return Move.INFECT;}
			else{
				if(left == Neighbor.EMPTY){
					return Move.LEFT;}
				else{
					if(right == Neighbor.EMPTY){
				}
					return Move.RIGHT;}
				
			}
			
			
		}
		
	

	}

}
