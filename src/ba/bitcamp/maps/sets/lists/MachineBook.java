package ba.bitcamp.maps.sets.lists;

public class MachineBook {

	protected String name;
	protected String autor;
	protected int pages;
	protected int numOfChars;
	protected String[] text;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor
	 *            the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}

	/**
	 * @param pages
	 *            the pages to set
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}

	/**
	 * @return the numOfChars
	 */
	public int getNumOfChars() {
		return numOfChars;
	}

	/**
	 * @param numOfChars
	 *            the numOfChars to set
	 */
	public void setNumOfChars(int numOfChars) {
		this.numOfChars = numOfChars;
	}

	/**
	 * @return the text
	 */
	public String[] getText() {
		return text;
	}

	/**
	 * @param text
	 *            the text to set
	 */
	public void setText(String[] text) {
		this.text = text;
	}

}
