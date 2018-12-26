package telran.person.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import telran.person.comparators.PersonAgeComparator;
import telran.person.comparators.PersonNameComparator;
import telran.person.interfaces.IManager;
import telran.person.model.Person;

public class PersonManager implements IManager{
//	ArrayList<Person> persons = new ArrayList<>();
//	List<Person> idList = new ArrayList<>();
//	ArrayList<Person> ageList = new ArrayList<>();
//	List<Person> nameList=new ArrayList<>();
	
	private List<Person> idList;
	private List<Person> nameList;
	private List<Person> ageList;
	private Comparator<Person> nameComparator;
	private Comparator<Person> ageComparator;
	
	public PersonManager() {
		idList = new ArrayList<>();
		nameList = new ArrayList<>();
		ageList = new ArrayList<>();
		nameComparator = new PersonNameComparator();
		ageComparator = new PersonAgeComparator();
	}
	
	public PersonManager(List<Person> list) {
		idList = new ArrayList<>();
		nameList = new ArrayList<>();
		ageList = new ArrayList<>();
		nameComparator = new PersonNameComparator();
		ageComparator = new PersonAgeComparator();
		if(list!=null) {
			for(Person p :list) {
				add(p);
			}
		}
	}
/*
	@Override
	public void add(Person item) {
		if(item == null) {
			return;
		}

		if(count == arr.length) {
			Person[] tmpArr = new Person[arr.length * 2];
			for (int i = 0; i < arr.length; i++) {
				tmpArr[i] = arr[i];
			}
			arr = tmpArr;
		}
		int index = indexOf(item);
		if(index < 0) {
			for (int i = count; i > (- index - 1); i--) {
				arr[i] = arr[i - 1];
			}
			arr[(-index - 1)] = item;
			count++;
		}
	}

	@Override
	public void remove(Person item) {
		if(item == null) {
			return;
		}
		int index = indexOf(item);
		if (index >=0) {
			for (int i = index; i < count - 1; i++) {
				arr[i] = arr[i + 1];
			}
			count--;
		}	
	}

	@Override
	public int indexOf(Person item) {
		return Arrays.binarySearch(arr, 0, count, item);
	}

	@Override
	public int size() {
		return count;
	}
	
	public Person[] find(int minAge, int maxAge) {
		Person[] res = null;
		Person[] tmp = Arrays.copyOfRange(arr, 0, count);
		Comparator<Person> comparator = new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				int res = Integer.compare(o1.getAge(), o2.getAge());
				if (res == 0) {
					res = Integer.compare(o1.getId(), o2.getId());
				}
				return res;
			}
			
		};
		Arrays.sort(tmp, comparator);
		Person left = new Person("", minAge, Integer.MIN_VALUE);
		Person right = new Person("", maxAge, Integer.MAX_VALUE);
		int leftIndx = -Arrays.binarySearch(tmp, left, comparator) - 1;
		int rightIndx = - Arrays.binarySearch(tmp, right, comparator) - 1;
		res = Arrays.copyOfRange(tmp, leftIndx, rightIndx);
		return res;
	}
	@Override
	public Person get(int index ) {
		if(index >= 0 && index < count) {
			return arr[index];
		}
		return null;
	}

	@Override
	public Iterator<Person> iterator() {
		return new Iterator<Person>() {
			int curr = 0;

			@Override
			public boolean hasNext() {
				
				return curr < count;
			}

			@Override
			public Person next() {
				if(hasNext()) {
					return arr[curr++];
				}
				throw new NoSuchElementException();
			}
		};
	}

	@Override
	public boolean add(Person p) {
	if(p==null) 
	{
		return false;
			}else
	idList.add(p);
	ageList.add(p);
	nameList.add(p);
	return true;
	}

	@Override
	public boolean remove(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Person find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Person> find(int minAge, int maxAge) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Person> getAllPersonsById() {
	
		PersonIdComparator pid = new PersonIdComparator();
		Collections.sort(idList,pid);
		return idList;
	}

	@Override
	public Iterable<Person> getAllPersonsByAge() {
		PersonAgeComparator pad = new PersonAgeComparator();
		Collections.sort(ageList,pad);
		return ageList;
	}

	@Override
	public Iterable<Person> getAllPersonsByName() {
		PersonNameComparator pnd = new PersonNameComparator();
		Collections.sort(nameList,pnd);
		return nameList;
	}

	@Override
	public int size() {
		
		return persons.size();
	}

	@Override
	public Iterator<Person> iterator() {
		return new Iterator<Person>() {
			int curr = 0;

			@Override
			public boolean hasNext() {
				
				return curr < count;
			}

			@Override
			public Person next() {
				if(hasNext()) {
					return persons.get(count);
				}
				throw new NoSuchElementException();
			}
		};
	}*/

	@Override
	public boolean add(Person p) {
		int indx = Collections.binarySearch(idList, p);
		if(indx<0) {
			idList.add(-indx-1,p);
			indx = Collections.binarySearch(ageList, p,ageComparator)-1;
			ageList.add(indx,p);
			indx = Collections.binarySearch(nameList, p,nameComparator)-1;
			nameList.add(indx,p);
			return true;
		}
		return false;
	}

	@Override
	public boolean remove(int id) {
		Person tmp = new Person("",id,-1);
		int indx = Collections.binarySearch(idList, tmp);
		if(indx>=0) {
			idList.remove(indx);
			indx = Collections.binarySearch(ageList,tmp,ageComparator);
			ageList.remove(indx);
			indx = Collections.binarySearch(nameList, tmp,nameComparator);
			nameList.remove(indx);
			return true;
			
		}
		return false;
	}

	@Override
	public Person find(int id) {
		int indx = Collections.binarySearch(idList,new Person("",id,12));
		if(indx>=0) {
			return idList.get(indx);
		}
		return null;
	}

	@Override
	public Iterable<Person> find(int minAge, int maxAge) {
		Person left = new Person("",Integer.MIN_VALUE,minAge);
		Person right = new Person("",Integer.MAX_VALUE,maxAge);
		int indxL =Collections.binarySearch(ageList, left,ageComparator);
		int indxR =Collections.binarySearch(ageList, right,ageComparator);
		return ageList.subList(indxL, indxR);
	}

	@Override
	public Iterable<Person> getAllPersonsById() {
		
		return idList;
	}

	@Override
	public Iterable<Person> getAllPersonsByAge() {
		
		return ageList;
	}

	@Override
	public Iterable<Person> getAllPersonsByName() {
		
		return nameList;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}
