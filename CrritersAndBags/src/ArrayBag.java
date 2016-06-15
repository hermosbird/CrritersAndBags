
public class ArrayBag<E> implements Bag{
	private Object array[];
	private int n;
	
	public ArrayBag(){
		array =new  Object[20];
		n=0;
	}	
	
	@Override
	public void add(Object element) {
		array[size()]=element;
		n++;
		
	}

	@Override
	public int size() {
		
		return n;
	}

	@Override
	public int occurencesOf(Object el) {
		int result=0;
		for(int i =0;i<size();i++){
			if(array[i].equals(el))
				result+=1;
		}
		
		
		return result;
	}

	@Override
	public boolean remove(Object el) {
		
		if(occurencesOf(el)==0)
			return false;
		for(int i =0;i<n;i++){
			if(array[i].equals(el)){
				for(int j =1;j<n;j++){
					array[j]=array[j+1];
				}
				n++;
				return true;
			}
		}
		return false;
	}

}
