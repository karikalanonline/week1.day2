package week1.day2;

public class Car {
	public static void main(String[] args) {
		Car car = new Car();

		car.getRegistrationNumber();
		car.getOwnerName();	
		car.getCarModel();

		boolean tyreCondition = car.isPuntured();
		System.out.println(tyreCondition);

		int subtraction = car.subtractTwoNumbers(12, 12);
		System.out.println(subtraction);

		int multiply = car.multiplyThreeNumbers(2, 3, 5);
		System.out.println(multiply);

		int divide = car.divideTwoNumbers(14, 4);
		System.out.println(divide);

	}
	long regNumber = 123434343455554343l;
	int regNumberLastFourDigits = 3431;
	String ownerName = "TestOwner";
	String carModel = "Swift";

	public long getRegistrationNumber() {
		System.out.println(regNumberLastFourDigits);
		return regNumberLastFourDigits;

	}
	private String getOwnerName() {
		System.out.println(ownerName);
		return ownerName;
	}
	void getCarModel() {
		System.out.println(carModel);
	}
	public boolean isPuntured() {
		return false;
	}
	public int subtractTwoNumbers(int num1, int num2) {
		return num1-num2;
	}
	public int multiplyThreeNumbers(int num1, int num2, int num3) {
		return num1*num2*num3;
	}
	public int divideTwoNumbers(int num1, int num2) {
		return num1/num2;



	}}

