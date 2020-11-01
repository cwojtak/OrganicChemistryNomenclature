package com.connorwojtak.nomenclature;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Nomenclature {

		public static final Map<Integer, String> BASE_PREFIXES = Map.ofEntries(
				new AbstractMap.SimpleEntry<Integer, String>(1, "meth"),
				new AbstractMap.SimpleEntry<Integer, String>(2, "eth"),
				new AbstractMap.SimpleEntry<Integer, String>(3, "prop"),
				new AbstractMap.SimpleEntry<Integer, String>(4, "but"),
				new AbstractMap.SimpleEntry<Integer, String>(5, "pent"),
				new AbstractMap.SimpleEntry<Integer, String>(6, "hex"),
				new AbstractMap.SimpleEntry<Integer, String>(7, "hept"),
				new AbstractMap.SimpleEntry<Integer, String>(8, "oct"),
				new AbstractMap.SimpleEntry<Integer, String>(9, "non"),
				new AbstractMap.SimpleEntry<Integer, String>(10, "dec"),
				new AbstractMap.SimpleEntry<Integer, String>(11, "undec"),
				new AbstractMap.SimpleEntry<Integer, String>(12, "dodec"),
				new AbstractMap.SimpleEntry<Integer, String>(13, "tridec"),
				new AbstractMap.SimpleEntry<Integer, String>(14, "tetradec"),
				new AbstractMap.SimpleEntry<Integer, String>(15, "pentadec"),
				new AbstractMap.SimpleEntry<Integer, String>(16, "hexadec"),
				new AbstractMap.SimpleEntry<Integer, String>(17, "heptadec"),
				new AbstractMap.SimpleEntry<Integer, String>(18, "octadec"),
				new AbstractMap.SimpleEntry<Integer, String>(19, "nonadec"),
				new AbstractMap.SimpleEntry<Integer, String>(20, "eicos"),
				new AbstractMap.SimpleEntry<Integer, String>(21, "henicos"),
				new AbstractMap.SimpleEntry<Integer, String>(22, "docos"),
				new AbstractMap.SimpleEntry<Integer, String>(23, "tricos"),
				new AbstractMap.SimpleEntry<Integer, String>(24, "tetracos"),
				new AbstractMap.SimpleEntry<Integer, String>(25, "pentacos"),
				new AbstractMap.SimpleEntry<Integer, String>(26, "hexacos"),
				new AbstractMap.SimpleEntry<Integer, String>(27, "heptacos"),
				new AbstractMap.SimpleEntry<Integer, String>(28, "octacos"),
				new AbstractMap.SimpleEntry<Integer, String>(29, "nonacos"),
				new AbstractMap.SimpleEntry<Integer, String>(30, "triacont"),
				new AbstractMap.SimpleEntry<Integer, String>(31, "hentriacont"),
				new AbstractMap.SimpleEntry<Integer, String>(32, "dotriacont"),
				new AbstractMap.SimpleEntry<Integer, String>(33, "tritriacont"),
				new AbstractMap.SimpleEntry<Integer, String>(34, "tetratriacont"),
				new AbstractMap.SimpleEntry<Integer, String>(35, "pentatriacont"),
				new AbstractMap.SimpleEntry<Integer, String>(36, "hexatriacont"),
				new AbstractMap.SimpleEntry<Integer, String>(37, "heptatriacont"),
				new AbstractMap.SimpleEntry<Integer, String>(38, "octatriacont"),
				new AbstractMap.SimpleEntry<Integer, String>(39, "nonatraicont"),
				new AbstractMap.SimpleEntry<Integer, String>(40, "tetracont"),
				new AbstractMap.SimpleEntry<Integer, String>(41, "hentetracont"),
				new AbstractMap.SimpleEntry<Integer, String>(42, "dotetracont"),
				new AbstractMap.SimpleEntry<Integer, String>(43, "tritetracont"),
				new AbstractMap.SimpleEntry<Integer, String>(44, "tetratetracont"),
				new AbstractMap.SimpleEntry<Integer, String>(45, "pentatetracont"),
				new AbstractMap.SimpleEntry<Integer, String>(46, "hexatetracont"),
				new AbstractMap.SimpleEntry<Integer, String>(47, "heptatetracont"),
				new AbstractMap.SimpleEntry<Integer, String>(48, "octatetracont"),
				new AbstractMap.SimpleEntry<Integer, String>(49, "nonatetracont"),
				new AbstractMap.SimpleEntry<Integer, String>(50, "pentacont"),
				new AbstractMap.SimpleEntry<Integer, String>(51, "henpentacont"),
				new AbstractMap.SimpleEntry<Integer, String>(52, "dopentacont"),
				new AbstractMap.SimpleEntry<Integer, String>(53, "tripentacont"),
				new AbstractMap.SimpleEntry<Integer, String>(54, "tetrapentacont"),
				new AbstractMap.SimpleEntry<Integer, String>(55, "pentapentacont"),
				new AbstractMap.SimpleEntry<Integer, String>(56, "hexapentacont"),
				new AbstractMap.SimpleEntry<Integer, String>(57, "heptapentacont"),
				new AbstractMap.SimpleEntry<Integer, String>(58, "octapentacont"),
				new AbstractMap.SimpleEntry<Integer, String>(59, "nonapentacont"),
				new AbstractMap.SimpleEntry<Integer, String>(60, "hexacont"),
				new AbstractMap.SimpleEntry<Integer, String>(61, "henhexacont"),
				new AbstractMap.SimpleEntry<Integer, String>(62, "dohexacont"),
				new AbstractMap.SimpleEntry<Integer, String>(63, "trihexacont"),
				new AbstractMap.SimpleEntry<Integer, String>(64, "tetrahexacont"),
				new AbstractMap.SimpleEntry<Integer, String>(65, "pentahexacont"),
				new AbstractMap.SimpleEntry<Integer, String>(66, "hexahexacont"),
				new AbstractMap.SimpleEntry<Integer, String>(67, "heptahexacont"),
				new AbstractMap.SimpleEntry<Integer, String>(68, "octahexacont"),
				new AbstractMap.SimpleEntry<Integer, String>(69, "nonahexacont"),
				new AbstractMap.SimpleEntry<Integer, String>(70, "heptacont"),
				new AbstractMap.SimpleEntry<Integer, String>(71, "henheptacont"),
				new AbstractMap.SimpleEntry<Integer, String>(72, "doheptacont"),
				new AbstractMap.SimpleEntry<Integer, String>(73, "triheptacont"),
				new AbstractMap.SimpleEntry<Integer, String>(74, "tetraheptacont"),
				new AbstractMap.SimpleEntry<Integer, String>(75, "pentaheptacont"),
				new AbstractMap.SimpleEntry<Integer, String>(76, "hexaheptacont"),
				new AbstractMap.SimpleEntry<Integer, String>(77, "heptaheptacont"),
				new AbstractMap.SimpleEntry<Integer, String>(78, "octaheptacont"),
				new AbstractMap.SimpleEntry<Integer, String>(79, "nonaheptacont"),
				new AbstractMap.SimpleEntry<Integer, String>(80, "octacont"),
				new AbstractMap.SimpleEntry<Integer, String>(81, "henoctacont"),
				new AbstractMap.SimpleEntry<Integer, String>(82, "dooctacont"),
				new AbstractMap.SimpleEntry<Integer, String>(83, "trioctacont"),
				new AbstractMap.SimpleEntry<Integer, String>(84, "tetraoctacont"),
				new AbstractMap.SimpleEntry<Integer, String>(85, "pentaoctacont"),
				new AbstractMap.SimpleEntry<Integer, String>(86, "hexaoctacont"),
				new AbstractMap.SimpleEntry<Integer, String>(87, "heptaoctacont"),
				new AbstractMap.SimpleEntry<Integer, String>(88, "octaoctacont"),
				new AbstractMap.SimpleEntry<Integer, String>(89, "nonaoctacont"),
				new AbstractMap.SimpleEntry<Integer, String>(90, "nonacont"),
				new AbstractMap.SimpleEntry<Integer, String>(91, "hennonacont"),
				new AbstractMap.SimpleEntry<Integer, String>(92, "dononacont"),
				new AbstractMap.SimpleEntry<Integer, String>(93, "trinonacont"),
				new AbstractMap.SimpleEntry<Integer, String>(94, "tetranonacont"),
				new AbstractMap.SimpleEntry<Integer, String>(95, "pentanonacont"),
				new AbstractMap.SimpleEntry<Integer, String>(96, "hexanonacont"),
				new AbstractMap.SimpleEntry<Integer, String>(97, "heptanonacont"),
				new AbstractMap.SimpleEntry<Integer, String>(98, "octanonacont"),
				new AbstractMap.SimpleEntry<Integer, String>(99, "nonanonacont"),
				new AbstractMap.SimpleEntry<Integer, String>(100, "hect"),
				new AbstractMap.SimpleEntry<Integer, String>(101, "henihect"),
				new AbstractMap.SimpleEntry<Integer, String>(102, "dohect"),
				new AbstractMap.SimpleEntry<Integer, String>(103, "trihect"),
				new AbstractMap.SimpleEntry<Integer, String>(104, "tetrahect"),
				new AbstractMap.SimpleEntry<Integer, String>(105, "pentahect"),
				new AbstractMap.SimpleEntry<Integer, String>(106, "hexahect"),
				new AbstractMap.SimpleEntry<Integer, String>(107, "heptahect"),
				new AbstractMap.SimpleEntry<Integer, String>(108, "octahect"),
				new AbstractMap.SimpleEntry<Integer, String>(109, "nonahect"),
				new AbstractMap.SimpleEntry<Integer, String>(110, "decahect"),
				new AbstractMap.SimpleEntry<Integer, String>(111, "undecahect"),
				new AbstractMap.SimpleEntry<Integer, String>(112, "dodecahect"),
				new AbstractMap.SimpleEntry<Integer, String>(113, "tridecahect"),
				new AbstractMap.SimpleEntry<Integer, String>(114, "tetradecahect"),
				new AbstractMap.SimpleEntry<Integer, String>(115, "pentadecahect"),
				new AbstractMap.SimpleEntry<Integer, String>(116, "hexadecahect"),
				new AbstractMap.SimpleEntry<Integer, String>(117, "heptadecahect"),
				new AbstractMap.SimpleEntry<Integer, String>(118, "octadecahect"),
				new AbstractMap.SimpleEntry<Integer, String>(119, "nonadecahect"),
				new AbstractMap.SimpleEntry<Integer, String>(120, "icosahect"));
		
		public static final Map<Integer, Character> BOND_CHARACTERS = Map.ofEntries(
				new AbstractMap.SimpleEntry<Integer, Character>(1, '-'),
				new AbstractMap.SimpleEntry<Integer, Character>(2, '='),
				new AbstractMap.SimpleEntry<Integer, Character>(3, '\u2261'));
		
		public static final Map<Integer, String> SUBSTITUENT_PREFIXES = Map.ofEntries(
				new AbstractMap.SimpleEntry<Integer, String>(0, "di"),
				new AbstractMap.SimpleEntry<Integer, String>(1, "tri"),
				new AbstractMap.SimpleEntry<Integer, String>(2, "tetra"),
				new AbstractMap.SimpleEntry<Integer, String>(3, "penta"),
				new AbstractMap.SimpleEntry<Integer, String>(4, "hexa"),
				new AbstractMap.SimpleEntry<Integer, String>(5, "hepta"),
				new AbstractMap.SimpleEntry<Integer, String>(6, "octa"),
				new AbstractMap.SimpleEntry<Integer, String>(7, "nona"),
				new AbstractMap.SimpleEntry<Integer, String>(8, "deca"));
		
		public static Atom METHYL;
		
		public static Atom ETHYL;
		
		public static Atom FLUORO;
		
		public static Atom CHLORO;
		
		public static Atom BROMO;
		
		public static Atom IODO;
		
		public static Map<String, Atom> BASIC_SUBSTITUENTS;
		
	private static Atom Molecule = null;
	
	/*
	public static void DEBUGDUMP(Atom a) {
		for(int i = 0; i < a.getChildren().size(); i++) {
			System.out.println(a.getChildren().get(i));
			DEBUGDUMP(a.getChildren().get(i));
		}
	}
	*/
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner s = new Scanner(System.in);
		declare();
		while(true) {
			System.out.println("Please enter the full name of the organic molecule you would like to draw:");
			String in = s.nextLine();
			
			parse(in);
			render();
			clear();
			
			System.out.println("Do you want to continue (Y/N)?");
			String scont = s.nextLine();
			if(scont.equals("N")) {
				System.out.println();
				break; 
			}
		}
		s.close();
	}
	
	private static void declare() {
		try {
			METHYL = new Atom("Carbon", "C").addChild(new Atom("Hydrogen", "H"), 1)
					.addChild(new Atom("Hydrogen", "H"), 1).addChild(new Atom("Hydrogen", "H"), 1);
			ETHYL = new Atom("Carbon", "C").addChild(new Atom("Hydrogen", "H"), 1)
					.addChild(new Atom("Hydrogen", "H"), 1).addChild(new Atom("Carbon", "C")
							.addChild((Atom)METHYL.clone(), 1), 1);
			FLUORO = new Atom("Fluorine", "F");
			CHLORO = new Atom("Chlorine", "Cl");
			BROMO = new Atom("Bromine", "Br");
			IODO = new Atom("Iodine", "I");
			BASIC_SUBSTITUENTS =  Map.ofEntries(
					new AbstractMap.SimpleEntry<String, Atom>("methyl", METHYL),
					new AbstractMap.SimpleEntry<String, Atom>("ethyl", ETHYL),
					new AbstractMap.SimpleEntry<String, Atom>("fluoro", FLUORO),
					new AbstractMap.SimpleEntry<String, Atom>("chloro", CHLORO),
					new AbstractMap.SimpleEntry<String, Atom>("bromo", BROMO),
					new AbstractMap.SimpleEntry<String, Atom>("iodo", IODO));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	
	private static void parse(String name) {
		//CYCLO
		boolean isCyclo = false;
		if(name.contains("cyclo")) {
			name = name.substring(0, name.indexOf("cyclo")) + name.substring(name.indexOf("cyclo")+5, name.length());
			isCyclo = true;
		}
		//BASES
		//Alkanes
		if(name.contains("ane")){
			String baseName = "";
			int baseNumber;
			for(baseNumber = 1; baseNumber < BASE_PREFIXES.size(); baseNumber++) {
				baseName = BASE_PREFIXES.get(baseNumber) + "ane";
				if(name.lastIndexOf(baseName) != -1) {
					if(name.lastIndexOf(baseName) + baseName.length() + 2 < name.length()) {
						if(!name.substring(name.lastIndexOf(baseName) + baseName.length(), name.lastIndexOf(baseName) + baseName.length() + 2).equals("yl")) break;
					} else {
						break;
					}
				}
			}
			name.replace(baseName, "");
			parseAne(baseName, baseNumber, isCyclo);
			name = name.substring(0, name.indexOf(baseName));
		}
		if(name.contains("ene")) name = name.substring(0, name.lastIndexOf("-")+1) + name.substring(name.lastIndexOf("ene"), name.length()); 
		if(name.contains("yne")) name = name.substring(0, name.lastIndexOf("-")+1) + name.substring(name.lastIndexOf("yne"), name.length()); 
		//Alkenes and Alkynes
		if(name.contains("-ene") || name.contains("-yne")) {
			String baseName = "";
			int baseNumber;
			for(baseNumber = 1; baseNumber <= BASE_PREFIXES.size(); baseNumber++) {
				baseName = BASE_PREFIXES.get(baseNumber);
				if(name.lastIndexOf(baseName) != -1) {
					if(name.lastIndexOf(baseName) + baseName.length() + 2 < name.length()) {
						if(!name.substring(name.lastIndexOf(baseName) + baseName.length(), name.lastIndexOf(baseName) + baseName.length() + 2).equals("yl")) break;
					} else {
						break;
					}
				}
			}
			if(name.contains("-ene")) {
				ArrayList<Integer> doubleBondNumbers = new ArrayList<Integer>();
				String temp = "";
				for(int i = name.indexOf(baseName) + baseName.length()+2; i < name.indexOf("-ene"); i++){
					if(name.charAt(i) == ',') {
						doubleBondNumbers.add(Integer.parseInt(temp));
						temp = "";
					} else {
						temp += ""+name.charAt(i);
					}
				}
				doubleBondNumbers.add(Integer.parseInt(temp));
				parseEneYne(baseName, baseNumber, doubleBondNumbers, true, isCyclo);
			} else {
				ArrayList<Integer> tripleBondNumbers = new ArrayList<Integer>();
				String temp = "";
				for(int i = name.indexOf(baseName) + baseName.length()+2; i < name.indexOf("-yne"); i++){
					if(name.charAt(i) == ',') {
						tripleBondNumbers.add(Integer.parseInt(temp));
						temp = "";
					} else {
						temp += ""+name.charAt(i);
					}
				}
				tripleBondNumbers.add(Integer.parseInt(temp));
				parseEneYne(baseName, baseNumber, tripleBondNumbers, false, isCyclo);
			}
			name = name.substring(0, name.indexOf(baseName));
		}
		if(name.length() == 0) return;
		//SUBSTITUENTS
		//Basic Substituents
		ArrayList<String> substituentNames = new ArrayList<String>();
		ArrayList<String> substituentLocations = new ArrayList<String>();
		int i = -1;
		int count = 0;
		while(!(-1 == name.indexOf('-', i+1))) {
			int j = name.indexOf('-', i+1);
			if(count % 2 == 0) {
				substituentLocations.add(name.substring(i+1, j));
			} else {
				substituentNames.add(name.substring(i+1, j));
			}
			i = j;
			count++;
		}
		substituentNames.add(name.substring(i+1, name.length()));
		parseBasicSubs(name, substituentNames, substituentLocations);
	}
	
	private static void parseAne(String baseName, int baseNumber, boolean cyclo) {
		if(!cyclo) Molecule = new Atom("Carbon", "C");
		else Molecule = new Atom("Carbon", "C0");
		ArrayList<Atom> carryOver = new ArrayList<Atom>();
		carryOver.add(Molecule);
		for(int i = 0; i < baseNumber; i++) {
			carryOver.get(i).addChild(new Atom("Hydrogen", "H"), 1);
			carryOver.get(i).addChild(new Atom("Hydrogen", "H"), 1);
			if(i == 0) {
				carryOver.get(i).addChild(new Atom("Hydrogen", "H"), 1);
			}
			if(i == baseNumber - 1) {
				carryOver.get(i).addChild(new Atom("Hydrogen", "H"), 1);
			}
			if(!(baseNumber == 1) && !(i == baseNumber - 1)) {
				Atom temp = new Atom("Carbon", "C");
				carryOver.get(i).addChild(temp, 1);
				carryOver.add(temp);
			}
		}
		if(cyclo) carryOver.get(carryOver.size()-1).setSymbol("C0");
	}
	
	private static void parseEneYne(String baseName, int baseNumber, ArrayList<Integer> bondNumbers, boolean ene, boolean cyclo) {
		if(!cyclo) Molecule = new Atom("Carbon", "C");
		else Molecule = new Atom("Carbon", "C0");
		ArrayList<Atom> carryOver = new ArrayList<Atom>();
		carryOver.add(Molecule);
		for(int i = 0; i < baseNumber; i++) {
			boolean accountedFor = false;
			for(int j = 0; j < bondNumbers.size(); j++) {
				if(bondNumbers.get(j) == i + 1) {
					if(ene) {
						carryOver.get(i).addChild(new Atom("Hydrogen", "H"), 1);
						accountedFor = true;
					} else {
						accountedFor = true;
					}
				}
			}
			if(!accountedFor) {
				carryOver.get(i).addChild(new Atom("Hydrogen", "H"), 1);
				carryOver.get(i).addChild(new Atom("Hydrogen", "H"), 1);
			}
			if(i == 0) {
				carryOver.get(i).addChild(new Atom("Hydrogen", "H"), 1);
			}
			if(i == baseNumber - 1) {
				carryOver.get(i).addChild(new Atom("Hydrogen", "H"), 1);
			}
			if(!(baseNumber == 1) && !(i == baseNumber - 1)) {
				Atom temp = new Atom("Carbon", "C");
				boolean addedAlready = false;
				for(int j = 0; j < bondNumbers.size(); j++) {
					if(bondNumbers.get(j) == i + 1) {
						if(ene) {
							carryOver.get(i).addChild(temp, 2);
						} else {
							carryOver.get(i).addChild(temp, 3);
						}
						addedAlready = true;
					}
				}
				if(!addedAlready) {
					carryOver.get(i).addChild(temp, 1);
				}
				carryOver.add(temp);
			}
		}
		if(cyclo) carryOver.get(carryOver.size()-1).setSymbol("C0");
	}
	
	private static void parseBasicSubs(String n, ArrayList<String> names, ArrayList<String> locations) {
		for(int i = 0; i < locations.size(); i++) {
			String substituent = names.get(i);
			for(int l = 0; l < SUBSTITUENT_PREFIXES.size(); l++) {
				substituent = substituent.replace(SUBSTITUENT_PREFIXES.get(l), "");
			}
			ArrayList<Integer> subNumbers = new ArrayList<Integer>();
			int k = 0;
			while(!(-1 == locations.get(i).indexOf(',', k+1))) {
				int j = locations.get(i).indexOf(',', k+1);
				subNumbers.add(Integer.parseInt(locations.get(i).substring(k, j)));
				k = j+1;
			}
			subNumbers.add(Integer.parseInt(locations.get(i).substring(k, locations.get(i).length())));
			for(int j = 0; j < subNumbers.size(); j++) {
				Atom carryOver = Molecule;
				for(int z = 0; z < subNumbers.get(j)-1; z++) {
					for(int a = 0; a < carryOver.getChildren().size(); a++) {
						if(carryOver.getChildren().get(a).getSymbol().equals("C") && carryOver.getChildren().get(a).getIfMainChain()) {
							carryOver = carryOver.getChildren().get(a);
							break;
						}
					}
				}
				try {
					Atom sub = (Atom)BASIC_SUBSTITUENTS.get(substituent).clone();
					sub.setSubstituent();
					carryOver.removeChild("H");
					carryOver.addChild(sub, 1, 0);
				} catch (CloneNotSupportedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void render() {
		System.out.println(Molecule);
		recursiveRender(Molecule, 1);
		System.out.println();
	}
	
	private static void recursiveRender(Atom parent, Integer indents) {
		for(int i = 0; i < parent.getChildren().size(); i++) {
			for(int j = 0; j < indents; j++) {
				System.out.print("\u0009");
			}
			System.out.println(BOND_CHARACTERS.get(parent.getBondNumbers().get(i)) + " " + parent.getChildren().get(i).getSymbol());
			if(!(parent.getChildren().get(i).getSymbol().equals("H"))) {
				recursiveRender(parent.getChildren().get(i), indents + 1);
			}
		}
	}
	
	private static void clear() {
		Molecule = null;
	}
	
	private static class Atom implements Cloneable {

		//private String atom;
		private String symbol;
		private ArrayList<Atom> children;
		private ArrayList<Integer> bondNumbers;
		private boolean mainChain = true;
		@SuppressWarnings("unused")
		public Atom copy;
		
		private Atom() {
			//atom = "NULL";
			symbol = "!";
			children = new ArrayList<Atom>();
			bondNumbers = new ArrayList<Integer>();
		}
		
		public Atom(String a, String s){
			//atom = a;
			symbol = s;
			children = new ArrayList<Atom>();
			bondNumbers = new ArrayList<Integer>();
		}
		
		public Atom addChild(Atom a, Integer b){
			children.add(a);
			bondNumbers.add(b);
			return this;
		}
		
		public Atom addChild(Atom a, Integer b, Integer where){
			children.add(where, a);
			bondNumbers.add(where, b);
			return this;
		}
		
		public ArrayList<Atom> getChildren() {
			return children;
		}
		
		public void removeChild(String symbol){
			for(int i = 0; i < children.size(); i++) {
				if(children.get(i).getSymbol().equals(symbol)) {
					children.remove(i);
					return;
				}
			}
		}
		
		public ArrayList<Integer> getBondNumbers() {
			return bondNumbers;
		}
		
		public String getSymbol() {
			return symbol;
		}
		
		public void setSymbol(String s) {
			symbol = s;
		}
		
		public void setSubstituent() {
			mainChain = false;
		}
		
		public boolean getIfMainChain() {
			return mainChain;
		}
		
		/*
		public String toFullString() {
			return atom;
		}
		*/
		
		@Override
		public String toString() {
			return symbol;
		}
		
		@Override
		public Object clone() throws CloneNotSupportedException {
			this.copy = new Atom();
			Atom a = (Atom)super.clone();
			a.copy = new Atom();
			return a;
		}
	}
}