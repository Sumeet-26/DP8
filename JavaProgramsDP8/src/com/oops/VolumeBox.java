package com.oops;

public class VolumeBox {

	int length, width, height, volume;

	public void setData(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}

	public void calculateVolume() {
		volume = length * width * height;
	}

	public void displayData() {
		System.out.println("Length of recatangle is " + length);
		System.out.println("Width of recatangle is " + width);
		System.out.println("Height of recatangle " + height);
		System.out.println("Volume of recatangle " + volume);
	}

	public static void main(String[] args) {
		VolumeBox obj = new VolumeBox();
		obj.setData(20, 23, 55);
		obj.calculateVolume();
		obj.displayData();

	}

}
