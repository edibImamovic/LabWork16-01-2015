package ba.bitcamp.maps.sets.lists;

import ba.bitcamp.models.Book;

public class CharacterCounter {

	public static <T> int count(T[] array) {

		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			T K = array[i];
			counter++;
		}

		return counter;

	}

	public static int countWords(String[] array) {
		return 0;

	}

	public static void main(String[] args) {
		Book b = new Book();
		b.setAutor("Vladimir Arsenijevic");
		b.setName("Predator");
		b.setPages(555);
		b.setText(new Integer[] { 1, 2, 3, 6, 5, 8 });

		int p = count(b.getText());
		System.out.println(p);

		System.out.println("----------------");

		MachineBook mb = new MachineBook();

		mb.setAutor("Vladimir Arsenijevic");
		mb.setName("Predatoriiiii");
		mb.setPages(555);
		mb.setText(new String[] { "A", "B", "H" });

		int bb = count(mb.getText());
		System.out.println(bb);

		Book[] books = new Book[] { new Book(), new Book(), new Book() };

		System.out.println(count(books));

		GenericClass<Integer> gs = new GenericClass<Integer>();

		System.out.println("----------------");

		gs.add(new Integer[] { 12, 13, 15, 15, 55 });

		System.out.println(count(gs.get()));

		System.out.println("----------------");

	}

}
