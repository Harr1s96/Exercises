package com.qa.library;

public abstract class Items implements WithName {

	public abstract String checkOutItem(String string);

	public abstract String checkInItem(String string);

	public abstract String addItem(String string);
    
	public abstract String removeItem(String string);

	public abstract String updateItem(String string);

	public abstract String getcheckoutDate();

}





//implements CheckOutAble, CheckInAble, Addable, Removable, Updatable