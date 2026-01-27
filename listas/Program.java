import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		//List<Integer> list;
		List<String> nomes = new ArrayList<>();
		System.out.println(nomes.size());
		nomes.add("Vinny");
		nomes.add("Beth");
		nomes.add("Davizin");
		nomes.add("Deby");
		System.out.println(nomes.size());
		for (String x : nomes) {
			System.out.println(x);
		}
		System.out.println();
		nomes.add(2, "Migau");
		System.out.println(nomes.size());
		for (String x : nomes) {
			System.out.println(x);
		}
		//nomes.remove(1); // Remove o primeiro item da lista
		nomes.removeIf(x -> x.charAt(0) == 'M');
		System.out.println(nomes.size());
		for (String x : nomes) {
			System.out.println(x);
		}
		System.out.println();
		System.out.println("Index of Mingau: " + nomes.indexOf("Mingau"));
		System.out.println("Index of Davizin: " + nomes.indexOf("Davizin"));
		System.out.println();
		List<String> result = nomes.stream().filter(x -> x.charAt(0) == 'D').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println();
		String elemento = nomes.stream().filter(x -> x.charAt(0) == 'V').findFirst().orElse(null);
		System.out.println(elemento);
		elemento = nomes.stream().filter(x -> x.charAt(0) == 'F').findFirst().orElse(null);
		System.out.println(elemento);
	}
}

/*public class Program {
	public static void main(String[] args) {
		int x = 20;
		Integer obj = x;
		//Object obj = x;
		System.out.println(obj);
		int y = (int) obj;
		System.out.println(y);
	}
}

public class Program {
	public static void main(String[] args) {
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		for (String name : vect) {
			System.out.println(name);
		}
	}
}*/