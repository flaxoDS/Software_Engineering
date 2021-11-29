package HW7_1;

public interface HouseholdItem {

	void accept(Visitor v);

	String getName();

}