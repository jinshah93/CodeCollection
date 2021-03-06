import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		ChemicalElement element1 = new ChemicalElement(1, "Hydrogen", "H", 1.008);
		ChemicalElement element2 = new ChemicalElement(12, "Magnessium", "Mg", 24.305);
		ChemicalElement element3 = new ChemicalElement(8, "Oxygen", "O", 15.999);
		ChemicalElement element4 = new ChemicalElement(14, "Silicon", "Si", 28.085);
		ChemicalElement element5 = new ChemicalElement(3, "Lithium", "Li", 6.94);
		ChemicalElement element6 = new ChemicalElement(1, "Hydrogen", "H", 1.008);
		System.out.println("Chemical elements are ready....");

		TreeSet<ChemicalElement> periodicTable = new TreeSet<ChemicalElement>();
		System.out.println("Empty periodic table is ready....");

		System.out.println("Adding the first element....");
		periodicTable.add(element1);
		periodicTable.add(element2);
		periodicTable.add(element3);
		periodicTable.add(element4);
		periodicTable.add(element5);
		periodicTable.add(element6);
		System.out.println("All the elements are added.....");

		for (ChemicalElement chemicalElement : periodicTable) {
			System.out.println("Chemical element : " + chemicalElement);
		}

	}
}

class ChemicalElement implements Comparable<ChemicalElement> {
	private int atomicNumber;
	private String atomicName;
	private String atomicFormula;
	private double atomicWeight;

	@Override
	public int compareTo(ChemicalElement o) {
		System.out.println("Comparing atomic number " + atomicNumber + " with o.atomicNumber " + o.atomicNumber);
		return Integer.compare(atomicNumber, o.atomicNumber);
	}
	
	public ChemicalElement(int atomicNumber, String atomicName, String atomicFormula, double atomicWeight) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.atomicFormula = atomicFormula;
		this.atomicWeight = atomicWeight;
	}

	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicFormula="
				+ atomicFormula + ", atomicWeight=" + atomicWeight + "]";
	}

	public int getAtomicNumber() {
		return atomicNumber;
	}

	public void setAtomicNumber(int atomicNumber) {
		this.atomicNumber = atomicNumber;
	}

	public String getAtomicName() {
		return atomicName;
	}

	public void setAtomicName(String atomicName) {
		this.atomicName = atomicName;
	}

	public String getAtomicFormula() {
		return atomicFormula;
	}

	public void setAtomicFormula(String atomicFormula) {
		this.atomicFormula = atomicFormula;
	}

	public double getAtomicWeight() {
		return atomicWeight;
	}

	public void setAtomicWeight(double atomicWeight) {
		this.atomicWeight = atomicWeight;
	}

}
