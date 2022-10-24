package IndiaTextDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class India {

	public static void main(String[] args) throws Exception {

		new India().split();
	}

	public void split() throws Exception {

		File file = new File("F:\\abc.txt");
		FileReader fr = new FileReader(file); // reads the file
		BufferedReader br = new BufferedReader(fr); // creates a buffering character input stream
		String line;
		HashMap<String, String> dta = new HashMap<String, String>();
		;
		while ((line = br.readLine()) != null) {

			String[] data = line.split(",");
			dta.put(data[0].trim(), data[1].trim());// storing the data in hashmap
		}
		fr.close();
		br.close();

		ArrayList<String> listOfValues = dta.values().stream().collect(Collectors.toCollection(ArrayList::new));// getting
																												// the
																												// countries
																												// name
																												// from
																												// list
		System.out.println(listOfValues);
		ArrayList<String> countries = removeDuplicates(listOfValues);
		System.out.println(countries);
		HashMap<String, BufferedWriter> bufferObj = new HashMap<String, BufferedWriter>();
		for (String string : countries) {
			File f = new File("F:\\" + string + ".txt");
			bufferObj.put(string, new BufferedWriter(new FileWriter(f)));

		}
		BufferedWriter bfw = null;
		for (Map.Entry<String, String> set : dta.entrySet()) {

			// Printing all elements of a Map
			System.out.println(set.getKey() + " = " + set.getValue());
			if (countries.contains(set.getValue())) {

				bfw = bufferObj.get(set.getValue());
				bfw.write(set.getKey() + ":" + set.getValue());

				// new line
				bfw.newLine();
				bfw.flush();
			}
		}

		bfw.close();
	}

	// Function to remove duplicates from an ArrayList
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {

		// Create a new ArrayList
		ArrayList<T> newList = new ArrayList<T>();

		// Traverse through the first list
		for (T element : list) {

			if (!newList.contains(element)) {

				newList.add(element);
			}
		}

		// return the new list
		return newList;
	}

}